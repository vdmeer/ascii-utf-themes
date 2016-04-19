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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.text.StrBuilder;
import org.apache.commons.lang3.tuple.Pair;

/**
 * A grid (table) using ASCII and/or UTF characters.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 160319 (19-Mar-16) for Java 1.8
 * @since      v0.0.1
 */
public interface TA_Grid extends IsTextArt {

	/**
	 * Returns the character map.
	 * @return character map
	 */
	Map<Integer, Character> getCharacterMap();

	/**
	 * Adds a new character map for a given rule set.
	 * @param ruleset required rule type (e.g. normal or light)
	 * @param none the none character (usually blank)
	 * @param horizontal the horizontal border character
	 * @param vertical the vertical border character
	 * @param topleft the top-left corner character
	 * @param topright the top-right corner character
	 * @param bottomleft the bottom-left corner character
	 * @param bottomright the bottom-right corner character
	 * @param midleft the mid-left corner character
	 * @param midright the mid-right corner character
	 * @param midboth the mid-both connector character
	 * @param middown the mid-down connector character
	 * @param midup the mid-up connector character
	 * @return this to allow chaining
	 */
	default TA_Grid addCharacterMap(int ruleset, char none, char horizontal, char vertical, char topleft, char topright, char bottomleft, char bottomright, char midleft, char midright, char midboth, char middown, char midup){
		Map<Integer, Character> map = this.getCharacterMap();
		Validate.notNull(map);
		Validate.noNullElements(map.keySet());
		Validate.noNullElements(map.values());

		map.put(TA_GridConfig.TYPE_NONE + ruleset, none);
		map.put(TA_GridConfig.TYPEPOS_HORIZONTAL + ruleset, horizontal);
		map.put(TA_GridConfig.TYPEPOS_VERTICAL + ruleset, vertical);
		map.put(TA_GridConfig.TYPEPOS_TOP_LEFT + ruleset, topleft);
		map.put(TA_GridConfig.TYPEPOS_TOP_RIGHT + ruleset, topright);
		map.put(TA_GridConfig.TYPEPOS_BOTTOM_LEFT + ruleset, bottomleft);
		map.put(TA_GridConfig.TYPEPOS_BOTTOM_RIGHT + ruleset, bottomright);
		map.put(TA_GridConfig.TYPEPOS_MID_LEFT + ruleset, midleft);
		map.put(TA_GridConfig.TYPEPOS_MID_RIGHT + ruleset, midright);
		map.put(TA_GridConfig.TYPEPOS_MID_BOTH + ruleset, midboth);
		map.put(TA_GridConfig.TYPEPOS_MID_DOWN + ruleset, middown);
		map.put(TA_GridConfig.TYPEPOS_MID_UP + ruleset, midup);

		this.addSupportedRuleSet(ruleset);
		return this;
	}

	/**
	 * Adds a new character map for a top rule using the given rule set indicator for normal, light, etc.
	 * @param ruleset required rule type (e.g. normal or light)
	 * @param none the none character (usually blank)
	 * @param horizontal the horizontal border character
	 * @param topleft the top-left corner character
	 * @param topright the top-right corner character
	 * @param middown the mid-down connector character
	 * @return this to allow chaining
	 */
	default TA_Grid addTopruleCharacterMap(int ruleset, char none, char horizontal, char topleft, char topright, char middown){
		this.addCharacterMap(ruleset | TA_GridConfig.RULESET_TOP_RULE, none, horizontal, ' ', topleft, topright, ' ', ' ', ' ', ' ', ' ', middown, ' ');
		return this;
	}

	/**
	 * Adds a new character map for a bottom rule using the given rule set indicator for normal, light, etc.
	 * @param ruleset required rule type (e.g. normal or light)
	 * @param none the none character (usually blank)
	 * @param horizontal the horizontal border character
	 * @param bottomleft the bottom-left corner character
	 * @param bottomright the bottom-right corner character
	 * @param midup the mid-up connector character
	 * @return this to allow chaining
	 */
	default TA_Grid addBottomRuleCharacterMap(int ruleset, char none, char horizontal, char bottomleft, char bottomright, char midup){
		this.addCharacterMap(ruleset | TA_GridConfig.RULESET_BOTTOM_RULE, none, horizontal, ' ', ' ', ' ', bottomleft, bottomright, ' ', ' ', ' ', ' ', midup);
		return this;
	}

