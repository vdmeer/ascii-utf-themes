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
import static de.vandermeer.asciithemes.TA_GridOptions.OPT_CONVERT_CORNERS_VER;
import static de.vandermeer.asciithemes.TA_GridOptions.optionNeeded;
import static de.vandermeer.asciithemes.TA_GridOptions.testOption;

import java.util.ArrayList;

import org.apache.commons.lang3.text.StrBuilder;
import org.apache.commons.lang3.tuple.Pair;

/**
 * Some helper methods for {@link TA_Grid}.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170404 (04-Apr-17) for Java 1.8
 * @since      v0.0.1
 */
public interface TA_GridHelpers {

	/** Options for adding a top rule. */
	static final int[][] TOP_RULE = new int[][]{
			{HAS_TOP_CORNER_LEFT, TA_GridConfig.PT_TOP_LEFT},
			{HAS_TOP_LINE, TA_GridConfig.PT_HORIZONTAL},
			{HAS_TOP_CONNECTOR, TA_GridConfig.PT_MID_DOWN},
			{HAS_TOP_CORNER_RIGHT, TA_GridConfig.PT_TOP_RIGHT},
	};

	/** Options for adding a mid rule. */
	static final int[][] MID_RULE = new int[][]{
			{HAS_MID_BORDER_LEFT, TA_GridConfig.PT_MID_LEFT},
			{HAS_MID_LINE, TA_GridConfig.PT_HORIZONTAL},
			{HAS_MID_CONNECTOR, TA_GridConfig.PT_MID_BOTH},
			{HAS_MID_BORDER_RIGHT, TA_GridConfig.PT_MID_RIGHT},
	};

	/** Options for adding a bottom rule. */
	static final int[][] BOTTOM_RULE = new int[][]{
			{HAS_BOTTOM_CORNER_LEFT, TA_GridConfig.PT_BOTTOM_LEFT},
			{HAS_BOTTOM_LINE, TA_GridConfig.PT_HORIZONTAL},
			{HAS_BOTTOM_CONNECTOR, TA_GridConfig.PT_MID_UP},
			{HAS_BOTTOM_CORNER_RIGHT, TA_GridConfig.PT_BOTTOM_RIGHT},
	};

	/**
	 * Calculates a content row and adds it to the frame (if not empty).
	 * @param ar the content
	 * @param mode the grid mode (from addGrid)
	 * @param rowtype the row type (determined by addGrid)
	 * @param frame internal frame to add the rendered row to
	 */
	static void addContentRow(String[][] ar, int mode, int rowtype, ArrayList<ArrayList<Object>> frame){
		for(int k=0; k<ar.length; k++){
			ArrayList<Object> al = new ArrayList<>();
			if(testOption(HAS_CONTENT_LEFT, mode)){
				al.add(TA_GridConfig.PT_VERTICAL | rowtype);
			}
			else if(optionNeeded(HAS_CONTENT_LEFT, mode)){
				al.add(TA_GridConfig.TYPE_NONE | rowtype);
			}

			for(int l=0; l<ar[k].length; l++){
				if(ar[k][l]!=null){
					for(char c : ar[k][l].toCharArray()){
						al.add(c);
					}
					if(l<(ar[k].length-1)){
						if(testOption(HAS_CONTENT_MID, mode)){
							al.add(TA_GridConfig.PT_VERTICAL | rowtype);
						}
						else if(optionNeeded(HAS_CONTENT_MID, mode)){
							al.add(TA_GridConfig.TYPE_NONE | rowtype);
						}
					}
				}
			}
			if(testOption(HAS_CONTENT_RIGHT, mode)){
				al.add(TA_GridConfig.PT_VERTICAL | rowtype);
			}
			else if(optionNeeded(HAS_CONTENT_RIGHT, mode)){
				al.add(TA_GridConfig.TYPE_NONE | rowtype);
			}
			if(al.size()>0){
				frame.add(al);
			}
//System.err.println(al + " ==> " + al.size());
		}
	}

