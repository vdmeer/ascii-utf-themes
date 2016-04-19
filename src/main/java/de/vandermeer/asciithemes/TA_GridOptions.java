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
 * Options and utilities for a {@link TA_Grid}.
 * 
 * The interface provides three different items:
 * - grid options determining parts of a grid (static definitions starting with `OPT_`),
 * - grid themes combining options to complete themes (static definitions starting with `THEME_`), and
 * - methods to calculate what parts of a grid are required (standard static methods) or needed (static methods finishing with `Needed`).
 * 
 * For the static methods, the difference between required and needed is:
 * - required means that the grid option needs to be rendered, i.e. a border character needs to be printed
 * - needed means that the grid option is not required but some character (blank) is needed in order to maintain vertical and/or horizontal alignment
 * 
 * The grid options define what part of the grid needs to be rendered (when adding a grid to some text).
 * The options are using bit masks to combine them to themes.
 * The predefined themes can be used to request different types of grids.
 * Other themes can be defined easily combining the required options.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 160319 (19-Mar-16) for Java 1.8
 * @since      v0.0.1
 */
public interface TA_GridOptions {

	//Each row type has 4 different characters, so each has 4 options

	//Top row first
	/** Top row, left corner. */
	static int OPT_TOP_CORNERLEFT     = 0b00000000000000_0001;

	/** Top row, line. */
	static int OPT_TOP_LINE           = 0b00000000000000_0010;

	/** Top row, connector. */
	static int OPT_TOP_CONNECTOR      = 0b00000000000000_0100;

	/** Top row, right corner. */
	static int OPT_TOP_CORNERRIGHT    = 0b00000000000000_1000;


	//bottom row next
	/** Bottom row, left corner. */
	static int OPT_BOTTOM_CORNERLEFT  = 0b0000000000_0001_0000;

	/** Bottom row, line. */
	static int OPT_BOTTOM_LINE        = 0b0000000000_0010_0000;

	/** Bottom row, connector. */
	static int OPT_BOTTOM_CONNECTOR   = 0b0000000000_0100_0000;

	/** Bottom row, right corner. */
	static int OPT_BOTTOM_CORNERRIGHT = 0b0000000000_1000_0000;


	//mid row
	/** Mid row, left corner. */
	static int OPT_MID_BORDERLEFT     = 0b000000_0001_0000_0000;

	/** Mid row, line. */
	static int OPT_MID_LINE           = 0b000000_0010_0000_0000;

	/** Mid row, connector. */
	static int OPT_MID_CONNECTOR      = 0b000000_0100_0000_0000;

	/** Mid row, right corner. */
	static int OPT_MID_BORDERRIGHT    = 0b000000_1000_0000_0000;


	//content row last, here we only have 3, the 4th is the content
	/** Content row, left border. */
	static int OPT_CONTENT_LEFT       = 0b000_001_0000_0000_0000;

	/** Content row, middle border. */
	static int OPT_CONTENT_MID        = 0b000_010_0000_0000_0000;

	/** Content row, right border. */
	static int OPT_CONTENT_RIGHT      = 0b000_100_0000_0000_0000;


	/** Flag for converting borders to line equivalent. */
	static int OPT_CONVERT_BORDERS           = 0b0001_000_0000_0000_0000;

	/** Flag for converting borders to line equivalent. */
	static int OPT_CONVERT_CONNECTORS_TOP    = 0b0010_000_0000_0000_0000;

	/** Flag for converting borders to line equivalent. */
	static int OPT_CONVERT_CONNECTORS_BOTTOM = 0b0100_000_0000_0000_0000;

	/** Flag for converting borders to line equivalent. */
	static int OPT_CONVERT_CONNECTORS_MID    = 0b1000_000_0000_0000_0000;



	/** Theme for using the full grid. */
	static int THEME_FULL_GRID = 
			OPT_TOP_CONNECTOR | OPT_TOP_CORNERLEFT | OPT_TOP_CORNERRIGHT | OPT_TOP_LINE |
			OPT_BOTTOM_CONNECTOR | OPT_BOTTOM_CORNERLEFT | OPT_BOTTOM_CORNERRIGHT | OPT_BOTTOM_LINE |
			OPT_MID_CONNECTOR | OPT_MID_BORDERLEFT | OPT_MID_BORDERRIGHT | OPT_MID_LINE |
			OPT_CONTENT_LEFT | OPT_CONTENT_MID | OPT_CONTENT_RIGHT
	;

