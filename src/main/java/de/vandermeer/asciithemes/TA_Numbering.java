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
 * Root for text art numbering objects, realizing any kind of numbering for instance for headings or enumerate lists.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 160319 (19-Mar-16) for Java 1.8
 * @since      v0.0.1
 */
public interface TA_Numbering extends IsTextArt {

	/**
	 * Returns the minimum number supported by the scheme.
	 * @return minimum number
	 */
	int getMinNumber();

	/**
	 * Returns the maximum number supported by the scheme.
	 * @return maximum number
	 */
	int getMaxNumber();

	/**
	 * Returns a string representation of the given number using the underlying numbering scheme
	 * @param number the number to convert to a string
	 * @return string representation of the number
	 * @throws IllegalArgumentException if the number could not represented by a string because the number was out of range for the scheme
	 */
	String getNumber(int number);

	@Override
	default StrBuilder toDoc(){
		if(this.getMaxNumber()==0){
			throw new IllegalArgumentException("numbering scheme toDoc: max level is 0");
		}

		StrBuilder ret = new StrBuilder(30);
		ret.append(this.getNumber(1)).append(" item 1").appendNewLine();
		ret.append(this.getNumber(2)).append(" item 2").appendNewLine();
		ret.append(this.getNumber(3)).append(" item 3").appendNewLine();
		ret.append("...").appendNewLine();
		ret.append(this.getNumber(this.getMaxNumber())).append(" item ").append(this.getMaxNumber());
		return ret;
	}
}
