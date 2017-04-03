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

import de.vandermeer.asciithemes.TA_Border_Chars;
import de.vandermeer.asciithemes.TA_Corner_Chars;
import de.vandermeer.asciithemes.TA_Frame;

/**
 * Collection of {@link TA_Frame} for extended ASCII characters.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170331 (31-Mar-17) for Java 1.8
 * @since      v0.0.1
 */
public abstract class A8_Frames_SameChar {

	/**
	 * A frame using the acute accent character `´`.
	 * 
	 * ----
	 * ´´´´´´´´´´´´´´´´´´´
	 * ´Lorem ipsum dolor´
	 * ´Lorem ipsum dolor´
	 * ´´´´´´´´´´´´´´´´´´´
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame acuteAccent(){
		return TA_Frame.create(
				A8_Lines_SameChar.acuteAccent(),
				TA_Corner_Chars.create('´', '´', '´', '´', "corner tuple using acute accent character '´'"),
				TA_Border_Chars.create('´', '´', "border pair using acute accent character '´'"),
				"frame using acute accent character '´'"
		);
	}

	/**
	 * A frame using the almost equal character `≈`.
	 * 
	 * ----
	 * ≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈
	 * ≈Lorem ipsum dolor≈
	 * ≈Lorem ipsum dolor≈
	 * ≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame almostEqual(){
		return TA_Frame.create(
				A8_Lines_SameChar.almostEqual(),
				TA_Corner_Chars.create('≈', '≈', '≈', '≈', "corner tuple using almost equal character '≈'"),
				TA_Border_Chars.create('≈', '≈', "border pair using almost equal character '≈'"),
				"frame using almost equal character '≈'"
		);
	}

	/**
	 * A frame using the black square character `■`.
	 * 
	 * ----
	 * ■■■■■■■■■■■■■■■■■■■
	 * ■Lorem ipsum dolor■
	 * ■Lorem ipsum dolor■
	 * ■■■■■■■■■■■■■■■■■■■
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame blackSquare(){
		return TA_Frame.create(
				A8_Lines_SameChar.blackSquare(),
				TA_Corner_Chars.create('■', '■', '■', '■', "corner tuple using black square character '■'"),
				TA_Border_Chars.create('■', '■', "border pair using black square character '■'"),
				"frame using black square character '■'"
		);
	}

	/**
	 * A frame using the broken pipe character `¦`.
	 * 
	 * ----
	 * ¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦
	 * ¦Lorem ipsum dolor¦
	 * ¦Lorem ipsum dolor¦
	 * ¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame brokenPipe(){
		return TA_Frame.create(
				A8_Lines_SameChar.brokenPipe(),
				TA_Corner_Chars.create('¦', '¦', '¦', '¦', "corner tuple using broken pipe character '¦'"),
				TA_Border_Chars.create('¦', '¦', "border pair using broken pipe character '¦'"),
				"frame using broken pipe character '¦'"
		);
	}

	/**
	 * A frame using the bullet character `•`.
	 * 
	 * ----
	 * •••••••••••••••••••
	 * •Lorem ipsum dolor•
	 * •Lorem ipsum dolor•
	 * •••••••••••••••••••
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame bullet(){
		return TA_Frame.create(
				A8_Lines_SameChar.bullet(),
				TA_Corner_Chars.create('•', '•', '•', '•', "corner tuple using bullet character '•'"),
				TA_Border_Chars.create('•', '•', "border pair using bullet character '•'"),
				"frame using bullet character '•'"
		);
	}

	/**
	 * A frame using the cedilla character `¸`.
	 * 
	 * ----
	 * ¸¸¸¸¸¸¸¸¸¸¸¸¸¸¸¸¸¸¸
	 * ¸Lorem ipsum dolor¸
	 * ¸Lorem ipsum dolor¸
	 * ¸¸¸¸¸¸¸¸¸¸¸¸¸¸¸¸¸¸¸
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame cedilla(){
		return TA_Frame.create(
				A8_Lines_SameChar.cedilla(),
				TA_Corner_Chars.create('¸', '¸', '¸', '¸', "corner tuple using cedilla character '¸'"),
				TA_Border_Chars.create('¸', '¸', "border pair using cedilla character '¸'"),
				"frame using cedilla character '¸'"
		);
	}

	/**
	 * A frame using the congruence character `≡`.
	 * 
	 * ----
	 * ≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡
	 * ≡Lorem ipsum dolor≡
	 * ≡Lorem ipsum dolor≡
	 * ≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame congruence(){
		return TA_Frame.create(
				A8_Lines_SameChar.congruence(),
				TA_Corner_Chars.create('≡', '≡', '≡', '≡', "corner tuple using congruence character '≡'"),
				TA_Border_Chars.create('≡', '≡', "border pair using congruence character '≡'"),
				"frame using congruence character '≡'"
		);
	}

	/**
	 * A frame using the copyright character `©`.
	 * 
	 * ----
	 * ©©©©©©©©©©©©©©©©©©©
	 * ©Lorem ipsum dolor©
	 * ©Lorem ipsum dolor©
	 * ©©©©©©©©©©©©©©©©©©©
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame copyright(){
		return TA_Frame.create(
				A8_Lines_SameChar.copyright(),
				TA_Corner_Chars.create('©', '©', '©', '©', "corner tuple using copyright character '©'"),
				TA_Border_Chars.create('©', '©', "border pair using copyright character '©'"),
				"frame using copyright character '©'"
		);
	}

	/**
	 * A frame using the currency character `¤`.
	 * 
	 * ----
	 * ¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤
	 * ¤Lorem ipsum dolor¤
	 * ¤Lorem ipsum dolor¤
	 * ¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame currency(){
		return TA_Frame.create(
				A8_Lines_SameChar.currency(),
				TA_Corner_Chars.create('¤', '¤', '¤', '¤', "corner tuple using currency character '¤'"),
				TA_Border_Chars.create('¤', '¤', "border pair using currency character '¤'"),
				"frame using currency character '¤'"
		);
	}

	/**
	 * A frame using the dagger character `†`.
	 * 
	 * ----
	 * †††††††††††††††††††
	 * †Lorem ipsum dolor†
	 * †Lorem ipsum dolor†
	 * †††††††††††††††††††
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame dagger(){
		return TA_Frame.create(
				A8_Lines_SameChar.dagger(),
				TA_Corner_Chars.create('†', '†', '†', '†', "corner tuple using dagger character '†'"),
				TA_Border_Chars.create('†', '†', "border pair using dagger character '†'"),
				"frame using dagger character '†'"
		);
	}

	/**
	 * A frame using the degree character `°`.
	 * 
	 * ----
	 * °°°°°°°°°°°°°°°°°°°
	 * °Lorem ipsum dolor°
	 * °Lorem ipsum dolor°
	 * °°°°°°°°°°°°°°°°°°°
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame degree(){
		return TA_Frame.create(
				A8_Lines_SameChar.degree(),
				TA_Corner_Chars.create('°', '°', '°', '°', "corner tuple using degree character '°'"),
				TA_Border_Chars.create('°', '°', "border pair using degree character '°'"),
				"frame using degree character '°'"
		);
	}

	/**
	 * A frame using the diaeresis character `¨`.
	 * 
	 * ----
	 * ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
	 * ¨Lorem ipsum dolor¨
	 * ¨Lorem ipsum dolor¨
	 * ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame diaeresis(){
		return TA_Frame.create(
				A8_Lines_SameChar.diaeresis(),
				TA_Corner_Chars.create('¨', '¨', '¨', '¨', "corner tuple using diaeresis character '¨'"),
				TA_Border_Chars.create('¨', '¨', "border pair using diaeresis character '¨'"),
				"frame using plus character '¨'"
		);
	}

	/**
	 * A frame using the division character `÷`.
	 * 
	 * ----
	 * ÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷
	 * ÷Lorem ipsum dolor÷
	 * ÷Lorem ipsum dolor÷
	 * ÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame division(){
		return TA_Frame.create(
				A8_Lines_SameChar.division(),
				TA_Corner_Chars.create('÷', '÷', '÷', '÷', "corner tuple using division character '÷'"),
				TA_Border_Chars.create('÷', '÷', "border pair using division character '÷'"),
				"frame using division character '÷'"
		);
	}

	/**
	 * A frame using the double dagger character `‡`.
	 * 
	 * ----
	 * ‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡
	 * ‡Lorem ipsum dolor‡
	 * ‡Lorem ipsum dolor‡
	 * ‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame doubleDagger(){
		return TA_Frame.create(
				A8_Lines_SameChar.doubleDagger(),
				TA_Corner_Chars.create('‡', '‡', '‡', '‡', "corner tuple using double dagger character '‡'"),
				TA_Border_Chars.create('‡', '‡', "border pair using double dagger character '‡'"),
				"frame using double dagger character '‡'"
		);
	}

	/**
	 * A frame using the em dash character `—`.
	 * 
	 * ----
	 * ———————————————————
	 * —Lorem ipsum dolor—
	 * —Lorem ipsum dolor—
	 * ———————————————————
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame emdash(){
		return TA_Frame.create(
				A8_Lines_SameChar.emdash(),
				TA_Corner_Chars.create('—', '—', '—', '—', "corner tuple using em dash character '—'"),
				TA_Border_Chars.create('—', '—', "border pair using em dash character '—'"),
				"frame using em dash character '—'"
		);
	}

	/**
	 * A frame using the en dash character `–`.
	 * 
	 * ----
	 * –––––––––––––––––––
	 * –Lorem ipsum dolor–
	 * –Lorem ipsum dolor–
	 * –––––––––––––––––––
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame endash(){
		return TA_Frame.create(
				A8_Lines_SameChar.endash(),
				TA_Corner_Chars.create('–', '–', '–', '–', "corner tuple using en dash character '–'"),
				TA_Border_Chars.create('–', '–', "border pair using en dash character '–'"),
				"frame using en dash character '–'"
		);
	}

	/**
	 * A frame using the full block character `█`.
	 * 
	 * ----
	 * ███████████████████
	 * █Lorem ipsum dolor█
	 * █Lorem ipsum dolor█
	 * ███████████████████
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame fullBlock(){
		return TA_Frame.create(
				A8_Lines_SameChar.fullBlock(),
				TA_Corner_Chars.create('█', '█', '█', '█', "corner tuple using full block character '█'"),
				TA_Border_Chars.create('█', '█', "border pair using full block character '█'"),
				"frame using full block character '█'"
		);
	}

	/**
	 * A frame using the high density dotted character `▓`.
	 * 
	 * ----
	 * ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
	 * ▓Lorem ipsum dolor▓
	 * ▓Lorem ipsum dolor▓
	 * ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame highDensityDotted(){
		return TA_Frame.create(
				A8_Lines_SameChar.highDensityDotted(),
				TA_Corner_Chars.create('▓', '▓', '▓', '▓', "corner tuple using high density dotted character '▓'"),
				TA_Border_Chars.create('▓', '▓', "border pair using high density dotted character '▓'"),
				"frame using high density dotted character '▓'"
		);
	}

	/**
	 * A frame using the horizontal ellipsis character `…`.
	 * 
	 * ----
	 * …………………………………………………
	 * …Lorem ipsum dolor…
	 * …Lorem ipsum dolor…
	 * …………………………………………………
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame horizontalEllipsis(){
		return TA_Frame.create(
				A8_Lines_SameChar.horizontalEllipsis(),
				TA_Corner_Chars.create('…', '…', '…', '…', "corner tuple using horizontal ellipsis character '…'"),
				TA_Border_Chars.create('…', '…', "border pair using horizontal ellipsis character '…'"),
				"frame using horizontal ellipsis character '…'"
		);
	}

	/**
	 * A frame using the infinity character `∞`.
	 * 
	 * ----
	 * ∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞
	 * ∞Lorem ipsum dolor∞
	 * ∞Lorem ipsum dolor∞
	 * ∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame infinity(){
		return TA_Frame.create(
				A8_Lines_SameChar.infinity(),
				TA_Corner_Chars.create('∞', '∞', '∞', '∞', "corner tuple using infinity character '∞'"),
				TA_Border_Chars.create('∞', '∞', "border pair using infinity character '∞'"),
				"frame using infinity character '∞'"
		);
	}

	/**
	 * A frame using the inverted exclamation mark character `¡`.
	 * 
	 * ----
	 * ¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡
	 * ¡Lorem ipsum dolor¡
	 * ¡Lorem ipsum dolor¡
	 * ¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame invertedExclamationMark(){
		return TA_Frame.create(
				A8_Lines_SameChar.invertedExclamationMark(),
				TA_Corner_Chars.create('¡', '¡', '¡', '¡', "corner tuple using inverted exclamation mark character '¡'"),
				TA_Border_Chars.create('¡', '¡', "border pair using inverted exclamation mark character '¡'"),
				"frame using inverted exclamation mark character '¡'"
		);
	}

	/**
	 * A frame using the inverted question mark character `¿`.
	 * 
	 * ----
	 * ¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿
	 * ¿Lorem ipsum dolor¿
	 * ¿Lorem ipsum dolor¿
	 * ¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame invertedQuestionMark(){
		return TA_Frame.create(
				A8_Lines_SameChar.invertedQuestionMark(),
				TA_Corner_Chars.create('¿', '¿', '¿', '¿', "corner tuple using inverted question mark character '¿'"),
				TA_Border_Chars.create('¿', '¿', "border pair using inverted question mark character '¿'"),
				"frame using inverted question mark character '¿'"
		);
	}

	/**
	 * A frame using the left double angle quotes character `«`.
	 * 
	 * ----
	 * «««««««««««««««««««
	 * «Lorem ipsum dolor«
	 * «Lorem ipsum dolor«
	 * «««««««««««««««««««
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame ldaq(){
		return TA_Frame.create(
				A8_Lines_SameChar.ldaq(),
				TA_Corner_Chars.create('«', '«', '«', '«', "corner tuple using left double angle quotes character '«'"),
				TA_Border_Chars.create('«', '«', "border pair using left double angle quotes character '«'"),
				"frame using left double angle quotes character '«'"
		);
	}

	/**
	 * A frame using the left double quotation mark character `“`.
	 * 
	 * ----
	 * “““““““““““““““““““
	 * “Lorem ipsum dolor“
	 * “Lorem ipsum dolor“
	 * “““““““““““““““““““
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame ldqm(){
		return TA_Frame.create(
				A8_Lines_SameChar.ldqm(),
				TA_Corner_Chars.create('“', '“', '“', '“', "corner tuple using left double quotation mark character '“'"),
				TA_Border_Chars.create('“', '“', "border pair using left double quotation mark character '“'"),
				"frame using left double quotation mark character '“'"
		);
	}

	/**
	 * A frame using the left half block character `▌`.
	 * 
	 * ----
	 * ▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌
	 * ▌Lorem ipsum dolor▌
	 * ▌Lorem ipsum dolor▌
	 * ▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame leftHalfBlock(){
		return TA_Frame.create(
				A8_Lines_SameChar.leftHalfBlock(),
				TA_Corner_Chars.create('▌', '▌', '▌', '▌', "corner tuple using left half block character '▌'"),
				TA_Border_Chars.create('▌', '▌', "border pair using left half block character '▌'"),
				"frame using left half block character '▌'"
		);
	}

	/**
	 * A frame using the low density dotted character `░`.
	 * 
	 * ----
	 * ░░░░░░░░░░░░░░░░░░░
	 * ░Lorem ipsum dolor░
	 * ░Lorem ipsum dolor░
	 * ░░░░░░░░░░░░░░░░░░░
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame lowDensityDotted(){
		return TA_Frame.create(
				A8_Lines_SameChar.lowDensityDotted(),
				TA_Corner_Chars.create('░', '░', '░', '░', "corner tuple using low density dotted character '░'"),
				TA_Border_Chars.create('░', '░', "border pair using low density dotted character '░'"),
				"frame using low density dotted character '░'"
		);
	}

	/**
	 * A frame using the lower half block character `▄`.
	 * 
	 * ----
	 * ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄
	 * ▄Lorem ipsum dolor▄
	 * ▄Lorem ipsum dolor▄
	 * ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame lowerHalfBlock(){
		return TA_Frame.create(
				A8_Lines_SameChar.lowerHalfBlock(),
				TA_Corner_Chars.create('▄', '▄', '▄', '▄', "corner tuple using lower half block character '▄'"),
				TA_Border_Chars.create('▄', '▄', "border pair using lower half block character '▄'"),
				"frame using lower half block character '▄'"
		);
	}

	/**
	 * A frame using the left single quotation mark character `‘`.
	 * 
	 * ----
	 * ‘‘‘‘‘‘‘‘‘‘‘‘‘‘‘‘‘‘‘
	 * ‘Lorem ipsum dolor‘
	 * ‘Lorem ipsum dolor‘
	 * ‘‘‘‘‘‘‘‘‘‘‘‘‘‘‘‘‘‘‘
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame lsqm(){
		return TA_Frame.create(
				A8_Lines_SameChar.lsqm(),
				TA_Corner_Chars.create('‘', '‘', '‘', '‘', "corner tuple using left single quotation mark character '‘'"),
				TA_Border_Chars.create('‘', '‘', "border pair using left single quotation mark character '‘'"),
				"frame using left single quotation mark character '‘'"
		);
	}

	/**
	 * A frame using the macron character `¯`.
	 * 
	 * ----
	 * ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯
	 * ¯Lorem ipsum dolor¯
	 * ¯Lorem ipsum dolor¯
	 * ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame macron(){
		return TA_Frame.create(
				A8_Lines_SameChar.macron(),
				TA_Corner_Chars.create('¯', '¯', '¯', '¯', "corner tuple using macron character '¯'"),
				TA_Border_Chars.create('¯', '¯', "border pair using macron character '¯'"),
				"frame using macron character '¯'"
		);
	}

	/**
	 * A frame using the masculine ordinal indicator character `º`.
	 * 
	 * ----
	 * ººººººººººººººººººº
	 * ºLorem ipsum dolorº
	 * ºLorem ipsum dolorº
	 * ººººººººººººººººººº
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame masculineOrdinalIndicator(){
		return TA_Frame.create(
				A8_Lines_SameChar.masculineOrdinalIndicator(),
				TA_Corner_Chars.create('º', 'º', 'º', 'º', "corner tuple using masculine ordinal indicator character 'º'"),
				TA_Border_Chars.create('º', 'º', "border pair using masculine ordinal indicator character 'º'"),
				"frame using masculine ordinal indicator character 'º'"
		);
	}

	/**
	 * A frame using the medium density dotted character `▒`.
	 * 
	 * ----
	 * ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
	 * ▒Lorem ipsum dolor▒
	 * ▒Lorem ipsum dolor▒
	 * ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame mediumDensityDotted(){
		return TA_Frame.create(
				A8_Lines_SameChar.mediumDensityDotted(),
				TA_Corner_Chars.create('▒', '▒', '▒', '▒', "corner tuple using medium density dotted character '▒'"),
				TA_Border_Chars.create('▒', '▒', "border pair using medium density dotted character '▒'"),
				"frame using medium density dotted character '▒'"
		);
	}

	/**
	 * A frame using the middle dot character `·`.
	 * 
	 * ----
	 * ···················
	 * ·Lorem ipsum dolor·
	 * ·Lorem ipsum dolor·
	 * ···················
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame middleDot(){
		return TA_Frame.create(
				A8_Lines_SameChar.middleDot(),
				TA_Corner_Chars.create('·', '·', '·', '·', "corner tuple using middle dot character '·'"),
				TA_Border_Chars.create('·', '·', "border pair using middle dot character '·'"),
				"frame using middle dot character '·'"
		);
	}

	/**
	 * A frame using the not character `¬`.
	 * 
	 * ----
	 * ¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬
	 * ¬Lorem ipsum dolor¬
	 * ¬Lorem ipsum dolor¬
	 * ¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame not(){
		return TA_Frame.create(
				A8_Lines_SameChar.not(),
				TA_Corner_Chars.create('¬', '¬', '¬', '¬', "corner tuple using not character '¬'"),
				TA_Border_Chars.create('¬', '¬', "border pair using not character '¬'"),
				"frame using not character '¬'"
		);
	}

	/**
	 * A frame using the paragraph character `¶`.
	 * 
	 * ----
	 * ¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶
	 * ¶Lorem ipsum dolor¶
	 * ¶Lorem ipsum dolor¶
	 * ¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame paragraph(){
		return TA_Frame.create(
				A8_Lines_SameChar.paragraph(),
				TA_Corner_Chars.create('¶', '¶', '¶', '¶', "corner tuple using paragraph character '¶'"),
				TA_Border_Chars.create('¶', '¶', "border pair using paragraph character '¶'"),
				"frame using paragraph character '¶'"
		);
	}

	/**
	 * A frame using the permille character `‰`.
	 * 
	 * ----
	 * ‰‰‰‰‰‰‰‰‰‰‰‰‰‰‰‰‰‰‰
	 * ‰Lorem ipsum dolor‰
	 * ‰Lorem ipsum dolor‰
	 * ‰‰‰‰‰‰‰‰‰‰‰‰‰‰‰‰‰‰‰
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame permille(){
		return TA_Frame.create(
				A8_Lines_SameChar.permille(),
				TA_Corner_Chars.create('‰', '‰', '‰', '‰', "corner tuple using permille character '‰'"),
				TA_Border_Chars.create('‰', '‰', "border pair using permille character '‰'"),
				"frame using permille character '‰'"
		);
	}

	/**
	 * A frame using the plusminus character `±`.
	 * 
	 * ----
	 * ±±±±±±±±±±±±±±±±±±±
	 * ±Lorem ipsum dolor±
	 * ±Lorem ipsum dolor±
	 * ±±±±±±±±±±±±±±±±±±±
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame plusminus(){
		return TA_Frame.create(
				A8_Lines_SameChar.plusminus(),
				TA_Corner_Chars.create('±', '±', '±', '±', "corner tuple using plusminus character '±'"),
				TA_Border_Chars.create('±', '±', "border pair using plusminus character '±'"),
				"frame using plusminus character '±'"
		);
	}

	/**
	 * A frame using the right double angle quotes character `»`.
	 * 
	 * ----
	 * »»»»»»»»»»»»»»»»»»»
	 * »Lorem ipsum dolor»
	 * »Lorem ipsum dolor»
	 * »»»»»»»»»»»»»»»»»»»
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame rdaq(){
		return TA_Frame.create(
				A8_Lines_SameChar.rdaq(),
				TA_Corner_Chars.create('»', '»', '»', '»', "corner tuple using right double angle quotes character '»'"),
				TA_Border_Chars.create('»', '»', "border pair using right double angle quotes character '»'"),
				"frame using right double angle quotes character '»'"
		);
	}

	/**
	 * A frame using the right double quotation mark character `”`.
	 * 
	 * ----
	 * ”””””””””””””””””””
	 * ”Lorem ipsum dolor”
	 * ”Lorem ipsum dolor”
	 * ”””””””””””””””””””
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame rdqm(){
		return TA_Frame.create(
				A8_Lines_SameChar.rdqm(),
				TA_Corner_Chars.create('”', '”', '”', '”', "corner tuple using right double quotation mark character '”'"),
				TA_Border_Chars.create('”', '”', "border pair using right double quotation mark character '”'"),
				"frame using right double quotation mark character '”'"
		);
	}

	/**
	 * A frame using the registered trade mark character `®`.
	 * 
	 * ----
	 * ®®®®®®®®®®®®®®®®®®®
	 * ®Lorem ipsum dolor®
	 * ®Lorem ipsum dolor®
	 * ®®®®®®®®®®®®®®®®®®®
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame registeredTradeMark(){
		return TA_Frame.create(
				A8_Lines_SameChar.registeredTradeMark(),
				TA_Corner_Chars.create('®', '®', '®', '®', "corner tuple using registered trade mark character '®'"),
				TA_Border_Chars.create('®', '®', "border pair using registered trade mark character '®'"),
				"frame using registered trade mark character '®'"
		);
	}

	/**
	 * A frame using the right half block character `▐`.
	 * 
	 * ----
	 * ▐▐▐▐▐▐▐▐▐▐▐▐▐▐▐▐▐▐▐
	 * ▐Lorem ipsum dolor▐
	 * ▐Lorem ipsum dolor▐
	 * ▐▐▐▐▐▐▐▐▐▐▐▐▐▐▐▐▐▐▐
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame rightHalfBlock(){
		return TA_Frame.create(
				A8_Lines_SameChar.rightHalfBlock(),
				TA_Corner_Chars.create('▐', '▐', '▐', '▐', "corner tuple using right half block character '▐'"),
				TA_Border_Chars.create('▐', '▐', "border pair using right half block character '▐'"),
				"frame using right half block character '▐'"
		);
	}

	/**
	 * A frame using the right single quotation mark character `’`.
	 * 
	 * ----
	 * ’’’’’’’’’’’’’’’’’’’
	 * ’Lorem ipsum dolor’
	 * ’Lorem ipsum dolor’
	 * ’’’’’’’’’’’’’’’’’’’
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame rsqm(){
		return TA_Frame.create(
				A8_Lines_SameChar.rsqm(),
				TA_Corner_Chars.create('’', '’', '’', '’', "corner tuple using right single quotation mark character '’'"),
				TA_Border_Chars.create('’', '’', "border pair using right single quotation mark character '’'"),
				"frame using right single quotation mark character '’'"
		);
	}

	/**
	 * A frame using the section character `§`.
	 * 
	 * ----
	 * §§§§§§§§§§§§§§§§§§§
	 * §Lorem ipsum dolor§
	 * §Lorem ipsum dolor§
	 * §§§§§§§§§§§§§§§§§§§
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame section(){
		return TA_Frame.create(
				A8_Lines_SameChar.section(),
				TA_Corner_Chars.create('§', '§', '§', '§', "corner tuple using section character '§'"),
				TA_Border_Chars.create('§', '§', "border pair using section character '§'"),
				"frame using section character '§'"
		);
	}

	/**
	 * A frame using the single left-pointing angle quotation mark character `‹`.
	 * 
	 * ----
	 * ‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹
	 * ‹Lorem ipsum dolor‹
	 * ‹Lorem ipsum dolor‹
	 * ‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame slpaqm(){
		return TA_Frame.create(
				A8_Lines_SameChar.slpaqm(),
				TA_Corner_Chars.create('‹', '‹', '‹', '‹', "corner tuple using single left-pointing angle quotation mark character '‹'"),
				TA_Border_Chars.create('‹', '‹', "border pair using single left-pointing angle quotation mark character '‹'"),
				"frame using single left-pointing angle quotation mark character '‹'"
		);
	}

	/**
	 * A frame using the soft hyphen character `­`.
	 * 
	 * ----
	 * ­­­­­­­­­­­­­­­­­­­
	 * ­Lorem ipsum dolor­
	 * ­Lorem ipsum dolor­
	 * ­­­­­­­­­­­­­­­­­­­
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame softHyphen(){
		return TA_Frame.create(
				A8_Lines_SameChar.softHyphen(),
				TA_Corner_Chars.create('­', '­', '­', '­', "corner tuple using soft hyphen character '­'"),
				TA_Border_Chars.create('­', '­', "border pair using soft hyphen character '­'"),
				"frame using soft hyphen character '­'"
		);
	}

	/**
	 * A frame using the single right-pointing angle quotation mark character `›`.
	 * 
	 * ----
	 * ›››››››››››››››››››
	 * ›Lorem ipsum dolor›
	 * ›Lorem ipsum dolor›
	 * ›››››››››››››››››››
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame srpaqm(){
		return TA_Frame.create(
				A8_Lines_SameChar.srpaqm(),
				TA_Corner_Chars.create('›', '›', '›', '›', "corner tuple using single right-pointing angle quotation mark character '›'"),
				TA_Border_Chars.create('›', '›', "border pair using single right-pointing angle quotation mark character '›'"),
				"frame using single right-pointing angle quotation mark character '›'"
		);
	}

	/**
	 * A frame using the times character `×`.
	 * 
	 * ----
	 * ×××××××××××××××××××
	 * ×Lorem ipsum dolor×
	 * ×Lorem ipsum dolor×
	 * ×××××××××××××××××××
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame times(){
		return TA_Frame.create(
				A8_Lines_SameChar.times(),
				TA_Corner_Chars.create('×', '×', '×', '×', "corner tuple using times character '×'"),
				TA_Border_Chars.create('×', '×', "border pair using times character '×'"),
				"frame using times character '×'"
		);
	}

	/**
	 * A frame using the upper half block character `▀`.
	 * 
	 * ----
	 * ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
	 * ▀Lorem ipsum dolor▀
	 * ▀Lorem ipsum dolor▀
	 * ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame upperHalfBlock(){
		return TA_Frame.create(
				A8_Lines_SameChar.upperHalfBlock(),
				TA_Corner_Chars.create('▀', '▀', '▀', '▀', "corner tuple using upper half block character '▀'"),
				TA_Border_Chars.create('▀', '▀', "border pair using upper half block character '▀'"),
				"frame using upper half block character '▀'"
		);
	}

}
