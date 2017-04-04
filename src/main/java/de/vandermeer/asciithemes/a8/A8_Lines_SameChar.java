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

package de.vandermeer.asciithemes.a8;

import de.vandermeer.asciithemes.TA_Line_Char;

/**
 * Collection of {@link TA_Line_Char} for extended ASCII characters.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170404 (04-Apr-17) for Java 1.8
 * @since      v0.0.1
 */
public abstract class A8_Lines_SameChar {

	/**
	 * A line using the acute accent character `´`.
	 * 
	 * ----
	 * ´´´´´´´´´´
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char acuteAccent(){
		return TA_Line_Char.create('´', "line using acute accent character '´'");
	}

	/**
	 * A line using the almost equal character `≈`.
	 * 
	 * ----
	 * ≈≈≈≈≈≈≈≈≈≈
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char almostEqual(){
		return TA_Line_Char.create('≈', "line using almost equal character '≈'");
	}

	/**
	 * A line using the black square character `■`.
	 * 
	 * ----
	 * ■■■■■■■■■■
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char blackSquare(){
		return TA_Line_Char.create('■', "line using black square character '■'");
	}

	/**
	 * A line using the plus character `─`.
	 * 
	 * ----
	 * ──────────
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char box1Line(){
		return TA_Line_Char.create('─', "line using box 1-line character '─'");
	}

	/**
	 * A line using the plus character `═`.
	 * 
	 * ----
	 * ══════════
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char box2Lines(){
		return TA_Line_Char.create('═', "line using box 2-lines character '═'");
	}

	/**
	 * A line using the broken pipe character `¦`.
	 * 
	 * ----
	 * ¦¦¦¦¦¦¦¦¦¦
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char brokenPipe(){
		return TA_Line_Char.create('¦', "line using broken pipe character '¦'");
	}

	/**
	 * A line using the bullet character `•`.
	 * 
	 * ----
	 * ••••••••••
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char bullet(){
		return TA_Line_Char.create('•', "line using bullet character '•'");
	}

	/**
	 * A line using the cedilla character `¸`.
	 * 
	 * ----
	 * ¸¸¸¸¸¸¸¸¸¸
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char cedilla(){
		return TA_Line_Char.create('¸', "line using cedilla character '¸'");
	}

	/**
	 * A line using the congruence character `≡`.
	 * 
	 * ----
	 * ≡≡≡≡≡≡≡≡≡≡
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char congruence(){
		return TA_Line_Char.create('≡', "line using congruence character '≡'");
	}

	/**
	 * A line using the copyright character `©`.
	 * 
	 * ----
	 * ©©©©©©©©©©
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char copyright(){
		return TA_Line_Char.create('©', "line using copyright character '©'");
	}

	/**
	 * A line using the currency character `¤`.
	 * 
	 * ----
	 * ¤¤¤¤¤¤¤¤¤¤
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char currency(){
		return TA_Line_Char.create('¤', "line using currency character '¤'");
	}

	/**
	 * A line using the dagger character `†`.
	 * 
	 * ----
	 * ††††††††††
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char dagger(){
		return TA_Line_Char.create('†', "line using dagger character '†'");
	}

	/**
	 * A line using the degree character `°`.
	 * 
	 * ----
	 * °°°°°°°°°°
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char degree(){
		return TA_Line_Char.create('°', "line using degree character '°'");
	}

	/**
	 * A line using the diaeresis character `¨`.
	 * 
	 * ----
	 * ¨¨¨¨¨¨¨¨¨¨
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char diaeresis(){
		return TA_Line_Char.create('¨', "line using diaeresis character '¨'");
	}

	/**
	 * A line using the division character `÷`.
	 * 
	 * ----
	 * ÷÷÷÷÷÷÷÷÷÷
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char division(){
		return TA_Line_Char.create('÷', "line using division character '÷'");
	}

	/**
	 * A line using the double dagger character `‡`.
	 * 
	 * ----
	 * ‡‡‡‡‡‡‡‡‡‡
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char doubleDagger(){
		return TA_Line_Char.create('‡', "line using double dagger character '‡'");
	}

	/**
	 * A line using the em dash character `—`.
	 * 
	 * ----
	 * ——————————
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char emdash(){
		return TA_Line_Char.create('—', "line using em dash character '—'");
	}

	/**
	 * A line using the en dash character `–`.
	 * 
	 * ----
	 * ––––––––––
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char endash(){
		return TA_Line_Char.create('–', "line using en dash character '–'");
	}

	/**
	 * A line using the full block character `█`.
	 * 
	 * ----
	 * ██████████
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char fullBlock(){
		return TA_Line_Char.create('█', "line using full block character '█'");
	}

	/**
	 * A line using the high density dotted character `▓`.
	 * 
	 * ----
	 * ▓▓▓▓▓▓▓▓▓▓
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char highDensityDotted(){
		return TA_Line_Char.create('▓', "line using high density dotted character '▓'");
	}

	/**
	 * A line using the horizontal ellipsis character `…`.
	 * 
	 * ----
	 * …………………………
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char horizontalEllipsis(){
		return TA_Line_Char.create('…', "line using horizontal ellipsis character '…'");
	}

	/**
	 * A line using the infinity character `∞`.
	 * 
	 * ----
	 * ∞∞∞∞∞∞∞∞∞∞
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char infinity(){
		return TA_Line_Char.create('∞', "line using infinity character '∞'");
	}

	/**
	 * A line using the inverted exclamation mark character `¡`.
	 * 
	 * ----
	 * ¡¡¡¡¡¡¡¡¡¡
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char invertedExclamationMark(){
		return TA_Line_Char.create('¡', "line using inverted exclamation mark character '¡'");
	}

	/**
	 * A line using the inverted question mark character `¿`.
	 * 
	 * ----
	 * ¿¿¿¿¿¿¿¿¿¿
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char invertedQuestionMark(){
		return TA_Line_Char.create('¿', "line using inverted question mark character '¿'");
	}

	/**
	 * A line using the left double angle quotes character `«`.
	 * 
	 * ----
	 * ««««««««««
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char ldaq(){
		return TA_Line_Char.create('«', "line using left double angle quotes character '«'");
	}

	/**
	 * A line using the left double quotation mark character `“`.
	 * 
	 * ----
	 * ““““““““““
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char ldqm(){
		return TA_Line_Char.create('“', "line using left double quotation mark character '“'");
	}

	/**
	 * A line using the left half block character `▌`.
	 * 
	 * ----
	 * ▌▌▌▌▌▌▌▌▌▌
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char leftHalfBlock(){
		return TA_Line_Char.create('▌', "line using left half block character '▌'");
	}

	/**
	 * A line using the low density dotted character `░`.
	 * 
	 * ----
	 * ░░░░░░░░░░
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char lowDensityDotted(){
		return TA_Line_Char.create('░', "line using low density dotted character '░'");
	}

	/**
	 * A line using the lower half block character `▄`.
	 * 
	 * ----
	 * ▄▄▄▄▄▄▄▄▄▄
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char lowerHalfBlock(){
		return TA_Line_Char.create('▄', "line using lower half block character '▄'");
	}

	/**
	 * A line using the left single quotation mark character `‘`.
	 * 
	 * ----
	 * ‘‘‘‘‘‘‘‘‘‘
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char lsqm(){
		return TA_Line_Char.create('‘', "line using left single quotation mark character '‘'");
	}

	/**
	 * A line using the macron character `¯`.
	 * 
	 * ----
	 * ¯¯¯¯¯¯¯¯¯¯
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char macron(){
		return TA_Line_Char.create('¯', "line using macron character '¯'");
	}

	/**
	 * A line using the masculine ordinal indicator character `º`.
	 * 
	 * ----
	 * ºººººººººº
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char masculineOrdinalIndicator(){
		return TA_Line_Char.create('º', "line using masculine ordinal indicator character 'º'");
	}

	/**
	 * A line using the medium density dotted character `▒`.
	 * 
	 * ----
	 * ▒▒▒▒▒▒▒▒▒▒
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char mediumDensityDotted(){
		return TA_Line_Char.create('▒', "line using medium density dotted character '▒'");
	}

	/**
	 * A line using the middle dot character `·`.
	 * 
	 * ----
	 * ··········
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char middleDot(){
		return TA_Line_Char.create('·', "line using middle dot character '·'");
	}

	/**
	 * A line using the not character `¬`.
	 * 
	 * ----
	 * ¬¬¬¬¬¬¬¬¬¬
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char not(){
		return TA_Line_Char.create('¬', "line using not character '¬'");
	}

	/**
	 * A line using the paragraph character `¶`.
	 * 
	 * ----
	 * ¶¶¶¶¶¶¶¶¶¶
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char paragraph(){
		return TA_Line_Char.create('¶', "line using paragraph character '¶'");
	}

	/**
	 * A line using the permille character `‰`.
	 * 
	 * ----
	 * ‰‰‰‰‰‰‰‰‰‰
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char permille(){
		return TA_Line_Char.create('‰', "line using permille character '‰'");
	}

	/**
	 * A line using the plusminus character `±`.
	 * 
	 * ----
	 * ±±±±±±±±±±
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char plusminus(){
		return TA_Line_Char.create('±', "line using plusminus character '±'");
	}

	/**
	 * A line using the right double angle quotes character `»`.
	 * 
	 * ----
	 * »»»»»»»»»»
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char rdaq(){
		return TA_Line_Char.create('»', "line using right double angle quotes character '»'");
	}

	/**
	 * A line using the right double quotation mark character `”`.
	 * 
	 * ----
	 * ””””””””””
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char rdqm(){
		return TA_Line_Char.create('”', "line using right double quotation mark character '”'");
	}

	/**
	 * A line using the registered trade mark character `®`.
	 * 
	 * ----
	 * ®®®®®®®®®®
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char registeredTradeMark(){
		return TA_Line_Char.create('®', "line using registered trade mark character '®'");
	}

	/**
	 * A line using the right half block character `▐`.
	 * 
	 * ----
	 * ▐▐▐▐▐▐▐▐▐▐
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char rightHalfBlock(){
		return TA_Line_Char.create('▐', "line using right half block character '▐'");
	}

	/**
	 * A line using the right single quotation mark character `’`.
	 * 
	 * ----
	 * ’’’’’’’’’’
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char rsqm(){
		return TA_Line_Char.create('’', "line using right single quotation mark character '’'");
	}

	/**
	 * A line using the section character `§`.
	 * 
	 * ----
	 * §§§§§§§§§§
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char section(){
		return TA_Line_Char.create('§', "line using section character '§'");
	}

	/**
	 * A line using the single left-pointing angle quotation mark character `‹`.
	 * 
	 * ----
	 * ‹‹‹‹‹‹‹‹‹‹
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char slpaqm(){
		return TA_Line_Char.create('‹', "line using single left-pointing angle quotation mark character '‹'");
	}

	/**
	 * A line using the soft hyphen character `­`.
	 * 
	 * ----
	 * ­­­­­­­­­­
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char softHyphen(){
		return TA_Line_Char.create('­', "line using soft hyphen character '­'");
	}

	/**
	 * A line using the single right-pointing angle quotation mark character `›`.
	 * 
	 * ----
	 * ››››››››››
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char srpaqm(){
		return TA_Line_Char.create('›', "line using single right-pointing angle quotation mark character '›'");
	}

	/**
	 * A line using the times character `×`.
	 * 
	 * ----
	 * ××××××××××
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char times(){
		return TA_Line_Char.create('×', "line using times character '×'");
	}

	/**
	 * A line using the upper half block character `▀`.
	 * 
	 * ----
	 * ▀▀▀▀▀▀▀▀▀▀
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char upperHalfBlock(){
		return TA_Line_Char.create('▀', "line using upper half block character '▀'");
	}

}


//ASC7_LINE_UNDERLINE				('‗', '‗', '‗', '‗', '‗', '‗', "character '‗' line"),
//ASC7_LINE_BULLET_OP				('∙', '∙', '∙', '∙', '∙', '∙', "character '∙' line"),
//ASC7_LINE_GT					('≥', '≥', '≥', '≥', '≥', '≥', "character '≥' line"),
//ASC7_LINE_LT					('≤', '≤', '≤', '≤', '≤', '≤', "character '≤' line"),