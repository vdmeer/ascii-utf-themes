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
 * Options and utilities for a {@link TA_Frame}.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 160319 (19-Mar-16) for Java 1.8
 * @since      v0.0.1
 */
public interface TA_FrameOptions {

	/** Option for using the top line of the frame. */
	static int OPT_LINE_TOP           = 0b00000001;

	/** Option for using the bottom line of the frame. */
	static int OPT_LINE_BOTTOM        = 0b00000010;


	/** Option for using the left border of the frame. */
	static int OPT_BORDER_LEFT        = 0b00000100;

	/** Option for using the right border of the frame. */
	static int OPT_BORDER_RIGHT       = 0b00001000;


	/** Option for using the top left corner of the frame. */
	static int OPT_CORNER_TOPLEFT     = 0b00010000;

	/** Option for using the top right corner of the frame. */
	static int OPT_CORNER_TOPRIGHT    = 0b00100000;

	/** Option for using the bottom left corner of the frame. */
	static int OPT_CORNER_BOTTOMLEFT  = 0b01000000;

	/** Option for using the bottom right corner of the frame. */
	static int OPT_CORNER_BOTTOMRIGHT = 0b10000000;

	/** Theme for using the full frame. */
	static int THEME_FULL_FRAME = 
			OPT_LINE_TOP | OPT_LINE_BOTTOM | OPT_BORDER_LEFT | OPT_BORDER_RIGHT |
			OPT_CORNER_TOPLEFT | OPT_CORNER_TOPRIGHT | OPT_CORNER_BOTTOMLEFT | OPT_CORNER_BOTTOMRIGHT;

	/** Theme for using only top and bottom lines. */
	static int THEME_LINE_TOPBOTTOM = 
			OPT_LINE_TOP | OPT_LINE_BOTTOM;

	/** Theme for using only left side. */
	static int THEME_LEFT_ONLY = 
			OPT_CORNER_TOPLEFT | OPT_BORDER_LEFT | OPT_CORNER_BOTTOMLEFT;

	/** Theme for using only left and right borders. */
	static int THEME_BORDERS_ONLY =
			OPT_BORDER_LEFT | OPT_BORDER_RIGHT;

	/** Theme for using only top/bottom lines and left/right borders, that is no corners. */
	static int THEME_LINES_ONLY = 
			OPT_LINE_TOP | OPT_LINE_BOTTOM | OPT_BORDER_LEFT | OPT_BORDER_RIGHT;

	/** Theme for using only corners. */
	static int THEME_CORNERS_ONLY = 
			OPT_CORNER_TOPLEFT | OPT_CORNER_TOPRIGHT | OPT_CORNER_BOTTOMLEFT | OPT_CORNER_BOTTOMRIGHT;

	/**
	 * Test for some characters required in the top line of a frame.
	 * @param mode the mode to test against
	 * @return true if some characters need to be drawn for the top line, false otherwise
	 */
	static boolean someTopCharacters(int mode){
		return ((mode & OPT_CORNER_TOPLEFT) == OPT_CORNER_TOPLEFT || (mode & OPT_LINE_TOP) == OPT_LINE_TOP || (mode & OPT_CORNER_TOPRIGHT) == OPT_CORNER_TOPRIGHT);
	}

	/**
	 * Test for some characters required in the bottom line of a frame.
	 * @param mode the mode to test against
	 * @return true if some characters need to be drawn for the bottom line, false otherwise
	 */
	static boolean someBottomCharacters(int mode){
		return ((mode & OPT_CORNER_BOTTOMLEFT) == OPT_CORNER_BOTTOMLEFT || (mode & OPT_LINE_BOTTOM) == OPT_LINE_BOTTOM || (mode & OPT_CORNER_BOTTOMRIGHT) == OPT_CORNER_BOTTOMRIGHT);
	}

	/**
	 * Tests if the top left corner is requested.
	 * @param mode the mode to test against
	 * @return true if top left corner is requested, false otherwise
	 */
	static boolean cornerTopLeft(int mode){
		return ((mode & OPT_CORNER_TOPLEFT) == OPT_CORNER_TOPLEFT);
	}

	/**
	 * Tests if the bottom left corner is requested.
	 * @param mode the mode to test against
	 * @return true if bottom left corner is requested, false otherwise
	 */
	static boolean cornerBottomLeft(int mode){
		return ((mode & OPT_CORNER_BOTTOMLEFT) == OPT_CORNER_BOTTOMLEFT);
	}

	/**
	 * Tests if the top left corner is needed.
	 * @param mode the mode to test against
	 * @return true if top left corner is needed, false otherwise
	 */
	static boolean cornerTopLeftNeeded(int mode){
		if((mode & OPT_LINE_TOP) == OPT_LINE_TOP || (mode & OPT_CORNER_TOPRIGHT) == OPT_CORNER_TOPRIGHT){
			if((mode & OPT_BORDER_LEFT) == OPT_BORDER_LEFT || (mode & OPT_CORNER_BOTTOMLEFT) == OPT_CORNER_BOTTOMLEFT){
				return true;
			}
		}
		return false;
	}

