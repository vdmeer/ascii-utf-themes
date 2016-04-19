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

import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.text.StrBuilder;

/**
 * An itemize list using ASCII and UTF-8 characters.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 160319 (19-Mar-16) for Java 1.8
 * @since      v0.0.1
 */
public interface TA_ItemizeList extends TA_List {

	/**
	 * Returns the label for a given level.
	 * @param level the level for the requested style
	 * @return label for a given level, null if not set or supported
	 * @throws NotImplementedException if requested level is not supported
	 */
	String getLabel(int level);

	/**
	 * Returns the max level the style supports.
	 * @return ax level, if set to -1 then the style provides unlimited levels
	 */
	int getMaxLevel();

	@Override
	default StrBuilder toDoc(){
		if(this.getMaxLevel()==0){
			throw new IllegalArgumentException("itemize list toDoc: max level is 0");
		}
		if(this.getMaxLevel()<-1){
			throw new IllegalArgumentException("itemize list toDoc: max level is < -1");
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
			ret.appendPadding(2*(n-1), ' ').append(this.getLabel(3)).append(" item 2");
		}

		n = 4;
		if(this.getMaxLevel()==-1 || this.getMaxLevel()>=n){
			ret.appendNewLine();
			ret.appendPadding(2*(n-1), ' ').append(this.getLabel(4)).append(" item 1").appendNewLine();
			ret.appendPadding(2*(n-1), ' ').append(this.getLabel(4)).append(" item 2");
		}

		n = 5;
		if(this.getMaxLevel()==-1 || this.getMaxLevel()>=n){
			ret.appendNewLine();
			ret.appendPadding(2*(n-1), ' ').append(this.getLabel(5)).append(" item 1").appendNewLine();
			ret.appendPadding(2*(n-1), ' ').append(this.getLabel(5)).append(" item 2");
		}

		n = 6;
		if(this.getMaxLevel()==-1 || this.getMaxLevel()>=n){
			ret.appendNewLine();
			ret.appendPadding(2*(n-1), ' ').append(this.getLabel(6)).append(" item 1").appendNewLine();
			ret.appendPadding(2*(n-1), ' ').append(this.getLabel(6)).append(" item 2");
		}
		return ret;
	}

	/**
	 * Creates a new itemize list with unlimited levels for given character.
	 * @param label character as label
	 * @param description list description
	 * @return new list
	 */
	public static TA_ItemizeList create(final Character label, final String description){
		Validate.notNull(label);
		Validate.notBlank(description);

		return new TA_ItemizeList() {
			@Override
			public int getMaxLevel() {
				return -1;
			}

			@Override
			public String getLabel(int level) {
				return label.toString();
			}

			@Override
			public String getDescription(){
				return description;
			}
		};
	}

	/**
	 * Creates a new itemize list with unlimited levels for given character.
	 * Incremental means that level 1 has 1 character, level 2 has 2 characters, level 3 has 3 characters and so forth.
	 * @param label character as label
	 * @param description list description
	 * @return new list
	 */
	public static TA_ItemizeList createIncremental(final Character label, final String description){
		Validate.notNull(label);
		Validate.notBlank(description);

		return new TA_ItemizeList() {
			@Override
			public int getMaxLevel() {
				return -1;
			}

			@Override
			public String getLabel(int level) {
				StrBuilder ret = new StrBuilder();
				for(int i=0; i<level; i++){
					ret.append(label);
				}
				return ret.toString();
			}

			@Override
			public String getDescription(){
				return description;
			}
		};
	}

	/**
	 * Creates a new itemize list for levels provided by the given characters.
	 * @param description list description
	 * @param characters characters in order of level they support (level 1 is first, level n is last)
	 * @return new list
	 */
	public static TA_ItemizeList create(final String description, final Character ... characters){
		Validate.notBlank(description);
		Validate.notNull(characters);
		Validate.noNullElements(characters);

		return new TA_ItemizeList() {
			@Override
			public int getMaxLevel() {
				return characters.length;
			}

			@Override
			public String getLabel(int level) {
				Validate.validState(level<=this.getMaxLevel(), "level larger than supported max level");
				return characters[level-1].toString();
			}

			@Override
			public String getDescription(){
				return description;
			}
		};
	}
}
