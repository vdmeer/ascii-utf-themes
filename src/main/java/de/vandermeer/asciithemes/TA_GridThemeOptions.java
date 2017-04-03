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

package de.vandermeer.asciithemes;

/**
 * Options for {@link TA_GridThemes}.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170331 (31-Mar-17) for Java 1.8
 * @since      v0.0.1
 */
public enum TA_GridThemeOptions {

	/**
	 * Option to show an empty top row.
	 */
	SHOW_EMPTY_ROW_TOP (TA_GridOptions.OPT_SHOW_EMPTY_ROW_TOP),

	/**
	 * Option to show an empty middle row.
	 */
	SHOW_EMPTY_ROW_MID (TA_GridOptions.OPT_SHOW_EMPTY_ROW_MID),

	/**
	 * Option to show an empty bottom row.
	 */
	SHOW_EMPTY_ROW_BOTTOM (TA_GridOptions.OPT_SHOW_EMPTY_ROW_BOTTOM),

	/**
	 * Option to show empty top/bottom rows.
	 */
	SHOW_EMPTY_ROW_TOPBOTTOM (TA_GridOptions.OPT_SHOW_EMPTY_ROW_TOP | TA_GridOptions.OPT_SHOW_EMPTY_ROW_BOTTOM),

	/**
	 * Option to show all empty rows.
	 */
	SHOW_EMPTY_ROW_ALL (TA_GridOptions.OPT_SHOW_EMPTY_ROW_TOP | TA_GridOptions.OPT_SHOW_EMPTY_ROW_MID | TA_GridOptions.OPT_SHOW_EMPTY_ROW_BOTTOM),


	/**
	 * Option to show an empty left border.
	 */
	SHOW_EMPTY_BORDER_LEFT (TA_GridOptions.OPT_SHOW_EMPTY_BORDER_LEFT),

	/**
	 * Option to show an empty mid border.
	 */
	SHOW_EMPTY_BORDER_MID (TA_GridOptions.OPT_SHOW_EMPTY_BORDER_MID),

	/**
	 * Option to show an empty right border.
	 */
	SHOW_EMPTY_BORDER_RIGHT (TA_GridOptions.OPT_SHOW_EMPTY_BORDER_RIGHT),

	/**
	 * Option to show empty left/right borders.
	 */
	SHOW_EMPTY_BORDER_LR (TA_GridOptions.OPT_SHOW_EMPTY_BORDER_LEFT | TA_GridOptions.OPT_SHOW_EMPTY_BORDER_RIGHT),

	/**
	 * Option to show all empty borders.
	 */
	SHOW_EMPTY_BORDER_ALL (TA_GridOptions.OPT_SHOW_EMPTY_BORDER_LEFT | TA_GridOptions.OPT_SHOW_EMPTY_BORDER_MID | TA_GridOptions.OPT_SHOW_EMPTY_BORDER_RIGHT),


	/**
	 * Option to show all empty rows and borders.
	 */
	SHOW_EMPTY_ALL (
			TA_GridOptions.OPT_SHOW_EMPTY_ROW_TOP | TA_GridOptions.OPT_SHOW_EMPTY_ROW_MID | TA_GridOptions.OPT_SHOW_EMPTY_ROW_BOTTOM |
			TA_GridOptions.OPT_SHOW_EMPTY_BORDER_LEFT | TA_GridOptions.OPT_SHOW_EMPTY_BORDER_MID | TA_GridOptions.OPT_SHOW_EMPTY_BORDER_RIGHT
	),


	/**
	 * Options to show empty borders and rows inside the grid.
	 */
	SHOW_EMPTY_INNER (
			TA_GridOptions.OPT_SHOW_EMPTY_ROW_MID | TA_GridOptions.OPT_SHOW_EMPTY_BORDER_MID
	),

	/**
	 * Options to show empty borders and rows outside the grid.
	 */
	SHOW_EMPTY_OUTER (
			TA_GridOptions.OPT_SHOW_EMPTY_ROW_TOP | TA_GridOptions.OPT_SHOW_EMPTY_ROW_BOTTOM |
			TA_GridOptions.OPT_SHOW_EMPTY_BORDER_LEFT | TA_GridOptions.OPT_SHOW_EMPTY_BORDER_RIGHT
	),

	;

	/** The option encoded as an integer using {@link TA_GridOptions}. */
	private int option;

	/**
	 * Creates a new theme option.
	 * @param option integer encoding of the option using {@link TA_GridOptions}.
	 */
	TA_GridThemeOptions(int option){
		this.option = option;
	}

	/**
	 * Returns the integer encoding of the option using {@link TA_GridOptions}.
	 * @return integer encoding of the option
	 */
	public int get(){
		return this.option;
	}

}
