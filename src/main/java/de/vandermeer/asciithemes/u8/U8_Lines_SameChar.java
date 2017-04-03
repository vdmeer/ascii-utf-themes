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

import de.vandermeer.asciithemes.TA_Line_Char;

/**
 * Collection of {@link TA_Line_Char} for UTF-8 characters.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170331 (31-Mar-17) for Java 1.8
 * @since      v0.0.1
 */
public abstract class U8_Lines_SameChar {

	/**
	 * A line using UTF-8 heavy line horizontal character `━`.
	 * 
	 * ----
	 * ━━━━━━━━━━
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char borderHeavyHorizontal(){
		return TA_Line_Char.create('━', "line UTF-8 heavy line horizontal character '━'");
	}

	/**
	 * A line using UTF-8 heavy quadruple dash character `┉`.
	 * 
	 * ----
	 * ┉┉┉┉┉┉┉┉┉┉
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char borderHeavyQuadrupleDash(){
		return TA_Line_Char.create('┉', "line UTF-8 heavy quadruple dash character '┉'");
	}

	/**
	 * A line using UTF-8 heavy triple dash character `┅`.
	 * 
	 * ----
	 * ┅┅┅┅┅┅┅┅┅┅
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char borderHeavyTripleDash(){
		return TA_Line_Char.create('┅', "line UTF-8 heavy triple dash character '┅'");
	}

	/**
	 * A line using UTF-8 heavy double dash character `╌`.
	 * 
	 * ----
	 * ╌╌╌╌╌╌╌╌╌╌
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char borderHeavyDoubleDash(){
		return TA_Line_Char.create('╌', "line UTF-8 heavy double dash character '╌'");
	}

	/**
	 * A line using UTF-8 double horizontal character `═`.
	 * 
	 * ----
	 * ══════════
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char borderDoubleHorizontal(){
		return TA_Line_Char.create('═', "line UTF-8 double horizontal character '═'");
	}

	/**
	 * A line using UTF-8 light quadruple dash character `┈`.
	 * 
	 * ----
	 * ┈┈┈┈┈┈┈┈┈┈
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char borderLightQuadrupleDash(){
		return TA_Line_Char.create('┈', "line UTF-8 light quadruple dash character '┈'");
	}

	/**
	 * A line using UTF-8 light line horizontal character `─`.
	 * 
	 * ----
	 * ──────────
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char borderLightHorizontal(){
		return TA_Line_Char.create('─', "line UTF-8 light line horizontal character '─'");
	}

	/**
	 * A line using UTF-8 light double dash character `╌`.
	 * 
	 * ----
	 * ╌╌╌╌╌╌╌╌╌╌
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char borderLightDoubleDash(){
		return TA_Line_Char.create('╌', "line UTF-8 light double dash character '╌'");
	}

	/**
	 * A line using UTF-8 light triple dash character `┄`.
	 * 
	 * ----
	 * ┄┄┄┄┄┄┄┄┄┄
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char borderLightTripleDash(){
		return TA_Line_Char.create('┄', "line UTF-8 light triple dash character '┄'");
	}

	/**
	 * A line using UTF-8 visible space character `␣`.
	 * 
	 * ----
	 * ␣␣␣␣␣␣␣␣␣␣
	 * ----
	 * 
	 * @return the line
	 */
	public static TA_Line_Char visibleSpace(){
		return TA_Line_Char.create('␣', "line UTF-8 visible space character '␣'");
	}
}

//UTF_LINE_VERTICAL_DOUBLE_DASH	('╎', '╎', '╎', '╎', '╎', '╎', "character '╎' line"),
//UTF_LINE_VERTICAL_QUADRUPLE_DASH('┊', '┊', '┊', '┊', '┊', '┊', "character '┊' line"),
//UTF_LINE_VERTICAL_TRIPLE_DASH	('┆', '┆', '┆', '┆', '┆', '┆', "character '┆' line"),