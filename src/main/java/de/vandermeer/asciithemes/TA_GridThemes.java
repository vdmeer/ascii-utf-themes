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

import static de.vandermeer.asciithemes.TA_GridOptions.HAS_BOTTOM_CONNECTOR;
import static de.vandermeer.asciithemes.TA_GridOptions.HAS_BOTTOM_CORNER_LEFT;
import static de.vandermeer.asciithemes.TA_GridOptions.HAS_BOTTOM_CORNER_RIGHT;
import static de.vandermeer.asciithemes.TA_GridOptions.HAS_BOTTOM_LINE;
import static de.vandermeer.asciithemes.TA_GridOptions.HAS_CONTENT_LEFT;
import static de.vandermeer.asciithemes.TA_GridOptions.HAS_CONTENT_MID;
import static de.vandermeer.asciithemes.TA_GridOptions.HAS_CONTENT_RIGHT;
import static de.vandermeer.asciithemes.TA_GridOptions.HAS_MID_BORDER_LEFT;
import static de.vandermeer.asciithemes.TA_GridOptions.HAS_MID_BORDER_RIGHT;
import static de.vandermeer.asciithemes.TA_GridOptions.HAS_MID_CONNECTOR;
import static de.vandermeer.asciithemes.TA_GridOptions.HAS_MID_LINE;
import static de.vandermeer.asciithemes.TA_GridOptions.HAS_TOP_CONNECTOR;
import static de.vandermeer.asciithemes.TA_GridOptions.HAS_TOP_CORNER_LEFT;
import static de.vandermeer.asciithemes.TA_GridOptions.HAS_TOP_CORNER_RIGHT;
import static de.vandermeer.asciithemes.TA_GridOptions.HAS_TOP_LINE;
import static de.vandermeer.asciithemes.TA_GridOptions.OPT_CONVERT_BORDERS;
import static de.vandermeer.asciithemes.TA_GridOptions.OPT_CONVERT_CONNECTORS_HOR;
import static de.vandermeer.asciithemes.TA_GridOptions.OPT_CONVERT_CONNECTORS_VER;
import static de.vandermeer.asciithemes.TA_GridOptions.OPT_CONVERT_CORNERS_HOR;

/**
 * Themes for a {@link TA_Grid}.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170404 (04-Apr-17) for Java 1.8
 * @since      v0.0.1
 */
public enum TA_GridThemes {

	/**
	 * Theme for using the full grid.
	 */
	FULL(
			HAS_TOP_CONNECTOR | HAS_TOP_CORNER_LEFT | HAS_TOP_CORNER_RIGHT | HAS_TOP_LINE |
			HAS_BOTTOM_CONNECTOR | HAS_BOTTOM_CORNER_LEFT | HAS_BOTTOM_CORNER_RIGHT | HAS_BOTTOM_LINE |
			HAS_MID_CONNECTOR | HAS_MID_BORDER_LEFT | HAS_MID_BORDER_RIGHT | HAS_MID_LINE |
			HAS_CONTENT_LEFT | HAS_CONTENT_MID | HAS_CONTENT_RIGHT
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
			  HAS_TOP_CONNECTOR | HAS_TOP_CORNER_LEFT | HAS_TOP_CORNER_RIGHT | HAS_TOP_LINE
			| HAS_BOTTOM_CONNECTOR | HAS_BOTTOM_CORNER_LEFT | HAS_BOTTOM_CORNER_RIGHT | HAS_BOTTOM_LINE
			| HAS_MID_BORDER_LEFT | HAS_MID_BORDER_RIGHT
			| HAS_CONTENT_LEFT | HAS_CONTENT_RIGHT
			| OPT_CONVERT_BORDERS | OPT_CONVERT_CONNECTORS_HOR
	),

	/**
	 * Theme for using inside borders.
	 */
	INSIDE(
			  HAS_MID_CONNECTOR | HAS_MID_LINE
			| HAS_CONTENT_MID
	),

	/**
	 * Theme for using the inside borders horizontal lines only.
	 */
	INSIDE_HORIZONTAL(
			  HAS_MID_CONNECTOR | HAS_MID_LINE
			| OPT_CONVERT_CONNECTORS_HOR
	),

	/**
	 * Theme for using all horizontal line but no corners.
	 */
	HORIZONTAL(
			  HAS_TOP_CONNECTOR | HAS_TOP_LINE
			| HAS_BOTTOM_CONNECTOR | HAS_BOTTOM_LINE
			| HAS_MID_CONNECTOR | HAS_MID_LINE
			| OPT_CONVERT_CONNECTORS_HOR
	),