	/**
	 * Adds a new character map for a mid rule using the given rule set indicator for normal, light, etc.
	 * @param ruleset required rule type (e.g. normal or light)
	 * @param none the none character (usually blank)
	 * @param vertical the vertical border character
	 * @param midleft the mid-left corner character
	 * @param midright the mid-right corner character
	 * @param midboth the mid-both connector character
	 * @param middown the mid-down connector character
	 * @param midup the mid-up connector character
	 * @return this to allow chaining
	 */
	default TA_Grid addMidruleCharacterMap(int ruleset, char none, char vertical, char midleft, char midright, char midboth, char middown, char midup){
		this.addCharacterMap(ruleset | TA_GridConfig.RULESET_MID_RULE, none, ' ', vertical, ' ', ' ', ' ', ' ', midleft, midright, midboth, middown, midup);
		return this;
	}

	/**
	 * Adds a new character map for a content row using the given rule set indicator for normal, light, etc.
	 * @param ruleset required rule type (e.g. normal or light)
	 * @param none the none character (usually blank)
	 * @param vertical the vertical border character
	 * @param midleft the mid-left corner character
	 * @param midright the mid-right corner character
	 * @return this to allow chaining
	 */
	default TA_Grid addCharacterMap(int ruleset, char none, char vertical, char midleft, char midright){
		this.addCharacterMap(ruleset | TA_GridConfig.RULESET_CONTENT_RULE, none, ' ', vertical, ' ', ' ', ' ', ' ', midleft, midright, ' ', ' ', ' ');
		return this;
	}

	/**
	 * Returns a flag with supported rule sets (effectively a list of supported rule sets).
	 * @return supported rule sets
	 */
	int supportedRulesets();

	/**
	 * Adds a new rule set to the list supported rule sets.
	 * @param set new rule set
	 */
	void addSupportedRuleSet(int set);

	/**
	 * Tests if a particular rule set is supported by the grid.
	 * @param set the rule set to test for
	 * @return true if the rule set is supported, false otherwise
	 */
	default boolean hasRuleSet(int set){
		return (this.supportedRulesets() & set) == set;
	}

	/**
	 * Calculates columns from the first content entry in the given table.
	 * @param table a table with rules and content
	 * @return calculated columns
	 */
	default ArrayList<Integer> calculateColumns(ArrayList<Object> table){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(Object o : table){
			if(o instanceof Pair){
				if(((Pair<?, ?>)o).getValue().getClass().isInstance(new String[][]{})){
					String[][]ar = (String[][])((Pair<?, ?>)o).getValue();
					for(int i=0; i<ar[0].length; i++){
						ret.add(ar[0][i].length());
					}
					break;
				}
			}
		}
		return ret;
	}

	/**
	 * Tests if the requested row type can be used, that is there is a corresponding character map available.
	 * The test is a validation of state, throwing an exception if no corresponding character map is provided by the grid.
	 * @param type row type to test
	 */
	default void testRuleType(int type){
		if((type & TA_GridConfig.RULESET_STRONG) == TA_GridConfig.RULESET_STRONG){
			Validate.validState(this.hasRuleSet(TA_GridConfig.RULESET_STRONG), "strong rule required but no strong character map in grid");
		}
		if((type & TA_GridConfig.RULESET_HEAVY) == TA_GridConfig.RULESET_HEAVY){
			Validate.validState(this.hasRuleSet(TA_GridConfig.RULESET_HEAVY), "heavy rule required but no heavy character map in grid");
		}
		if((type & TA_GridConfig.RULESET_LIGHT) == TA_GridConfig.RULESET_LIGHT){
			Validate.validState(this.hasRuleSet(TA_GridConfig.RULESET_LIGHT), "light rule required but no light character map in grid");
		}
	}

