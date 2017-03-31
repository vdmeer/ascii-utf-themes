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
		map.put(TA_GridConfig.PT_HORIZONTAL + ruleset, horizontal);
		map.put(TA_GridConfig.PT_VERTICAL + ruleset, vertical);
		map.put(TA_GridConfig.PT_TOP_LEFT + ruleset, topleft);
		map.put(TA_GridConfig.PT_TOP_RIGHT + ruleset, topright);
		map.put(TA_GridConfig.PT_BOTTOM_LEFT + ruleset, bottomleft);
		map.put(TA_GridConfig.PT_BOTTOM_RIGHT + ruleset, bottomright);
		map.put(TA_GridConfig.PT_MID_LEFT + ruleset, midleft);
		map.put(TA_GridConfig.PT_MID_RIGHT + ruleset, midright);
		map.put(TA_GridConfig.PT_MID_BOTH + ruleset, midboth);
		map.put(TA_GridConfig.PT_MID_DOWN + ruleset, middown);
		map.put(TA_GridConfig.PT_MID_UP + ruleset, midup);

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
		this.addCharacterMap(ruleset | TA_GridConfig.CHAR_TOP_RULE, none, horizontal, ' ', topleft, topright, ' ', ' ', ' ', ' ', ' ', middown, ' ');
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
		this.addCharacterMap(ruleset | TA_GridConfig.CHAR_BOTTOM_RULE, none, horizontal, ' ', ' ', ' ', bottomleft, bottomright, ' ', ' ', ' ', ' ', midup);
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
		this.addCharacterMap(ruleset | TA_GridConfig.CHAR_MID_RULE, none, ' ', vertical, ' ', ' ', ' ', ' ', midleft, midright, midboth, middown, midup);
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
		this.addCharacterMap(ruleset | TA_GridConfig.CHAR_CONTENT_RULE, none, ' ', vertical, ' ', ' ', ' ', ' ', midleft, midright, ' ', ' ', ' ');
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
	 * Calculates column width across the table, using columns with content to calculate width.
	 * @param table a table with rules and content
	 * @return calculated columns
	 */
	default ArrayList<Integer> calculateColumns(ArrayList<Object> table){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(Object o : table){
			if(o instanceof Pair){
				if(((Pair<?, ?>)o).getValue().getClass().isInstance(new String[][]{})){
					String[][]ar = (String[][])((Pair<?, ?>)o).getValue();
					for(int r=0; r<ar.length; r++){
						for(int c=0;c<ar[r].length; c++){
							//add to array if not set
							if(c>=ret.size()){
								if(ar[r][c]!=null){
									ret.add(ar[r][c].length());
								}
								else{
									ret.add(-1);
								}
							}

							if(ar[r][c]!=null){
								if(ret.get(c)==-1 || ar[r][c].length()<ret.get(c)){
									ret.set(c, ar[r][c].length());
								}
							}
						}
					}
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
	 * The method does guarantee that all lines (member of the final collection) have the same length.
	 * 
	 * @param content the content to add a grid to
	 * @param theme the grid theme
	 * @return new list with grid
	 */
	default ArrayList<StrBuilder> addGrid(Collection<Object> content, TA_GridThemes theme){
		return this.addGrid(content, theme.get());
	}

	/**
	 * Changes the input list by adding a grid.
	 * 
	 * The method does guarantee that all lines (member of the final collection) have the same length.
	 * 
	 * @param content the content to add a grid to
	 * @param theme the grid theme
	 * @param options the grid theme options
	 * @return new list with grid
	 */
	default ArrayList<StrBuilder> addGrid(Collection<Object> content, TA_GridThemes theme, TA_GridThemeOptions options){
		return this.addGrid(content, theme.get() | options.get());
	}

	/**
	 * Changes the input list by adding a grid.
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
					TA_GridHelpers.addRule(TA_GridHelpers.topRule, mode, ruletype | TA_GridConfig.CHAR_TOP_RULE, columns, frame);
				}
				else if(i==(table.size()-1)){
					//we have a bottom rule, adding bottom as rule set
					TA_GridHelpers.addRule(TA_GridHelpers.bottomRule, mode, ruletype | TA_GridConfig.CHAR_BOTTOM_RULE, columns, frame);
				}
				else{
					//we have a mid rule, adding mid as rule set
					TA_GridHelpers.addRule(TA_GridHelpers.midRule, mode, ruletype | TA_GridConfig.CHAR_MID_RULE, columns, frame);
				}
			}
			else if(table.get(i) instanceof Pair){
				if(((Pair<?, ?>)table.get(i)).getValue().getClass().isInstance(new String[][]{})){
					String[][] ar = (String[][])((Pair<?, ?>)table.get(i)).getValue();
					int ruletype = (Integer)((Pair<?, ?>)table.get(i)).getKey();
					this.testRuleType(ruletype);
					TA_GridHelpers.addContentRow(ar, mode, ruletype | TA_GridConfig.CHAR_CONTENT_RULE, frame);
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
					int postype = (Integer)o;
					postype = TA_GridHelpers.adjustBorder(postype, i, k, mode, frame);
					postype = TA_GridHelpers.convertBorders(postype, i, k, frame.size()-1, frame.get(i).size()-1, mode);
					postype = TA_GridHelpers.convertConnectors(postype, i, k, frame.size()-1, frame.get(i).size()-1, mode);

					Character c = cmap.get(postype);
					if(c==null){
						//remove added rulesets (top, middle, bottom, content) and try again
						postype = postype & ~TA_GridConfig.CHAR_TOP_RULE;
						postype = postype & ~TA_GridConfig.CHAR_MID_RULE;
						postype = postype & ~TA_GridConfig.CHAR_BOTTOM_RULE;
						postype = postype & ~TA_GridConfig.CHAR_CONTENT_RULE;
						c = cmap.get(postype);
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

	@Override
	default StrBuilder toDoc() {
		ArrayList<StrBuilder> normalGrid = this.addGrid(TA_GridHelpers.todocEmptyContent(TA_GridConfig.RULESET_NORMAL), TA_GridThemes.FULL);
		ArrayList<StrBuilder> strongGrid = (this.hasRuleSet(TA_GridConfig.RULESET_STRONG))?this.addGrid(TA_GridHelpers.todocEmptyContent(TA_GridConfig.RULESET_STRONG), TA_GridThemes.FULL):null;
		ArrayList<StrBuilder> heavyGrid = (this.hasRuleSet(TA_GridConfig.RULESET_HEAVY))?this.addGrid(TA_GridHelpers.todocEmptyContent(TA_GridConfig.RULESET_HEAVY), TA_GridThemes.FULL):null;
		ArrayList<StrBuilder> lightGrid = (this.hasRuleSet(TA_GridConfig.RULESET_LIGHT))?this.addGrid(TA_GridHelpers.todocEmptyContent(TA_GridConfig.RULESET_LIGHT), TA_GridThemes.FULL):null;

		int strongRule = this.hasRuleSet(TA_GridConfig.RULESET_STRONG)?TA_GridConfig.RULESET_STRONG:TA_GridConfig.RULESET_NORMAL;
		int heavyRule  = this.hasRuleSet(TA_GridConfig.RULESET_HEAVY)?TA_GridConfig.RULESET_HEAVY:strongRule;

		ArrayList<StrBuilder> exampleGrid = this.addGrid(
				TA_GridHelpers.todocExampleContent(
						this.hasRuleSet(TA_GridConfig.RULESET_LIGHT)?TA_GridConfig.RULESET_LIGHT:TA_GridConfig.RULESET_NORMAL,
						strongRule,
						heavyRule
				), TA_GridThemes.FULL)
		;

		return new StrBuilder().appendWithSeparators(TA_GridHelpers.todocBuildAll(normalGrid, strongGrid, heavyGrid, lightGrid, exampleGrid), "\n");
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
