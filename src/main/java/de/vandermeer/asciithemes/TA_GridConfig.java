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
 * Configuration and utilities for a {@link TA_Grid}.
 * 
 * The interface provides four different items:
 * - basic types for grid characters that are either blank (none) or have a characteristic of: up, down, left, and/or right starting with `TYPE_`,
 * - rule types that define a rule to be either none (no rule), normal (standard character), or strong (strong or emphasized character) starting with `RULETYPE`,
 * - type/position combinations that define all possible grid border characters (starting with `TYPEPOS`)
 * - static methods that help to determine configurations
 * 
 * Only the rule types should be used outside the grid to tell the grid renderer (`addGrid` method) which rule type to use.
 * The `create` methods of the grid interface (should) provide all means to easily create a grid with all different character options.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 160319 (19-Mar-16) for Java 1.8
 * @since      v0.0.1
 */
public interface TA_GridConfig {

	/** Type for an empty border. */
	static int TYPE_NONE	= 0b0000;

	/** Type for a border with top connector. */
	static int TYPE_UP		= 0b0001;

	/** Type for a border with bottom connector. */
	static int TYPE_DOWN	= 0b0010;

	/** Type for a border with left connector. */
	static int TYPE_LEFT	= 0b0100;

	/** Type for a border with right connector. */
	static int TYPE_RIGHT	= 0b1000;


	/** A character in a top rule. */
	static int RULESET_TOP_RULE		= 0b0000_0001_0000;

	/** A character in a mid rule. */
	static int RULESET_MID_RULE		= 0b0000_0010_0000;

	/** A character in a bottom rule. */
	static int RULESET_BOTTOM_RULE	= 0b0000_0100_0000;

	/** A character in a content rule. */
	static int RULESET_CONTENT_RULE	= 0b0000_1000_0000;

	/** Row type for a normal characters, that is a normal border. */
	static int RULESET_NORMAL		= 0b0001_0000_0000;

	/** Row type for a strong characters, that is a strong border. */
	static int RULESET_STRONG		= 0b0010_0000_0000;

	/** Row type for a heavy characters, that is a heavy border. */
	static int RULESET_HEAVY		= 0b0100_0000_0000;

	/** Row type for a light characters, that is a light border. */
	static int RULESET_LIGHT		= 0b1000_0000_0000;


	/** Border type and position for a simple horizontal border item, for instance `═` . */
	static int TYPEPOS_HORIZONTAL = TYPE_LEFT | TYPE_RIGHT;

	/** Border type and position for a simple horizontal border item, for instance `║` . */
	static int TYPEPOS_VERTICAL   = TYPE_UP | TYPE_DOWN;


	/** Border type and position for a top-left border item, for instance `╔` . */
	static int TYPEPOS_TOP_LEFT  = TYPE_RIGHT | TYPE_DOWN;

	/** Border type and position for a top-right border item, for instance `╗` . */
	static int TYPEPOS_TOP_RIGHT = TYPE_LEFT | TYPE_DOWN;


	/** Border type and position for a bottom-left border item, for instance `╚` . */
	static int TYPEPOS_BOTTOM_LEFT  = TYPE_RIGHT | TYPE_UP;

	/** Border type and position for a bottom-right border item, for instance `╝` . */
	static int TYPEPOS_BOTTOM_RIGHT = TYPE_LEFT | TYPE_UP;


	/** Border type and position for a middle-left border item, for instance `╠` . */
	static int TYPEPOS_MID_LEFT  = TYPE_RIGHT | TYPE_UP | TYPE_DOWN;

	/** Border type and position for a middle-right border item, for instance `╣` . */
	static int TYPEPOS_MID_RIGHT = TYPE_LEFT | TYPE_UP | TYPE_DOWN;

	/** Border type and position for a middle-up-down border item, for instance `╬` . */
	static int TYPEPOS_MID_BOTH  = TYPE_LEFT | TYPE_RIGHT | TYPE_UP | TYPE_DOWN;


	/** Border type and position for a middle-down border item, for instance `╦` . */
	static int TYPEPOS_MID_DOWN = TYPE_LEFT | TYPE_RIGHT | TYPE_DOWN;

	/** Border type and position for a middle-up border item, for instance `╩` . */
	static int TYPEPOS_MID_UP   = TYPE_LEFT | TYPE_RIGHT | TYPE_UP;