	/**
	 * Changes the input list by adding a grid.
	 * 
	 * 
	 * The method does guarantee that all lines (member of the final collection) have the same length.
	 * 
	 * @param content the content to add a grid to
	 * @param mode options for the grid
	 * @return new list with grid
	 */
	default ArrayList<StrBuilder> addGrid(Collection<Object> content, int mode){
		Validate.notNull(content);
		Validate.noNullElements(content);
		Validate.validState(content.size()>0, "no content provided, size of collection was 0");

		ArrayList<Object> table = new ArrayList<>(content);
		ArrayList<ArrayList<Object>> frame = new ArrayList<>();

		//calculate the columns
		ArrayList<Integer> columns = this.calculateColumns(table);
		Validate.validState(columns.size()>0, "there was no content provided to draw a grid around");

		//build the frame, calculate all rules
		for(int i=0; i<table.size(); i++){
			if(table.get(i) instanceof Integer){
				//we have a rule, calculate
				int ruletype = (Integer)table.get(i);
				this.testRuleType(ruletype);
				if(i==0){
					//we have a top rule, adding top as rule set
					this.addTopRule(mode, ruletype | TA_GridConfig.RULESET_TOP_RULE, columns, frame);
				}
				else if(i==(table.size()-1)){
					//we have a bottom rule, adding bottom as rule set
					this.addBottomRule(mode, ruletype | TA_GridConfig.RULESET_BOTTOM_RULE, columns, frame);
				}
				else{
					//we have a mid rule, adding mid as rule set
					this.addMidRule(mode, ruletype | TA_GridConfig.RULESET_MID_RULE, columns, frame);
				}
			}
			else if(table.get(i) instanceof Pair){
				if(((Pair<?, ?>)table.get(i)).getValue().getClass().isInstance(new String[][]{})){
					String[][] ar = (String[][])((Pair<?, ?>)table.get(i)).getValue();
					int ruletype = (Integer)((Pair<?, ?>)table.get(i)).getKey();
					this.testRuleType(ruletype);
					this.addContentRow(ar, mode, ruletype | TA_GridConfig.RULESET_CONTENT_RULE, columns, frame);
				}
			}
			else{
				throw new IllegalArgumentException("unknown object type in content, found: <" + table.get(i).getClass().getSimpleName() + ">");
			}
		}

		//finally render the table, remove any non-connections
		Map<Integer, Character> cmap = this.getCharacterMap();
		ArrayList<StrBuilder> ret = new ArrayList<>();
		for(int i=0; i<frame.size(); i++){
			StrBuilder sb = new StrBuilder();
			for(int k=0; k<frame.get(i).size(); k++){
				Object o = frame.get(i).get(k);
				if(o instanceof Integer){
					int typepos = (Integer)frame.get(i).get(k);
					typepos = this.adjustBorder(typepos, i, k, mode, frame);
					Character c = cmap.get(typepos);
					if(c==null){
						//remove added rulesets (top, middle, bottom, content) and try again
						typepos = typepos & ~TA_GridConfig.RULESET_TOP_RULE;
						typepos = typepos & ~TA_GridConfig.RULESET_MID_RULE;
						typepos = typepos & ~TA_GridConfig.RULESET_BOTTOM_RULE;
						typepos = typepos & ~TA_GridConfig.RULESET_CONTENT_RULE;
						c = cmap.get(typepos);
					}
					Validate.validState(c!=null, "problem creating a border character, did not find character for <" + c + ">");
					sb.append(c);
				}
				if(o instanceof Character){
					sb.append(o);
				}
			}
			ret.add(sb);
		}
		return ret;
	}