	/**
	 * Theme for using all horizontal line with corners.
	 */
	LATEX(
			  HAS_TOP_CONNECTOR | HAS_TOP_LINE
			| HAS_BOTTOM_CONNECTOR | HAS_BOTTOM_LINE
			| HAS_MID_CONNECTOR | HAS_MID_LINE
			| HAS_TOP_CORNER_LEFT | HAS_TOP_CORNER_RIGHT
			| HAS_BOTTOM_CORNER_LEFT | HAS_BOTTOM_CORNER_RIGHT
			| HAS_MID_BORDER_LEFT | HAS_MID_BORDER_RIGHT
			| OPT_CONVERT_CONNECTORS_HOR | OPT_CONVERT_CORNERS_HOR
	),

	/**
	 * Theme for using the inside borders vertical lines only.
	 */
	INSIDE_VERTICAL(
			  HAS_CONTENT_MID | HAS_MID_CONNECTOR
			| OPT_CONVERT_CONNECTORS_VER
	),

	/**
	 * Theme for using borders vertical lines only.
	 */
	VERTICAL(
			  HAS_MID_BORDER_LEFT | HAS_MID_CONNECTOR | HAS_MID_BORDER_RIGHT
			| HAS_CONTENT_LEFT | HAS_CONTENT_MID | HAS_CONTENT_RIGHT
			| OPT_CONVERT_BORDERS | OPT_CONVERT_CONNECTORS_VER
	),

	/**
	 * Theme for using only top and bottom lines.
	 */
	LINE_TOPBOTTOM(
			  HAS_TOP_CONNECTOR | HAS_TOP_LINE
			| HAS_BOTTOM_CONNECTOR | HAS_BOTTOM_LINE
			| OPT_CONVERT_CONNECTORS_HOR
	),

	/**
	 * Theme for using only left side.
	 */
	LEFT(
			  HAS_MID_BORDER_LEFT | HAS_CONTENT_LEFT
			| OPT_CONVERT_BORDERS
	),

	/**
	 * Theme for using only right side.
	 */
	RIGHT(
			  HAS_MID_BORDER_RIGHT | HAS_CONTENT_RIGHT
			| OPT_CONVERT_BORDERS
	),

	/**
	 * Theme for using only left and right borders.
	 */
	BORDERS(
			  HAS_MID_BORDER_LEFT | HAS_MID_BORDER_RIGHT
			| HAS_CONTENT_LEFT | HAS_CONTENT_RIGHT
			| OPT_CONVERT_BORDERS
	),

	/**
	 * Theme for using only corners.
	 */
	CORNERS(
			  HAS_TOP_CORNER_LEFT | HAS_TOP_CORNER_RIGHT
			| HAS_BOTTOM_CORNER_LEFT | HAS_BOTTOM_CORNER_RIGHT
	),

	/**
	 * Theme for using only corners and connectors.
	 */
	CC(
			  HAS_TOP_CORNER_LEFT | HAS_TOP_CORNER_RIGHT | HAS_TOP_CONNECTOR
			| HAS_BOTTOM_CORNER_LEFT | HAS_BOTTOM_CORNER_RIGHT | HAS_BOTTOM_CONNECTOR
			| HAS_MID_BORDER_LEFT | HAS_MID_BORDER_RIGHT 
			| HAS_MID_CONNECTOR
	),

	/**
	 * Theme for using only connectors.
	 */
	CONNECTORS(
			  HAS_TOP_CONNECTOR
			| HAS_BOTTOM_CONNECTOR
			| HAS_MID_CONNECTOR
	),

	/**
	 * Theme for using top and bottom lines only.
	 */
	TOPBOTTOM(
			  HAS_TOP_CONNECTOR | HAS_TOP_LINE
			| HAS_BOTTOM_CONNECTOR | HAS_BOTTOM_LINE
			| OPT_CONVERT_CONNECTORS_HOR
	),

	/**
	 * Theme for using top line only.
	 */
	TOP(
			  HAS_TOP_CONNECTOR | HAS_TOP_LINE
			| OPT_CONVERT_CONNECTORS_HOR
	),

	/**
	 * Theme for using bottom line only.
	 */
	BOTTOM(
			  HAS_BOTTOM_CONNECTOR | HAS_BOTTOM_LINE
			| OPT_CONVERT_CONNECTORS_HOR
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
