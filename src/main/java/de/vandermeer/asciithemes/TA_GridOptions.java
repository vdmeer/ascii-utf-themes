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
 * @version    v0.0.1 build 170404 (04-Apr-17) for Java 1.8
 * @since      v0.0.1
 */
public interface TA_GridOptions {

	//Top row first
	/** Option for using the top row, left corner. */
	static int HAS_TOP_CORNER_LEFT               = 0b0001;

	/** Option for using the top row, line. */
	static int HAS_TOP_LINE                      = 0b0010;

	/** Option for using the top row, connector. */
	static int HAS_TOP_CONNECTOR                 = 0b0100;

	/** Option for using the top row, right corner. */
	static int HAS_TOP_CORNER_RIGHT              = 0b1000;


	//bottom row next
	/** Option for using the bottom row, left corner. */
	static int HAS_BOTTOM_CORNER_LEFT            = 0b0001_0000;

	/** Option for using the bottom row, line. */
	static int HAS_BOTTOM_LINE                   = 0b0010_0000;

	/** Option for using the bottom row, connector. */
	static int HAS_BOTTOM_CONNECTOR              = 0b0100_0000;

	/** Option for using the bottom row, right corner. */
	static int HAS_BOTTOM_CORNER_RIGHT           = 0b1000_0000;


	//mid row
	/** Option for using the mid row, left corner. */
	static int HAS_MID_BORDER_LEFT               = 0b0001_0000_0000;

	/** Option for using the mid row, line. */
	static int HAS_MID_LINE                      = 0b0010_0000_0000;

	/** Option for using the mid row, connector. */
	static int HAS_MID_CONNECTOR                 = 0b0100_0000_0000;

	/** Option for using the mid row, right corner. */
	static int HAS_MID_BORDER_RIGHT              = 0b1000_0000_0000;


	//content row, here we only have 3, the 4th is all 3 active
	/** Option for using the content row, left border. */
	static int HAS_CONTENT_LEFT                  = 0b001_0000_0000_0000;

	/** Option for using the content row, middle border. */
	static int HAS_CONTENT_MID                   = 0b010_0000_0000_0000;

	/** Option for using the content row, right border. */
	static int HAS_CONTENT_RIGHT                 = 0b100_0000_0000_0000;


	/** Option for converting all borders to line equivalent. */
	static int OPT_CONVERT_BORDERS               = 0b00001_000_0000_0000_0000;

	/** Option for converting all connectors to horizontal line equivalent. */
	static int OPT_CONVERT_CONNECTORS_HOR        = 0b00010_000_0000_0000_0000;

	/** Option for converting all connectors to vertical line equivalent. */
	static int OPT_CONVERT_CONNECTORS_VER        = 0b00100_000_0000_0000_0000;

	/** Option for converting all corners to horizontal line equivalent. */
//	static int OPT_CONVERT_CORNERS_HOR           = 0b01000_000_0000_0000_0000;

	/** Option for converting all corners to vertical line equivalent. */
//	static int OPT_CONVERT_CORNERS_VER           = 0b10000_000_0000_0000_0000;


	/** Option for showing an empty horizontal top row. */
	static int OPT_SHOW_EMPTY_ROW_TOP            = 0b000001_00000_000_0000_0000_0000;

	/** Option for showing an empty horizontal middle row. */
	static int OPT_SHOW_EMPTY_ROW_MID            = 0b000010_00000_000_0000_0000_0000;

	/** Option for showing an empty horizontal bottom row. */
	static int OPT_SHOW_EMPTY_ROW_BOTTOM         = 0b000100_00000_000_0000_0000_0000;

	/** Option for showing an empty left border. */
	static int OPT_SHOW_EMPTY_BORDER_LEFT        = 0b001000_00000_000_0000_0000_0000;

	/** Option for showing an empty mid border. */
	static int OPT_SHOW_EMPTY_BORDER_MID         = 0b010000_00000_000_0000_0000_0000;

	/** Option for showing an empty right border. */
	static int OPT_SHOW_EMPTY_BORDER_RIGHT       = 0b100000_00000_000_0000_0000_0000;


