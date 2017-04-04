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

package de.vandermeer.asciithemes.u8;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

import de.vandermeer.asciithemes.TA_Numbering;
import de.vandermeer.skb.interfaces.transformers.Integer_To_RomanLiteral;

/**
 * Collection of {@link TA_Numbering} numbering schemes using UTF-8 characters.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170404 (04-Apr-17) for Java 1.8
 * @since      v0.0.1
 */
public interface U8_NumberingSchemes {

	/**
	 * Numbering scheme using UTF Circled Latin Capital (upper case) characters `Ⓐ-Ⓩ`.
	 * 
	 * ----
	 * Ⓐ item 1
	 * Ⓑ item 2
	 * Ⓒ item 3
	 * ...
	 * Ⓩ item 26
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Numbering AlphaCircledLatin(){
		return new TA_Numbering() {
			@Override
			public String getNumber(int number) {
				Validate.validState(0<number && number<27, "numbering supported 0<number<27 - number was: " + number);
				return new String(Character.toChars(number+9397));
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
				return "numbering scheme using UTF Circled Latin Capital (upper case) characters 'Ⓐ-Ⓩ'";
			}
		};
	}

	/**
	 * Numbering scheme using UTF Circled Latin Capital (lower case) characters `ⓐ-ⓩ`.
	 * 
	 * ----
	 * ⓐ item 1
	 * ⓑ item 2
	 * ⓒ item 3
	 * ...
	 * ⓩ item 26
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Numbering alphaCircledLatin(){
		return new TA_Numbering() {
			@Override
			public String getNumber(int number) {
				Validate.validState(0<number && number<27, "numbering supported 0<number<27 - number was: " + number);
				return new String(Character.toChars(number+9423));
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
				return "numbering scheme using UTF Circled Latin Capital (lower case) characters 'ⓐ-ⓩ'";
			}
		};
	}

	/**
	 * Numbering scheme using UTF Parenthesized Latin Small Letter (lower case) characters `⒜-⒵`.
	 * 
	 * ----
	 * ⒜ item 1
	 * ⒝ item 2
	 * ⒞ item 3
	 * ...
	 * ⒵ item 26
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Numbering alphaParenthesizedLatinSmallLetter(){
		return new TA_Numbering() {
			@Override
			public String getNumber(int number) {
				Validate.validState(0<number && number<27, "numbering supported 0<number<27 - number was: " + number);
				return new String(Character.toChars(number+9371));
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
				return "numbering scheme using UTF Parenthesized Latin Small Letter (lower case) characters '⒜-⒵'";
			}
		};
	}

	/**
	 * Numbering scheme using UTF Fullwidth Latin Capital Letter (upper case) characters `Ａ-Ｚ`.
	 * 
	 * ----
	 * Ａ item 1
	 * Ｂ item 2
	 * Ｃ item 3
	 * ...
	 * Ｚ item 26
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Numbering AlphaFullwidthLatinCapitalLetter(){
		return new TA_Numbering() {
			@Override
			public String getNumber(int number) {
				Validate.validState(0<number && number<27, "numbering supported 0<number<27 - number was: " + number);
				return new String(Character.toChars(number+65312));
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
				return "numbering scheme using UTF Fullwidth Latin Capital Letter (upper case) characters 'Ａ-Ｚ'";
			}
		};
	}

	/**
	 * Numbering scheme using UTF Fullwidth Latin Small Letter (lower case) characters `ａ-ｚ`.
	 * 
	 * ----
	 * ａ item 1
	 * ｂ item 2
	 * ｃ item 3
	 * ...
	 * ｚ item 26
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Numbering alphaFullwidthLatinSmallLetter(){
		return new TA_Numbering() {
			@Override
			public String getNumber(int number) {
				Validate.validState(0<number && number<27, "numbering supported 0<number<27 - number was: " + number);
				return new String(Character.toChars(number+65344));
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
				return "numbering scheme using UTF Fullwidth Latin Small Letter (lower case) characters 'ａ-ｚ'";
			}
		};
	}

	/**
	 * Numbering scheme using UTF Circled Digit/Number characters `①-⑳`.
	 * 
	 * ----
	 * ① item 1
	 * ② item 2
	 * ③ item 3
	 * ...
	 * ⑳ item 20
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Numbering numberCircledDigit(){
		return new TA_Numbering() {
			@Override
			public String getNumber(int number) {
				Validate.validState(0<number && number<21, "numbering supported 0<number<21 - number was: " + number);
				return new String(Character.toChars(number+9311));
			}

			@Override
			public int getMinNumber() {
				return 1;
			}

			@Override
			public int getMaxNumber() {
				return 20;
			}

			@Override
			public String getDescription(){
				return "numbering scheme using UTF Circled Digit/Number characters '①-⑳'";
			}
		};
	}

	/**
	 * Numbering scheme using UTF Double Circled Digit/Number characters `⓵-⓾`.
	 * 
	 * ----
	 * ⓵ item 1
	 * ⓶ item 2
	 * ⓷ item 3
	 * ...
	 * ⓾ item 10
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Numbering numberDoubleCircledDigit(){
		return new TA_Numbering() {
			@Override
			public String getNumber(int number) {
				Validate.validState(0<number && number<11, "numbering supported 0<number<11 - number was: " + number);
				return new String(Character.toChars(number+9460));
			}

			@Override
			public int getMinNumber() {
				return 1;
			}

			@Override
			public int getMaxNumber() {
				return 10;
			}

			@Override
			public String getDescription(){
				return "numbering scheme using UTF Double Circled Digit/Number characters '⓵-⓾'";
			}
		};
	}

	/**
	 * Numbering scheme using UTF Dingbat Negative Circled Digit characters `❶-❿`.
	 * 
	 * ----
	 * ❶ item 1
	 * ❷ item 2
	 * ❸ item 3
	 * ...
	 * ❿ item 10
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Numbering numberDingbatNegativeCircledDigit(){
		return new TA_Numbering() {
			@Override
			public String getNumber(int number) {
				Validate.validState(0<number && number<11, "numbering supported 0<number<11 - number was: " + number);
				return new String(Character.toChars(number+10101));
			}

			@Override
			public int getMinNumber() {
				return 1;
			}

			@Override
			public int getMaxNumber() {
				return 10;
			}

			@Override
			public String getDescription(){
				return "numbering scheme using UTF Dingbat Negative Circled Digit characters '❶-❿'";
			}
		};
	}

	/**
	 * Numbering scheme using UTF Dingbat Negative Sanserif Circled Digit characters `➊-➓`.
	 * 
	 * ----
	 * ➊ item 1
	 * ➋ item 2
	 * ➌ item 3
	 * ...
	 * ➓ item 10
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Numbering numberDingbatNegativeSanserifCircledDigit(){
		return new TA_Numbering() {
			@Override
			public String getNumber(int number) {
				Validate.validState(0<number && number<11, "numbering supported 0<number<11 - number was: " + number);
				return new String(Character.toChars(number+10121));
			}

			@Override
			public int getMinNumber() {
				return 1;
			}

			@Override
			public int getMaxNumber() {
				return 10;
			}

			@Override
			public String getDescription(){
				return "numbering scheme using UTF Dingbat Negative Sanserif Circled Digit characters '➊-➓'";
			}
		};
	}

	/**
	 * Numbering scheme using UTF Dingbat Sanserif Circled Digit characters `➀-➉`.
	 * 
	 * ----
	 * ➀ item 1
	 * ➁ item 2
	 * ➂ item 3
	 * ...
	 * ➉ item 10
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Numbering numberDingbatSanserifCircledDigit(){
		return new TA_Numbering() {
			@Override
			public String getNumber(int number) {
				Validate.validState(0<number && number<11, "numbering supported 0<number<11 - number was: " + number);
				return new String(Character.toChars(number+10111));
			}

			@Override
			public int getMinNumber() {
				return 1;
			}

			@Override
			public int getMaxNumber() {
				return 10;
			}

			@Override
			public String getDescription(){
				return "numbering scheme using UTF Dingbat Sanserif Circled Digit characters '➀-➉'";
			}
		};
	}

	/**
	 * Numbering scheme using UTF Superscript characters `¹-⁹`.
	 * 
	 * ----
	 * ¹ item 1
	 * ² item 2
	 * ³ item 3
	 * ...
	 * ⁹ item 9
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Numbering numberSuperscript(){
		return new TA_Numbering() {
			@Override
			public String getNumber(int number) {
				Validate.validState(0<number && number<10, "numbering supported 0<number<10 - number was: " + number);
				if(number==1){
					return new String(Character.toChars(number+184));
				}
				else if(number>3){
					//4-10
					return new String(Character.toChars(number+8304));
				}
				else{
					//2, 3
					return new String(Character.toChars(number+176));
				}
			}

			@Override
			public int getMinNumber() {
				return 1;
			}

			@Override
			public int getMaxNumber() {
				return 9;
			}

			@Override
			public String getDescription(){
				return "numbering scheme using UTF Superscript characters '¹-⁹'";
			}
		};
	}

	/**
	 * Numbering scheme case UTF Subscript characters `₁-₉`.
	 * 
	 * ----
	 * ₁ item 1
	 * ₂ item 2
	 * ₃ item 3
	 * ...
	 * ₉ item 9
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Numbering numberSubscript(){
		return new TA_Numbering() {
			@Override
			public String getNumber(int number) {
				Validate.validState(0<number && number<10, "numbering supported 0<number<10 - number was: " + number);
				return new String(Character.toChars(number+8320));
			}

			@Override
			public int getMinNumber() {
				return 1;
			}

			@Override
			public int getMaxNumber() {
				return 9;
			}

			@Override
			public String getDescription(){
				return "numbering scheme using UTF Subscript characters '₁-₉'";
			}
		};
	}

	/**
	 * Numbering scheme case UTF Full Stop characters `⒈-⒛`.
	 * 
	 * ----
	 * ⒈ item 1
	 * ⒉ item 2
	 * ⒊ item 3
	 * ...
	 * ⒛ item 20
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Numbering numberFullStop(){
		return new TA_Numbering() {
			@Override
			public String getNumber(int number) {
				Validate.validState(0<number && number<21, "numbering supported 0<number<21 - number was: " + number);
				return new String(Character.toChars(number+9351));
			}

			@Override
			public int getMinNumber() {
				return 1;
			}

			@Override
			public int getMaxNumber() {
				return 20;
			}

			@Override
			public String getDescription(){
				return "numbering scheme using UTF Full Stop characters '⒈-⒛'";
			}
		};
	}

	/**
	 * Numbering scheme using UTF Parenthesized Digit/Number characters `⑴-⒇`.
	 * 
	 * ----
	 * ⑴ item 1
	 * ⑵ item 2
	 * ⑶ item 3
	 * ...
	 * ⒇ item 20
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Numbering numberParenthesized(){
		return new TA_Numbering() {
			@Override
			public String getNumber(int number) {
				Validate.validState(0<number && number<21, "numbering supported 0<number<21 - number was: " + number);
				return new String(Character.toChars(number+9331));
			}

			@Override
			public int getMinNumber() {
				return 1;
			}

			@Override
			public int getMaxNumber() {
				return 20;
			}

			@Override
			public String getDescription(){
				return "numbering scheme using UTF Parenthesized Digit/Number characters '⑴-⒇'";
			}
		};
	}

	/**
	 * Numbering scheme case UTF Fullwidth characters `１-９`.
	 * 
	 * ----
	 * １ item 1
	 * ２ item 2
	 * ３ item 3
	 * ...
	 * ９ item 9
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Numbering numberFullwidth(){
		return new TA_Numbering() {
			@Override
			public String getNumber(int number) {
				Validate.validState(0<number && number<10, "numbering supported 0<number<10 - number was: " + number);
				return new String(Character.toChars(number+65296));
			}

			@Override
			public int getMinNumber() {
				return 1;
			}

			@Override
			public int getMaxNumber() {
				return 9;
			}

			@Override
			public String getDescription(){
				return "numbering scheme using UTF Fullwidth characters '１-９'";
			}
		};
	}

	/**
	 * Numbering scheme for Roman number literals using upper case UTF-8 Number Forms upper case characters.
	 * 
	 * ----
	 * Ⅰ item 1
	 * Ⅱ item 2
	 * Ⅲ item 3
	 * ...
	 * ⅯⅯⅯⅯ item 4000
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Numbering RomanNumberForms(){
		return new TA_Numbering() {
			/** Standard Roman literals. */
			String[] from = new String[]{"M", "D", "C", "L", "XII", "XI", "X", "VIII", "VII", "VI", "V", "III", "II", "I"};