	/**
	 * Calculates a top rule and adds it to the frame (if not empty).
	 * @param mode the grid mode (from addGrid)
	 * @param rowtype the row type (determined by addGrid)
	 * @param columns the columns of the text (determined by addGrid)
	 * @param frame internal frame to add the rendered rule to
	 */
	default void addTopRule(int mode, int rowtype, ArrayList<Integer> columns, ArrayList<ArrayList<Object>> frame){
		ArrayList<Object> al = new ArrayList<>();
		if(TA_GridOptions.cornerTopLeft(mode)){
			al.add(TA_GridConfig.TYPEPOS_TOP_LEFT | rowtype);
		}
		else if(TA_GridOptions.cornerTopLeftNeeded(mode)){
			al.add(TA_GridConfig.TYPE_NONE);
		}
		for(int k=0; k<columns.size(); k++){
			for(int l=0; l<columns.get(k); l++){
				if(TA_GridOptions.lineTop(mode)){
					al.add(TA_GridConfig.TYPEPOS_HORIZONTAL | rowtype);
				}
				else if(TA_GridOptions.lineTopNeeded(mode)){
					al.add(TA_GridConfig.TYPE_NONE);
				}
			}
			if(k<(columns.size()-1)){
				if(TA_GridOptions.connectorTop(mode)){
					al.add(TA_GridConfig.TYPEPOS_MID_DOWN | rowtype);
				}
				else if(TA_GridOptions.connectorTopNeeded(mode)){
					al.add(TA_GridConfig.TYPE_NONE);
				}
			}
		}
		if(TA_GridOptions.cornerTopRight(mode)){
			al.add(TA_GridConfig.TYPEPOS_TOP_RIGHT | rowtype);
		}
		else if(TA_GridOptions.cornerTopRightNeeded(mode)){
			al.add(TA_GridConfig.TYPE_NONE);
		}

		if(al.size()>0){
			frame.add(al);
		}
	}

	/**
	 * Calculates a bottom rule and adds it to the frame (if not empty).
	 * @param mode the grid mode (from addGrid)
	 * @param rowtype the row type (determined by addGrid)
	 * @param columns the columns of the text (determined by addGrid)
	 * @param frame internal frame to add the rendered rule to
	 */
	default void addBottomRule(int mode, int rowtype, ArrayList<Integer> columns, ArrayList<ArrayList<Object>> frame){
		ArrayList<Object> al = new ArrayList<>();
		if(TA_GridOptions.cornerBottomLeft(mode)){
			al.add(TA_GridConfig.TYPEPOS_BOTTOM_LEFT | rowtype);
		}
		else if(TA_GridOptions.cornerBottomLeftNeeded(mode)){
			al.add(TA_GridConfig.TYPE_NONE);
		}
		for(int k=0; k<columns.size(); k++){
			for(int l=0; l<columns.get(k); l++){
				if(TA_GridOptions.lineBottom(mode)){
					al.add(TA_GridConfig.TYPEPOS_HORIZONTAL | rowtype);
				}
				else if(TA_GridOptions.lineBottomNeeded(mode)){
					al.add(TA_GridConfig.TYPE_NONE);
				}
			}
			if(k<(columns.size()-1)){
				if(TA_GridOptions.connectorBottom(mode)){
					al.add(TA_GridConfig.TYPEPOS_MID_UP | rowtype);
				}
				else if(TA_GridOptions.connectorBottomNeeded(mode)){
					al.add(TA_GridConfig.TYPE_NONE);
				}
			}
		}
		if(TA_GridOptions.cornerBottomRight(mode)){
			al.add(TA_GridConfig.TYPEPOS_BOTTOM_RIGHT | rowtype);
		}
		else if(TA_GridOptions.cornerBottomRightNeeded(mode)){
			al.add(TA_GridConfig.TYPE_NONE);
		}

		if(al.size()>0){
			frame.add(al);
		}
	}