	/**
	 * Calculates a rule and adds it to the frame (if not empty).
	 * @param type rule type and options, use one of {@link #TOP_RULE}, {@link #MID_RULE}, or {@link #BOTTOM_RULE}
	 * @param mode the grid mode (from addGrid)
	 * @param rowtype the row type (determined by addGrid)
	 * @param columns the columns of the text (determined by addGrid)
	 * @param frame internal frame to add the rendered rule to
	 */
	static void addRule(int[][] type, int mode, int rowtype, ArrayList<Integer> columns, ArrayList<ArrayList<Object>> frame){
		ArrayList<Object> al = new ArrayList<>();
		if(testOption(type[0][0], mode)){
			al.add(type[0][1] | rowtype);
		}
		else if(optionNeeded(type[0][0], mode)){
			al.add(TA_GridConfig.TYPE_NONE | rowtype);
		}
		for(int k=0; k<columns.size(); k++){
			for(int l=0; l<columns.get(k); l++){
				if(testOption(type[1][0], mode)){
					al.add(type[1][1] | rowtype);
				}
				else if(optionNeeded(type[1][0], mode)){
					al.add(TA_GridConfig.TYPE_NONE | rowtype);
				}
			}
			if(k<(columns.size()-1)){
				if(testOption(type[2][0], mode)){
					al.add(type[2][1] | rowtype);
				}
				else if(optionNeeded(type[2][0], mode)){
					al.add(TA_GridConfig.TYPE_NONE | rowtype);
				}
			}
		}
		if(testOption(type[3][0], mode)){
			al.add(type[3][1] | rowtype);
		}
		else if(optionNeeded(type[3][0], mode)){
			al.add(TA_GridConfig.TYPE_NONE | rowtype);
		}

		if(al.size()>0){
			frame.add(al);
		}
//System.err.println(al + " ==> " + al.size());
	}

	/**
	 * Adjusts borders, testing if a particular border character is connected uo, down, left, and right in the grid.
	 * @param postype the border character as position/type
	 * @param v position of the character vertically in the frame
	 * @param h position of the character horizontally in the frame
	 * @param mode mode the grid mode (from addGrid)
	 * @param frame the internal frame to find connected characters
	 * @return the adjusted character to be used finally to find the actual border character
	 */
	static int adjustBorder(int postype, int v, int h, int mode, ArrayList<ArrayList<Object>> frame){
		int vsize = frame.size()-1;
		int hsize = frame.get(v).size()-1;

		//so remove any line if we find a character and add one if we find a corresponding border (but only if there was some type set already)
		if(v>0){
			if(frame.get(v-1).get(h) instanceof Character){
				postype = postype & ~TA_GridConfig.TYPE_UP;
			}
			else if(frame.get(v-1).get(h) instanceof Integer){
				if(hasType(postype)){
					postype = postype | TA_GridConfig.TYPE_UP;
				}
			}
		}
		if(v<(vsize)){
			if(frame.get(v+1).get(h) instanceof Character){
				postype = postype & ~TA_GridConfig.TYPE_DOWN;
			}
			else if(frame.get(v+1).get(h) instanceof Integer){
				if(hasType(postype)){
					postype = postype | TA_GridConfig.TYPE_DOWN;
				}
			}
		}
		if(h>0){
			if(frame.get(v).get(h-1) instanceof Character){
				postype = postype & ~TA_GridConfig.TYPE_LEFT;
			}
			else if(frame.get(v).get(h-1) instanceof Integer){
				if(hasType(postype)){
					postype = postype | TA_GridConfig.TYPE_LEFT;
				}
			}
		}
		if(h<(hsize)){
			if(frame.get(v).get(h+1) instanceof Character){
				postype = postype & ~TA_GridConfig.TYPE_RIGHT;
			}
			else if(frame.get(v).get(h+1) instanceof Integer){
				if(hasType(postype)){
					postype = postype | TA_GridConfig.TYPE_RIGHT;
				}
			}
		}
		return postype;
	}

	/**
	 * Removes left/right connections if the given mode requires it and the position/type is a border.
	 * @param postype the type position to test
	 * @param v vertical position of position/type
	 * @param h horizontal position of position/type
	 * @param vsize max vertical index
	 * @param hsize max horizontal index
	 * @param mode the mode to test against
	 * @return original position/type if no border conversion was needed, converted position/type otherwise
	 */
	static int convertBorders(int postype, int v, int h, int vsize, int hsize, int mode){
		if(v>0 && v<vsize){
			if(h==0 || h==hsize){
				if(testOption(OPT_CONVERT_BORDERS, mode)){
					postype = postype & ~TA_GridConfig.TYPE_LEFT;
					postype = postype & ~TA_GridConfig.TYPE_RIGHT;
					return postype;
				}
			}
		}
		return postype;
	}

