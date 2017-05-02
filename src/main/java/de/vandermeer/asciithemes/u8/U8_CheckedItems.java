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

package de.vandermeer.asciithemes.u8;

import de.vandermeer.asciithemes.TA_CheckedItem;

/**
 * Collection of {@link TA_CheckedItem} for UTF-8 characters.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170404 (04-Apr-17) for Java 1.8
 * @since      v0.0.1
 */
public interface U8_CheckedItems {

	/**
	 * A checked item using `☑` and `☐`.
	 * 
	 * ----
	 * ☑ checked item
	 * ☐ unchecked item
	 * ----
	 * 
	 * @return the checked item
	 */
	static TA_CheckedItem ballotBox(){
		return TA_CheckedItem.create("☑", "☐", "checked item using \"☑\" and \"☐\"");
	}

	/**
	 * A checked item using `☒` and `☐`.
	 * 
	 * ----
	 * ☒ checked item
	 * ☐ unchecked item
	 * ----
	 * 
	 * @return the checked item
	 */
	static TA_CheckedItem ballotBoxX(){
		return TA_CheckedItem.create("☒", "☐", "checked item using \"☒\" and \"☐\"");
	}

	/**
	 * A checked item using `✗` and ` `.
	 * 
	 * ----
	 * ✗ checked item
	 *   unchecked item
	 * ----
	 * 
	 * @return the checked item
	 */
	static TA_CheckedItem ballotX(){
		return TA_CheckedItem.create("✗", " ", "checked item using \"✗\" and \" \"");
	}

	/**
	 * A checked item using `✘` and ` `.
	 * 
	 * ----
	 * ✘ checked item
	 *   unchecked item
	 * ----
	 * 
	 * @return the checked item
	 */
	static TA_CheckedItem ballotX_Heavy(){
		return TA_CheckedItem.create("✘", " ", "checked item using \"✘\" and \" \"");
	}

	/**
	 * A checked item using `✓` and ` `.
	 * 
	 * ----
	 * ✓ checked item
	 *   unchecked item
	 * ----
	 * 
	 * @return the checked item
	 */
	static TA_CheckedItem checkmark(){
		return TA_CheckedItem.create("✓", " ", "checked item using \"✓\" and \" \"");
	}

	/**
	 * A checked item using `✕` and ` `.
	 * 
	 * ----
	 * ✕ checked item
	 *   unchecked item
	 * ----
	 * 
	 * @return the checked item
	 */
	static TA_CheckedItem multiplication(){
		return TA_CheckedItem.create("✕", " ", "checked item using \"✕\" and \" \"");
	}

	/**
	 * A checked item using `‹x›` and `‹ ›`.
	 * 
	 * ----
	 * ‹x› checked item
	 * ‹ › unchecked item
	 * ----
	 * 
	 * @return the checked item
	 */
	static TA_CheckedItem spaqmx(){
		return TA_CheckedItem.create("‹x›", "‹ ›", "checked item using \"‹x›\" and \"‹ ›\"");
	}

	/**
	 * A checked item using `‹X›` and `‹ ›`.
	 * 
	 * ----
	 * ‹X› checked item
	 * ‹ › unchecked item
	 * ----
	 * 
	 * @return the checked item
	 */
	static TA_CheckedItem spaqmX(){
		return TA_CheckedItem.create("‹X›", "‹ ›", "checked item using \"‹X›\" and \"‹ ›\"");
	}
}
