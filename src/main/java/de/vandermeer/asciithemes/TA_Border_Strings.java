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
 * Left and right border pair using strings with ASCII and/or UTF characters.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170404 (04-Apr-17) for Java 1.8
 * @since      v0.0.1
 */
public interface TA_Border_Strings extends TA_Border {

	/**
	 * Creates a new border pair.
	 * @param left border left string
	 * @param right border right string
	 * @param description a description for the line, cannot be blank
	 * @return new border pair
	 */
	static TA_Border_Strings create(final String left, final String right, final String description){
		Validate.notNull(left);
		Validate.notNull(right);
		Validate.notBlank(description);

		return new TA_Border_Strings() {
			@Override
			public String getDescription(){
				return description;
			}

			@Override
			public String getLeftString() {
				return left;
			}

			@Override
			public String getRightString() {
				return right;
			}
		};
	}

	@Override
	default StrBuilder getBorder(int mode, StrBuilder builder){
		StrBuilder ret = (builder==null)?new StrBuilder():builder;
		switch(mode){
			case MODE_LEFT:
				return ret.append(this.getLeftString());
			case MODE_RIGHT:
				return ret.append(this.getRightString());
			default:
				return ret;
		}
	}

	/**
	 * Returns the string for the left border.
	 * @return left border string
	 */
	String getLeftString();

	/**
	 * Returns the string for the right border.
	 * @return right border string
	 */
	String getRightString();

	@Override
	default StrBuilder toDoc() {
		StrBuilder ret = new StrBuilder(5)
			.append(getLeftString())
			.append(' ')
			.append(this.getRightString())
		;
		return ret;
	}
}
