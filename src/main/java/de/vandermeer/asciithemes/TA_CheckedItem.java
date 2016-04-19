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
 * An item that has a checked and an unchecked label.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 160319 (19-Mar-16) for Java 1.8
 * @since      v0.0.1
 */
public interface TA_CheckedItem extends IsTextArt {

	/**
	 * Returns the label for a given level.
	 * @param checked flag for a checked (true) or unchecked (false) label
	 * @return the label
	 */
	default String getLabel(boolean checked){
		return (checked==true)?this.getCheckedLabel():this.getUncheckedLabel();
	}

	/**
	 * Returns the checked label.
	 * @return checked label
	 */
	String getCheckedLabel();

	/**
	 * Returns the unchecked label
	 * @return unchecked label
	 */
	String getUncheckedLabel();

	@Override
	default StrBuilder toDoc(){
		StrBuilder ret = new StrBuilder(30);
		ret.append(this.getCheckedLabel()).append(" checked item").appendNewLine();
		ret.append(this.getUncheckedLabel()).append(" unchecked item");
		return ret;
	}

	/**
	 * Creates a new checked item.
	 * @param checked checked label character
	 * @param unchecked unckecked label character
	 * @param description item description
	 * @return new checked item
	 */
	public static TA_CheckedItem create(final Character checked, final Character unchecked, final String description){
		Validate.notNull(checked);
		Validate.notNull(unchecked);
		Validate.notBlank(description);

		return new TA_CheckedItem() {
			@Override
			public String getUncheckedLabel() {
				return unchecked.toString();
			}
			
			@Override
			public String getCheckedLabel() {
				return checked.toString();
			}

			@Override
			public String getDescription(){
				return description;
			}
		};
	}

	/**
	 * Creates a new checked item.
	 * @param checked checked label string
	 * @param unchecked unckecked label string
	 * @param description item description
	 * @return new checked item
	 */
	public static TA_CheckedItem create(final String checked, final String unchecked, final String description){
		Validate.notNull(checked);
		Validate.notNull(unchecked);
		Validate.notBlank(description);

		return new TA_CheckedItem() {
			@Override
			public String getUncheckedLabel() {
				return unchecked.toString();
			}
			
			@Override
			public String getCheckedLabel() {
				return checked.toString();
			}

			@Override
			public String getDescription(){
				return description;
			}
		};
	}

}
