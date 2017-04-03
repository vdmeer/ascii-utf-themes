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
 * A split line (left and right side using different characters) using ASCII and/or UTF characters.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170331 (31-Mar-17) for Java 1.8
 * @since      v0.0.1
 */
public interface TA_Line_SplitChar extends TA_Line {

	/**
	 * Returns a line of given length.
	 * @param length number of characters in the line
	 * @return line of given length, empty if length was null or negative
	 */
	default StrBuilder getLine(int length) {
		return this.getLine(length, null);
	}

	/**
	 * Returns a line of given length.
	 * @param length number of characters in the line
	 * @param builder builder to append the line to, new builder will be created if null
	 * @return line of given length, empty if length was null or negative
	 */
	default StrBuilder getLine(int length, StrBuilder builder){
		StrBuilder ret = new StrBuilder();
		if(length<1){
			return (builder==null)?ret:builder;
		}
		ret.appendPadding(length/2, this.getLeftLineChar());
		while(ret.length()<length){
			ret.appendPadding(1, this.getRightLineChar());
		}

		return (builder==null)?ret:builder.append(ret);
	}

	/**
	 * Returns the left character used for the line.
	 * @return line left character
	 */
	Character getLeftLineChar();

	/**
	 * Returns the right character used for the line.
	 * @return line right character
	 */
	Character getRightLineChar();


	@Override
	default StrBuilder toDoc() {
		return this.getLine(10);
	}

	/**
	 * Creates a a new line.
	 * @param left left line character
	 * @param right right line character
	 * @param description a description for the line, cannot be blank
	 * @return new line
	 */
	static TA_Line_SplitChar create(final Character left, final Character right, final String description){
		Validate.notNull(left);
		Validate.notNull(right);
		Validate.notBlank(description);

		return new TA_Line_SplitChar() {
			@Override
			public Character getLeftLineChar() {
				return left;
			}

			@Override
			public Character getRightLineChar() {
				return right;
			}

			@Override
			public String getDescription(){
				return description;
			}
		};
	}
}