	/**
	 * Removes top/down connections if the given mode requires and the position/type is a connector.
	 * The method will process top/bottom/mid separately
	 * @param postype the type position to test
	 * @param v vertical position of position/type
	 * @param h horizontal position of position/type
	 * @param vsize max vertical index
	 * @param hsize max horizontal index
	 * @param mode the mode to test against
	 * @return original position/type if no connector conversion was needed, converted position/type otherwise
	 */
	static int convertConnectors(int postype, int v, int h, int vsize, int hsize, int mode){
		if(v==0){
			//top
			if(h>0 && h<hsize){
				//in the middle
				if(testOption(OPT_CONVERT_CONNECTORS_HOR, mode)){
					postype = postype & ~TA_GridConfig.TYPE_DOWN;
					return postype;
				}
			}
		}
		if(v==vsize){
			//bottom
			if(h>0 && h<hsize){
				//in the middle
				if(testOption(OPT_CONVERT_CONNECTORS_HOR, mode)){
					postype = postype & ~TA_GridConfig.TYPE_UP;
					return postype;
				}
			}
		}
		else{
			//mid
			if(h>0 && h<hsize){
				if(testOption(OPT_CONVERT_CONNECTORS_HOR, mode)){
					postype = postype & ~TA_GridConfig.TYPE_UP;
					postype = postype & ~TA_GridConfig.TYPE_DOWN;
					return postype;
				}
				if(testOption(OPT_CONVERT_CONNECTORS_VER, mode)){
					postype = postype & ~TA_GridConfig.TYPE_LEFT;
					postype = postype & ~TA_GridConfig.TYPE_RIGHT;
					return postype;
				}
			}
		}
		return postype;
	}

	/**
	 * Removes top/down connections if the given mode requires and the position/type is a corner.
	 * The method will process top/bottom/mid separately
	 * @param postype the type position to test
	 * @param v vertical position of position/type
	 * @param h horizontal position of position/type
	 * @param vsize max vertical index
	 * @param hsize max horizontal index
	 * @param mode the mode to test against
	 * @return original position/type if no corner conversion was needed, converted position/type otherwise
	 */
	static int convertCorners(int postype, int v, int h, int vsize, int hsize, int mode){
		if(v==0){
			//top
			if(testOption(TA_GridConfig.CHAR_TOP_RULE, postype)){
				if(h==0 || h==hsize){
					//in the middle
					if(testOption(OPT_CONVERT_CORNERS_HOR, mode)){
						postype = postype & ~TA_GridConfig.TYPE_DOWN;
						postype = postype | TA_GridConfig.TYPE_RIGHT;
						postype = postype | TA_GridConfig.TYPE_LEFT;
						return postype;
					}
				}
			}
		}
		if(v==vsize){
			//bottom
			if(testOption(TA_GridConfig.CHAR_BOTTOM_RULE, postype)){
				if(h==0 || h==hsize){
					//in the middle
					if(testOption(OPT_CONVERT_CORNERS_HOR, mode)){
						postype = postype & ~TA_GridConfig.TYPE_UP;
						postype = postype | TA_GridConfig.TYPE_RIGHT;
						postype = postype | TA_GridConfig.TYPE_LEFT;
						return postype;
					}
				}
			}
		}
		else{
			//mid, avoid already corrected borders
			//TODO this works for HOR but not correctly for VER!
			if(testOption(TA_GridConfig.CHAR_MID_RULE, postype)){
				if(h==0 || h==hsize){
					if(testOption(OPT_CONVERT_CORNERS_HOR, mode)){
						postype = postype & ~TA_GridConfig.TYPE_UP;
						postype = postype & ~TA_GridConfig.TYPE_DOWN;
						postype = postype | TA_GridConfig.TYPE_RIGHT;
						postype = postype | TA_GridConfig.TYPE_LEFT;
						return postype;
					}
					if(testOption(OPT_CONVERT_CORNERS_VER, mode)){
						postype = postype & ~TA_GridConfig.TYPE_LEFT;
						postype = postype & ~TA_GridConfig.TYPE_RIGHT;
						postype = postype | TA_GridConfig.TYPE_UP;
						postype = postype | TA_GridConfig.TYPE_DOWN;
						return postype;
					}
				}
			}
		}
		return postype;
	}

	/**
	 * Tests if the given position/type has a type, that is an up, down, left, or right.
	 * @param postype position/type to test
	 * @return true if the given position/type already has a type, false otherwise
	 */
	static boolean hasType(int postype){
		return
			((postype & TA_GridConfig.TYPE_UP) == TA_GridConfig.TYPE_UP) ||
			((postype & TA_GridConfig.TYPE_DOWN) == TA_GridConfig.TYPE_DOWN) ||
			((postype & TA_GridConfig.TYPE_LEFT) == TA_GridConfig.TYPE_LEFT) ||
			((postype & TA_GridConfig.TYPE_RIGHT) == TA_GridConfig.TYPE_RIGHT)
		;
	}

