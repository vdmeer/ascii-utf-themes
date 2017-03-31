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
 * Themes for a {@link TA_Grid}.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 160319 (19-Mar-16) for Java 1.8
 * @since      v0.0.1
 */
public enum TA_GridThemes {

	/**
	 * Theme for using the full grid.
	 */
	FULL(
			TA_GridOptions.HAS_TOP_CONNECTOR | TA_GridOptions.HAS_TOP_CORNER_LEFT | TA_GridOptions.HAS_TOP_CORNER_RIGHT | TA_GridOptions.HAS_TOP_LINE |
			TA_GridOptions.HAS_BOTTOM_CONNECTOR | TA_GridOptions.HAS_BOTTOM_CORNER_LEFT | TA_GridOptions.HAS_BOTTOM_CORNER_RIGHT | TA_GridOptions.HAS_BOTTOM_LINE |
			TA_GridOptions.HAS_MID_CONNECTOR | TA_GridOptions.HAS_MID_BORDER_LEFT | TA_GridOptions.HAS_MID_BORDER_RIGHT | TA_GridOptions.HAS_MID_LINE |
			TA_GridOptions.HAS_CONTENT_LEFT | TA_GridOptions.HAS_CONTENT_MID | TA_GridOptions.HAS_CONTENT_RIGHT
	),

	/**
	 * Theme for using no grid.
	 */
	NONE(
			0
	),

	/**
	 * Theme for using the outside borders.
	 */
	OUTSIDE(
			  TA_GridOptions.HAS_TOP_CONNECTOR | TA_GridOptions.HAS_TOP_CORNER_LEFT | TA_GridOptions.HAS_TOP_CORNER_RIGHT | TA_GridOptions.HAS_TOP_LINE
			| TA_GridOptions.HAS_BOTTOM_CONNECTOR | TA_GridOptions.HAS_BOTTOM_CORNER_LEFT | TA_GridOptions.HAS_BOTTOM_CORNER_RIGHT | TA_GridOptions.HAS_BOTTOM_LINE
			| TA_GridOptions.HAS_MID_BORDER_LEFT | TA_GridOptions.HAS_MID_BORDER_RIGHT
			| TA_GridOptions.HAS_CONTENT_LEFT | TA_GridOptions.HAS_CONTENT_RIGHT
			| TA_GridOptions.OPT_CONVERT_BORDERS | TA_GridOptions.OPT_CONVERT_CONNECTORS_HOR
	),

	/**
	 * Theme for using inside borders.
	 */
	INSIDE(
			  TA_GridOptions.HAS_MID_CONNECTOR | TA_GridOptions.HAS_MID_LINE
			| TA_GridOptions.HAS_CONTENT_MID
	),

	/**
	 * Theme for using the inside borders horizontal lines only.
	 */
	INSIDE_HORIZONTAL(
			  TA_GridOptions.HAS_MID_CONNECTOR | TA_GridOptions.HAS_MID_LINE
			| TA_GridOptions.OPT_CONVERT_CONNECTORS_HOR
	),

	/**
	 * Theme for using only top/bottom lines and left/right borders, that is no corners.
	 */
	HORIZONTAL(
			  TA_GridOptions.HAS_TOP_CONNECTOR | TA_GridOptions.HAS_TOP_LINE
			| TA_GridOptions.HAS_BOTTOM_CONNECTOR | TA_GridOptions.HAS_BOTTOM_LINE
			| TA_GridOptions.HAS_MID_CONNECTOR | TA_GridOptions.HAS_MID_LINE
			| TA_GridOptions.OPT_CONVERT_CONNECTORS_HOR
	),

	/**
	 * Theme for using the inside borders vertical lines only.
	 */
	INSIDE_VERTICAL(
			  TA_GridOptions.HAS_CONTENT_MID | TA_GridOptions.HAS_MID_CONNECTOR
			| TA_GridOptions.OPT_CONVERT_CONNECTORS_VER
	),

	/**
	 * Theme for using borders vertical lines only.
	 */
	VERTICAL(
			  TA_GridOptions.HAS_MID_BORDER_LEFT | TA_GridOptions.HAS_MID_CONNECTOR | TA_GridOptions.HAS_MID_BORDER_RIGHT
			| TA_GridOptions.HAS_CONTENT_LEFT | TA_GridOptions.HAS_CONTENT_MID | TA_GridOptions.HAS_CONTENT_RIGHT
			| TA_GridOptions.OPT_CONVERT_BORDERS | TA_GridOptions.OPT_CONVERT_CONNECTORS_VER
	),

