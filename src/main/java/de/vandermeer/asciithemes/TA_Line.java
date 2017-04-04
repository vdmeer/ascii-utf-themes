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

import org.apache.commons.lang3.text.StrBuilder;

/**
 * A line.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170404 (04-Apr-17) for Java 1.8
 * @since      v0.0.1
 */
public interface TA_Line extends IsTextArt {

	/**
	 * Returns a line of given length.
	 * @param length number of characters in the line
	 * @return line of given length, empty if length was null or negative
	 */
	StrBuilder getLine(int length);

	/**
	 * Returns a line of given length.
	 * @param length number of characters in the line
	 * @param builder builder to append the line to, new builder will be created if null
	 * @return line of given length, empty if length was null or negative
	 */
	StrBuilder getLine(int length, StrBuilder builder);

	/**
	 * Returns a line of given length.
	 * @param length number of characters in the line
	 * @return line of given length, empty if length was null or negative
	 */
	default String getLineAsString(int length){
		return this.getLine(length).toString();
	}

	/**
	 * Returns a line of given length.
	 * @param length number of characters in the line
	 * @param builder builder to append the line to, new builder will be created if null
	 * @return line of given length, empty if length was null or negative
	 */
	default String getLineAsString(int length, StrBuilder builder){
		return this.getLine(length, builder).toString();
	}
}