	/** Theme for using the outside borders. */
	static int THEME_OUTSIDE = 
			  OPT_TOP_CONNECTOR | OPT_TOP_CORNERLEFT | OPT_TOP_CORNERRIGHT | OPT_TOP_LINE
			| OPT_BOTTOM_CONNECTOR | OPT_BOTTOM_CORNERLEFT | OPT_BOTTOM_CORNERRIGHT | OPT_BOTTOM_LINE
			| OPT_MID_BORDERLEFT | OPT_MID_BORDERRIGHT
			| OPT_CONTENT_LEFT | OPT_CONTENT_RIGHT
			| OPT_CONVERT_BORDERS | OPT_CONVERT_CONNECTORS_TOP | OPT_CONVERT_CONNECTORS_BOTTOM
	;

	/** Theme for using inside borders. */
	static int THEME_INSIDE = 
			  OPT_MID_CONNECTOR | OPT_MID_LINE
			| OPT_CONTENT_MID
	;

	/** Theme for using the inside borders horizontal lines only. */
	static int THEME_INSIDE_HORIZONTAL = 
			  OPT_MID_CONNECTOR | OPT_MID_LINE
			| OPT_CONVERT_CONNECTORS_MID
	;

	/** Theme for using only top/bottom lines and left/right borders, that is no corners. */
	static int THEME_HORIZONTAL = 
			  OPT_TOP_CONNECTOR | OPT_TOP_LINE
			| OPT_BOTTOM_CONNECTOR | OPT_BOTTOM_LINE
			| OPT_MID_CONNECTOR | OPT_MID_LINE
			| OPT_CONVERT_CONNECTORS_TOP | OPT_CONVERT_CONNECTORS_BOTTOM | OPT_CONVERT_CONNECTORS_MID
	;

	/** Theme for using the inside borders vertical lines only. */
	static int THEME_INSIDE_VERTICAL = OPT_CONTENT_MID;

	/** Theme for using borders vertical lines only. */
	static int THEME_VERTICAL = 
			  OPT_MID_BORDERLEFT | OPT_MID_BORDERRIGHT
			| OPT_CONTENT_LEFT | OPT_CONTENT_MID | OPT_CONTENT_RIGHT
			| OPT_CONVERT_BORDERS
	;

	/** Theme for using only top and bottom lines. */
	static int THEME_LINE_TOPBOTTOM = OPT_BOTTOM_CONNECTOR | OPT_BOTTOM_LINE;

	/** Theme for using only left side. */
	static int THEME_LEFT_ONLY = 
			OPT_TOP_CORNERLEFT | OPT_MID_BORDERLEFT | OPT_CONTENT_LEFT | OPT_BOTTOM_CORNERLEFT;

	/** Theme for using only left and right borders. */
	static int THEME_BORDERS_ONLY =
			  OPT_MID_BORDERLEFT | OPT_MID_BORDERRIGHT
			| OPT_CONTENT_LEFT | OPT_CONTENT_MID
	;
	/** Theme for using only corners. */
	static int THEME_CORNERS_ONLY = 
			  OPT_TOP_CORNERLEFT | OPT_TOP_CORNERRIGHT
			| OPT_BOTTOM_CORNERLEFT | OPT_BOTTOM_CORNERRIGHT
	;

	/** Theme for using only corners and connectors. */
	static int THEME_CC_ONLY = 
			  OPT_TOP_CORNERLEFT | OPT_TOP_CORNERRIGHT | OPT_TOP_CONNECTOR
			| OPT_BOTTOM_CORNERLEFT | OPT_BOTTOM_CORNERRIGHT | OPT_BOTTOM_CONNECTOR
			| OPT_MID_BORDERLEFT | OPT_MID_BORDERRIGHT 
			| OPT_MID_CONNECTOR
	;

