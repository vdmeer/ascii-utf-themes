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
 * Collection of {@link TA_Frame} for ASCII characters.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170404 (04-Apr-17) for Java 1.8
 * @since      v0.0.1
 */
public interface A7_Frames_SameChar {

	/**
	 * A frame using the ampersand character `&amp;`.
	 * 
	 * ----
	 * &amp;&amp;&amp;&amp;&amp;&amp;&amp;&amp;&amp;&amp;&amp;&amp;&amp;&amp;&amp;&amp;&amp;&amp;&amp;
	 * &amp;Lorem ipsum dolor&amp;
	 * &amp;Lorem ipsum dolor&amp;
	 * &amp;&amp;&amp;&amp;&amp;&amp;&amp;&amp;&amp;&amp;&amp;&amp;&amp;&amp;&amp;&amp;&amp;&amp;&amp;
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame ampersand(){
		return TA_Frame.create(
				A7_Lines_SameChar.ampersand(),
				TA_Corner_Chars.create('&', '&', '&', '&', "corner tuple using ampersand character '&'"),
				TA_Border_Chars.create('&', '&', "border pair using ampersand character '&'"),
				"frame using ampersand character '&'"
		);
	}

	/**
	 * A frame using the apostrophe character `'`.
	 * 
	 * ----
	 * '''''''''''''''''''
	 * 'Lorem ipsum dolor'
	 * 'Lorem ipsum dolor'
	 * '''''''''''''''''''
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame apostrophe(){
		return TA_Frame.create(
				A7_Lines_SameChar.apostrophe(),
				TA_Corner_Chars.create('\'', '\'', '\'', '\'', "corner tuple using apostrophe character '''"),
				TA_Border_Chars.create('\'', '\'', "border pair using apostrophe character '''"),
				"frame using apostrophe character '''"
		);
	}

	/**
	 * A frame using the at character `&#64;`.
	 * 
	 * ----
	 * &#64;&#64;&#64;&#64;&#64;&#64;&#64;&#64;&#64;&#64;&#64;&#64;&#64;&#64;&#64;&#64;&#64;&#64;&#64;
	 * &#64;Lorem ipsum dolor&#64;
	 * &#64;Lorem ipsum dolor&#64;
	 * &#64;&#64;&#64;&#64;&#64;&#64;&#64;&#64;&#64;&#64;&#64;&#64;&#64;&#64;&#64;&#64;&#64;&#64;&#64;
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame at(){
		return TA_Frame.create(
				A7_Lines_SameChar.at(),
				TA_Corner_Chars.create('@', '@', '@', '@', "corner tuple using at character '@'"),
				TA_Border_Chars.create('@', '@', "border pair using at character '@'"),
				"frame using at character '@'"
		);
	}

	/**
	 * A frame using the backslash character `\\`.
	 * 
	 * ----
	 * \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	 * \\Lorem ipsum dolor\\
	 * \\Lorem ipsum dolor\\
	 * \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame backslash(){
		return TA_Frame.create(
				A7_Lines_SameChar.backslash(),
				TA_Corner_Chars.create('\\', '\\', '\\', '\\', "corner tuple using backslash character '\\'"),
				TA_Border_Chars.create('\\', '\\', "border pair using backslash character '\\'"),
				"frame using backslash character '\\'"
		);
	}

	/**
	 * A frame using the bar character `|`.
	 * 
	 * ----
	 * |||||||||||||||||||
	 * |Lorem ipsum dolor|
	 * |Lorem ipsum dolor|
	 * |||||||||||||||||||
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame bar(){
		return TA_Frame.create(
				A7_Lines_SameChar.bar(),
				TA_Corner_Chars.create('|', '|', '|', '|', "corner tuple using bar character '|'"),
				TA_Border_Chars.create('|', '|', "border pair using bar character '|'"),
				"frame using bar character '|'"
		);
	}


	/**
	 * A frame using the (round) bracket left character `(`.
	 * 
	 * ----
	 * (((((((((((((((((((
	 * (Lorem ipsum dolor(
	 * (Lorem ipsum dolor(
	 * (((((((((((((((((((
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame bl(){
		return TA_Frame.create(
				A7_Lines_SameChar.bl(),
				TA_Corner_Chars.create('(', '(', '(', '(', "corner tuple using (round) bracket left character '('"),
				TA_Border_Chars.create('(', '(', "border pair using (round) bracket left character '('"),
				"frame using (round) bracket left character '('"
		);
	}

	/**
	 * A frame using the blank character ` `.
	 * 
	 * ----
	 *                    
	 *  Lorem ipsum dolor 
	 *  Lorem ipsum dolor 
	 *                    
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame blank(){
		return TA_Frame.create(
				A7_Lines_SameChar.blank(),
				TA_Corner_Chars.create(' ', ' ', ' ', ' ', "corner tuple using blank character ' '"),
				TA_Border_Chars.create(' ', ' ', "border pair using blank character ' '"),
				"frame using blank character ' '"
		);
	}

	/**
	 * A frame using the (round) bracket right character `)`.
	 * 
	 * ----
	 * )))))))))))))))))))
	 * )Lorem ipsum dolor)
	 * )Lorem ipsum dolor)
	 * )))))))))))))))))))
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame br(){
		return TA_Frame.create(
				A7_Lines_SameChar.br(),
				TA_Corner_Chars.create(')', ')', ')', ')', "corner tuple using (round) bracket right character ')'"),
				TA_Border_Chars.create(')', ')', "border pair using (round) bracket right character ')'"),
				"frame using (round) bracket right character ')'"
		);
	}

	/**
	 * A frame using the curly bracket left character `{`.
	 * 
	 * ----
	 * {{{{{{{{{{{{{{{{{{{
	 * {Lorem ipsum dolor{
	 * {Lorem ipsum dolor{
	 * {{{{{{{{{{{{{{{{{{{
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame cbl(){
		return TA_Frame.create(
				A7_Lines_SameChar.cbl(),
				TA_Corner_Chars.create('{', '{', '{', '{', "corner tuple using curly bracket left character '{'"),
				TA_Border_Chars.create('{', '{', "border pair using curly bracket left character '{'"),
				"frame using curly bracket right character '{'"
		);
	}

	/**
	 * A frame using the curly bracket right character `}`.
	 * 
	 * ----
	 * }}}}}}}}}}}}}}}}}}}
	 * }Lorem ipsum dolor}
	 * }Lorem ipsum dolor}
	 * }}}}}}}}}}}}}}}}}}}
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame cbr(){
		return TA_Frame.create(
				A7_Lines_SameChar.cbr(),
				TA_Corner_Chars.create('}', '}', '}', '}', "corner tuple using curly bracket right character '}'"),
				TA_Border_Chars.create('}', '}', "border pair using curly bracket right character '}'"),
				"frame using curly bracket right character '}'"
		);
	}

	/**
	 * A frame using the circumflex character `^`.
	 * 
	 * ----
	 * ^^^^^^^^^^^^^^^^^^^
	 * ^Lorem ipsum dolor^
	 * ^Lorem ipsum dolor^
	 * ^^^^^^^^^^^^^^^^^^^
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame circumflex(){
		return TA_Frame.create(
				A7_Lines_SameChar.circumflex(),
				TA_Corner_Chars.create('^', '^', '^', '^', "corner tuple using circumflex character '^'"),
				TA_Border_Chars.create('^', '^', "border pair using circumflex character '^'"),
				"frame using circumflex character '^'"
		);
	}

	/**
	 * A frame using the colon character `:`.
	 * 
	 * ----
	 * :::::::::::::::::::
	 * :Lorem ipsum dolor:
	 * :Lorem ipsum dolor:
	 * :::::::::::::::::::
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame colon(){
		return TA_Frame.create(
				A7_Lines_SameChar.colon(),
				TA_Corner_Chars.create(':', ':', ':', ':', "corner tuple using colon character ':'"),
				TA_Border_Chars.create(':', ':', "border pair using colon character ':'"),
				"frame using colon character ':'"
		);
	}

	/**
	 * A frame using the comma character `,`.
	 * 
	 * ----
	 * ,,,,,,,,,,,,,,,,,,,
	 * ,Lorem ipsum dolor,
	 * ,Lorem ipsum dolor,
	 * ,,,,,,,,,,,,,,,,,,,
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame comma(){
		return TA_Frame.create(
				A7_Lines_SameChar.comma(),
				TA_Corner_Chars.create(',', ',', ',', ',', "corner tuple using comma character ','"),
				TA_Border_Chars.create(',', ',', "border pair using comma character ','"),
				"frame using comma character ','"
		);
	}

	/**
	 * A frame using the dollar character `$`.
	 * 
	 * ----
	 * $$$$$$$$$$$$$$$$$$$
	 * $Lorem ipsum dolor$
	 * $Lorem ipsum dolor$
	 * $$$$$$$$$$$$$$$$$$$
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame dollar(){
		return TA_Frame.create(
				A7_Lines_SameChar.dollar(),
				TA_Corner_Chars.create('$', '$', '$', '$', "corner tuple using dollar character '$'"),
				TA_Border_Chars.create('$', '$', "border pair using dollar character '$'"),
				"frame using dollar character '$'"
		);
	}

	/**
	 * A frame using the dot character `.`.
	 * 
	 * ----
	 * ...................
	 * .Lorem ipsum dolor.
	 * .Lorem ipsum dolor.
	 * ...................
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame dot(){
		return TA_Frame.create(
				A7_Lines_SameChar.dot(),
				TA_Corner_Chars.create('.', '.', '.', '.', "corner tuple using dot character '.'"),
				TA_Border_Chars.create('.', '.', "border pair using dot character '.'"),
				"frame using dot character '.'"
		);
	}

	/**
	 * A frame using the equals character `=`.
	 * 
	 * ----
	 * ===================
	 * =Lorem ipsum dolor=
	 * =Lorem ipsum dolor=
	 * ===================
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame equals(){
		return TA_Frame.create(
				A7_Lines_SameChar.equals(),
				TA_Corner_Chars.create('=', '=', '=', '=', "corner tuple using equals character '='"),
				TA_Border_Chars.create('=', '=', "border pair using equals character '='"),
				"frame using equals character '='"
		);
	}

	/**
	 * A frame using the exclamation mark character `!`.
	 * 
	 * ----
	 * !!!!!!!!!!!!!!!!!!!
	 * !Lorem ipsum dolor!
	 * !Lorem ipsum dolor!
	 * !!!!!!!!!!!!!!!!!!!
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame exclamationMark(){
		return TA_Frame.create(
				A7_Lines_SameChar.exclamationMark(),
				TA_Corner_Chars.create('!', '!', '!', '!', "corner tuple using exclamation mark character '!'"),
				TA_Border_Chars.create('!', '!', "border pair using exclamation mark character '!'"),
				"frame using exclamation mark character '!'"
		);
	}

	/**
	 * A frame using the grave accent character `\``.
	 * 
	 * ----
	 * ```````````````````
	 * `Lorem ipsum dolor`
	 * `Lorem ipsum dolor`
	 * ```````````````````
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame graveAccent(){
		return TA_Frame.create(
				A7_Lines_SameChar.graveAccent(),
				TA_Corner_Chars.create('`', '`', '`', '`', "corner tuple using grave accent character '`'"),
				TA_Border_Chars.create('`', '`', "border pair using grave accent character '`'"),
				"frame using grave accent character '`'"
		);
	}

	/**
	 * A frame using the greater than character `&gt;`.
	 * 
	 * ----
	 * &gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;
	 * &gt;Lorem ipsum dolor&gt;
	 * &gt;Lorem ipsum dolor&gt;
	 * &gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame greaterThan(){
		return TA_Frame.create(
				A7_Lines_SameChar.greaterThan(),
				TA_Corner_Chars.create('>', '>', '>', '>', "corner tuple using greater than character '>'"),
				TA_Border_Chars.create('>', '>', "border pair using greater than character '>'"),
				"frame using greater than character '>'"
		);
	}

	/**
	 * A frame using the hashmark character `#`.
	 * 
	 * ----
	 * ###################
	 * #Lorem ipsum dolor#
	 * #Lorem ipsum dolor#
	 * ###################
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame hashmark(){
		return TA_Frame.create(
				A7_Lines_SameChar.hashmark(),
				TA_Corner_Chars.create('#', '#', '#', '#', "corner tuple using hashmark character '#'"),
				TA_Border_Chars.create('#', '#', "border pair using hashmark character '#'"),
				"frame using hashmark character '#'"
		);
	}

	/**
	 * A frame using the less than character `&lt;`.
	 * 
	 * ----
	 * &lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;
	 * &lt;Lorem ipsum dolor&lt;
	 * &lt;Lorem ipsum dolor&lt;
	 * &lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame lessThan(){
		return TA_Frame.create(
				A7_Lines_SameChar.lessThan(),
				TA_Corner_Chars.create('<', '<', '<', '<', "corner tuple using less than character '<'"),
				TA_Border_Chars.create('<', '<', "border pair using less than character '<'"),
				"frame using less than character '<'"
		);
	}

	/**
	 * A frame using the minus character `-`.
	 * 
	 * ----
	 * -------------------
	 * -Lorem ipsum dolor-
	 * -Lorem ipsum dolor-
	 * -------------------
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame minus(){
		return TA_Frame.create(
				A7_Lines_SameChar.minus(),
				TA_Corner_Chars.create('-', '-', '-', '-', "corner tuple using minus character '-'"),
				TA_Border_Chars.create('-', '-', "border pair using minus character '-'"),
				"frame using minus character '-'"
		);
	}

	/**
	 * A frame using the percent character `%`.
	 * 
	 * ----
	 * %%%%%%%%%%%%%%%%%%%
	 * %Lorem ipsum dolor%
	 * %Lorem ipsum dolor%
	 * %%%%%%%%%%%%%%%%%%%
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame percent(){
		return TA_Frame.create(
				A7_Lines_SameChar.percent(),
				TA_Corner_Chars.create('%', '%', '%', '%', "corner tuple using percent character '%'"),
				TA_Border_Chars.create('%', '%', "border pair using percent character '%'"),
				"frame using percent character '%'"
		);
	}

	/**
	 * A frame using the plus character `+`.
	 * 
	 * ----
	 * +++++++++++++++++++
	 * +Lorem ipsum dolor+
	 * +Lorem ipsum dolor+
	 * +++++++++++++++++++
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame plus(){
		return TA_Frame.create(
				A7_Lines_SameChar.plus(),
				TA_Corner_Chars.create('+', '+', '+', '+', "corner tuple using plus character '+'"),
				TA_Border_Chars.create('+', '+', "border pair using plus character '+'"),
				"frame using plus character '+'"
		);
	}

	/**
	 * A frame using the question mark character `?`.
	 * 
	 * ----
	 * ???????????????????
	 * ?Lorem ipsum dolor?
	 * ?Lorem ipsum dolor?
	 * ???????????????????
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame questionMark(){
		return TA_Frame.create(
				A7_Lines_SameChar.questionMark(),
				TA_Corner_Chars.create('?', '?', '?', '?', "corner tuple using question mark character '?'"),
				TA_Border_Chars.create('?', '?', "border pair using question mark character '?'"),
				"frame using question mark character '?'"
		);
	}

	/**
	 * A frame using the quotation mark character `"`.
	 * 
	 * ----
	 * """""""""""""""""""
	 * "Lorem ipsum dolor"
	 * "Lorem ipsum dolor"
	 * """""""""""""""""""
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame quotationMark(){
		return TA_Frame.create(
				A7_Lines_SameChar.quotationMark(),
				TA_Corner_Chars.create('"', '"', '"', '"', "corner tuple using quotation mark character '\"'"),
				TA_Border_Chars.create('"', '"', "border pair using quotation mark character '\"'"),
				"frame using quotation mark character '\"'"
		);
	}

	/**
	 * A frame using the square bracket left character `[`.
	 * 
	 * ----
	 * [[[[[[[[[[[[[[[[[[[
	 * [Lorem ipsum dolor[
	 * [Lorem ipsum dolor[
	 * [[[[[[[[[[[[[[[[[[[
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame sbl(){
		return TA_Frame.create(
				A7_Lines_SameChar.sbl(),
				TA_Corner_Chars.create('[', '[', '[', '[', "corner tuple using square bracket left character '['"),
				TA_Border_Chars.create('[', '[', "border pair using square bracket left character '['"),
				"frame using square bracket left character '['"
		);
	}

	/**
	 * A frame using the square bracket right character `]`.
	 * 
	 * ----
	 * ]]]]]]]]]]]]]]]]]]]
	 * ]Lorem ipsum dolor]
	 * ]Lorem ipsum dolor]
	 * ]]]]]]]]]]]]]]]]]]]
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame sbr(){
		return TA_Frame.create(
				A7_Lines_SameChar.sbr(),
				TA_Corner_Chars.create(']', ']', ']', ']', "corner tuple using square bracket right character ']'"),
				TA_Border_Chars.create(']', ']', "border pair using square bracket righ character ']'"),
				"frame using square bracket right character ']'"
		);
	}

	/**
	 * A frame using the semicolon character `;`.
	 * 
	 * ----
	 * ;;;;;;;;;;;;;;;;;;;
	 * ;Lorem ipsum dolor;
	 * ;Lorem ipsum dolor;
	 * ;;;;;;;;;;;;;;;;;;;
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame semicolon(){
		return TA_Frame.create(
				A7_Lines_SameChar.semicolon(),
				TA_Corner_Chars.create(';', ';', ';', ';', "corner tuple using semicolon character ';'"),
				TA_Border_Chars.create(';', ';', "border pair using semicolon character ';'"),
				"frame using semicolon character ';'"
		);
	}

	/**
	 * A frame using the slash character `/`.
	 * 
	 * ----
	 * ///////////////////
	 * /Lorem ipsum dolor/
	 * /Lorem ipsum dolor/
	 * ///////////////////
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame slash(){
		return TA_Frame.create(
				A7_Lines_SameChar.slash(),
				TA_Corner_Chars.create('/', '/', '/', '/', "corner tuple using slash character '/'"),
				TA_Border_Chars.create('/', '/', "border pair using slash character '/'"),
				"frame using slash character '/'"
		);
	}

	/**
	 * A frame using the star character `*`.
	 * 
	 * ----
	 * *******************
	 * *Lorem ipsum dolor*
	 * *Lorem ipsum dolor*
	 * *******************
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame star(){
		return TA_Frame.create(
				A7_Lines_SameChar.star(),
				TA_Corner_Chars.create('*', '*', '*', '*', "corner tuple using star character '*'"),
				TA_Border_Chars.create('*', '*', "border pair using star character '*'"),
				"frame using star character '*'"
		);
	}

	/**
	 * A frame using the tilde character `~`.
	 * 
	 * ----
	 * ~~~~~~~~~~~~~~~~~~~
	 * ~Lorem ipsum dolor~
	 * ~Lorem ipsum dolor~
	 * ~~~~~~~~~~~~~~~~~~~
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame tilde(){
		return TA_Frame.create(
				A7_Lines_SameChar.tilde(),
				TA_Corner_Chars.create('~', '~', '~', '~', "corner tuple using tilde character '~'"),
				TA_Border_Chars.create('~', '~', "border pair using tilde character '~'"),
				"frame using tilde character '~'"
		);
	}

	/**
	 * A frame using the underscore character `_`.
	 * 
	 * ----
	 * ___________________
	 * _Lorem ipsum dolor_
	 * _Lorem ipsum dolor_
	 * ___________________
	 * ----
	 * 
	 * @return the frame
	 */
	static TA_Frame underscore(){
		return TA_Frame.create(
				A7_Lines_SameChar.underscore(),
				TA_Corner_Chars.create('_', '_', '_', '_', "corner tuple using underscore character '_'"),
				TA_Border_Chars.create('_', '_', "border pair using underscore character '_'"),
				"frame using underscore character '_'"
		);
	}

}
