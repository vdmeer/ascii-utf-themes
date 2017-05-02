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

import de.vandermeer.asciithemes.TA_Border_Chars;
import de.vandermeer.asciithemes.TA_Corner_Chars;
import de.vandermeer.asciithemes.TA_Frame;

/**
 * Collection of {@link TA_Frame} for UTF-8 characters.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170404 (04-Apr-17) for Java 1.8
 * @since      v0.0.1
 */
public interface U8_Frames {

	/**
	 * A frame theme using double line characters.
	 * ----
	 * ╔═════════════════╗
	 * ║Lorem ipsum dolor║
	 * ║Lorem ipsum dolor║
	 * ╚═════════════════╝
	 * ----
	 * 
	 * @return the frame theme
	 */
	static TA_Frame borderDouble(){
		return TA_Frame.create(
				U8_Lines_SameChar.borderDoubleHorizontal(),
				TA_Corner_Chars.create('╔', '╗', '╚', '╝', "corner tuple UTF-8 double corners '╔╗╚╝'"),
				TA_Border_Chars.create('║', '║', "border pair UTF-8 double borders '║'"),
				"frame theme using UTF-8 double line characters"
		);
	}

	/**
	 * A frame theme using double (vertical) and single (horizontal) line characters.
	 * ----
	 * ╓─────────────────╖
	 * ║Lorem ipsum dolor║
	 * ║Lorem ipsum dolor║
	 * ╙─────────────────╜
	 * ----
	 * 
	 * @return the frame theme
	 */
	static TA_Frame borderDoubleSingle(){
		return TA_Frame.create(
				U8_Lines_SameChar.borderLightHorizontal(),
				TA_Corner_Chars.create('╓', '╖', '╙', '╜', "corner tuple UTF-8 double corners '╓╖╙╜'"),
				TA_Border_Chars.create('║', '║', "border pair UTF-8 double borders '║'"),
				"frame theme using double (vertical) and single (horizontal) line characters"
		);
	}

	/**
	 * A frame theme using heavy characters.
	 * ----
	 * ┏━━━━━━━━━━━━━━━━━┓
	 * ┃Lorem ipsum dolor┃
	 * ┃Lorem ipsum dolor┃
	 * ┗━━━━━━━━━━━━━━━━━┛
	 * ----
	 * 
	 * @return the frame theme
	 */
	static TA_Frame borderHeavy(){
		return TA_Frame.create(
				U8_Lines_SameChar.borderHeavyHorizontal(),
				TA_Corner_Chars.create('┏', '┓', '┗', '┛', "corner tuple UTF-8 light corners '┏┓┗┛'"),
				TA_Border_Chars.create('┃', '┃', "border pair UTF-8 light borders '┃'"),
				"frame theme using UTF-8 heavy characters"
		);
	}

	/**
	 * A frame theme using light characters.
	 * ----
	 * ┌─────────────────┐
	 * │Lorem ipsum dolor│
	 * │Lorem ipsum dolor│
	 * └─────────────────┘
	 * ----
	 * 
	 * @return the frame theme
	 */
	static TA_Frame borderLight(){
		return TA_Frame.create(
				U8_Lines_SameChar.borderLightHorizontal(),
				TA_Corner_Chars.create('┌', '┐', '└', '┘', "corner tuple UTF-8 light corners '┌┐└┘'"),
				TA_Border_Chars.create('│', '│', "border pair UTF-8 light borders '│'"),
				"frame theme using UTF-8 light characters"
		);
	}

	/**
	 * A frame theme using light (rounded corners) characters.
	 * ----
	 * ╭─────────────────╮
	 * │Lorem ipsum dolor│
	 * │Lorem ipsum dolor│
	 * ╰─────────────────╯
	 * ----
	 * 
	 * @return the frame theme
	 */
	static TA_Frame borderLightRounded(){
		return TA_Frame.create(
				U8_Lines_SameChar.borderLightHorizontal(),
				TA_Corner_Chars.create('╭', '╮', '╰', '╯', "corner tuple UTF-8 light corners '╭╮╰╯'"),
				TA_Border_Chars.create('│', '│', "border pair UTF-8 light borders '│'"),
				"frame theme using UTF-8 light (rounded corners) characters"
		);
	}

	/**
	 * A frame theme using single (vertical) and double (horizontal) line characters.
	 * ----
	 * ╒═════════════════╕
	 * │Lorem ipsum dolor│
	 * │Lorem ipsum dolor│
	 * ╘═════════════════╛
	 * ----
	 * 
	 * @return the frame theme
	 */
	static TA_Frame borderSingleDouble(){
		return TA_Frame.create(
				U8_Lines_SameChar.borderDoubleHorizontal(),
				TA_Corner_Chars.create('╒', '╕', '╘', '╛', "corner tuple UTF-8 double corners '╒╕╘╛'"),
				TA_Border_Chars.create('│', '│', "border pair UTF-8 double borders '│'"),
				"frame theme using single (vertical) and double (horizontal) line characters"
		);
	}
}