	/**
	 * Simple helper testing the existing of an option in a given mode.
	 * @param option the option to test
	 * @param mode the mode to test against
	 * @return true if option set in mode, false otherwise
	 */
	static boolean testOption(int option, int mode){
		return ((mode & option) == option);
	}

	/**
	 * Simple helper to test a set of options in a given mode.
	 * The method tests if any of the given options is set in the mode
	 * @param mode the mode to test against
	 * @param options set of options to test for
	 * @return true if any option is set in the mode, false otherwise
	 */
	static boolean testOptionsOr(int mode, int ... options){
		if(options==null){
			return false;
		}
		for(int opt : options){
			if(((mode & opt) == opt) == true){
				return true;
			}
		}
		return false;
	}

	/**
	 * Tests if an option is needed, that is if a particular position in the frame requires a character without being requested (set by the mode).
	 * @param option the option to test for
	 * @param mode the mode to test against
	 * @return true if the option is needed, false otherwise
	 */
	static boolean optionNeeded(int option, int mode){
		switch(option){
			case HAS_TOP_CORNER_LEFT:
				if(testOptionsOr(mode, HAS_TOP_LINE, HAS_TOP_CONNECTOR, HAS_TOP_CORNER_RIGHT)){
					if(testOptionsOr(mode, HAS_CONTENT_LEFT, HAS_BOTTOM_CORNER_LEFT, HAS_MID_BORDER_LEFT)){
						return true;
					}
					if(testOptionsOr(mode, OPT_SHOW_EMPTY_BORDER_LEFT)){
						return true;
					}
				}
				if(testOption(OPT_SHOW_EMPTY_ROW_TOP, mode)){
					if(testOptionsOr(mode, OPT_SHOW_EMPTY_BORDER_LEFT)){
						return true;
					}
					if(testOptionsOr(mode, HAS_CONTENT_LEFT, HAS_BOTTOM_CORNER_LEFT, HAS_MID_BORDER_LEFT)){
						return true;
					}
				}
				break;
			case HAS_TOP_LINE:
				if(testOptionsOr(mode, HAS_TOP_CORNER_LEFT, HAS_TOP_CONNECTOR, HAS_TOP_CORNER_RIGHT)){
					return true;
				}
				if(testOption(OPT_SHOW_EMPTY_ROW_TOP, mode)){
					return true;
				}
				break;
			case HAS_TOP_CONNECTOR:
				if(testOptionsOr(mode, HAS_TOP_LINE, HAS_TOP_CORNER_RIGHT, HAS_TOP_CORNER_LEFT)){
					if(testOptionsOr(mode, HAS_CONTENT_MID, HAS_BOTTOM_CONNECTOR, HAS_MID_CONNECTOR)){
						return true;
					}
					if(testOptionsOr(mode, OPT_SHOW_EMPTY_BORDER_MID)){
						return true;
					}
				}
				if(testOption(OPT_SHOW_EMPTY_ROW_TOP, mode)){
					if(testOptionsOr(mode, OPT_SHOW_EMPTY_BORDER_MID)){
						return true;
					}
					if(testOptionsOr(mode, HAS_CONTENT_MID, HAS_BOTTOM_CONNECTOR, HAS_MID_CONNECTOR)){
						return true;
					}
				}
				break;
			case HAS_TOP_CORNER_RIGHT:
				if(testOptionsOr(mode, HAS_TOP_LINE, HAS_TOP_CONNECTOR, HAS_TOP_CORNER_LEFT)){
					if(testOptionsOr(mode, HAS_CONTENT_RIGHT, HAS_BOTTOM_CORNER_RIGHT, HAS_MID_BORDER_RIGHT)){
						return true;
					}
					if(testOptionsOr(mode, OPT_SHOW_EMPTY_BORDER_RIGHT)){
						return true;
					}
				}
				if(testOption(OPT_SHOW_EMPTY_ROW_TOP, mode)){
					if(testOptionsOr(mode, OPT_SHOW_EMPTY_BORDER_RIGHT)){
						return true;
					}
					if(testOptionsOr(mode, HAS_CONTENT_RIGHT, HAS_BOTTOM_CORNER_RIGHT, HAS_MID_BORDER_RIGHT)){
						return true;
					}
				}
				break;

			case HAS_BOTTOM_CORNER_LEFT:
				if(testOptionsOr(mode, HAS_BOTTOM_LINE, HAS_BOTTOM_CONNECTOR, HAS_BOTTOM_CORNER_RIGHT)){
					if(testOptionsOr(mode, HAS_TOP_CORNER_LEFT, HAS_CONTENT_LEFT, HAS_MID_BORDER_LEFT)){
						return true;
					}
					if(testOptionsOr(mode, OPT_SHOW_EMPTY_BORDER_LEFT)){
						return true;
					}
				}
				if(testOption(OPT_SHOW_EMPTY_ROW_BOTTOM, mode)){
					if(testOptionsOr(mode, OPT_SHOW_EMPTY_BORDER_LEFT)){
						return true;
					}
					if(testOptionsOr(mode, HAS_TOP_CORNER_LEFT, HAS_CONTENT_LEFT, HAS_MID_BORDER_LEFT)){
						return true;
					}
				}
				break;
			case HAS_BOTTOM_LINE:
				if(testOptionsOr(mode, HAS_BOTTOM_CORNER_LEFT, HAS_BOTTOM_CONNECTOR, HAS_BOTTOM_CORNER_RIGHT)){
					return true;
				}
				if(testOption(OPT_SHOW_EMPTY_ROW_BOTTOM, mode)){
					return true;
				}
				break;
			case HAS_BOTTOM_CONNECTOR:
				if(testOptionsOr(mode, HAS_BOTTOM_CORNER_LEFT, HAS_BOTTOM_LINE, HAS_BOTTOM_CORNER_RIGHT)){
					if(testOptionsOr(mode, HAS_TOP_CONNECTOR, HAS_CONTENT_MID, HAS_MID_CONNECTOR)){
						return true;
					}
					if(testOptionsOr(mode, OPT_SHOW_EMPTY_BORDER_MID)){
						return true;
					}
				}
				if(testOption(OPT_SHOW_EMPTY_ROW_BOTTOM, mode)){
					if(testOptionsOr(mode, OPT_SHOW_EMPTY_BORDER_MID)){
						return true;
					}
					if(testOptionsOr(mode, HAS_TOP_CONNECTOR, HAS_CONTENT_MID, HAS_MID_CONNECTOR)){
						return true;
					}
				}
				break;
			case HAS_BOTTOM_CORNER_RIGHT:
				if(testOptionsOr(mode, HAS_BOTTOM_CORNER_LEFT, HAS_BOTTOM_LINE, HAS_BOTTOM_CONNECTOR)){
					if(testOptionsOr(mode, HAS_TOP_CORNER_RIGHT, HAS_CONTENT_RIGHT, HAS_MID_BORDER_RIGHT)){
						return true;
					}
					if(testOptionsOr(mode, OPT_SHOW_EMPTY_BORDER_RIGHT)){
						return true;
					}
				}
				if(testOption(OPT_SHOW_EMPTY_ROW_BOTTOM, mode)){
					if(testOptionsOr(mode, OPT_SHOW_EMPTY_BORDER_RIGHT)){
						return true;
					}
					if(testOptionsOr(mode, HAS_TOP_CORNER_RIGHT, HAS_CONTENT_RIGHT, HAS_MID_BORDER_RIGHT)){
						return true;
					}
				}
				break;

			case HAS_MID_BORDER_LEFT:
				if(testOptionsOr(mode, HAS_MID_LINE, HAS_MID_CONNECTOR, HAS_MID_BORDER_RIGHT)){
					if(testOptionsOr(mode, HAS_TOP_CORNER_LEFT, HAS_BOTTOM_CORNER_LEFT, HAS_CONTENT_LEFT)){
						return true;
					}
					if(testOptionsOr(mode, OPT_SHOW_EMPTY_BORDER_LEFT)){
						return true;
					}
				}
				if(testOption(OPT_SHOW_EMPTY_ROW_MID, mode)){
					if(testOptionsOr(mode, OPT_SHOW_EMPTY_BORDER_LEFT)){
						return true;
					}
					if(testOptionsOr(mode, HAS_TOP_CORNER_LEFT, HAS_BOTTOM_CORNER_LEFT, HAS_CONTENT_LEFT)){
						return true;
					}
				}
				break;
			case HAS_MID_LINE:
				if(testOptionsOr(mode, HAS_MID_BORDER_LEFT, HAS_MID_CONNECTOR, HAS_MID_BORDER_RIGHT)){
					return true;
				}
				if(testOption(OPT_SHOW_EMPTY_ROW_MID, mode)){
					return true;
				}
				break;
			case HAS_MID_CONNECTOR:
				if(testOptionsOr(mode, HAS_MID_BORDER_LEFT, HAS_MID_LINE, HAS_MID_BORDER_RIGHT)){
					if(testOptionsOr(mode, HAS_TOP_CONNECTOR, HAS_BOTTOM_CONNECTOR, HAS_CONTENT_MID)){
						return true;
					}
					if(testOptionsOr(mode, OPT_SHOW_EMPTY_BORDER_MID)){
						return true;
					}
				}
				if(testOption(OPT_SHOW_EMPTY_ROW_MID, mode)){
					if(testOptionsOr(mode, OPT_SHOW_EMPTY_BORDER_MID)){
						return true;
					}
					if(testOptionsOr(mode, HAS_TOP_CONNECTOR, HAS_BOTTOM_CONNECTOR, HAS_CONTENT_MID)){
						return true;
					}
				}
				break;
			case HAS_MID_BORDER_RIGHT:
				if(testOptionsOr(mode, HAS_MID_BORDER_LEFT, HAS_MID_LINE, HAS_MID_CONNECTOR)){
					if(testOptionsOr(mode, HAS_TOP_CORNER_RIGHT, HAS_BOTTOM_CORNER_RIGHT, HAS_CONTENT_RIGHT)){
						return true;
					}
					if(testOptionsOr(mode, OPT_SHOW_EMPTY_BORDER_RIGHT)){
						return true;
					}
				}
				if(testOption(OPT_SHOW_EMPTY_ROW_MID, mode)){
					if(testOptionsOr(mode, OPT_SHOW_EMPTY_BORDER_RIGHT)){
						return true;
					}
					if(testOptionsOr(mode, HAS_TOP_CORNER_RIGHT, HAS_BOTTOM_CORNER_RIGHT, HAS_CONTENT_RIGHT)){
						return true;
					}
				}
				break;

			case HAS_CONTENT_LEFT:
				if(testOptionsOr(mode, HAS_TOP_CORNER_LEFT, HAS_BOTTOM_CORNER_LEFT, HAS_MID_BORDER_LEFT)){
					return true;
				}
				if(testOptionsOr(mode, OPT_SHOW_EMPTY_BORDER_LEFT)){
					return true;
				}
				break;
			case HAS_CONTENT_MID:
				if(testOptionsOr(mode, HAS_TOP_CONNECTOR, HAS_BOTTOM_CONNECTOR, HAS_MID_CONNECTOR)){
					return true;
				}
				if(testOptionsOr(mode, OPT_SHOW_EMPTY_BORDER_MID)){
					return true;
				}
				break;
			case HAS_CONTENT_RIGHT:
				if(testOptionsOr(mode, HAS_TOP_CORNER_RIGHT, HAS_BOTTOM_CORNER_RIGHT, HAS_MID_BORDER_RIGHT)){
					return true;
				}
				if(testOptionsOr(mode, OPT_SHOW_EMPTY_BORDER_RIGHT)){
					return true;
				}
				break;

			default:
				throw new IllegalArgumentException("unkown option: " + option + " for mode: " + mode);
		}
		return false;
	}

}
