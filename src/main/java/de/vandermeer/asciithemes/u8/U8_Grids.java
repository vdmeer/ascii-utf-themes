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

import de.vandermeer.asciithemes.TA_Grid;
import de.vandermeer.asciithemes.TA_GridConfig;

/**
 * Collection of {@link TA_Grid} for different UTF-8 characters.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170404 (04-Apr-17) for Java 1.8
 * @since      v0.0.1
 */
public abstract class U8_Grids {

	/**
	 * A grid using UTF-8 light border characters.
	 * 
	 * ----
	 * Normal         Example
	 * ┌─┬─┬─┬─┐      ┌─────┬─────┬─────┬─────┐
	 * │ │ │ │ │      │ h1  │ h2  │ h3  │ h4  │
	 * ├─┼─┼─┼─┤      ├─────┴─────┴─────┴─────┤
	 * │ │ │ │ │      │ c11 to c14 w/col-span │
	 * └─┴─┴─┴─┘      ├─────┬─────┬─────┬─────┤
	 *                │ c21 │ c22 │ c23 │ c24 │
	 *                ├─────┴─────┼─────┴─────┤
	 *                │ c31 - c32 │ c33 - c34 │
	 *                ├─────┬─────┼─────┬─────┤
	 *                │ f1  │ f2  │ f3  │ f4  │
	 *                └─────┴─────┴─────┴─────┘
	 * ----
	 * 
	 * @return the grid
	 */
	public static TA_Grid borderLight(){
		return TA_Grid.create("grid using UTF-8 light border characters")
				.addCharacterMap(TA_GridConfig.RULESET_NORMAL, ' ', '─', '│', '┌', '┐', '└', '┘', '├', '┤', '┼', '┬', '┴')
		;
	}

	/**
	 * A grid using UTF-8 double border characters.
	 * 
	 * ----
	 * Normal         Example
	 * ╔═╦═╦═╦═╗      ╔═════╦═════╦═════╦═════╗
	 * ║ ║ ║ ║ ║      ║ h1  ║ h2  ║ h3  ║ h4  ║
	 * ╠═╬═╬═╬═╣      ╠═════╩═════╩═════╩═════╣
	 * ║ ║ ║ ║ ║      ║ c11 to c14 w/col-span ║
	 * ╚═╩═╩═╩═╝      ╠═════╦═════╦═════╦═════╣
	 *                ║ c21 ║ c22 ║ c23 ║ c24 ║
	 *                ╠═════╩═════╬═════╩═════╣
	 *                ║ c31 - c32 ║ c33 - c34 ║
	 *                ╠═════╦═════╬═════╦═════╣
	 *                ║ f1  ║ f2  ║ f3  ║ f4  ║
	 *                ╚═════╩═════╩═════╩═════╝
	 * ----
	 * 
	 * @return the grid
	 */
	public static TA_Grid borderDouble(){
		return TA_Grid.create("grid using UTF-8 double border characters")
				.addCharacterMap(TA_GridConfig.RULESET_NORMAL, ' ', '═', '║', '╔', '╗', '╚', '╝', '╠', '╣', '╬', '╦', '╩')
		;
	}

	/**
	 * A grid using UTF-8 light characters horizontally and double border characters vertically.
	 * 
	 * ----
	 * Normal         Example
	 * ╓─╥─╥─╥─╖      ╓─────╥─────╥─────╥─────╖
	 * ║ ║ ║ ║ ║      ║ h1  ║ h2  ║ h3  ║ h4  ║
	 * ╟─╫─╫─╫─╢      ╟─────╨─────╨─────╨─────╢
	 * ║ ║ ║ ║ ║      ║ c11 to c14 w/col-span ║
	 * ╙─╨─╨─╨─╜      ╟─────╥─────╥─────╥─────╢
	 *                ║ c21 ║ c22 ║ c23 ║ c24 ║
	 *                ╟─────╨─────╫─────╨─────╢
	 *                ║ c31 - c32 ║ c33 - c34 ║
	 *                ╟─────╥─────╫─────╥─────╢
	 *                ║ f1  ║ f2  ║ f3  ║ f4  ║
	 *                ╙─────╨─────╨─────╨─────╜
	 * ----
	 * 
	 * @return the grid
	 */
	public static TA_Grid borderLightDouble(){
		return TA_Grid.create("grid using UTF-8 light characters horizontally and double border characters vertically")
				.addCharacterMap(TA_GridConfig.RULESET_NORMAL, ' ', '─', '║', '╓', '╖', '╙', '╜', '╟', '╢', '╫', '╥', '╨')
		;
	}

