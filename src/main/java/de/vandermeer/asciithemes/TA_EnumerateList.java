/* Copyright 2016 Sven van der Meer <vdmeer.sven@mykolab.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.vandermeer.asciithemes;

import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.text.StrBuilder;

/**
 * An enumerate list using ASCII and UTF-8 characters.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170404 (04-Apr-17) for Java 1.8
 * @since      v0.0.1
 */
public interface TA_EnumerateList extends TA_List {

	/**
	 * Returns the label for a given level.
	 * If the list is implementing a nested style, this method will always use the top level style.
	 * @param level the level for the requested style
	 * @return label for a given level, null if not set or supported
	 * @throws IllegalArgumentException if requested level is not supported
	 */
	String getLabel(int level);

	/**
	 * Returns a label constructed of labels for each given level.
	 * @param levels the levels, each entry marks the number for the given level
	 * @param separator the separator between numbers, can be null
	 * @param useSepOnLast use true if the last number gets a separator, false if not
	 * @return label string, unless overwritten this will be null if the max level is not -1
	 * @throws IllegalArgumentException if any requested level is not supported
	 */
	default String getLabel(int[] levels, String separator, boolean useSepOnLast){
		Validate.notNull(levels);
		if(this.getMaxLevel()==-1){
			StrBuilder ret = new StrBuilder();
			for(int l : levels){
				ret.appendSeparator(separator);
				ret.append(this.getLabel(l));
			}
			if(useSepOnLast){
				ret.append(separator);
			}
			return ret.toString();
		}
		return null;
	}

	/**
	 * Returns the max level the style supports.
	 * @return ax level, if set to -1 then the style provides unlimited levels
	 */
	int getMaxLevel();

	@Override
	default StrBuilder toDoc(){
		if(this.getMaxLevel()==0){
			throw new IllegalArgumentException("enumerate list toDoc: max level is 0");
		}
		if(this.getMaxLevel()<-1){
			throw new IllegalArgumentException("enumerate list toDoc: max level is < -1");
		}

		StrBuilder ret = new StrBuilder(30);
		ret.append(this.getLabel(1)).append(" item 1").appendNewLine();
		ret.append(this.getLabel(1)).append(" item 2");

		int n = 2;
		if(this.getMaxLevel()==-1 || this.getMaxLevel()>=n){
			ret.appendNewLine();
			ret.appendPadding(2*(n-1), ' ').append(this.getLabel(2)).append(" item 1").appendNewLine();
			ret.appendPadding(2*(n-1), ' ').append(this.getLabel(2)).append(" item 2");
		}

		n = 3;
		if(this.getMaxLevel()==-1 || this.getMaxLevel()>=n){
			ret.appendNewLine();
			ret.appendPadding(2*(n-1), ' ').append(this.getLabel(3)).append(" item 1").appendNewLine();
			ret.appendPadding(2*(n-1), ' ').append(this.getLabel(3)).append(" item 2").appendNewLine();
		}

		ret.appendNewLine();

		ret.append(this.getLabel(new int[]{1}, ".", true)).append(" item 1").appendNewLine();
		ret.append(this.getLabel(new int[]{1, 2}, ".", true)).append(" item 1/2").appendNewLine();
		ret.append(this.getLabel(new int[]{1, 2, 3}, ".", true)).append(" item 1/2/3").appendNewLine();
		ret.append(this.getLabel(new int[]{1, 2, 3, 4}, ".", true)).append(" item 1/2/3/4").appendNewLine();
		ret.append(this.getLabel(new int[]{1, 2, 3, 4, 5}, ".", true)).append(" item 1/2/3/4/5");

		return ret;
	}

	/**
	 * Creates a new enumerate list with unlimited levels for given numbering scheme.
	 * @param numbering the numbering scheme to use
	 * @param description list description
	 * @return new list
	 */
	public static TA_EnumerateList create(final TA_Numbering numbering, final String description){
		Validate.notNull(numbering);
		Validate.notBlank(description);

		return new TA_EnumerateList() {
			@Override
			public int getMaxLevel() {
				return -1;
			}

			@Override
			public String getLabel(int level) {
				return numbering.getNumber(level);
			}

			@Override
			public String getDescription(){
				return description;
			}
		};
	}

	/**
	 * Creates a new enumerate list with levels provided by given numbering schemes.
	 * @param description list description
	 * @param numbering an array with numbering schemes
	 * @return new list
	 */
	public static TA_EnumerateList create(final String description, final TA_Numbering ...numbering){
		Validate.notNull(numbering);
		Validate.noNullElements(numbering);
		Validate.notBlank(description);

		return new TA_EnumerateList() {
			@Override
			public int getMaxLevel() {
				return numbering.length;
			}

			@Override
			public String getLabel(int level) {
				return numbering[0].getNumber(level);
			}

			@Override
			public String getLabel(int[] levels, String separator, boolean useSepOnLast){
				String simple = TA_EnumerateList.super.getLabel(levels, separator, useSepOnLast);
				if(simple!=null){
					return simple;
				}

				Validate.notNull(levels);
				Validate.validState(numbering.length>=levels.length, "the required levels are going deeper than the provided numbering: levels <" + levels.length + "> provided <" + numbering.length + ">");
				StrBuilder ret = new StrBuilder();
				for(int i=0; i<levels.length; i++){
					ret.appendSeparator(separator);
					ret.append(numbering[i].getNumber(levels[i]));
				}
				if(useSepOnLast){
					ret.append(separator);
				}
				return ret.toString();
			}

			@Override
			public String getDescription(){
				return description;
			}
		};
	}

}
