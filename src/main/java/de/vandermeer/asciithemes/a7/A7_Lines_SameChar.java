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

import de.vandermeer.asciithemes.TA_Line_Char;

/**
 * Collection of {@link TA_Line_Char} for ASCII characters.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170331 (31-Mar-17) for Java 1.8
 * @since      v0.0.1
 */
public abstract class A7_Lines_SameChar {

	/**
	 * A line using the ampersand character `&amp;`.
	 * 
	 * ----
	 * &amp;&amp;&amp;&amp;&amp;&amp;&amp;&amp;&amp;&amp;
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char ampersand(){
		return TA_Line_Char.create('&', "line using ampersand character '&'");
	}

	/**
	 * A line using the apostrophe character `\'`.
	 * 
	 * ----
	 * ''''''''''
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char apostrophe(){
		return TA_Line_Char.create('\'', "line using apostrophe character '''");
	}

	/**
	 * A line using the at character `&#64;`.
	 * 
	 * ----
	 * &#64;&#64;&#64;&#64;&#64;&#64;&#64;&#64;&#64;&#64;
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char at(){
		return TA_Line_Char.create('@', "line using at character '@'");
	}

	/**
	 * A line using the backslash character `\\`.
	 * 
	 * ----
	 * \\\\\\\\\\\\\\\\\\\\
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char backslash(){
		return TA_Line_Char.create('\\', "line using backslash character '\\'");
	}

	/**
	 * A line using the bar character `|`.
	 * 
	 * ----
	 * ||||||||||
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char bar(){
		return TA_Line_Char.create('|', "line using bar character '|'");
	}

	/**
	 * A line using the (round) bracket left character `(`.
	 * 
	 * ----
	 * ((((((((((
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char bl(){
		return TA_Line_Char.create('(', "line using (round) bracket left character '('");
	}

	/**
	 * A line using the blank character ` `.
	 * 
	 * ----
	 *           
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char blank(){
		return TA_Line_Char.create(' ', "line using blank character ' '");
	}

	/**
	 * A line using the (round) bracket right character `)`.
	 * 
	 * ----
	 * ))))))))))
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char br(){
		return TA_Line_Char.create(')', "line using (round) bracket right character ')'");
	}

	/**
	 * A line using the curly bracket left character `{`.
	 * 
	 * ----
	 * {{{{{{{{{{
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char cbl(){
		return TA_Line_Char.create('{', "line using curly bracket left character '{'");
	}

	/**
	 * A line using the curly bracket right character `}`.
	 * 
	 * ----
	 * }}}}}}}}}}
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char cbr(){
		return TA_Line_Char.create('}', "line using curly bracket right character '}'");
	}

	/**
	 * A line using the circumflex character `^`.
	 * 
	 * ----
	 * ^^^^^^^^^^
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char circumflex(){
		return TA_Line_Char.create('^', "line using circumflex character '^'");
	}

	/**
	 * A line using the colon character `:`.
	 * 
	 * ----
	 * ::::::::::
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char colon(){
		return TA_Line_Char.create(':', "line using colon character ':'");
	}

	/**
	 * A line using the comma character `,`.
	 * 
	 * ----
	 * ,,,,,,,,,,
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char comma(){
		return TA_Line_Char.create(',', "line using comma character ','");
	}

	/**
	 * A line using the dollar character `$`.
	 * 
	 * ----
	 * $$$$$$$$$$
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char dollar(){
		return TA_Line_Char.create('$', "line using dollar character '$'");
	}

	/**
	 * A line using the dot character `.`.
	 * 
	 * ----
	 * ..........
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char dot(){
		return TA_Line_Char.create('.', "line using dot character '.'");
	}

	/**
	 * A line using the equals character `=`.
	 * 
	 * ----
	 * ==========
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char equals(){
		return TA_Line_Char.create('=', "line using equals character '='");
	}

	/**
	 * A line using the exclamation mark character `!`.
	 * 
	 * ----
	 * !!!!!!!!!!
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char exclamationMark(){
		return TA_Line_Char.create('!', "line using exclamation mark character '!'");
	}

	/**
	 * A line using the grave accent character `\`\`.
	 * 
	 * ----
	 * ``````````
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char graveAccent(){
		return TA_Line_Char.create('`', "line using grave accent character '`'");
	}

	/**
	 * A line using the greater than character `;&gt;`.
	 * 
	 * ----
	 * &gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char greaterThan(){
		return TA_Line_Char.create('>', "line using greater than character '>'");
	}

	/**
	 * A line using the hashmark character `#`.
	 * 
	 * ----
	 * ##########
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char hashmark(){
		return TA_Line_Char.create('#', "line using hashmark character '#'");
	}

	/**
	 * A line using the less than character `&lt;`.
	 * 
	 * ----
	 * &lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char lessThan(){
		return TA_Line_Char.create('<', "line using less than character '<'");
	}

	/**
	 * A line using the minus character `-`.
	 * 
	 * ----
	 * ----------
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char minus(){
		return TA_Line_Char.create('-', "line using minus character '-'");
	}

	/**
	 * A line using the percent character `%`.
	 * 
	 * ----
	 * %%%%%%%%%%
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char percent(){
		return TA_Line_Char.create('%', "line using percent character '%'");
	}

	/**
	 * A line using the plus character `+`.
	 * 
	 * ----
	 * ++++++++++
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char plus(){
		return TA_Line_Char.create('+', "line using plus character '+'");
	}

	/**
	 * A line using the question mark character `?`.
	 * 
	 * ----
	 * ??????????
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char questionMark(){
		return TA_Line_Char.create('?', "line using question mark character '?'");
	}

	/**
	 * A line using the quotation mark character `"`.
	 * 
	 * ----
	 * """"""""""
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char quotationMark(){
		return TA_Line_Char.create('"', "line using quotation mark character '\"'");
	}

	/**
	 * A line using the square bracket left character `[`.
	 * 
	 * ----
	 * [[[[[[[[[[
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char sbl(){
		return TA_Line_Char.create('[', "line using square bracket left character '['");
	}


	/**
	 * A line using the square bracket right character `]`.
	 * 
	 * ----
	 * ]]]]]]]]]]
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char sbr(){
		return TA_Line_Char.create(']', "line using square bracket right character ']'");
	}


	/**
	 * A line using the semicolon character `;`.
	 * 
	 * ----
	 * ;;;;;;;;;;
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char semicolon(){
		return TA_Line_Char.create(';', "line using semicolon character ';'");
	}


	/**
	 * A line using the slash character `/`.
	 * 
	 * ----
	 * //////////
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char slash(){
		return TA_Line_Char.create('/', "line using slash character '/'");
	}


	/**
	 * A line using the star character `*`.
	 * 
	 * ----
	 * **********
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char star(){
		return TA_Line_Char.create('*', "line using star character '*'");
	}


	/**
	 * A line using the tilde character `~`.
	 * 
	 * ----
	 * ~~~~~~~~~~
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char tilde(){
		return TA_Line_Char.create('~', "line using tilde character '~'");
	}


	/**
	 * A line using the underscore character `_`.
	 * 
	 * ----
	 * __________
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char underscore(){
		return TA_Line_Char.create('_', "line using underscore character '_'");
	}

}
