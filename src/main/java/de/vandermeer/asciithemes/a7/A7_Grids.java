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

import de.vandermeer.asciithemes.TA_Grid;
import de.vandermeer.asciithemes.TA_GridConfig;

/**
 * Collection of {@link TA_Grid} for different ASCII characters.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 160319 (19-Mar-16) for Java 1.8
 * @since      v0.0.1
 */
public abstract class A7_Grids {

	/**
	 * A grid using `-` for lines, `|` for borders and `+` for corners.
	 * 
	 * ----
	 * +--------------------------------+
	 * |top row col-span 3, single line |
	 * +---------------+----------------+
	 * |second row col1|second row col2 |
	 * +----------+----+-----+----------+
	 * |r3, c1, l1|r3, c2, l1|r3, c3, l1|
	 * |r3, c1, l2|r3, c2, l2|r3, c3, l2|
	 * +----------+----------+----------+
	 * ----
	 * 
	 * @return the grid
	 */
	public static TA_Grid minusBarPlus(){
		return TA_Grid.create("grid using '-' for lines, '|' for borders and '+' for corners")
				.addCharacterMap(TA_GridConfig.RULESET_NORMAL, ' ', '-', '|', '+', '+', '+', '+', '+', '+', '+', '+', '+')
		;
	}

	/**
	 * A grid using `-` for lines, `|` for borders and `+` for corners.
	 * 
	 * ----
	 * +--------------------------------+
	 * |top row col-span 3, single line |
	 * +---------------+----------------+
	 * |second row col1|second row col2 |
	 * +----------+----+-----+----------+
	 * |r3, c1, l1|r3, c2, l1|r3, c3, l1|
	 * |r3, c1, l2|r3, c2, l2|r3, c3, l2|
	 * +----------+----------+----------+
	 * ----
	 * 
	 * @return the grid
	 */
	public static TA_Grid minusBarPlusEquals(){
		return TA_Grid.create("grid using '-' for lines, '|' for borders and '+' for corners plus '=' for strong lines")
				.addCharacterMap(TA_GridConfig.RULESET_NORMAL, ' ', '-', '|', '+', '+', '+', '+', '+', '+', '+', '+', '+')
				.addCharacterMap(TA_GridConfig.RULESET_STRONG, ' ', '=', '|', '=', '=', '=', '=', '=', '=', '=', '=', '=')
		;
	}
}

/*
TA_GridConfig.RULETYPE_NORMAL, ' ', '═', '║', '╔', '╗', '╚', '╝', '╠', '╣', '╬', '╦', '╩'

Normal           Strong           Example
+-+-+-+-+        =========        ================
| | | | |        | | | | |        |h1  |h2  |h3  |
+-+-+-+-+        =========        ================
| | | | |        | | | | |        |c1  |c2  |c3  |
+-+-+-+-+        =========        +----+----+----+
                                  |c1  |c2  |c3  |
                                  +----+----+----+
                                  |c1  |c2  |c3  |
                                  ================
*/