	/**
	 * Theme for using only top and bottom lines.
	 */
	LINE_TOPBOTTOM(
			  TA_GridOptions.HAS_TOP_CONNECTOR | TA_GridOptions.HAS_TOP_LINE
			| TA_GridOptions.HAS_BOTTOM_CONNECTOR | TA_GridOptions.HAS_BOTTOM_LINE
			| TA_GridOptions.OPT_CONVERT_CONNECTORS_HOR
	),

	/**
	 * Theme for using only left side.
	 */
	LEFT(
			  TA_GridOptions.HAS_MID_BORDER_LEFT | TA_GridOptions.HAS_CONTENT_LEFT
			| TA_GridOptions.OPT_CONVERT_BORDERS
	),

	/**
	 * Theme for using only right side.
	 */
	RIGHT(
			  TA_GridOptions.HAS_MID_BORDER_RIGHT | TA_GridOptions.HAS_CONTENT_RIGHT
			| TA_GridOptions.OPT_CONVERT_BORDERS
	),

	/**
	 * Theme for using only left and right borders.
	 */
	BORDERS(
			  TA_GridOptions.HAS_MID_BORDER_LEFT | TA_GridOptions.HAS_MID_BORDER_RIGHT
			| TA_GridOptions.HAS_CONTENT_LEFT | TA_GridOptions.HAS_CONTENT_RIGHT
			| TA_GridOptions.OPT_CONVERT_BORDERS
	),

	/**
	 * Theme for using only corners.
	 */
	CORNERS(
			  TA_GridOptions.HAS_TOP_CORNER_LEFT | TA_GridOptions.HAS_TOP_CORNER_RIGHT
			| TA_GridOptions.HAS_BOTTOM_CORNER_LEFT | TA_GridOptions.HAS_BOTTOM_CORNER_RIGHT
	),

	/**
	 * Theme for using only corners and connectors.
	 */
	CC(
			  TA_GridOptions.HAS_TOP_CORNER_LEFT | TA_GridOptions.HAS_TOP_CORNER_RIGHT | TA_GridOptions.HAS_TOP_CONNECTOR
			| TA_GridOptions.HAS_BOTTOM_CORNER_LEFT | TA_GridOptions.HAS_BOTTOM_CORNER_RIGHT | TA_GridOptions.HAS_BOTTOM_CONNECTOR
			| TA_GridOptions.HAS_MID_BORDER_LEFT | TA_GridOptions.HAS_MID_BORDER_RIGHT 
			| TA_GridOptions.HAS_MID_CONNECTOR
	),

	/**
	 * Theme for using only connectors.
	 */
	CONNECTORS(
			  TA_GridOptions.HAS_TOP_CONNECTOR
			| TA_GridOptions.HAS_BOTTOM_CONNECTOR
			| TA_GridOptions.HAS_MID_CONNECTOR
	),

	/**
	 * Theme for using top and bottom lines only.
	 */
	TOPBOTTOM(
			  TA_GridOptions.HAS_TOP_CONNECTOR | TA_GridOptions.HAS_TOP_LINE
			| TA_GridOptions.HAS_BOTTOM_CONNECTOR | TA_GridOptions.HAS_BOTTOM_LINE
			| TA_GridOptions.OPT_CONVERT_CONNECTORS_HOR
	),

	/**
	 * Theme for using top line only.
	 */
	TOP(
			  TA_GridOptions.HAS_TOP_CONNECTOR | TA_GridOptions.HAS_TOP_LINE
			| TA_GridOptions.OPT_CONVERT_CONNECTORS_HOR
	),

	/**
	 * Theme for using bottom line only.
	 */
	BOTTOM(
			  TA_GridOptions.HAS_BOTTOM_CONNECTOR | TA_GridOptions.HAS_BOTTOM_LINE
			| TA_GridOptions.OPT_CONVERT_CONNECTORS_HOR
	),

	;

	/** The theme encoded as an integer using {@link TA_GridOptions}. */
	private int theme;

	/**
	 * Creates a new theme.
	 * @param theme integer encoding of the theme using {@link TA_GridOptions}.
	 */
	TA_GridThemes(int theme){
		this.theme = theme;
	}

	/**
	 * Returns the integer encoding of the theme using {@link TA_GridOptions}.
	 * @return integer encoding of the theme
	 */
	public int get(){
		return this.theme;
	}
}