	/** Theme for using top and bottom lines only. */
	static int THEME_TOPBOTTOM = 
			  OPT_TOP_CONNECTOR | OPT_TOP_CORNERLEFT | OPT_TOP_CORNERRIGHT | OPT_TOP_LINE
			| OPT_BOTTOM_CONNECTOR | OPT_BOTTOM_CORNERLEFT | OPT_BOTTOM_CORNERRIGHT | OPT_BOTTOM_LINE
	;

	/** Theme for using top line only. */
	static int THEME_TOP = 
			OPT_TOP_CONNECTOR | OPT_TOP_CORNERLEFT | OPT_TOP_CORNERRIGHT | OPT_TOP_LINE
	;

	/** Theme for using bottom line only. */
	static int THEME_BOTTOM = 
			OPT_BOTTOM_CONNECTOR | OPT_BOTTOM_CORNERLEFT | OPT_BOTTOM_CORNERRIGHT | OPT_BOTTOM_LINE
	;



	/**
	 * Tests if borders need to be converted.
	 * @param mode the mode to test against
	 * @return true if borders need to be converted, false otherwise
	 */
	static boolean convertBorders(int mode){
		return ((mode & OPT_CONVERT_BORDERS) == OPT_CONVERT_BORDERS);
	}

	/**
	 * Tests if top connectors need to be converted.
	 * @param mode the mode to test against
	 * @return true if top connectors need to be converted, false otherwise
	 */
	static boolean convertConnectorsTop(int mode){
		return ((mode & OPT_CONVERT_CONNECTORS_TOP) == OPT_CONVERT_CONNECTORS_TOP);
	}

	/**
	 * Tests if bottom connectors need to be converted.
	 * @param mode the mode to test against
	 * @return true if bottom connectors need to be converted, false otherwise
	 */
	static boolean convertConnectorsBottom(int mode){
		return ((mode & OPT_CONVERT_CONNECTORS_BOTTOM) == OPT_CONVERT_CONNECTORS_BOTTOM);
	}

	/**
	 * Tests if mid connectors need to be converted.
	 * @param mode the mode to test against
	 * @return true if mid connectors need to be converted, false otherwise
	 */
	static boolean convertConnectorsMid(int mode){
		return ((mode & OPT_CONVERT_CONNECTORS_MID) == OPT_CONVERT_CONNECTORS_MID);
	}


	/**
	 * Tests if the top left corner is requested.
	 * @param mode the mode to test against
	 * @return true if top left corner is requested, false otherwise
	 */
	static boolean cornerTopLeft(int mode){
		return ((mode & OPT_TOP_CORNERLEFT) == OPT_TOP_CORNERLEFT);
	}

	/**
	 * Tests if the top left corner is needed.
	 * @param mode the mode to test against
	 * @return true if top left corner is needed, false otherwise
	 */
	static boolean cornerTopLeftNeeded(int mode){
		if(lineTop(mode) || connectorTop(mode) || cornerTopRight(mode)){
			if(contentLeftBorder(mode) || borderMidLeft(mode) || cornerBottomLeft(mode)){
				return true;
			}
		}
		return false;
	}

	/**
	 * Tests if the top line is requested.
	 * @param mode the mode to test against
	 * @return true if top line is requested, false otherwise
	 */
	static boolean lineTop(int mode){
		return ((mode & OPT_TOP_LINE) == OPT_TOP_LINE);
	}

	/**
	 * Tests if the top connector is requested.
	 * @param mode the mode to test against
	 * @return true if top connector is requested, false otherwise
	 */
	static boolean connectorTop(int mode){
		return ((mode & OPT_TOP_CONNECTOR) == OPT_TOP_CONNECTOR);
	}

	/**
	 * Tests if a top line is needed because one or both corners are required.
	 * @param mode the mode to test against
	 * @return true if a top line is needed, false otherwise
	 */
	static boolean lineTopNeeded(int mode){
		return (cornerTopLeft(mode) || cornerTopRight(mode));
	}

	/**
	 * Tests if a top connector is needed because one or both corners are required.
	 * @param mode the mode to test against
	 * @return true if a top connector is needed, false otherwise
	 */
	static boolean connectorTopNeeded(int mode){
		return (cornerTopLeft(mode) || cornerTopRight(mode));
	}