			/** UTF character replacements. */
			String[] to = new String[]{"Ⅿ", "Ⅾ", "Ⅽ", "Ⅼ", "Ⅻ", "Ⅺ", "Ⅹ", "Ⅷ", "Ⅶ", "Ⅵ", "Ⅴ", "Ⅲ", "Ⅱ", "Ⅰ"};

			@Override
			public String getNumber(int number) {
				Validate.validState(0<number && number<4001, "numbering supported 0<number<4001 - number was: " + number);
				String literal = Integer_To_RomanLiteral.convert(number);
				literal = literal.replace("IV", "Ⅳ");
				literal = literal.replace("IX", "Ⅸ");
				return StringUtils.replaceEach(literal, from, to);
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
				return "Numbering scheme for Roman number literals using upper case UTF-8 Number Forms upper case characters.";
			}
		};
	}

	/**
	 * Numbering scheme for Roman number literals using lower case UTF-8 Number Forms lower case characters.
	 * 
	 * ----
	 * ⅰ item 1
	 * ⅱ item 2
	 * ⅲ item 3
	 * ...
	 * ⅿⅿⅿⅿ item 4000
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Numbering romanNumberForms(){
		return new TA_Numbering() {
			/** Standard Roman literals. */
			String[] from = new String[]{"M", "D", "C", "L", "XIII", "XII", "XI", "X", "VIII", "VII", "VI", "V", "III", "II", "I"};

			/** UTF character replacements. */
			String[] to = new String[]{"ⅿ", "ⅾ", "ⅽ", "ⅼ", "ⅹⅲ", "ⅻ", "ⅺ", "ⅹ", "ⅷ", "ⅶ", "ⅵ", "ⅴ", "ⅲ", "ⅱ", "ⅰ"};

			@Override
			public String getNumber(int number) {
				Validate.validState(0<number && number<4001, "numbering supported 0<number<4001 - number was: " + number);
				String literal = Integer_To_RomanLiteral.convert(number);
				literal = literal.replace("IV", "ⅳ");
				literal = literal.replace("IX", "ⅸ");
				return StringUtils.replaceEach(literal, from, to);
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
				return "Numbering scheme for Roman number literals using lower case UTF-8 Number Forms lower case characters.";
			}
		};
	}

	/**
	 * Numbering scheme for Roman number literals using upper case UTF-8 Number Circled Latin Capital (upper case) characters.
	 * 
	 * ----
	 * Ⓘ item 1
	 * ⒾⒾ item 2
	 * ⒾⒾⒾ item 3
	 * ...
	 * ⓂⓂⓂⓂ item 4000
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Numbering RomanCircledLatinCapital(){
		return new TA_Numbering() {
			/** Standard Roman literals. */
			String[] from = new String[]{"M", "D", "C", "L", "X", "V", "I"};

			/** UTF character replacements. */
			String[] to = new String[]{"Ⓜ", "Ⓓ", "Ⓒ", "Ⓛ", "Ⓧ", "Ⓥ", "Ⓘ"};

			@Override
			public String getNumber(int number) {
				Validate.validState(0<number && number<4001, "numbering supported 0<number<4001 - number was: " + number);
				return StringUtils.replaceEach(Integer_To_RomanLiteral.convert(number), from, to);
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
				return "Numbering scheme for Roman number literals using upper case UTF-8 Circled Latin Capital (upper case) characters.";
			}
		};
	}

	/**
	 * Numbering scheme for Roman number literals using lower case UTF-8 Number Circled Latin Small (lower case) characters.
	 * 
	 * ----
	 * ⓘ item 1
	 * ⓘⓘ item 2
	 * ⓘⓘⓘ item 3
	 * ...
	 * ⓜⓜⓜⓜ item 4000
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Numbering romanCircledLatinSmall(){
		return new TA_Numbering() {
			/** Standard Roman literals. */
			String[] from = new String[]{"M", "D", "C", "L", "X", "V", "I"};

			/** UTF character replacements. */
			String[] to = new String[]{"ⓜ", "ⓓ", "ⓒ", "ⓛ", "ⓧ", "ⓥ", "ⓘ"};

			@Override
			public String getNumber(int number) {
				Validate.validState(0<number && number<4001, "numbering supported 0<number<4001 - number was: " + number);
				return StringUtils.replaceEach(Integer_To_RomanLiteral.convert(number), from, to);
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
				return "Numbering scheme for Roman number literals using lower case UTF-8 Circled Latin Small (lower case) characters.";
			}
		};
	}
}
