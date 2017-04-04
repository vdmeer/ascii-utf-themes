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

import de.vandermeer.asciithemes.TA_Checklist;

/**
 * Collection of {@link TA_Checklist} for UTF-8 characters.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170404 (04-Apr-17) for Java 1.8
 * @since      v0.0.1
 */
public abstract class U8_Checklists {

	/**
	 * A checklist using {@link U8_CheckedItems#spaqmX()} for unlimited levels.
	 * 
	 * ----
	 * ‹X› checked item
	 * ‹ › unchecked item
	 *   ‹X› checked item
	 *   ‹ › unchecked item
	 *     ‹X› checked item
	 *     ‹ › unchecked item
	 *       ‹X› checked item
	 *       ‹ › unchecked item
	 *         ‹X› checked item
	 *         ‹ › unchecked item
	 *           ‹X› checked item
	 *           ‹ › unchecked item
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_Checklist spaqmX(){
		return TA_Checklist.create(U8_CheckedItems.spaqmX(), "checklist using \"‹X›\" and \"‹ ›\" for unlimited levels");
	}

	/**
	 * A checklist using {@link U8_CheckedItems#spaqmx()} for unlimited levels.
	 * 
	 * ----
	 * ‹x› checked item
	 * ‹ › unchecked item
	 *   ‹x› checked item
	 *   ‹ › unchecked item
	 *     ‹x› checked item
	 *     ‹ › unchecked item
	 *       ‹x› checked item
	 *       ‹ › unchecked item
	 *         ‹x› checked item
	 *         ‹ › unchecked item
	 *           ‹x› checked item
	 *           ‹ › unchecked item
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_Checklist spaqmx(){
		return TA_Checklist.create(U8_CheckedItems.spaqmx(), "checklist using \"‹x›\" and \"‹ ›\" for unlimited levels");
	}

	/**
	 * A checklist using {@link U8_CheckedItems#multiplication()} for unlimited levels.
	 * 
	 * ----
	 * ✕ checked item
	 *   unchecked item
	 *   ✕ checked item
	 *     unchecked item
	 *     ✕ checked item
	 *       unchecked item
	 *       ✕ checked item
	 *         unchecked item
	 *         ✕ checked item
	 *           unchecked item
	 *           ✕ checked item
	 *             unchecked item
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_Checklist multiplication(){
		return TA_Checklist.create(U8_CheckedItems.multiplication(), "checklist using \"✕\" and \" \" for unlimited levels");
	}

	/**
	 * A checklist using {@link U8_CheckedItems#checkmark()} for unlimited levels.
	 * 
	 * ----
	 * ✓ checked item
	 *   unchecked item
	 *   ✓ checked item
	 *     unchecked item
	 *     ✓ checked item
	 *       unchecked item
	 *       ✓ checked item
	 *         unchecked item
	 *         ✓ checked item
	 *           unchecked item
	 *           ✓ checked item
	 *             unchecked item
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_Checklist checkmark(){
		return TA_Checklist.create(U8_CheckedItems.checkmark(), "checklist using \"✓\" and \" \" for unlimited levels");
	}

	/**
	 * A checklist using {@link U8_CheckedItems#ballotX_Heavy()} for unlimited levels.
	 * 
	 * ----
	 * ✘ checked item
	 *   unchecked item
	 *   ✘ checked item
	 *     unchecked item
	 *     ✘ checked item
	 *       unchecked item
	 *       ✘ checked item
	 *         unchecked item
	 *         ✘ checked item
	 *           unchecked item
	 *           ✘ checked item
	 *             unchecked item
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_Checklist ballotX_Heavy(){
		return TA_Checklist.create(U8_CheckedItems.ballotX_Heavy(), "checklist using \"✘\" and \" \" for unlimited levels");
	}

	/**
	 * A checklist using {@link U8_CheckedItems#ballotX()} for unlimited levels.
	 * 
	 * ----
	 * ✗ checked item
	 *   unchecked item
	 *   ✗ checked item
	 *     unchecked item
	 *     ✗ checked item
	 *       unchecked item
	 *       ✗ checked item
	 *         unchecked item
	 *         ✗ checked item
	 *           unchecked item
	 *           ✗ checked item
	 *             unchecked item
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_Checklist ballotX(){
		return TA_Checklist.create(U8_CheckedItems.ballotX(), "checklist using \"✗\" and \" \" for unlimited levels");
	}

	/**
	 * A checklist using {@link U8_CheckedItems#ballotBoxX()} for unlimited levels.
	 * 
	 * ----
	 * ☒ checked item
	 * ☐ unchecked item
	 *   ☒ checked item
	 *   ☐ unchecked item
	 *     ☒ checked item
	 *     ☐ unchecked item
	 *       ☒ checked item
	 *       ☐ unchecked item
	 *         ☒ checked item
	 *         ☐ unchecked item
	 *           ☒ checked item
	 *           ☐ unchecked item
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_Checklist ballotBoxX(){
		return TA_Checklist.create(U8_CheckedItems.ballotBoxX(), "checklist using \"☒\" and \"☐\" for unlimited levels");
	}

	/**
	 * A checklist using {@link U8_CheckedItems#ballotBox()} for unlimited levels.
	 * 
	 * ----
	 * ☑ checked item
	 * ☐ unchecked item
	 *   ☑ checked item
	 *   ☐ unchecked item
	 *     ☑ checked item
	 *     ☐ unchecked item
	 *       ☑ checked item
	 *       ☐ unchecked item
	 *         ☑ checked item
	 *         ☐ unchecked item
	 *           ☑ checked item
	 *           ☐ unchecked item
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_Checklist ballotBox(){
		return TA_Checklist.create(U8_CheckedItems.ballotBox(), "checklist using \"☑\" and \"☐\" for unlimited levels");
	}

	/**
	 * A checklist using mixed styles for 4 levels.
	 * 
	 * ----
	 * ☑ checked item
	 * ☐ unchecked item
	 *   ☒ checked item
	 *   ☐ unchecked item
	 *     ‹X› checked item
	 *     ‹ › unchecked item
	 *       ‹x› checked item
	 *       ‹ › unchecked item
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_Checklist mix(){
		return TA_Checklist.create("checklist using mixed styles for 4 levels", U8_CheckedItems.ballotBox(), U8_CheckedItems.ballotBoxX(), U8_CheckedItems.spaqmX(), U8_CheckedItems.spaqmx());
	}
}
