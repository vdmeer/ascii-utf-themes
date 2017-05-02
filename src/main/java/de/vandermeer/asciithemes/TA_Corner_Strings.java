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
 * Corner tuple using strings with ASCII and/or UTF characters.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170404 (04-Apr-17) for Java 1.8
 * @since      v0.0.1
 */
public interface TA_Corner_Strings extends TA_Corner {

	/**
	 * Creates a new corner pair.
	 * @param topleft string of the top left corner
	 * @param topright string of the top right border
	 * @param bottomleft string of the bottom left corner
	 * @param bottomright string of the bottom right border
	 * @param description a description for the line, cannot be blank
	 * @return new corner pair
	 */
	static TA_Corner_Strings create(final String topleft, final String topright, final String bottomleft, final String bottomright, final String description){
		Validate.notNull(topleft);
		Validate.notNull(topright);
		Validate.notNull(bottomleft);
		Validate.notNull(bottomright);
		Validate.notBlank(description);

		return new TA_Corner_Strings() {
			@Override
			public String getBottomLeftString() {
				return bottomleft;
			}

			public String getBottomRightString() {
				return bottomright;
			}

			@Override
			public String getDescription(){
				return description;
			}

			@Override
			public String getTopLeftString() {
				return topleft;
			}

			@Override
			public String getTopRightString() {
				return topright;
			}
		};
	}

	/**
	 * Returns the string for the bottom left corner.
	 * @return left corner string
	 */
	String getBottomLeftString();

	/**
	 * Returns the string for the bottom right corner.
	 * @return right corner string
	 */
	String getBottomRightString();

	@Override
	default StrBuilder getCorner(int mode, StrBuilder builder){
		StrBuilder ret = (builder==null)?new StrBuilder():builder;
		switch(mode){
			case TA_Corner.MODE_TOP_LEFT:
				return ret.append(this.getTopLeftString());
			case TA_Corner.MODE_TOP_RIGHT:
				return ret.append(this.getTopRightString());
			case TA_Corner.MODE_BOTTOM_LEFT:
				return ret.append(this.getBottomLeftString());
			case TA_Corner.MODE_BOTTOM_RIGHT:
				return ret.append(this.getBottomRightString());
			default:
				return ret;
		}
	}

	/**
	 * Returns the string for the top left corner.
	 * @return left corner string
	 */
	String getTopLeftString();

	/**
	 * Returns the string for the top right corner.
	 * @return right corner string
	 */
	String getTopRightString();

	@Override
	default StrBuilder toDoc() {
		StrBuilder ret = new StrBuilder(10)
			.append(getTopLeftString()).append(' ').append(this.getTopRightString())
			.appendNewLine()
			.appendNewLine()
			.append(getBottomLeftString()).append(' ').append(this.getBottomRightString())
			
		;
		return ret;
	}
}