	/**
	 * Tests if the bottom left corner is needed.
	 * @param mode the mode to test against
	 * @return true if bottom left corner is needed, false otherwise
	 */
	static boolean cornerBottomLeftNeeded(int mode){
		if((mode & OPT_LINE_BOTTOM) == OPT_LINE_BOTTOM || (mode & OPT_CORNER_BOTTOMRIGHT) == OPT_CORNER_BOTTOMRIGHT){
			if((mode & OPT_BORDER_LEFT) == OPT_BORDER_LEFT || (mode & OPT_CORNER_TOPLEFT) == OPT_CORNER_TOPLEFT){
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
		return ((mode & OPT_LINE_TOP) == OPT_LINE_TOP);
	}

	/**
	 * Tests if a top line is needed because one or both corners are required.
	 * @param mode the mode to test against
	 * @return true if a top line is needed, false otherwise
	 */
	static boolean lineTopNeeded(int mode){
		return ((mode & OPT_CORNER_TOPLEFT) == OPT_CORNER_TOPLEFT || (mode & OPT_CORNER_TOPRIGHT) == OPT_CORNER_TOPRIGHT);
	}

	/**
	 * Tests if the bottom line is requested.
	 * @param mode the mode to test against
	 * @return true if bottom line is requested, false otherwise
	 */
	static boolean lineBottom(int mode){
		return ((mode & OPT_LINE_BOTTOM) == OPT_LINE_BOTTOM);
	}

	/**
	 * Tests if a bottom line is needed because one or both corners are required.
	 * @param mode the mode to test against
	 * @return true if a bottom line is needed, false otherwise
	 */
	static boolean lineBottomNeeded(int mode){
		return ((mode & OPT_CORNER_BOTTOMLEFT) == OPT_CORNER_BOTTOMLEFT || (mode & OPT_CORNER_BOTTOMRIGHT) == OPT_CORNER_BOTTOMRIGHT);
	}

	/**
	 * Tests if the top right corner is requested.
	 * @param mode the mode to test against
	 * @return true if top right corner is requested, false otherwise
	 */
	static boolean cornerTopRight(int mode){
		return ((mode & OPT_CORNER_TOPRIGHT) == OPT_CORNER_TOPRIGHT);
	}

	/**
	 * Tests if the bottom right corner is requested.
	 * @param mode the mode to test against
	 * @return true if bottom right corner is requested, false otherwise
	 */
	static boolean cornerBottomRight(int mode){
		return ((mode & OPT_CORNER_BOTTOMRIGHT) == OPT_CORNER_BOTTOMRIGHT);
	}

	/**
	 * Tests if the top right corner is needed.
	 * @param mode the mode to test against
	 * @return true if top right corner is needed, false otherwise
	 */
	static boolean cornerTopRightNeeded(int mode){
		if((mode & OPT_CORNER_TOPLEFT) == OPT_CORNER_TOPLEFT || (mode & OPT_LINE_TOP) == OPT_LINE_TOP){
			if((mode & OPT_BORDER_RIGHT) == OPT_BORDER_RIGHT || (mode & OPT_CORNER_BOTTOMRIGHT) == OPT_CORNER_BOTTOMRIGHT){
				return true;
			}
		}
		return false;
	}

	/**
	 * Tests if the bottom right corner is needed.
	 * @param mode the mode to test against
	 * @return true if bottom right corner is needed, false otherwise
	 */
	static boolean cornerBottomRightNeeded(int mode){
		if((mode & OPT_CORNER_BOTTOMLEFT) == OPT_CORNER_BOTTOMLEFT || (mode & OPT_LINE_BOTTOM) == OPT_LINE_BOTTOM){
			if((mode & OPT_BORDER_RIGHT) == OPT_BORDER_RIGHT || (mode & OPT_CORNER_TOPRIGHT) == OPT_CORNER_TOPRIGHT){
				return true;
			}
		}
		return false;
	}

	/**
	 * Tests if the left border is requested.
	 * @param mode the mode to test against
	 * @return true if left border is requested, false otherwise
	 */
	static boolean borderLeft(int mode){
		return ((mode & OPT_BORDER_LEFT) == OPT_BORDER_LEFT);
	}

	/**
	 * Tests if the right border is requested.
	 * @param mode the mode to test against
	 * @return true if right border is requested, false otherwise
	 */
	static boolean borderRight(int mode){
		return ((mode & OPT_BORDER_RIGHT) == OPT_BORDER_RIGHT);
	}

	/**
	 * Tests if the left border is needed.
	 * @param mode the mode to test against
	 * @return true if left border is needed, false otherwise
	 */
	static boolean borderLeftNeeded(int mode){
		return ((mode & OPT_CORNER_TOPLEFT) == OPT_CORNER_TOPLEFT || (mode & OPT_CORNER_BOTTOMLEFT) == OPT_CORNER_BOTTOMLEFT);
	}

	/**
	 * Tests if the right border is needed.
	 * @param mode the mode to test against
	 * @return true if right border is needed, false otherwise
	 */
	static boolean borderRightNeeded(int mode){
		return ((mode & OPT_CORNER_TOPRIGHT) == OPT_CORNER_TOPRIGHT || (mode & OPT_CORNER_BOTTOMRIGHT) == OPT_CORNER_BOTTOMRIGHT);
	}
}
