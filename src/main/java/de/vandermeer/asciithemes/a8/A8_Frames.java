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
 * @version    v0.0.1 build 170404 (04-Apr-17) for Java 1.8
 * @since      v0.0.1
 */
public abstract class A8_Frames {

	/**
	 * A frame using the using box 1-line characters `+`.
	 * 
	 * ----
	 * ┌─────────────────┐
	 * │Lorem ipsum dolor│
	 * │Lorem ipsum dolor│
	 * └─────────────────┘
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame box1Line(){
		return TA_Frame.create(
				A8_Lines_SameChar.box1Line(),
				TA_Corner_Chars.create('┌', '┐', '└', '┘', "corner tuple using box 1-line characters: '┌', '┐', '└', '┘'"),
				TA_Border_Chars.create('│', '│', "border pair using box 1-line characters '│'"),
				"frame using using box 1-line characters '+'"
		);
	}

	/**
	 * A frame using the box 2-lines character characters `+`.
	 * 
	 * ----
	 * ╔═════════════════╗
	 * ║Lorem ipsum dolor║
	 * ║Lorem ipsum dolor║
	 * ╚═════════════════╝
	 * ----
	 * 
	 * @return the frame
	 */
	public static TA_Frame box2Lines(){
		return TA_Frame.create(
				A8_Lines_SameChar.box2Lines(),
				TA_Corner_Chars.create('╔', '╗', '╚', '╝', "corner tuple using box 2-lines characters: '╔', '╗', '╚', '╝'"),
				TA_Border_Chars.create('║', '║', "border pair using box 2-lines character '║'"),
				"frame using box 2-lines character characters '+'"
		);
	}

}
