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
 * Corner tuple using ASCII and/or UTF characters.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170404 (04-Apr-17) for Java 1.8
 * @since      v0.0.1
 */
public interface TA_Corner_Chars extends TA_Corner {

	/**
	 * Returns the character for the top left corner.
	 * @return left corner character
	 */
	Character getTopLeftChar();

	/**
	 * Returns the character for the top right corner.
	 * @return right corner character
	 */
	Character getTopRightChar();

	/**
	 * Returns the character for the bottom left corner.
	 * @return left corner character
	 */
	Character getBottomLeftChar();

	/**
	 * Returns the character for the bottom right corner.
	 * @return right corner character
	 */
	Character getBottomRightChar();

	@Override
	default StrBuilder getCorner(int mode, StrBuilder builder){
		StrBuilder ret = (builder==null)?new StrBuilder():builder;
		switch(mode){
			case TA_Corner.MODE_TOP_LEFT:
				return ret.append(this.getTopLeftChar());
			case TA_Corner.MODE_TOP_RIGHT:
				return ret.append(this.getTopRightChar());
			case TA_Corner.MODE_BOTTOM_LEFT:
				return ret.append(this.getBottomLeftChar());
			case TA_Corner.MODE_BOTTOM_RIGHT:
				return ret.append(this.getBottomRightChar());
			default:
				return ret;
		}
	}

	@Override
	default StrBuilder toDoc() {
		StrBuilder ret = new StrBuilder(10)
			.append(getTopLeftChar()).append(' ').append(this.getTopRightChar())
			.appendNewLine()
			.appendNewLine()
			.append(getBottomLeftChar()).append(' ').append(this.getBottomRightChar())
			
		;
		return ret;
	}

	/**
	 * Creates a new corner pair.
	 * @param topleft character of the top left corner
	 * @param topright character of the top right border
	 * @param bottomleft character of the bottom left corner
	 * @param bottomright character of the bottom right border
	 * @param description a description for the line, cannot be blank
	 * @return new corner pair
	 */
	static TA_Corner_Chars create(final Character topleft, final Character topright, final Character bottomleft, final Character bottomright, final String description){
		Validate.notNull(topleft);
		Validate.notNull(topright);
		Validate.notNull(bottomleft);
		Validate.notNull(bottomright);
		Validate.notBlank(description);

		return new TA_Corner_Chars() {
			@Override
			public Character getTopRightChar() {
				return topright;
			}

			@Override
			public Character getTopLeftChar() {
				return topleft;
			}

			public Character getBottomRightChar() {
				return bottomright;
			}

			@Override
			public Character getBottomLeftChar() {
				return bottomleft;
			}

			@Override
			public String getDescription(){
				return description;
			}
		};
	}
}