	/**
	 * Tests if the top right corner is requested.
	 * @param mode the mode to test against
	 * @return true if top right corner is requested, false otherwise
	 */
	static boolean cornerTopRight(int mode){
		return ((mode & OPT_TOP_CORNERRIGHT) == OPT_TOP_CORNERRIGHT);
	}

	/**
	 * Tests if the top right corner is needed.
	 * @param mode the mode to test against
	 * @return true if top right corner is needed, false otherwise
	 */
	static boolean cornerTopRightNeeded(int mode){
		if(cornerTopLeft(mode) || lineTop(mode) || connectorTop(mode)){
			if(contentRightBorder(mode) || borderMidRight(mode) || cornerBottomRight(mode)){
				return true;
			}
		}
		return false;
	}

	/**
	 * Tests if the bottom left corner is requested.
	 * @param mode the mode to test against
	 * @return true if bottom left corner is requested, false otherwise
	 */
	static boolean cornerBottomLeft(int mode){
		return ((mode & OPT_BOTTOM_CORNERLEFT) == OPT_BOTTOM_CORNERLEFT);
	}

	/**
	 * Tests if the bottom left corner is needed.
	 * @param mode the mode to test against
	 * @return true if bottom left corner is needed, false otherwise
	 */
	static boolean cornerBottomLeftNeeded(int mode){
		if(lineBottom(mode) || connectorBottom(mode) || cornerBottomRight(mode)){
			if(contentLeftBorder(mode) || borderMidLeft(mode) || cornerTopLeft(mode)){
				return true;
			}
		}
		return false;
	}

	/**
	 * Tests if the bottom line is requested.
	 * @param mode the mode to test against
	 * @return true if bottom line is requested, false otherwise
	 */
	static boolean lineBottom(int mode){
		return ((mode & OPT_BOTTOM_LINE) == OPT_BOTTOM_LINE);
	}

	/**
	 * Tests if the bottom connector is requested.
	 * @param mode the mode to test against
	 * @return true if bottom connector is requested, false otherwise
	 */
	static boolean connectorBottom(int mode){
		return ((mode & OPT_BOTTOM_CONNECTOR) == OPT_BOTTOM_CONNECTOR);
	}

	/**
	 * Tests if a bottom line is needed because one or both corners are required.
	 * @param mode the mode to test against
	 * @return true if a bottom line is needed, false otherwise
	 */
	static boolean lineBottomNeeded(int mode){
		return (cornerBottomLeft(mode) || cornerBottomRight(mode));
	}

	/**
	 * Tests if a bottom connector is needed because one or both corners are required.
	 * @param mode the mode to test against
	 * @return true if a bottom connector is needed, false otherwise
	 */
	static boolean connectorBottomNeeded(int mode){
		return (cornerBottomLeft(mode) || cornerBottomRight(mode));
	}

	/**
	 * Tests if the bottom right corner is requested.
	 * @param mode the mode to test against
	 * @return true if bottom right corner is requested, false otherwise
	 */
	static boolean cornerBottomRight(int mode){
		return ((mode & OPT_BOTTOM_CORNERRIGHT) == OPT_BOTTOM_CORNERRIGHT);
	}

	/**
	 * Tests if the bottom right corner is needed.
	 * @param mode the mode to test against
	 * @return true if bottom right corner is needed, false otherwise
	 */
	static boolean cornerBottomRightNeeded(int mode){
		if(cornerBottomLeft(mode) || lineBottom(mode) || connectorBottom(mode)){
			if(contentRightBorder(mode) || borderMidRight(mode) || cornerTopRight(mode)){
				return true;
			}
		}
		return false;
	}

	/**
	 * Tests if the mid left border is requested.
	 * @param mode the mode to test against
	 * @return true if mid left border is requested, false otherwise
	 */
	static boolean borderMidLeft(int mode){
		return ((mode & OPT_MID_BORDERLEFT) == OPT_MID_BORDERLEFT);
	}

	/**
	 * Tests if the mid left border is needed.
	 * @param mode the mode to test against
	 * @return true if mid left border is needed, false otherwise
	 */
	static boolean borderMidLeftNeeded(int mode){
		return (contentLeftBorder(mode) || cornerTopLeft(mode) || cornerTopRight(mode));
	}

