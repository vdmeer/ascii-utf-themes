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
import de.vandermeer.asciithemes.TA_Line_SplitChar;

/**
 * Collection of {@link TA_Line_Char} for ASCII characters.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170404 (04-Apr-17) for Java 1.8
 * @since      v0.0.1
 */
public interface A7_Lines_SplitChar {

	/**
	 * A split line using left `\\\\` and right '/'.
	 * 
	 * ----
	 * \\\\\\\\\\/////
	 * ----
	 * 
	 * @return the line
	 */
	static TA_Line_SplitChar backSlashSlash(){
		return TA_Line_SplitChar.create('\\', '/', "split line using left `\\` and right '/'");
	}

	/**
	 * A split line using left `(` and right ')'.
	 * 
	 * ----
	 * ((((()))))
	 * ----
	 * 
	 * @return the line
	 */
	static TA_Line_SplitChar blbr(){
		return TA_Line_SplitChar.create('(', ')', "split line using left `(` and right ')'");
	}

	/**
	 * A split line using left `)` and right '('.
	 * 
	 * ----
	 * )))))(((((
	 * ----
	 * 
	 * @return the line
	 */
	static TA_Line_SplitChar brbl(){
		return TA_Line_SplitChar.create(')', '(', "split line using left `)` and right '('");
	}

	/**
	 * A split line using left `{` and right '}'.
	 * 
	 * ----
	 * {{{{{}}}}}
	 * ----
	 * 
	 * @return the line
	 */
	static TA_Line_SplitChar cblcbr(){
		return TA_Line_SplitChar.create('{', '}', "split line using left `{` and right '}'");
	}

	/**
	 * A split line using left `}` and right '{'.
	 * 
	 * ----
	 * }}}}}{{{{{
	 * ----
	 * 
	 * @return the line
	 */
	static TA_Line_SplitChar cbrcbl(){
		return TA_Line_SplitChar.create('}', '{', "split line using left `}` and right '{'");
	}

	/**
	 * A split line using left `&gt;` and right '&lt;'.
	 * 
	 * ----
	 * &gt;&gt;&gt;&gt;&gt;&lt;&lt;&lt;&lt;&lt;
	 * ----
	 * 
	 * @return the line
	 */
	static TA_Line_SplitChar gtlt(){
		return TA_Line_SplitChar.create('>', '<', "split line using left `>` and right '<'");
	}

	/**
	 * A split line using left `&lt;` and right '&gt;'.
	 * 
	 * ----
	 * &lt;&lt;&lt;&lt;&lt;&gt;&gt;&gt;&gt;&gt;
	 * ----
	 * 
	 * @return the line
	 */
	static TA_Line_SplitChar ltgt(){
		return TA_Line_SplitChar.create('<', '>', "split line using left `<` and right '>'");
	}

	/**
	 * A split line using left `[` and right ']'.
	 * 
	 * ----
	 * [[[[[]]]]]
	 * ----
	 * 
	 * @return the line
	 */
	static TA_Line_SplitChar sblsbr(){
		return TA_Line_SplitChar.create('[', ']', "split line using left `[` and right ']'");
	}

	/**
	 * A split line using left `]` and right '['.
	 * 
	 * ----
	 * ]]]]][[[[[
	 * ----
	 * 
	 * @return the line
	 */
	static TA_Line_SplitChar sbrsbl(){
		return TA_Line_SplitChar.create(']', '[', "split line using left `]` and right '['");
	}

	/**
	 * A split line using left `/` and right '\\\\'.
	 * 
	 * ----
	 * /////\\\\\\\\\\
	 * ----
	 * 
	 * @return the line
	 */
	static TA_Line_SplitChar slashbackSlash(){
		return TA_Line_SplitChar.create('/', '\\', "split line using left `/` and right '\\'");
	}
}
