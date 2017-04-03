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

import de.vandermeer.asciithemes.TA_Border_Chars;
import de.vandermeer.asciithemes.TA_Corner_Chars;
import de.vandermeer.asciithemes.TA_Frame;

/**
 * Collection of {@link TA_Frame} for different ASCII characters.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170331 (31-Mar-17) for Java 1.8
 * @since      v0.0.1
 */
public abstract class A7_Frames {

	/**
	 * A frame using `-` for lines, `|` for borders and `+` for corners.
	 * 
	 * ----
	 * +-----------------+
	 * |Lorem ipsum dolor|
	 * |Lorem ipsum dolor|
	 * +-----------------+
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame minusBarPlus(){
		return TA_Frame.create(
				A7_Lines_SameChar.minus(),
				TA_Corner_Chars.create('+', '+', '+', '+', "corner tuple using plus character '+'"),
				TA_Border_Chars.create('|', '|', "border pair using bar character '|'"),
				"frame using '-' for lines, '|' for borders and '+' for corners"
		);
	}

	/**
	 * A frame using a split line, borders, and corners with gt/lt characters `&gt;` and `&lt;`.
	 * 
	 * ----
	 * &gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;
	 * &gt;Lorem ipsum dolor&lt;
	 * &gt;Lorem ipsum dolor&lt;
	 * &gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame split_gtlt(){
		return TA_Frame.create(
				A7_Lines_SplitChar.gtlt(),
				TA_Corner_Chars.create('>', '<', '>', '<', "corner tuple using gt/lt characters '>' and '<'"),
				TA_Border_Chars.create('>', '<', "border pair using gt/lt characters '>' and '<'"),
				"frame using a split line, borders, and corners with gt/lt characters '>' and '<'"
		);
	}

	/**
	 * A frame using a split line, borders, and corners with gt/lt characters `&lt;` and `&gt;`.
	 * 
	 * ----
	 * &lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;
	 * &lt;Lorem ipsum dolor&gt;
	 * &lt;Lorem ipsum dolor&gt;
	 * &lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame split_ltgt(){
		return TA_Frame.create(
				A7_Lines_SplitChar.ltgt(),
				TA_Corner_Chars.create('<', '>', '<', '>', "corner tuple using gt/lt characters '<' and '>'"),
				TA_Border_Chars.create('<', '>', "border pair using gt/lt characters '<' and '>'"),
				"frame using a split line, borders, and corners with gt/lt characters '<' and '>'"
		);
	}

	/**
	 * A frame using a split line, borders, and corners with bl/br characters `(` and `)`.
	 * 
	 * ----
	 * ((((((((())))))))))
	 * (Lorem ipsum dolor)
	 * (Lorem ipsum dolor)
	 * ((((((((())))))))))
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame split_blbr(){
		return TA_Frame.create(
				A7_Lines_SplitChar.blbr(),
				TA_Corner_Chars.create('(', ')', '(', ')', "corner tuple using bl/br characters '(' and ')'"),
				TA_Border_Chars.create('(', ')', "border pair using bl/br characters '(' and ')'"),
				"frame using a split line, borders, and corners with bl/br characters '(' and ')'"
		);
	}

	/**
	 * A frame using a split line, borders, and corners with br/bl characters `)` and `(`.
	 * 
	 * ----
	 * )))))))))((((((((((
	 * )Lorem ipsum dolor(
	 * )Lorem ipsum dolor(
	 * )))))))))((((((((((
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame split_brbl(){
		return TA_Frame.create(
				A7_Lines_SplitChar.brbl(),
				TA_Corner_Chars.create(')', '(', ')', '(', "corner tuple using br/bl characters ')' and '('"),
				TA_Border_Chars.create(')', '(', "border pair using br/bl characters ')' and '('"),
				"frame using a split line, borders, and corners with br/bl characters ')' and '('"
		);
	}

	/**
	 * A frame using a split line, borders, and corners with sbl/sbr characters `[` and `]`.
	 * 
	 * ----
	 * [[[[[[[[[]]]]]]]]]]
	 * [Lorem ipsum dolor]
	 * [Lorem ipsum dolor]
	 * [[[[[[[[[]]]]]]]]]]
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame split_sblsbr(){
		return TA_Frame.create(
				A7_Lines_SplitChar.sblsbr(),
				TA_Corner_Chars.create('[', ']', '[', ']', "corner tuple using sbl/sbr characters '[' and ']'"),
				TA_Border_Chars.create('[', ']', "border pair using sbl/sbr characters '[' and ']'"),
				"frame using a split line, borders, and corners with sbl/sbr characters '[' and ']'"
		);
	}

	/**
	 * A frame using a split line, borders, and corners with sbr/sbl characters `]` and `[`.
	 * 
	 * ----
	 * ]]]]]]]]][[[[[[[[[[
	 * ]Lorem ipsum dolor[
	 * ]Lorem ipsum dolor[
	 * ]]]]]]]]][[[[[[[[[[
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame split_sbrsbl(){
		return TA_Frame.create(
				A7_Lines_SplitChar.sbrsbl(),
				TA_Corner_Chars.create(']', '[', ']', '[', "corner tuple using sbr/sbl characters ']' and '['"),
				TA_Border_Chars.create(']', '[', "border pair using sbr/sbl characters ']' and '['"),
				"frame using a split line, borders, and corners with sbr/sbl characters ']' and '['"
		);
	}

	/**
	 * A frame using a split line, borders, and corners with cbl/cbr characters `{` and `}`.
	 * 
	 * ----
	 * {{{{{{{{{}}}}}}}}}}
	 * {Lorem ipsum dolor}
	 * {Lorem ipsum dolor}
	 * {{{{{{{{{}}}}}}}}}}
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame split_cblcbr(){
		return TA_Frame.create(
				A7_Lines_SplitChar.cblcbr(),
				TA_Corner_Chars.create('{', '}', '{', '}', "corner tuple using cbl/cbr characters '{' and '}'"),
				TA_Border_Chars.create('{', '}', "border pair using cbl/cbr characters '{' and '}'"),
				"frame using a split line, borders, and corners with cbl/cbr characters '{' and '}'"
		);
	}

	/**
	 * A frame using a split line, borders, and corners with cbr/cbl characters `}` and `{`.
	 * 
	 * ----
	 * }}}}}}}}}{{{{{{{{{{
	 * }Lorem ipsum dolor{
	 * }Lorem ipsum dolor{
	 * }}}}}}}}}{{{{{{{{{{
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame split_cbrcbl(){
		return TA_Frame.create(
				A7_Lines_SplitChar.cbrcbl(),
				TA_Corner_Chars.create('}', '{', '}', '{', "corner tuple using cbr/cbl characters '}' and '{'"),
				TA_Border_Chars.create('}', '{', "border pair using cbr/cbl characters '}' and '{'"),
				"frame using a split line, borders, and corners with cbr/cbl characters '}' and '{'"
		);
	}

	/**
	 * A frame using a split line, borders, and corners with slash/backslash characters `/` and `\\`.
	 * 
	 * ----
	 * /////////\\\\\\\\\\\\\\\\\\\\
	 * /Lorem ipsum dolor\\
	 * /Lorem ipsum dolor\\
	 * /////////\\\\\\\\\\\\\\\\\\\\
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame split_slashbackSlash(){
		return TA_Frame.create(
				A7_Lines_SplitChar.slashbackSlash(),
				TA_Corner_Chars.create('/', '\\', '/', '\\', "corner tuple using slash/backslash characters '/' and '\\'"),
				TA_Border_Chars.create('/', '\\', "border pair using slash/backslash characters '/' and '\\'"),
				"frame using a split line, borders, and corners with slash/backslash characters '/' and '\\'"
		);
	}

	/**
	 * A frame using a split line, borders, and corners with backslash/slash characters `\\` and `\`.
	 * 
	 * ----
	 * \\\\\\\\\\\\\\\\\\//////////
	 * \\Lorem ipsum dolor/
	 * \\Lorem ipsum dolor/
	 * \\\\\\\\\\\\\\\\\\//////////
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame split_backSlashSlash(){
		return TA_Frame.create(
				A7_Lines_SplitChar.backSlashSlash(),
				TA_Corner_Chars.create('\\', '/', '\\', '/', "corner tuple using backslash/slash characters '\\' and '/'"),
				TA_Border_Chars.create('\\', '/', "border pair using backslash/slash characters '\\' and '/'"),
				"frame using a split line, borders, and corners with backslash/slash characters '\\' and '/'"
		);
	}
}
