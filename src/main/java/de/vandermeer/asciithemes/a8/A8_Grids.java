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

import de.vandermeer.asciithemes.TA_Grid;
import de.vandermeer.asciithemes.TA_GridConfig;

/**
 * Collection of {@link TA_Grid} for different extended ASCII characters.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 160319 (19-Mar-16) for Java 1.8
 * @since      v0.0.1
 */
public abstract class A8_Grids {

	/**
	 * A grid using normal, strong, and heavy extended ASCII characters for lines only (LaTeX style table).
	 * 
	 * ----
	 * Normal       Heavy        Strong       Example
	 * ─────────    ≡≡≡≡≡≡≡≡≡    ═════════    ≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡
	 *                                          h1    h2    h3    h4   
	 * ─────────    ≡≡≡≡≡≡≡≡≡    ═════════    ═════════════════════════
	 *                                          c11 to c14 w/col-span  
	 * ─────────    ≡≡≡≡≡≡≡≡≡    ═════════    ─────────────────────────
	 *                                          c21   c22   c23   c24  
	 *                                        ─────────────────────────
	 *                                          c31 - c32   c33 - c34  
	 *                                        ═════════════════════════
	 *                                          f1    f2    f3    f4   
	 *                                        ≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡
	 * ----
	 * 
	 * @return the grid
	 */
	public static TA_Grid lineDobuleTripple(){
		return TA_Grid.create("grid using normal, strong, and heavy extended ASCII characters for lines only (LaTeX style table)")
				.addCharacterMap(TA_GridConfig.RULESET_NORMAL, ' ', '─', ' ', '─', '─', '─', '─', '─', '─', '─', '─', '─')
				.addCharacterMap(TA_GridConfig.RULESET_STRONG, ' ', '═', ' ', '═', '═', '═', '═', '═', '═', '═', '═', '═')
				.addCharacterMap(TA_GridConfig.RULESET_HEAVY, ' ', '≡', ' ', '≡', '≡', '≡', '≡', '≡', '≡', '≡', '≡', '≡')
		;
	}

	/**
	 * A grid using normal, strong, and heavy extended ASCII characters for lines only (LaTeX style table).
	 * 
	 * ----
	 * ----
	 * 
	 * @return the grid
	 */
	public static TA_Grid lineDobuleBlocks(){
		return TA_Grid.create("grid using normal, strong, and heavy extended ASCII characters for lines only (LaTeX style table)")
				.addCharacterMap(TA_GridConfig.RULESET_NORMAL, ' ', '═', ' ', '═', '═', '═', '═', '═', '═', '═', '═', '═')
				.addCharacterMap(TA_GridConfig.RULESET_STRONG, ' ', '▓', ' ', '▓', '▓', '▓', '▓', '▓', '▓', '▓', '▓', '▓')
				.addCharacterMap(TA_GridConfig.RULESET_HEAVY, ' ', '▀', ' ', '▀', '▀', '▀', '▀', '▀', '▀', '▀', '▀', '▀')
				.addCharacterMap(TA_GridConfig.RULESET_LIGHT, ' ', '─', ' ', '─', '─', '─', '─', '─', '─', '─', '─', '─')
		;
	}
}

/*
TA_GridConfig.RULETYPE_NORMAL, ' ', '═', '║', '╔', '╗', '╚', '╝', '╠', '╣', '╬', '╦', '╩'
*/

/*


Normal           Strong           Example
─────────        ▀▀▀▀▀▀▀▀▀        ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
                                   h1   h2   h3   
─────────        ═════════        ════════════════
                                   c1   c2   c3   
─────────        ▓▓▓▓▓▓▓▓▓        ────────────────
                                   c1   c2   c3   
                                  ────────────────
                                   c1   c2   c3   
                                  ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓

*/