	/**
	 * Calculates a mid rule and adds it to the frame (if not empty).
	 * @param mode the grid mode (from addGrid)
	 * @param rowtype the row type (determined by addGrid)
	 * @param columns the columns of the text (determined by addGrid)
	 * @param frame internal frame to add the rendered rule to
	 */
	default void addMidRule(int mode, int rowtype, ArrayList<Integer> columns, ArrayList<ArrayList<Object>> frame){
		ArrayList<Object> al = new ArrayList<>();
		if(TA_GridOptions.borderMidLeft(mode)){
			al.add(TA_GridConfig.TYPEPOS_MID_LEFT | rowtype);
		}
		else if(TA_GridOptions.borderMidLeftNeeded(mode)){
			al.add(TA_GridConfig.TYPE_NONE);
		}
		for(int k=0; k<columns.size(); k++){
			for(int l=0; l<columns.get(k); l++){
				if(TA_GridOptions.lineMid(mode)){
					al.add(TA_GridConfig.TYPEPOS_HORIZONTAL | rowtype);
				}
				else if(TA_GridOptions.lineMidNeeded(mode)){
					al.add(TA_GridConfig.TYPE_NONE);
				}
			}
			if(k<(columns.size()-1)){
				if(TA_GridOptions.connectorMid(mode)){
					al.add(TA_GridConfig.TYPEPOS_MID_BOTH | rowtype);
				}
				else if(TA_GridOptions.connectorMidNeeded(mode)){
					al.add(TA_GridConfig.TYPE_NONE);
				}
			}
		}
		if(TA_GridOptions.borderMidRight(mode)){
			al.add(TA_GridConfig.TYPEPOS_MID_RIGHT | rowtype);
		}
		else if(TA_GridOptions.borderMidRightNeeded(mode)){
			al.add(TA_GridConfig.TYPE_NONE);
		}

		if(al.size()>0){
			frame.add(al);
		}
	}

	/**
	 * Calculates a content row and adds it to the frame (if not empty).
	 * @param ar the content
	 * @param mode the grid mode (from addGrid)
	 * @param rowtype the row type (determined by addGrid)
	 * @param columns the columns of the text (determined by addGrid)
	 * @param frame internal frame to add the rendered row to
	 */
	default void addContentRow(String[][] ar, int mode, int rowtype, ArrayList<Integer> columns, ArrayList<ArrayList<Object>> frame){
		for(int k=0; k<ar.length; k++){
			ArrayList<Object> al = new ArrayList<>();
			if(TA_GridOptions.contentLeftBorder(mode)){
				al.add(TA_GridConfig.TYPEPOS_VERTICAL | rowtype);
			}
			else if(TA_GridOptions.contentLeftBorderNeeded(mode)){
				al.add(TA_GridConfig.TYPE_NONE);
			}
			for(int l=0; l<ar[k].length; l++){
				for(char c : ar[k][l].toCharArray()){
					al.add(c);
				}
				if(l<(ar[k].length-1)){
					if(TA_GridOptions.contentMidBorder(mode)){
						al.add(TA_GridConfig.TYPEPOS_VERTICAL | rowtype);
					}
					else if(TA_GridOptions.contentMidBorderNeeded(mode)){
						al.add(TA_GridConfig.TYPE_NONE);
					}
				}
			}
			if(TA_GridOptions.contentRightBorder(mode)){
				al.add(TA_GridConfig.TYPEPOS_VERTICAL | rowtype);
			}
			else if(TA_GridOptions.contentRightBorderNeeded(mode)){
				al.add(TA_GridConfig.TYPE_NONE);
			}
			if(al.size()>0){
				frame.add(al);
			}
		}
	}