	/**
	 * Tests if the mid line is requested.
	 * @param mode the mode to test against
	 * @return true if mid line is requested, false otherwise
	 */
	static boolean lineMid(int mode){
		return ((mode & OPT_MID_LINE) == OPT_MID_LINE);
	}

	/**
	 * Tests if the mid connector is requested.
	 * @param mode the mode to test against
	 * @return true if mid connector is requested, false otherwise
	 */
	static boolean connectorMid(int mode){
		return ((mode & OPT_MID_CONNECTOR) == OPT_MID_CONNECTOR);
	}

	/**
	 * Tests if a mid line is needed because one or both corners are required.
	 * @param mode the mode to test against
	 * @return true if a mid line is needed, false otherwise
	 */
	static boolean lineMidNeeded(int mode){
		if(borderMidLeft(mode) || borderMidRight(mode)){
			return true;
		}
		if(connectorTop(mode) || connectorBottom(mode)){
			return true;
		}
		if(connectorMid(mode)){
			return true;
		}
		if(mode==THEME_INSIDE_VERTICAL || mode==THEME_CORNERS_ONLY){
			return true;
		}		return false;
	}

	/**
	 * Tests if a mid connector is needed because one or both corners are required.
	 * @param mode the mode to test against
	 * @return true if a mid connector is needed, false otherwise
	 */
	static boolean connectorMidNeeded(int mode){
		if(mode==THEME_INSIDE_VERTICAL || mode==THEME_CORNERS_ONLY){
			return true;
		}
		return (borderMidLeft(mode) || borderMidRight(mode));
	}

	/**
	 * Tests if the mid right border is requested.
	 * @param mode the mode to test against
	 * @return true if mid right border is requested, false otherwise
	 */
	static boolean borderMidRight(int mode){
		return ((mode & OPT_MID_BORDERRIGHT) == OPT_MID_BORDERRIGHT);
	}

	/**
	 * Tests if the mid right border is needed.
	 * @param mode the mode to test against
	 * @return true if mid right border is needed, false otherwise
	 */
	static boolean borderMidRightNeeded(int mode){
		return (contentRightBorder(mode) || cornerBottomLeft(mode) || cornerBottomRight(mode));
	}

	/**
	 * Tests if the left content border is requested.
	 * @param mode the mode to test against
	 * @return true if left content border is requested, false otherwise
	 */
	static boolean contentLeftBorder(int mode){
		return ((mode & OPT_CONTENT_LEFT) == OPT_CONTENT_LEFT);
	}

	/**
	 * Tests if the left content border is needed.
	 * @param mode the mode to test against
	 * @return true if left content border is needed, false otherwise
	 */
	static boolean contentLeftBorderNeeded(int mode){
		return (cornerTopLeft(mode) || borderMidLeft(mode) || cornerBottomLeft(mode));
	}

	/**
	 * Tests if the mid content border is requested.
	 * @param mode the mode to test against
	 * @return true if mid content border is requested, false otherwise
	 */
	static boolean contentMidBorder(int mode){
		return ((mode & OPT_CONTENT_MID) == OPT_CONTENT_MID);
	}

	/**
	 * Tests if the mid content border is needed.
	 * @param mode the mode to test against
	 * @return true if mid content border is needed, false otherwise
	 */
	static boolean contentMidBorderNeeded(int mode){
//		if(connectorTop(mode) || connectorMid(mode) || connectorBottom(mode)){
//			return true;
//		}
//		if(cornerTopLeft(mode) || cornerTopRight(mode)){
//			return true;
//		}
//		if(cornerBottomLeft(mode) || cornerBottomRight(mode)){
//			return true;
//		}
//		return false;
		return true;
	}

	/**
	 * Tests if the right content border is requested.
	 * @param mode the mode to test against
	 * @return true if right content border is requested, false otherwise
	 */
	static boolean contentRightBorder(int mode){
		return ((mode & OPT_CONTENT_RIGHT) == OPT_CONTENT_RIGHT);
	}

	/**
	 * Tests if the right content border is needed.
	 * @param mode the mode to test against
	 * @return true if right content border is needed, false otherwise
	 */
	static boolean contentRightBorderNeeded(int mode){
		return (cornerTopRight(mode) || borderMidRight(mode) || cornerBottomRight(mode));
	}
}