	/**
	 * Builds a set of lines based on several input grids, combining them all.
	 * @param normalGrid a given normal grid, can be null or empty
	 * @param strongGrid a given strong grid, can be null or empty
	 * @param heavyGrid a given heavy grid, can be null or empty
	 * @param lightGrid a given light grid, can be null or empty
	 * @param exampleGrid a given example grid, can be null or empty
	 * @return set of rendered lines combing all input grids as array of string builders
	 */
	static ArrayList<StrBuilder> todocBuildAll(ArrayList<StrBuilder> normalGrid, ArrayList<StrBuilder> strongGrid, ArrayList<StrBuilder> heavyGrid, ArrayList<StrBuilder> lightGrid, ArrayList<StrBuilder> exampleGrid){
		ArrayList<StrBuilder> ret = new ArrayList<>();

		StrBuilder top =  new StrBuilder();
		if(normalGrid!=null){
			top.append("Normal         ");
		}
		if(strongGrid!=null){
			top.append("Strong         ");
		}
		if(lightGrid!=null){
			top.append("Light          ");
		}
		if(heavyGrid!=null){
			top.append("Heavy          ");
		}
		if(exampleGrid!=null){
			top.append("Example");
		}
		ret.add(top);

		int max = 0;
		max = (normalGrid!=null&&normalGrid.size()>max)?normalGrid.size():max;
		max = (strongGrid!=null&&strongGrid.size()>max)?strongGrid.size():max;
		max = (lightGrid!=null&&lightGrid.size()>max)?lightGrid.size():max;
		max = (heavyGrid!=null&&heavyGrid.size()>max)?heavyGrid.size():max;
		max = (exampleGrid!=null&&exampleGrid.size()>max)?exampleGrid.size():max;

		String space = "      ";
		String empty = "               ";
		for(int i=0; i<max; i++){
			StrBuilder line = new StrBuilder();
			if(normalGrid!=null && i<normalGrid.size()){
				line.append(normalGrid.get(i)).append(space);
			}
			if(strongGrid!=null && i<strongGrid.size()){
				line.append(strongGrid.get(i)).append(space);
			}
			if(lightGrid!=null && i<lightGrid.size()){
				line.append(lightGrid.get(i)).append(space);
			}
			if(heavyGrid!=null && i<heavyGrid.size()){
				line.append(heavyGrid.get(i)).append(space);
			}
			if(exampleGrid!=null && i<exampleGrid.size()){
				if(normalGrid!=null && i>=normalGrid.size()){
					line.append(empty);
				}
				if(strongGrid!=null && i>=strongGrid.size()){
					line.append(empty);
				}
				if(lightGrid!=null && i>=lightGrid.size()){
					line.append(empty);
				}
				if(heavyGrid!=null && i>=heavyGrid.size()){
					line.append(empty);
				}
				line.append(exampleGrid.get(i));
			}
			ret.add(line);
		}
		return ret;
	}

	/**
	 * Creates an empty content array for documentations using a given rule set.
	 * @param ruleset the rule set to be used (normal, strong, etc)
	 * @return an empty content array
	 */
	static ArrayList<Object> todocEmptyContent(int ruleset){
		ArrayList<Object> ret = new ArrayList<>();
		ret.add(ruleset);
		ret.add(Pair.of(ruleset, new String[][]{new String[]{" ", " ", " ", " "}}));
		ret.add(ruleset);
		ret.add(Pair.of(ruleset, new String[][]{new String[]{" ", " ", " ", " "}}));
		ret.add(ruleset);
		return ret;
	}

	/**
	 * Creates a content array for an example for documentations using available rules (from the calling grid).
	 * @param lightRule an available light rule
	 * @param strongRule an available strong rule
	 * @param heavyRule an available heavy rule
	 * @return a content array with an example
	 */
	static ArrayList<Object> todocExampleContent(int lightRule, int strongRule, int heavyRule){
		ArrayList<Object> ret = new ArrayList<>();
		ret.add(heavyRule);
		ret.add(
				Pair.of(
						strongRule,
						new String[][]{new String[]{" h1  ", " h2  ", " h3  ", " h4  "}}
				)
		);
		ret.add(strongRule);
		ret.add(
				Pair.of(
						strongRule,
						new String[][]{new String[]{" c11 to c14 w/col-span "}}
//						new String[][]{new String[]{" c11 ", " c12 ", " c13 ", " c14 "}}
				)
		);
		ret.add(TA_GridConfig.RULESET_NORMAL);
		ret.add(
				Pair.of(
						strongRule,
//						new String[][]{new String[]{" c21 & c22 ", " c23 & c24 "}}
						new String[][]{new String[]{" c21 ", " c22 ", " c23 ", " c24 "}}
				)
		);
		ret.add(lightRule);
		ret.add(
				Pair.of(
						strongRule,
						new String[][]{new String[]{" c31 - c32 ", " c33 - c34 "}}
//						new String[][]{new String[]{" c31 ", " c32 ", " c33 ", " c34 "}}
				)
		);
		ret.add(strongRule);
		ret.add(
				Pair.of(
						strongRule,
						new String[][]{new String[]{" f1  ", " f2  ", " f3  ", " f4  "}}
				)
		);
		ret.add(heavyRule);
		return ret;
	}
}
