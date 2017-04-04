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

import de.vandermeer.asciithemes.TA_EnumerateList;

/**
 * Collection of {@link TA_EnumerateList} for UT-8 characters.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170404 (04-Apr-17) for Java 1.8
 * @since      v0.0.1
 */
public abstract class U8_EnumerateLists {

	/**
	 * An enumerate using {@link U8_NumberingSchemes#numberSubscript()}.
	 * 
	 * ----
	 * ₁ item 1
	 * ₁ item 2
	 *   ₂ item 1
	 *   ₂ item 2
	 *     ₃ item 1
	 *     ₃ item 2
	 * 
	 * ₁. item 1
	 * ₁.₂. item 1/2
	 * ₁.₂.₃. item 1/2/3
	 * ₁.₂.₃.₄. item 1/2/3/4
	 * ₁.₂.₃.₄.₅. item 1/2/3/4/5
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_EnumerateList numberSubscript(){
		return TA_EnumerateList.create(U8_NumberingSchemes.numberSubscript(), "enumerate list using UTF subscript characters for unlimeted levels");
	}

	/**
	 * An enumerate using {@link U8_NumberingSchemes#numberSuperscript()}.
	 * 
	 * ----
	 * ¹ item 1
	 * ¹ item 2
	 *   ² item 1
	 *   ² item 2
	 *     ³ item 1
	 *     ³ item 2
	 * 
	 * ¹. item 1
	 * ¹.². item 1/2
	 * ¹.².³. item 1/2/3
	 * ¹.².³.⁴. item 1/2/3/4
	 * ¹.².³.⁴.⁵. item 1/2/3/4/5
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_EnumerateList numberSuperscript(){
		return TA_EnumerateList.create(U8_NumberingSchemes.numberSuperscript(), "enumerate list using UTF superscript characters for unlimeted levels");
	}

	/**
	 * An enumerate using {@link U8_NumberingSchemes#numberDoubleCircledDigit()}, {@link U8_NumberingSchemes#numberCircledDigit()}, {@link U8_NumberingSchemes#numberDingbatSanserifCircledDigit()}, {@link U8_NumberingSchemes#numberDingbatNegativeSanserifCircledDigit()}, and {@link U8_NumberingSchemes#numberDingbatNegativeCircledDigit()}.
	 * 
	 * ----
	 * ⓵ item 1
	 * ⓵ item 2
	 *   ⓶ item 1
	 *   ⓶ item 2
	 *     ⓷ item 1
	 *     ⓷ item 2
	 * 
	 * ⓵. item 1
	 * ⓵.②. item 1/2
	 * ⓵.②.➂. item 1/2/3
	 * ⓵.②.➂.➍. item 1/2/3/4
	 * ⓵.②.➂.➍.❺. item 1/2/3/4/5
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_EnumerateList arabic_Alpha_alpha_Roman_roman(){
		return TA_EnumerateList.create(
				"enumerate list using the following schemes for 5 levels: double circled numbers, circled numbers, sanserif circled numbers, negative sanserif circled numbers, simple netagive circled numbers",
				U8_NumberingSchemes.numberDoubleCircledDigit(),
				U8_NumberingSchemes.numberCircledDigit(),
				U8_NumberingSchemes.numberDingbatSanserifCircledDigit(),
				U8_NumberingSchemes.numberDingbatNegativeSanserifCircledDigit(),
				U8_NumberingSchemes.numberDingbatNegativeCircledDigit()
		);
	}

	/**
	 * An enumerate using {@link U8_NumberingSchemes#AlphaCircledLatin()}.
	 * 
	 * ----
	 * Ⓐ item 1
	 * Ⓐ item 2
	 *   Ⓑ item 1
	 *   Ⓑ item 2
	 *     Ⓒ item 1
	 *     Ⓒ item 2
	 * 
	 * Ⓐ. item 1
	 * Ⓐ.Ⓑ. item 1/2
	 * Ⓐ.Ⓑ.Ⓒ. item 1/2/3
	 * Ⓐ.Ⓑ.Ⓒ.Ⓓ. item 1/2/3/4
	 * Ⓐ.Ⓑ.Ⓒ.Ⓓ.Ⓔ. item 1/2/3/4/5
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_EnumerateList AlphaCircledLatin(){
		return TA_EnumerateList.create(U8_NumberingSchemes.AlphaCircledLatin(), "enumerate list using UTF Circled Latin Capital (upper case) characters for unlimeted levels");
	}

	/**
	 * An enumerate using {@link U8_NumberingSchemes#alphaCircledLatin()}.
	 * 
	 * ----
	 * ⓐ item 1
	 * ⓐ item 2
	 *   ⓑ item 1
	 *   ⓑ item 2
	 *     ⓒ item 1
	 *     ⓒ item 2
	 * 
	 * ⓐ. item 1
	 * ⓐ.ⓑ. item 1/2
	 * ⓐ.ⓑ.ⓒ. item 1/2/3
	 * ⓐ.ⓑ.ⓒ.ⓓ. item 1/2/3/4
	 * ⓐ.ⓑ.ⓒ.ⓓ.ⓔ. item 1/2/3/4/5
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_EnumerateList alphaCircledLatin(){
		return TA_EnumerateList.create(U8_NumberingSchemes.alphaCircledLatin(), "enumerate list using UTF Circled Latin Capital (lower case) characters for unlimeted levels");
	}

	/**
	 * An enumerate using {@link U8_NumberingSchemes#alphaParenthesizedLatinSmallLetter()}.
	 * 
	 * ----
	 * ⒜ item 1
	 * ⒜ item 2
	 *   ⒝ item 1
	 *   ⒝ item 2
	 *     ⒞ item 1
	 *     ⒞ item 2
	 * 
	 * ⒜. item 1
	 * ⒜.⒝. item 1/2
	 * ⒜.⒝.⒞. item 1/2/3
	 * ⒜.⒝.⒞.⒟. item 1/2/3/4
	 * ⒜.⒝.⒞.⒟.⒠. item 1/2/3/4/5
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_EnumerateList alphaParenthesizedLatinSmallLetter(){
		return TA_EnumerateList.create(U8_NumberingSchemes.alphaParenthesizedLatinSmallLetter(), "enumerate list using UTF Parenthesized Latin Small Letter (lower case) characters for unlimeted levels");
	}

	/**
	 * An enumerate using {@link U8_NumberingSchemes#AlphaFullwidthLatinCapitalLetter()}.
	 * 
	 * ----
	 * Ａ item 1
	 * Ａ item 2
	 *   Ｂ item 1
	 *   Ｂ item 2
	 *     Ｃ item 1
	 *     Ｃ item 2
	 * 
	 * Ａ. item 1
	 * Ａ.Ｂ. item 1/2
	 * Ａ.Ｂ.Ｃ. item 1/2/3
	 * Ａ.Ｂ.Ｃ.Ｄ. item 1/2/3/4
	 * Ａ.Ｂ.Ｃ.Ｄ.Ｅ. item 1/2/3/4/5
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_EnumerateList AlphaFullwidthLatinCapitalLetter(){
		return TA_EnumerateList.create(U8_NumberingSchemes.AlphaFullwidthLatinCapitalLetter(), "enumerate list using UTF Fullwidth Latin Capital Letter (upper case) characters for unlimeted levels");
	}

	/**
	 * An enumerate using {@link U8_NumberingSchemes#alphaFullwidthLatinSmallLetter()}.
	 * 
	 * ----
	 * ａ item 1
	 * ａ item 2
	 *   ｂ item 1
	 *   ｂ item 2
	 *     ｃ item 1
	 *     ｃ item 2
	 * 
	 * ａ. item 1
	 * ａ.ｂ. item 1/2
	 * ａ.ｂ.ｃ. item 1/2/3
	 * ａ.ｂ.ｃ.ｄ. item 1/2/3/4
	 * ａ.ｂ.ｃ.ｄ.ｅ. item 1/2/3/4/5
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_EnumerateList alphaFullwidthLatinSmallLetter(){
		return TA_EnumerateList.create(U8_NumberingSchemes.alphaFullwidthLatinSmallLetter(), "enumerate list using UTF Fullwidth Latin Small Letter (lower case) characters for unlimeted levels");
	}

	/**
	 * An enumerate using {@link U8_NumberingSchemes#numberCircledDigit()}.
	 * 
	 * ----
	 * ① item 1
	 * ① item 2
	 *   ② item 1
	 *   ② item 2
	 *     ③ item 1
	 *     ③ item 2
	 * 
	 * ①. item 1
	 * ①.②. item 1/2
	 * ①.②.③. item 1/2/3
	 * ①.②.③.④. item 1/2/3/4
	 * ①.②.③.④.⑤. item 1/2/3/4/5
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_EnumerateList numberCircledDigit(){
		return TA_EnumerateList.create(U8_NumberingSchemes.numberCircledDigit(), "enumerate list using UTF Circled Digit/Number characters for unlimeted levels");
	}

	/**
	 * An enumerate using {@link U8_NumberingSchemes#numberDoubleCircledDigit()}.
	 * 
	 * ----
	 * ⓵ item 1
	 * ⓵ item 2
	 *   ⓶ item 1
	 *   ⓶ item 2
	 *     ⓷ item 1
	 *     ⓷ item 2
	 * 
	 * ⓵. item 1
	 * ⓵.⓶. item 1/2
	 * ⓵.⓶.⓷. item 1/2/3
	 * ⓵.⓶.⓷.⓸. item 1/2/3/4
	 * ⓵.⓶.⓷.⓸.⓹. item 1/2/3/4/5
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_EnumerateList numberDoubleCircledDigit(){
		return TA_EnumerateList.create(U8_NumberingSchemes.numberDoubleCircledDigit(), "enumerate list using UTF Double Circled Digit/Number characters for unlimeted levels");
	}

	/**
	 * An enumerate using {@link U8_NumberingSchemes#numberDingbatNegativeCircledDigit()}.
	 * 
	 * ----
	 * ❶ item 1
	 * ❶ item 2
	 *   ❷ item 1
	 *   ❷ item 2
	 *     ❸ item 1
	 *     ❸ item 2
	 * 
	 * ❶. item 1
	 * ❶.❷. item 1/2
	 * ❶.❷.❸. item 1/2/3
	 * ❶.❷.❸.❹. item 1/2/3/4
	 * ❶.❷.❸.❹.❺. item 1/2/3/4/5
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_EnumerateList numberDingbatNegativeCircledDigit(){
		return TA_EnumerateList.create(U8_NumberingSchemes.numberDingbatNegativeCircledDigit(), "enumerate list using UTF Dingbat Negative Circled Digit characters for unlimeted levels");
	}

	/**
	 * An enumerate using {@link U8_NumberingSchemes#numberDingbatNegativeSanserifCircledDigit()}.
	 * 
	 * ----
	 * ➊ item 1
	 * ➊ item 2
	 *   ➋ item 1
	 *   ➋ item 2
	 *     ➌ item 1
	 *     ➌ item 2
	 * 
	 * ➊. item 1
	 * ➊.➋. item 1/2
	 * ➊.➋.➌. item 1/2/3
	 * ➊.➋.➌.➍. item 1/2/3/4
	 * ➊.➋.➌.➍.➎. item 1/2/3/4/5
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_EnumerateList numberDingbatNegativeSanserifCircledDigit(){
		return TA_EnumerateList.create(U8_NumberingSchemes.numberDingbatNegativeSanserifCircledDigit(), "enumerate list using UTF Dingbat Negative Sanserif Circled Digit characters for unlimeted levels");
	}

	/**
	 * An enumerate using {@link U8_NumberingSchemes#numberDingbatSanserifCircledDigit()}.
	 * 
	 * ----
	 * ➀ item 1
	 * ➀ item 2
	 *   ➁ item 1
	 *   ➁ item 2
	 *     ➂ item 1
	 *     ➂ item 2
	 * 
	 * ➀. item 1
	 * ➀.➁. item 1/2
	 * ➀.➁.➂. item 1/2/3
	 * ➀.➁.➂.➃. item 1/2/3/4
	 * ➀.➁.➂.➃.➄. item 1/2/3/4/5
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_EnumerateList numberDingbatSanserifCircledDigit(){
		return TA_EnumerateList.create(U8_NumberingSchemes.numberDingbatSanserifCircledDigit(), "enumerate list using UTF Dingbat Sanserif Circled Digit characters for unlimeted levels");
	}

	/**
	 * An enumerate using {@link U8_NumberingSchemes#numberFullStop()}.
	 * 
	 * ----
	 * ⒈ item 1
	 * ⒈ item 2
	 *   ⒉ item 1
	 *   ⒉ item 2
	 *     ⒊ item 1
	 *     ⒊ item 2
	 * 
	 * ⒈. item 1
	 * ⒈⒉ item 1/2
	 * ⒈⒉⒊ item 1/2/3
	 * ⒈⒉⒊⒋ item 1/2/3/4
	 * ⒈⒉⒊⒋⒌ item 1/2/3/4/5
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_EnumerateList numberFullStop(){
		return TA_EnumerateList.create(U8_NumberingSchemes.numberFullStop(), "enumerate list using UTF Full Stop characters for unlimeted levels");
	}

	/**
	 * An enumerate using {@link U8_NumberingSchemes#numberParenthesized()}.
	 * 
	 * ----
	 * ⑴ item 1
	 * ⑴ item 2
	 *   ⑵ item 1
	 *   ⑵ item 2
	 *     ⑶ item 1
	 *     ⑶ item 2
	 * 
	 * ⑴. item 1
	 * ⑴.⑵. item 1/2
	 * ⑴.⑵.⑶. item 1/2/3
	 * ⑴.⑵.⑶.⑷. item 1/2/3/4
	 * ⑴.⑵.⑶.⑷.⑸. item 1/2/3/4/5
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_EnumerateList numberParenthesized(){
		return TA_EnumerateList.create(U8_NumberingSchemes.numberParenthesized(), "enumerate list using UTF Parenthesized Digit/Number characters for unlimeted levels");
	}

	/**
	 * An enumerate using {@link U8_NumberingSchemes#numberFullwidth()}.
	 * 
	 * ----
	 * １ item 1
	 * １ item 2
	 *   ２ item 1
	 *   ２ item 2
	 *     ３ item 1
	 *     ３ item 2
	 * 
	 * １. item 1
	 * １.２. item 1/2
	 * １.２.３. item 1/2/3
	 * １.２.３.４. item 1/2/3/4
	 * １.２.３.４.５. item 1/2/3/4/5
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_EnumerateList numberFullwidth(){
		return TA_EnumerateList.create(U8_NumberingSchemes.numberFullwidth(), "enumerate list using UTF Fullwidth characters for unlimeted levels");
	}

	/**
	 * An enumerate using {@link U8_NumberingSchemes#RomanNumberForms()}.
	 * 
	 * ----
	 * Ⅰ item 1
	 * Ⅰ item 2
	 *   Ⅱ item 1
	 *   Ⅱ item 2
	 *     Ⅲ item 1
	 *     Ⅲ item 2
	 * 
	 * Ⅰ. item 1
	 * Ⅰ.Ⅱ. item 1/2
	 * Ⅰ.Ⅱ.Ⅲ. item 1/2/3
	 * Ⅰ.Ⅱ.Ⅲ.Ⅳ. item 1/2/3/4
	 * Ⅰ.Ⅱ.Ⅲ.Ⅳ.Ⅴ. item 1/2/3/4/5
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_EnumerateList RomanNumberForms(){
		return TA_EnumerateList.create(U8_NumberingSchemes.RomanNumberForms(), "enumerate list using Roman number literals using upper case UTF-8 Number Forms upper case characters for unlimeted levels");
	}

	/**
	 * An enumerate using {@link U8_NumberingSchemes#romanNumberForms()}.
	 * 
	 * ----
	 * ⅰ item 1
	 * ⅰ item 2
	 *   ⅱ item 1
	 *   ⅱ item 2
	 *     ⅲ item 1
	 *     ⅲ item 2
	 * 
	 * ⅰ. item 1
	 * ⅰ.ⅱ. item 1/2
	 * ⅰ.ⅱ.ⅲ. item 1/2/3
	 * ⅰ.ⅱ.ⅲ.ⅳ. item 1/2/3/4
	 * ⅰ.ⅱ.ⅲ.ⅳ.ⅴ. item 1/2/3/4/5
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_EnumerateList romanNumberForms(){
		return TA_EnumerateList.create(U8_NumberingSchemes.romanNumberForms(), "enumerate list using Roman number literals using lower case UTF-8 Number Forms lower case characters for unlimeted levels");
	}

	/**
	 * An enumerate using {@link U8_NumberingSchemes#RomanCircledLatinCapital()}.
	 * 
	 * ----
	 * Ⓘ item 1
	 * Ⓘ item 2
	 *   ⒾⒾ item 1
	 *   ⒾⒾ item 2
	 *     ⒾⒾⒾ item 1
	 *     ⒾⒾⒾ item 2
	 * 
	 * Ⓘ. item 1
	 * Ⓘ.ⒾⒾ. item 1/2
	 * Ⓘ.ⒾⒾ.ⒾⒾⒾ. item 1/2/3
	 * Ⓘ.ⒾⒾ.ⒾⒾⒾ.ⒾⓋ. item 1/2/3/4
	 * Ⓘ.ⒾⒾ.ⒾⒾⒾ.ⒾⓋ.Ⓥ. item 1/2/3/4/5
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_EnumerateList RomanCircledLatinCapital(){
		return TA_EnumerateList.create(U8_NumberingSchemes.RomanCircledLatinCapital(), "enumerate list using Roman number literals using upper case UTF-8 Circled Latin Capital (upper case) characters for unlimeted levels");
	}

	/**
	 * An enumerate using {@link U8_NumberingSchemes#romanCircledLatinSmall()}.
	 * 
	 * ----
	 * ⓘ item 1
	 * ⓘ item 2
	 *   ⓘⓘ item 1
	 *   ⓘⓘ item 2
	 *     ⓘⓘⓘ item 1
	 *     ⓘⓘⓘ item 2
	 * 
	 * ⓘ. item 1
	 * ⓘ.ⓘⓘ. item 1/2
	 * ⓘ.ⓘⓘ.ⓘⓘⓘ. item 1/2/3
	 * ⓘ.ⓘⓘ.ⓘⓘⓘ.ⓘⓥ. item 1/2/3/4
	 * ⓘ.ⓘⓘ.ⓘⓘⓘ.ⓘⓥ.ⓥ. item 1/2/3/4/5
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_EnumerateList romanCircledLatinSmall(){
		return TA_EnumerateList.create(U8_NumberingSchemes.romanCircledLatinSmall(), "enumerate list using Roman number literals using lower case UTF-8 Circled Latin Small (lower case) characters for unlimeted levels");
	}

}