	/**
	 * A grid combining UTF-8 light characters (normal rule) with double line characters (strong rule).
	 * 
	 * ----
	 * Normal         Strong         Example
	 * ┌─┬─┬─┬─┐      ╒═╤═╤═╤═╕      ╒═════╤═════╤═════╤═════╕
	 * │ │ │ │ │      │ │ │ │ │      │ h1  │ h2  │ h3  │ h4  │
	 * ├─┼─┼─┼─┤      ╞═╪═╪═╪═╡      ╞═════╧═════╧═════╧═════╡
	 * │ │ │ │ │      │ │ │ │ │      │ c11 to c14 w/col-span │
	 * └─┴─┴─┴─┘      ╘═╧═╧═╧═╛      ├─────┬─────┬─────┬─────┤
	 *                               │ c21 │ c22 │ c23 │ c24 │
	 *                               ├─────┴─────┼─────┴─────┤
	 *                               │ c31 - c32 │ c33 - c34 │
	 *                               ╞═════╤═════╪═════╤═════╡
	 *                               │ f1  │ f2  │ f3  │ f4  │
	 *                               ╘═════╧═════╧═════╧═════╛
	 * ----
	 * 
	 * @return the grid
	 */
	public static TA_Grid borderStrongDoubleLight(){
		return TA_Grid.create("grid combining UTF-8 light characters (normal rule) with double line characters (strong rule)")
				.addCharacterMap(TA_GridConfig.RULESET_NORMAL, ' ', '─', '│', '┌', '┐', '└', '┘', '├', '┤', '┼', '┬', '┴')
				.addCharacterMap(TA_GridConfig.RULESET_STRONG, ' ', '═', '│', '╒', '╕', '╘', '╛', '╞', '╡', '╪', '╤', '╧')
		;
	}

	/**
	 * A grid using UTF-8 double characters horizontally and light border characters vertically.
	 * 
	 * ----
	 * Normal         Example
	 * ╒═╤═╤═╤═╕      ╒═════╤═════╤═════╤═════╕
	 * │ │ │ │ │      │ h1  │ h2  │ h3  │ h4  │
	 * ╞═╪═╪═╪═╡      ╞═════╧═════╧═════╧═════╡
	 * │ │ │ │ │      │ c11 to c14 w/col-span │
	 * ╘═╧═╧═╧═╛      ╞═════╤═════╤═════╤═════╡
	 *                │ c21 │ c22 │ c23 │ c24 │
	 *                ╞═════╧═════╪═════╧═════╡
	 *                │ c31 - c32 │ c33 - c34 │
	 *                ╞═════╤═════╪═════╤═════╡
	 *                │ f1  │ f2  │ f3  │ f4  │
	 *                ╘═════╧═════╧═════╧═════╛
	 * ----
	 * 
	 * @return the grid
	 */
	public static TA_Grid borderDoubleLight(){
		return TA_Grid.create("grid using UTF-8 double characters horizontally and light border characters vertically")
				.addCharacterMap(TA_GridConfig.RULESET_NORMAL, ' ', '═', '│', '╒', '╕', '╘', '╛', '╞', '╡', '╪', '╤', '╧')
		;
	}

	/**
	 * A grid using UTF-8 heavy border characters.
	 * 
	 * ----
	 * Normal         Example
	 * ┏━┳━┳━┳━┓      ┏━━━━━┳━━━━━┳━━━━━┳━━━━━┓
	 * ┃ ┃ ┃ ┃ ┃      ┃ h1  ┃ h2  ┃ h3  ┃ h4  ┃
	 * ┣━╋━╋━╋━┫      ┣━━━━━┻━━━━━┻━━━━━┻━━━━━┫
	 * ┃ ┃ ┃ ┃ ┃      ┃ c11 to c14 w/col-span ┃
	 * ┗━┻━┻━┻━┛      ┣━━━━━┳━━━━━┳━━━━━┳━━━━━┫
	 *                ┃ c21 ┃ c22 ┃ c23 ┃ c24 ┃
	 *                ┣━━━━━┻━━━━━╋━━━━━┻━━━━━┫
	 *                ┃ c31 - c32 ┃ c33 - c34 ┃
	 *                ┣━━━━━┳━━━━━╋━━━━━┳━━━━━┫
	 *                ┃ f1  ┃ f2  ┃ f3  ┃ f4  ┃
	 *                ┗━━━━━┻━━━━━┻━━━━━┻━━━━━┛
	 * ----
	 * 
	 * @return the grid
	 */
	public static TA_Grid borderheavy(){
		return TA_Grid.create("grid using UTF-8 heavy border characters")
				.addCharacterMap(TA_GridConfig.RULESET_NORMAL, ' ', '━', '┃', '┏', '┓', '┗', '┛', '┣', '┫', '╋', '┳', '┻')
		;
	}

}
