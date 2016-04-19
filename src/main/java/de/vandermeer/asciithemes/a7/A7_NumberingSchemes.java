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

package de.vandermeer.asciithemes.a7;

import org.apache.commons.lang3.Validate;

import de.vandermeer.asciithemes.TA_Numbering;
import de.vandermeer.skb.interfaces.transformers.Integer_To_RomanLiteral;

/**
 * Collection of {@link TA_Numbering} numbering schemes using standard ASCII characters.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 160319 (19-Mar-16) for Java 1.8
 * @since      v0.0.1
 */
public interface A7_NumberingSchemes {

	/**
	 * Numbering scheme simply returning a blank character.
	 * 
	 * ----
	 *   item 1
	 *   item 2
	 *   item 3
	 * ...
	 *   item 1000
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Numbering blank(){
		return new TA_Numbering() {
			@Override
			public String getNumber(int number) {
				return " ";
			}

			@Override
			public int getMinNumber() {
				return 1;
			}

			@Override
			public int getMaxNumber() {
				return 1000;
			}

			@Override
			public String getDescription(){
				return "numbering scheme simply returning a blank character";
			}
		};
	}

	/**
	 * Numbering scheme using upper case alphanumeric ASCII characters `A-Z`.
	 * 
	 * ----
	 * A item 1
	 * B item 2
	 * C item 3
	 * ...
	 * Z item 26
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Numbering Alpha(){
		return new TA_Numbering() {
			@Override
			public String getNumber(int number) {
				Validate.validState(0<number && number<27, "numbering supported 0<number<27 - number was: " + number);
				return new String(Character.toChars(number+64));
			}

			@Override
			public int getMinNumber() {
				return 1;
			}

			@Override
			public int getMaxNumber() {
				return 26;
			}

			@Override
			public String getDescription(){
				return "numbering scheme upper case alphanumeric ASCII characters 'A-Z'";
			}
		};
	}

	/**
	 * Numbering scheme using lower case alphanumeric ASCII characters `a-z`.
	 * 
	 * ----
	 * a item 1
	 * b item 2
	 * c item 3
	 * ...
	 * z item 26
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Numbering alpha(){
		return new TA_Numbering() {
			@Override
			public String getNumber(int number) {
				Validate.validState(0<number && number<27, "numbering supported 0<number<27 - number was: " + number);
				return new String(Character.toChars(number+96));
			}

			@Override
			public int getMinNumber() {
				return 1;
			}

			@Override
			public int getMaxNumber() {
				return 26;
			}

			@Override
			public String getDescription(){
				return "numbering scheme using lower case alphanumeric ASCII characters 'a-z'";
			}
		};
	}

	/**
	 * Numbering scheme using ASCII characters for numbers `0-9`.
	 * 
	 * ----
	 * 1 item 1
	 * 2 item 2
	 * 3 item 3
	 * ...
	 * 100 item 100
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Numbering number(){
		return new TA_Numbering() {
			@Override
			public String getNumber(int number) {
				Validate.validState(0<number && number<101, "numbering supported 0<number<101 - number was: " + number);
				return Integer.toString(number);
			}

			@Override
			public int getMinNumber() {
				return 1;
			}

			@Override
			public int getMaxNumber() {
				return 100;
			}

			@Override
			public String getDescription(){
				return "numbering scheme using ASCII characters for numbers '0-9'";
			}
		};
	}

	/**
	 * Numbering scheme for Roman number literals using lower case ASCII characters.
	 * 
	 * ----
	 * i item 1
	 * ii item 2
	 * iii item 3
	 * ...
	 * mmmm item 4000
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Numbering roman(){
		return new TA_Numbering() {
			@Override
			public String getNumber(int number) {
				Validate.validState(0<number && number<4001, "numbering supported 0<number<4001 - number was: " + number);
				return Integer_To_RomanLiteral.convert(number).toLowerCase();
			}

			@Override
			public int getMinNumber() {
				return 1;
			}

			@Override
			public int getMaxNumber() {
				return 4000;
			}

			@Override
			public String getDescription(){
				return "numbering scheme for Roman number literals using lower case ASCII characters";
			}
		};
	}


	/**
	 * Numbering scheme for Roman number literals using upper case ASCII characters.
	 * 
	 * ----
	 * I item 1
	 * II item 2
	 * III item 3
	 * ...
	 * MMMM item 4000
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Numbering Roman(){
		return new TA_Numbering() {
			@Override
			public String getNumber(int number) {
				Validate.validState(0<number && number<4001, "numbering supported 0<number<4001 - number was: " + number);
				return Integer_To_RomanLiteral.convert(number);
			}

			@Override
			public int getMinNumber() {
				return 1;
			}

			@Override
			public int getMaxNumber() {
				return 4000;
			}

			@Override
			public String getDescription(){
				return "numbering scheme for Roman number literals using upper case ASCII characters";
			}
		};
	}
}