	/**
	 * Adjusts borders, testing if a particular border character is connected uo, down, left, and right in the grid.
	 * @param typepos the border character as type/position
	 * @param v position of the character vertically in the frame
	 * @param h position of the character horizontally in the frame
	 * @param mode mode the grid mode (from addGrid)
	 * @param frame the internal frame to find connected characters
	 * @return the adjusted character to be used finally to find the actual border character
	 */
	default int adjustBorder(int typepos, int v, int h, int mode, ArrayList<ArrayList<Object>> frame){
		//if null then add normal row
		if(typepos==0){
			typepos = TA_GridConfig.RULESET_NORMAL;
		}

		int vsize = frame.size()-1;
		int hsize = frame.get(v).size()-1;

		//we build a full frame first to realize column spans and deal with removing things later
		//so remove any line if we find a character and add one if we find a border
		if(v>0){
			if(frame.get(v-1).get(h) instanceof Character){
				typepos = typepos & ~TA_GridConfig.TYPE_UP;
			}
			else if(frame.get(v-1).get(h) instanceof Integer){
				typepos = typepos | TA_GridConfig.TYPE_UP;
			}
		}
		if(v<(vsize)){
			if(frame.get(v+1).get(h) instanceof Character){
				typepos = typepos & ~TA_GridConfig.TYPE_DOWN;
			}
			else if(frame.get(v+1).get(h) instanceof Integer){
				typepos = typepos | TA_GridConfig.TYPE_DOWN;
			}
		}
		if(h>0){
			if(frame.get(v).get(h-1) instanceof Character){
				typepos = typepos & ~TA_GridConfig.TYPE_LEFT;
			}
			else if(frame.get(v).get(h-1) instanceof Integer){
				typepos = typepos | TA_GridConfig.TYPE_LEFT;
			}
		}
		if(h<(hsize)){
			if(frame.get(v).get(h+1) instanceof Character){
				typepos = typepos & ~TA_GridConfig.TYPE_RIGHT;
			}
			else if(frame.get(v).get(h+1) instanceof Integer){
				typepos = typepos | TA_GridConfig.TYPE_RIGHT;
			}
		}

		typepos = this.correctExceptions(typepos);
		if(v==0){
			typepos = TA_GridConfig.convertTopline(typepos, h, hsize, mode);
		}
		else if(v==vsize){
			typepos = TA_GridConfig.convertBottomline(typepos, h, hsize, mode);
		}
		else{
			typepos = TA_GridConfig.convertMidline(typepos, v, h, vsize, hsize, mode);
		}
		typepos = TA_GridConfig.convertBorders(typepos, v, h, vsize, hsize, mode);
		typepos = TA_GridConfig.convertConnectors(typepos, v, h, vsize, hsize, mode);
		return typepos;
	}

	/**
	 * Corrects some exceptions not yet covered by other methods.
	 * @param typepos the type/pos to correct exceptions for
	 * @return corrected typepos
	 */
	default int correctExceptions(int typepos){
		int tp = typepos & ~TA_GridConfig.RULESET_NORMAL;
		tp = tp & ~TA_GridConfig.RULESET_STRONG;
		tp = tp & ~TA_GridConfig.RULESET_HEAVY;
		tp = tp & ~TA_GridConfig.RULESET_LIGHT;

		//
		//some exceptions (special cases)
		//- vertical mid-borders in content row if no top/bottom is generated only have up or down but need both
		if(tp==TA_GridConfig.TYPE_UP){
			typepos = typepos | TA_GridConfig.TYPE_DOWN;
		}
		if(tp==TA_GridConfig.TYPE_DOWN){
			typepos = typepos | TA_GridConfig.TYPE_UP;
		}

		//- some where 0 but then only get left or right but nothing else (e.g. in inside_vertical mode), set them to 0 again
		if(tp==TA_GridConfig.TYPE_LEFT){
			typepos = typepos & ~TA_GridConfig.TYPE_LEFT;
		}
		if(tp==TA_GridConfig.TYPE_RIGHT){
			typepos = typepos & ~TA_GridConfig.TYPE_RIGHT;
		}
		return typepos;
	}

