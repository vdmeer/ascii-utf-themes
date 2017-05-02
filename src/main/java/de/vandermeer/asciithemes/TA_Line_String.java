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
 * A line using strings with ASCII and/or UTF characters.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170404 (04-Apr-17) for Java 1.8
 * @since      v0.0.1
 */
public interface TA_Line_String extends TA_Line {

	/**
	 * Creates a a new line.
	 * @param str line string
	 * @param description a description for the line, cannot be blank
	 * @return new line
	 */
	static TA_Line_String create(final String str, final String description){
		Validate.notNull(str);
		Validate.notBlank(description);

		return new TA_Line_String() {
			@Override
			public String getDescription(){
				return description;
			}

			@Override
			public String getLineString() {
				return str;
			}
		};
	}

	/**
	 * Returns a line of given length.
	 * @param length number of in the line
	 * @return line of given length, empty if length was null or negative
	 */
	default StrBuilder getLine(int length) {
		return this.getLine(length, null);
	}

	/**
	 * Returns a line of given length.
	 * @param length number of in the line
	 * @param builder builder to append the line to, new builder will be created if null
	 * @return line of given length, empty if length was null or negative
	 */
	default StrBuilder getLine(int length, StrBuilder builder){
		StrBuilder append = new StrBuilder();
		if(this.getLineString().length()==0 || length==0){
			return append;
		}
		while(append.length()<(length)){
			append.append(this.getLineString());
		}
		while(append.length()>length){
			append.deleteCharAt(append.length()-1);
		}
		if(builder==null){
			return append;
		}
		return builder.append(append);
	}

	/**
	 * Returns the string used for the line.
	 * @return line string
	 */
	String getLineString();

	@Override
	default StrBuilder toDoc() {
		return this.getLine(10);
	}
}