	/**
	 * Converts the typos is not set in the mode.
	 * @param typepos the type position to test
	 * @param h horizontal position of typos
	 * @param hsize max horizontal index
	 * @param mode the mode to test against
	 * @return original typepos if in the mode, corrected otherwise
	 */
	static int convertTopline(int typepos, int h, int hsize, int mode){
		//top line (rule or content)
		if(h==0){
			//rule
			if(!TA_GridOptions.cornerTopLeft(mode) && (typepos & TYPEPOS_TOP_LEFT) == TYPEPOS_TOP_LEFT){ 
				return typepos & ~TYPEPOS_TOP_LEFT;
			}
			//content
			if(!TA_GridOptions.contentLeftBorder(mode) && (typepos & TYPEPOS_VERTICAL) == TYPEPOS_VERTICAL){ 
				return typepos & ~TYPEPOS_VERTICAL;
			}
		}
		else if(h==hsize){
			//rule
			if(!TA_GridOptions.cornerTopRight(mode) && (typepos & TYPEPOS_TOP_RIGHT) == TYPEPOS_TOP_RIGHT){ 
				return typepos & ~TYPEPOS_TOP_RIGHT;
			}
			//content
			if(!TA_GridOptions.contentLeftBorder(mode) && (typepos & TYPEPOS_VERTICAL) == TYPEPOS_VERTICAL){ 
				return typepos & ~TYPEPOS_VERTICAL;
			}
		}
		else{
			//rule
			if(!TA_GridOptions.lineTop(mode) && (typepos & TYPEPOS_HORIZONTAL) == TYPEPOS_HORIZONTAL && (typepos & TYPEPOS_MID_DOWN) != TYPEPOS_MID_DOWN){ 
				return typepos & ~TYPEPOS_HORIZONTAL;
			}
			if(!TA_GridOptions.connectorTop(mode) && (typepos & TYPEPOS_MID_DOWN) == TYPEPOS_MID_DOWN){
				return typepos & ~TYPEPOS_MID_DOWN;
			}
			//content
			if(!TA_GridOptions.contentMidBorder(mode) && (typepos & TYPEPOS_VERTICAL) == TYPEPOS_VERTICAL){ 
				return typepos & ~TYPEPOS_VERTICAL;
			}
		}

		return typepos;
	}

	/**
	 * Converts the typos is not set in the mode.
	 * @param typepos the type position to test
	 * @param h horizontal position of typos
	 * @param hsize max horizontal index
	 * @param mode the mode to test against
	 * @return original typepos if in the mode, corrected otherwise
	 */
	static int convertBottomline(int typepos, int h, int hsize, int mode){
		//bottom line (rule or content)
		if(h==0){
			//rule
			if(!TA_GridOptions.cornerBottomLeft(mode) && (typepos & TYPEPOS_BOTTOM_LEFT) == TYPEPOS_BOTTOM_LEFT){ 
				return typepos & ~TYPEPOS_BOTTOM_LEFT;
			}
			//content
			if(!TA_GridOptions.contentLeftBorder(mode) && (typepos & TYPEPOS_VERTICAL) == TYPEPOS_VERTICAL){ 
				return typepos & ~TYPEPOS_VERTICAL;
			}
		}
		else if(h==hsize){
			//rule
			if(!TA_GridOptions.cornerBottomRight(mode) && (typepos & TYPEPOS_BOTTOM_RIGHT) == TYPEPOS_BOTTOM_RIGHT){ 
				return typepos & ~TYPEPOS_BOTTOM_RIGHT;
			}
			//content
			if(!TA_GridOptions.contentLeftBorder(mode) && (typepos & TYPEPOS_VERTICAL) == TYPEPOS_VERTICAL){ 
				return typepos & ~TYPEPOS_VERTICAL;
			}
		}
		else{
			//rule
			if(!TA_GridOptions.lineBottom(mode) && (typepos & TYPEPOS_HORIZONTAL) == TYPEPOS_HORIZONTAL && (typepos & TYPEPOS_MID_UP) != TYPEPOS_MID_UP){ 
				return typepos & ~TYPEPOS_HORIZONTAL;
			}
			if(!TA_GridOptions.connectorBottom(mode) && (typepos & TYPEPOS_MID_UP) == TYPEPOS_MID_UP){
				return typepos & ~TYPEPOS_MID_UP;
			}
			//content
			if(!TA_GridOptions.contentMidBorder(mode) && (typepos & TYPEPOS_VERTICAL) == TYPEPOS_VERTICAL && (typepos & TYPEPOS_MID_UP) != TYPEPOS_MID_UP && (typepos & TYPEPOS_MID_DOWN) != TYPEPOS_MID_DOWN){ 
				return typepos & ~TYPEPOS_VERTICAL;
			}
		}

		return typepos;
	}