	@Override
	default StrBuilder toDoc() {
		Collection<Object> content = new ArrayList<>();
		ArrayList<StrBuilder> normalGrid = null;
		ArrayList<StrBuilder> strongGrid = null;
		ArrayList<StrBuilder> heavyGrid = null;
		ArrayList<StrBuilder> lightGrid = null;
		ArrayList<StrBuilder> exampleGrid = null;

		int lightRule  = this.hasRuleSet(TA_GridConfig.RULESET_LIGHT)?TA_GridConfig.RULESET_LIGHT:TA_GridConfig.RULESET_NORMAL;
		int strongRule = this.hasRuleSet(TA_GridConfig.RULESET_STRONG)?TA_GridConfig.RULESET_STRONG:TA_GridConfig.RULESET_NORMAL;
		int heavyRule  = this.hasRuleSet(TA_GridConfig.RULESET_HEAVY)?TA_GridConfig.RULESET_HEAVY:strongRule;

		content.add(TA_GridConfig.RULESET_NORMAL);
		content.add(Pair.of(TA_GridConfig.RULESET_NORMAL, new String[][]{new String[]{" ", " ", " ", " "}}));
		content.add(TA_GridConfig.RULESET_NORMAL);
		content.add(Pair.of(TA_GridConfig.RULESET_NORMAL, new String[][]{new String[]{" ", " ", " ", " "}}));
		content.add(TA_GridConfig.RULESET_NORMAL);
		normalGrid = this.addGrid(content, TA_GridOptions.THEME_FULL_GRID);

		if(this.hasRuleSet(TA_GridConfig.RULESET_STRONG)){
			content.clear();
			content.add(TA_GridConfig.RULESET_STRONG);
			content.add(Pair.of(TA_GridConfig.RULESET_STRONG, new String[][]{new String[]{" ", " ", " ", " "}}));
			content.add(TA_GridConfig.RULESET_STRONG);
			content.add(Pair.of(TA_GridConfig.RULESET_STRONG, new String[][]{new String[]{" ", " ", " ", " "}}));
			content.add(TA_GridConfig.RULESET_STRONG);
			strongGrid = this.addGrid(content, TA_GridOptions.THEME_FULL_GRID);
		}

		if(this.hasRuleSet(TA_GridConfig.RULESET_HEAVY)){
			content.clear();
			content.add(TA_GridConfig.RULESET_HEAVY);
			content.add(Pair.of(TA_GridConfig.RULESET_HEAVY, new String[][]{new String[]{" ", " ", " ", " "}}));
			content.add(TA_GridConfig.RULESET_HEAVY);
			content.add(Pair.of(TA_GridConfig.RULESET_HEAVY, new String[][]{new String[]{" ", " ", " ", " "}}));
			content.add(TA_GridConfig.RULESET_HEAVY);
			heavyGrid = this.addGrid(content, TA_GridOptions.THEME_FULL_GRID);
		}

		if(this.hasRuleSet(TA_GridConfig.RULESET_LIGHT)){
			content.clear();
			content.add(TA_GridConfig.RULESET_LIGHT);
			content.add(Pair.of(TA_GridConfig.RULESET_LIGHT, new String[][]{new String[]{" ", " ", " ", " "}}));
			content.add(TA_GridConfig.RULESET_LIGHT);
			content.add(Pair.of(TA_GridConfig.RULESET_LIGHT, new String[][]{new String[]{" ", " ", " ", " "}}));
			content.add(TA_GridConfig.RULESET_LIGHT);
			lightGrid = this.addGrid(content, TA_GridOptions.THEME_FULL_GRID);
		}

		content.clear();
		content.add(heavyRule);
		content.add(
				Pair.of(
						strongRule,
						new String[][]{new String[]{" h1  ", " h2  ", " h3  ", " h4  "}}
				)
		);
		content.add(strongRule);
		content.add(
				Pair.of(
						strongRule,
						new String[][]{new String[]{" c11 to c14 w/col-span "}}
//						new String[][]{new String[]{" c11 ", " c12 ", " c13 ", " c14 "}}
				)
		);
		content.add(TA_GridConfig.RULESET_NORMAL);
		content.add(
				Pair.of(
						strongRule,
//						new String[][]{new String[]{" c21 & c22 ", " c23 & c24 "}}
						new String[][]{new String[]{" c21 ", " c22 ", " c23 ", " c24 "}}
				)
		);
		content.add(lightRule);
		content.add(
				Pair.of(
						strongRule,
						new String[][]{new String[]{" c31 - c32 ", " c33 - c34 "}}
//						new String[][]{new String[]{" c31 ", " c32 ", " c33 ", " c34 "}}
				)
		);
		content.add(strongRule);
		content.add(
				Pair.of(
						strongRule,
						new String[][]{new String[]{" f1  ", " f2  ", " f3  ", " f4  "}}
				)
		);
		content.add(heavyRule);
		exampleGrid = this.addGrid(content, TA_GridOptions.THEME_FULL_GRID);

		String space = "      ";

		if(this.hasRuleSet(TA_GridConfig.RULESET_STRONG)){
			exampleGrid.add(0, new StrBuilder().append("Normal         Strong         Example"));
		}
		else if(this.hasRuleSet(TA_GridConfig.RULESET_HEAVY)){
			exampleGrid.add(0, new StrBuilder().append("Normal                        Example"));
		}
		else{
			exampleGrid.add(0, new StrBuilder().append("Normal         Example"));
		}
		for(int i=0; i<normalGrid.size(); i++){
			if(this.hasRuleSet(TA_GridConfig.RULESET_STRONG)){
				exampleGrid.get(i+1).insert(0, new StrBuilder().append(normalGrid.get(i)).append(space).append(strongGrid.get(i)).append(space));
			}
			else{
				exampleGrid.get(i+1).insert(0, new StrBuilder().append(normalGrid.get(i)));
			}
		}

		exampleGrid.get(6).insert(0, new StrBuilder().append("                              "));
		if(this.hasRuleSet(TA_GridConfig.RULESET_LIGHT) && this.hasRuleSet(TA_GridConfig.RULESET_HEAVY)){
			exampleGrid.get(7).insert(0, new StrBuilder().append("Light          Heavy          "));
		}
		else if(this.hasRuleSet(TA_GridConfig.RULESET_HEAVY)){
			exampleGrid.get(7).insert(0, new StrBuilder().append("               Heavy          "));
		}
		else if(this.hasRuleSet(TA_GridConfig.RULESET_LIGHT)){
			exampleGrid.get(7).insert(0, new StrBuilder().append("Light                         "));
		}
		else{
			exampleGrid.get(7).insert(0, new StrBuilder().append("                              "));
		}
		for(int i=8; i<exampleGrid.size(); i++){
			if(this.hasRuleSet(TA_GridConfig.RULESET_LIGHT) && this.hasRuleSet(TA_GridConfig.RULESET_HEAVY)){
				exampleGrid.get(i).insert(0, new StrBuilder().append(lightGrid.get(i-8)).append(space).append(heavyGrid.get(i-8)).append(space));
			}
			else if(this.hasRuleSet(TA_GridConfig.RULESET_HEAVY)){
				exampleGrid.get(i).insert(0, new StrBuilder().append(space).append(space).append("   ").append(heavyGrid.get(i-8)).append(space));
			}
			else if(this.hasRuleSet(TA_GridConfig.RULESET_LIGHT)){
				exampleGrid.get(i).insert(0, new StrBuilder().append(lightGrid.get(i-8)).append(space).append(space).append(space).append("   "));
			}
			else{
				exampleGrid.get(i).insert(0, new StrBuilder().append("                              "));
			}
		}
		if(this.hasRuleSet(TA_GridConfig.RULESET_LIGHT) && this.hasRuleSet(TA_GridConfig.RULESET_HEAVY)){
			exampleGrid.add(new StrBuilder().append(lightGrid.get(lightGrid.size()-1)).append(space).append(heavyGrid.get(heavyGrid.size()-1)));
		}
		else if(this.hasRuleSet(TA_GridConfig.RULESET_HEAVY)){
			exampleGrid.add(new StrBuilder().append(space).append(space).append("   ").append(heavyGrid.get(heavyGrid.size()-1)));
		}
		else if(this.hasRuleSet(TA_GridConfig.RULESET_LIGHT)){
			exampleGrid.add(new StrBuilder().append(lightGrid.get(lightGrid.size()-1)));
		}

		return new StrBuilder().appendWithSeparators(exampleGrid, "\n");
	}

	/**
	 * Creates a new empty (no character map loaded) grid object.
	 * @param description a description for the line, cannot be blank
	 * @return new grid object
	 */
	static TA_Grid create(String description){
		Validate.notBlank(description);

		return new TA_Grid() {
			Map<Integer, Character> map = new HashMap<>();
			protected int supportedRuleSet = TA_GridConfig.RULESET_NORMAL;

			@Override
			public Map<Integer, Character> getCharacterMap() {
				return map;
			}

			@Override
			public String getDescription(){
				return description;
			}

			@Override
			public int supportedRulesets() {
				return supportedRuleSet;
			}

			@Override
			public void addSupportedRuleSet(int set) {
				supportedRuleSet = supportedRuleSet | set;
			}
		};
	}

}
