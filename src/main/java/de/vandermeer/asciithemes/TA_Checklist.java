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
 * A echecklist list using ASCII and UTF-8 characters.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170404 (04-Apr-17) for Java 1.8
 * @since      v0.0.1
 */
public interface TA_Checklist extends TA_List {

	/**
	 * Returns the label for a given level.
	 * If the list is implementing a nested style, this method will always use the top level style.
	 * @param level the level for the requested style
	 * @param checked set true if the item is checked, false otherwise
	 * @return label for a given level, null if not set or supported
	 * @throws IllegalArgumentException if requested level is not supported
	 */
	String getLabel(int level, boolean checked);

	/**
	 * Returns the max level the style supports.
	 * @return ax level, if set to -1 then the style provides unlimited levels
	 */
	int getMaxLevel();

	@Override
	default StrBuilder toDoc(){
		if(this.getMaxLevel()==0){
			throw new IllegalArgumentException("checklist toDoc: max level is 0");
		}
		if(this.getMaxLevel()<-1){
			throw new IllegalArgumentException("checklist toDoc: max level is < -1");
		}

		StrBuilder ret = new StrBuilder(30);
		ret.append(this.getLabel(1, true)).append(" checked item").appendNewLine();
		ret.append(this.getLabel(1, false)).append(" unchecked item");

		int n = 2;
		if(this.getMaxLevel()==-1 || this.getMaxLevel()>=n){
			ret.appendNewLine();
			ret.appendPadding(2*(n-1), ' ').append(this.getLabel(2, true)).append(" checked item").appendNewLine();
			ret.appendPadding(2*(n-1), ' ').append(this.getLabel(2, false)).append(" unchecked item");
		}

		n = 3;
		if(this.getMaxLevel()==-1 || this.getMaxLevel()>=n){
			ret.appendNewLine();
			ret.appendPadding(2*(n-1), ' ').append(this.getLabel(3, true)).append(" checked item").appendNewLine();
			ret.appendPadding(2*(n-1), ' ').append(this.getLabel(3, false)).append(" unchecked item");
		}

		n = 4;
		if(this.getMaxLevel()==-1 || this.getMaxLevel()>=n){
			ret.appendNewLine();
			ret.appendPadding(2*(n-1), ' ').append(this.getLabel(4, true)).append(" checked item").appendNewLine();
			ret.appendPadding(2*(n-1), ' ').append(this.getLabel(4, false)).append(" unchecked item");
		}

		n = 5;
		if(this.getMaxLevel()==-1 || this.getMaxLevel()>=n){
			ret.appendNewLine();
			ret.appendPadding(2*(n-1), ' ').append(this.getLabel(5, true)).append(" checked item").appendNewLine();
			ret.appendPadding(2*(n-1), ' ').append(this.getLabel(5, false)).append(" unchecked item");
		}

		n = 6;
		if(this.getMaxLevel()==-1 || this.getMaxLevel()>=n){
			ret.appendNewLine();
			ret.appendPadding(2*(n-1), ' ').append(this.getLabel(6, true)).append(" checked item").appendNewLine();
			ret.appendPadding(2*(n-1), ' ').append(this.getLabel(6, false)).append(" unchecked item");
		}
		return ret;
	}

	/**
	 * Creates a new checklist with unlimited levels.
	 * @param item the checked item to be used
	 * @param description list description
	 * @return new list
	 */
	public static TA_Checklist create(final TA_CheckedItem item, final String description){
		Validate.notNull(item);
		Validate.notBlank(description);

		return new TA_Checklist() {
			@Override
			public int getMaxLevel() {
				return -1;
			}

			@Override
			public String getLabel(int level, boolean checked) {
				return item.getLabel(checked);
			}

			@Override
			public String getDescription(){
				return description;
			}
		};
	}

	/**
	 * Creates a new checklist list with levels.
	 * @param description list description
	 * @param items an array with checked items
	 * @return new list
	 */
	public static TA_Checklist create(final String description, final TA_CheckedItem ...items){
		Validate.notNull(items);
		Validate.noNullElements(items);
		Validate.notBlank(description);

		return new TA_Checklist() {
			@Override
			public int getMaxLevel() {
				return items.length;
			}

			@Override
			public String getLabel(int level, boolean checked) {
				return items[level-1].getLabel(checked);
			}

			@Override
			public String getDescription(){
				return description;
			}
		};
	}

}