	/**
	 * Converts the typos is not set in the mode.
	 * @param typepos the type position to test
	 * @param v vertical position of typos
	 * @param h horizontal position of typos
	 * @param vsize max vertical index
	 * @param hsize max horizontal index
	 * @param mode the mode to test against
	 * @return original typepos if in the mode, corrected otherwise
	 */
	static int convertMidline(int typepos, int v, int h, int vsize, int hsize, int mode){
		if(v==0 || v==(vsize)){
			throw new IllegalArgumentException("converts mid lines ut got a top/bottom line");
		}

		//mid
		if(h==0){
			//mid left side
			//rule
			if(!TA_GridOptions.borderMidLeft(mode) && (typepos & TYPEPOS_MID_LEFT) == TYPEPOS_MID_LEFT){ 
				return typepos & ~TYPEPOS_MID_LEFT;
			}
			//content
			if(!TA_GridOptions.contentLeftBorder(mode) && (typepos & TYPEPOS_VERTICAL) == TYPEPOS_VERTICAL && (typepos & TYPEPOS_MID_LEFT) != TYPEPOS_MID_LEFT){ 
				return typepos & ~TYPEPOS_VERTICAL;
			}
		}
		else if(h==(hsize)){
			// mid right side
				//rule
			if(!TA_GridOptions.borderMidRight(mode) && (typepos & TYPEPOS_MID_RIGHT) == TYPEPOS_MID_RIGHT){ 
				return typepos & ~TYPEPOS_MID_RIGHT;
			}
			//content
			if(!TA_GridOptions.contentLeftBorder(mode) && (typepos & TYPEPOS_VERTICAL) == TYPEPOS_VERTICAL && (typepos & TYPEPOS_MID_RIGHT) != TYPEPOS_MID_RIGHT){ 
				return typepos & ~TYPEPOS_VERTICAL;
			}
		}
		else{
			//mid middle
			//rule
			if(!TA_GridOptions.lineMid(mode) && (typepos & TYPEPOS_HORIZONTAL) == TYPEPOS_HORIZONTAL && (typepos & TYPEPOS_MID_UP) != TYPEPOS_MID_UP && (typepos & TYPEPOS_MID_DOWN) != TYPEPOS_MID_DOWN){ 
				return typepos & ~TYPEPOS_HORIZONTAL;
			}
			if(!TA_GridOptions.connectorMid(mode) && (typepos & TYPEPOS_MID_BOTH) == TYPEPOS_MID_BOTH){ 
				return typepos & ~TYPEPOS_MID_BOTH;
			}
			if(!TA_GridOptions.connectorMid(mode) && (typepos & TYPEPOS_MID_UP) == TYPEPOS_MID_UP){ 
				return typepos & ~TYPEPOS_MID_UP;
			}
			if(!TA_GridOptions.connectorMid(mode) && (typepos & TYPEPOS_MID_DOWN) == TYPEPOS_MID_DOWN){ 
				return typepos & ~TYPEPOS_MID_DOWN;
			}
			//content
			if(!TA_GridOptions.contentMidBorder(mode) && (typepos & TYPEPOS_VERTICAL) == TYPEPOS_VERTICAL && (typepos & TYPEPOS_MID_UP) != TYPEPOS_MID_UP && (typepos & TYPEPOS_MID_DOWN) != TYPEPOS_MID_DOWN){ 
				return typepos & ~TYPEPOS_VERTICAL;
			}
		}

		return typepos;
	}

	/**
	 * Removes left/right connections if the given mode requires and the typepos position is a border.
	 * @param typepos the type position to test
	 * @param v vertical position of typos
	 * @param h horizontal position of typos
	 * @param vsize max vertical index
	 * @param hsize max horizontal index
	 * @param mode the mode to test against
	 * @return original typepos if no border conversion was needed, converted typepos otherwise
	 */
	static int convertBorders(int typepos, int v, int h, int vsize, int hsize, int mode){
		if(v>0 && v<vsize){
			if(h==0 || h==hsize){
				if(TA_GridOptions.convertBorders(mode)){
					typepos = typepos & ~TA_GridConfig.TYPE_LEFT;
					typepos = typepos & ~TA_GridConfig.TYPE_RIGHT;
					return typepos;
				}
			}
		}
		return typepos;
	}

	/**
	 * Removes top/down connections if the given mode requires and the typepos position is a connector.
	 * The method will process top/bottom/mid separately
	 * @param typepos the type position to test
	 * @param v vertical position of typos
	 * @param h horizontal position of typos
	 * @param vsize max vertical index
	 * @param hsize max horizontal index
	 * @param mode the mode to test against
	 * @return original typepos if no connector conversion was needed, converted typepos otherwise
	 */
	static int convertConnectors(int typepos, int v, int h, int vsize, int hsize, int mode){
		if(v==0){
			//top
			if(h>0 && h<hsize){
				//in the middle
				if(TA_GridOptions.convertConnectorsTop(mode)){
					typepos = typepos & ~TA_GridConfig.TYPE_DOWN;
					return typepos;
				}
			}
		}
		if(v==vsize){
			//bottom
			if(h>0 && h<hsize){
				//in the middle
				if(TA_GridOptions.convertConnectorsBottom(mode)){
					typepos = typepos & ~TA_GridConfig.TYPE_UP;
					return typepos;
				}
			}
		}
		else{
			//mid
			if(h>0 && h<hsize){
				if(TA_GridOptions.convertConnectorsMid(mode)){
					typepos = typepos & ~TA_GridConfig.TYPE_UP;
					typepos = typepos & ~TA_GridConfig.TYPE_DOWN;
					return typepos;
				}
			}
		}
		return typepos;
	}
}
