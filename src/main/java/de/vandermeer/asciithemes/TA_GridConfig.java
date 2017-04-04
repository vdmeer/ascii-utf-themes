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
 * @version    v0.0.1 build 170404 (04-Apr-17) for Java 1.8
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
	static int CHAR_TOP_RULE		= 0b0000_0001_0000;

	/** A character in a mid rule. */
	static int CHAR_MID_RULE		= 0b0000_0010_0000;

	/** A character in a bottom rule. */
	static int CHAR_BOTTOM_RULE		= 0b0000_0100_0000;

	/** A character in a content rule. */
	static int CHAR_CONTENT_RULE	= 0b0000_1000_0000;


	/** Row type for a normal character, that is a normal border. */
	static int RULESET_NORMAL		= 0b0001_0000_0000;

	/** Row type for a strong character, that is a strong border. */
	static int RULESET_STRONG		= 0b0010_0000_0000;

	/** Row type for a heavy character, that is a heavy border. */
	static int RULESET_HEAVY		= 0b0100_0000_0000;

	/** Row type for a light character, that is a light border. */
	static int RULESET_LIGHT		= 0b1000_0000_0000;


	/** Border position and type for a simple horizontal border item, for instance `═` . */
	static int PT_HORIZONTAL = TYPE_LEFT | TYPE_RIGHT;

	/** Border position and type for a simple horizontal border item, for instance `║` . */
	static int PT_VERTICAL   = TYPE_UP | TYPE_DOWN;


	/** Border position and type for a top-left border item, for instance `╔` . */
	static int PT_TOP_LEFT  = TYPE_RIGHT | TYPE_DOWN;

	/** Border position and type for a top-right border item, for instance `╗` . */
	static int PT_TOP_RIGHT = TYPE_LEFT | TYPE_DOWN;


	/** Border position and type for a bottom-left border item, for instance `╚` . */
	static int PT_BOTTOM_LEFT  = TYPE_RIGHT | TYPE_UP;

	/** Border position and type for a bottom-right border item, for instance `╝` . */
	static int PT_BOTTOM_RIGHT = TYPE_LEFT | TYPE_UP;


	/** Border position and type for a middle-left border item, for instance `╠` . */
	static int PT_MID_LEFT  = TYPE_RIGHT | TYPE_UP | TYPE_DOWN;

	/** Border position and type for a middle-right border item, for instance `╣` . */
	static int PT_MID_RIGHT = TYPE_LEFT | TYPE_UP | TYPE_DOWN;

	/** Border position and type for a middle-up-down border item, for instance `╬` . */
	static int PT_MID_BOTH  = TYPE_LEFT | TYPE_RIGHT | TYPE_UP | TYPE_DOWN;


	/** Border position and type for a middle-down border item, for instance `╦` . */
	static int PT_MID_DOWN = TYPE_LEFT | TYPE_RIGHT | TYPE_DOWN;

	/** Border position and type for a middle-up border item, for instance `╩` . */
	static int PT_MID_UP   = TYPE_LEFT | TYPE_RIGHT | TYPE_UP;

}
