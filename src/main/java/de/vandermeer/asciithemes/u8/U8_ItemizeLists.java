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

import de.vandermeer.asciithemes.TA_ItemizeList;

/**
 * Collection of {@link TA_ItemizeList} for UTF-8 characters.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170331 (31-Mar-17) for Java 1.8
 * @since      v0.0.1
 */
public abstract class U8_ItemizeLists {

	/**
	 * An itemize list using the character `•` for unlimited levels.
	 * 
	 * ----
	 * • item 1
	 * • item 2
	 *   • item 1
	 *   • item 2
	 *     • item 1
	 *     • item 2
	 *       • item 1
	 *       • item 2
	 *         • item 1
	 *         • item 2
	 *           • item 1
	 *           • item 2
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_ItemizeList allBullet(){
		return TA_ItemizeList.create('•', "itemize list using the character '•' for unlimited levels");
	}

	/**
	 * An itemize list using the character `•` for unlimited levels.
	 * 
	 * ----
	 * • item 1
	 * • item 2
	 *   •• item 1
	 *   •• item 2
	 *     ••• item 1
	 *     ••• item 2
	 *       •••• item 1
	 *       •••• item 2
	 *         ••••• item 1
	 *         ••••• item 2
	 *           •••••• item 1
	 *           •••••• item 2
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_ItemizeList allBulletIncremental(){
		return TA_ItemizeList.createIncremental('•', "itemize list using the character '•' for unlimited levels incremental");
	}

	/**
	 * An itemize list using the character `○` for unlimited levels.
	 * 
	 * ----
	 * ○ item 1
	 * ○ item 2
	 *   ○ item 1
	 *   ○ item 2
	 *     ○ item 1
	 *     ○ item 2
	 *       ○ item 1
	 *       ○ item 2
	 *         ○ item 1
	 *         ○ item 2
	 *           ○ item 1
	 *           ○ item 2
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_ItemizeList allWhiteCircle(){
		return TA_ItemizeList.create('○', "itemize list using the character '○' for unlimited levels");
	}

	/**
	 * An itemize list using the character `○` for unlimited levels.
	 * 
	 * ----
	 * ○ item 1
	 * ○ item 2
	 *   ○○ item 1
	 *   ○○ item 2
	 *     ○○○ item 1
	 *     ○○○ item 2
	 *       ○○○○ item 1
	 *       ○○○○ item 2
	 *         ○○○○○ item 1
	 *         ○○○○○ item 2
	 *           ○○○○○○ item 1
	 *           ○○○○○○ item 2
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_ItemizeList allWhiteCircleIncremental(){
		return TA_ItemizeList.createIncremental('○', "itemize list using the character '○' for unlimited levels incremental");
	}

	/**
	 * An itemize list using the character `▪` for unlimited levels.
	 * 
	 * ----
	 * ▪ item 1
	 * ▪ item 2
	 *   ▪ item 1
	 *   ▪ item 2
	 *     ▪ item 1
	 *     ▪ item 2
	 *       ▪ item 1
	 *       ▪ item 2
	 *         ▪ item 1
	 *         ▪ item 2
	 *           ▪ item 1
	 *           ▪ item 2
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_ItemizeList allBlackSmallSquare(){
		return TA_ItemizeList.create('▪', "itemize list using the character '▪' for unlimited levels");
	}

	/**
	 * An itemize list using the character `▪` for unlimited levels.
	 * 
	 * ----
	 * ▪ item 1
	 * ▪ item 2
	 *   ▪▪ item 1
	 *   ▪▪ item 2
	 *     ▪▪▪ item 1
	 *     ▪▪▪ item 2
	 *       ▪▪▪▪ item 1
	 *       ▪▪▪▪ item 2
	 *         ▪▪▪▪▪ item 1
	 *         ▪▪▪▪▪ item 2
	 *           ▪▪▪▪▪▪ item 1
	 *           ▪▪▪▪▪▪ item 2
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_ItemizeList allBlackSmallSquareIncremental(){
		return TA_ItemizeList.createIncremental('▪', "itemize list using the character '▪' for unlimited levels incremental");
	}

	/**
	 * An itemize list using the character `▸` for unlimited levels.
	 * 
	 * ----
	 * ▸ item 1
	 * ▸ item 2
	 *   ▸ item 1
	 *   ▸ item 2
	 *     ▸ item 1
	 *     ▸ item 2
	 *       ▸ item 1
	 *       ▸ item 2
	 *         ▸ item 1
	 *         ▸ item 2
	 *           ▸ item 1
	 *           ▸ item 2
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_ItemizeList allBlackRightTriangle(){
		return TA_ItemizeList.create('▸', "itemize list using the character '▸' for unlimited levels");
	}

	/**
	 * An itemize list using the character `▸` for unlimited levels.
	 * 
	 * ----
	 * ▸ item 1
	 * ▸ item 2
	 *   ▸▸ item 1
	 *   ▸▸ item 2
	 *     ▸▸▸ item 1
	 *     ▸▸▸ item 2
	 *       ▸▸▸▸ item 1
	 *       ▸▸▸▸ item 2
	 *         ▸▸▸▸▸ item 1
	 *         ▸▸▸▸▸ item 2
	 *           ▸▸▸▸▸▸ item 1
	 *           ▸▸▸▸▸▸ item 2
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_ItemizeList allBlackRightTriangleIncremental(){
		return TA_ItemizeList.createIncremental('▸', "itemize list using the character '▸' for unlimited levels incremental");
	}

	/**
	 * An itemize list using the character `▹` for unlimited levels.
	 * 
	 * ----
	 * ▹ item 1
	 * ▹ item 2
	 *   ▹ item 1
	 *   ▹ item 2
	 *     ▹ item 1
	 *     ▹ item 2
	 *       ▹ item 1
	 *       ▹ item 2
	 *         ▹ item 1
	 *         ▹ item 2
	 *           ▹ item 1
	 *           ▹ item 2
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_ItemizeList allWhiteRightTriangle(){
		return TA_ItemizeList.create('▹', "itemize list using the character '▹' for unlimited levels");
	}

	/**
	 * An itemize list using the character `▹` for unlimited levels.
	 * 
	 * ----
	 * ▹ item 1
	 * ▹ item 2
	 *   ▹▹ item 1
	 *   ▹▹ item 2
	 *     ▹▹▹ item 1
	 *     ▹▹▹ item 2
	 *       ▹▹▹▹ item 1
	 *       ▹▹▹▹ item 2
	 *         ▹▹▹▹▹ item 1
	 *         ▹▹▹▹▹ item 2
	 *           ▹▹▹▹▹▹ item 1
	 *           ▹▹▹▹▹▹ item 2
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_ItemizeList allWhiteRightTriangleIncremental(){
		return TA_ItemizeList.createIncremental('▹', "itemize list using the character '▹' for unlimited levels incremental");
	}

	/**
	 * An itemize list using the characters '•', '○', '▪' generating an HTML like list.
	 * 
	 * ----
	 * • item 1
	 * • item 2
	 *   ○ item 1
	 *   ○ item 2
	 *     ▪ item 1
	 *     ▪ item 2
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_ItemizeList htmlLike(){
		return TA_ItemizeList.create("list using the characters '•', '○', '▪' generating an HTML like list", '•', '○', '▪');
	}

	/**
	 * An itemize list using the UTF-8 star characters '✳', '✴', '✵' ,'✷' ,'✹' ,'✺'.
	 * 
	 * ----
	 * ✳ item 1
	 * ✳ item 2
	 *   ✴ item 1
	 *   ✴ item 2
	 *     ✵ item 1
	 *     ✵ item 2
	 *       ✷ item 1
	 *       ✷ item 2
	 *         ✹ item 1
	 *         ✹ item 2
	 *           ✺ item 1
	 *           ✺ item 2
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_ItemizeList stars(){
		return TA_ItemizeList.create("list using the UTF-8 star characters '✳', '✴', '✵' ,'✷' ,'✹' ,'✺'", '✳', '✴', '✵' ,'✷' ,'✹' ,'✺');
	}

	/**
	 * An itemize list using the UTF-8 outline star characters '✧', '✩', '✫' ,'✬' ,'✭' ,'✯'.
	 * 
	 * ----
	 * ✧ item 1
	 * ✧ item 2
	 *   ✩ item 1
	 *   ✩ item 2
	 *     ✫ item 1
	 *     ✫ item 2
	 *       ✬ item 1
	 *       ✬ item 2
	 *         ✭ item 1
	 *         ✭ item 2
	 *           ✯ item 1
	 *           ✯ item 2
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_ItemizeList starsOutline(){
		return TA_ItemizeList.create("list using the UTF-8 outline star characters '✧', '✩', '✫' ,'✬' ,'✭' ,'✯'", '✧', '✩', '✫' ,'✬' ,'✭' ,'✯');
	}

	/**
	 * An itemize list using the UTF-8 tear drop characters '✻', '✼', '✾'.
	 * 
	 * ----
	 * ✻ item 1
	 * ✻ item 2
	 *   ✼ item 1
	 *   ✼ item 2
	 *     ✾ item 1
	 *     ✾ item 2
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_ItemizeList tearDrop(){
		return TA_ItemizeList.create("list using the UTF-8 tear drop characters '✻', '✼', '✾'", '✻', '✼', '✾');
	}

	/**
	 * An itemize list using the UTF-8 florette characters '✿', '❀', '❁'.
	 * 
	 * ----
	 * ✿ item 1
	 * ✿ item 2
	 *   ❀ item 1
	 *   ❀ item 2
	 *     ❁ item 1
	 *     ❁ item 2
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_ItemizeList florette(){
		return TA_ItemizeList.create("list using the UTF-8 florette characters '✿', '❀', '❁'", '✿', '❀', '❁');
	}

	/**
	 * An itemize list using the UTF-8 snowflake characters '❄', '❅', '❆'.
	 * 
	 * ----
	 * ❄ item 1
	 * ❄ item 2
	 *   ❅ item 1
	 *   ❅ item 2
	 *     ❆ item 1
	 *     ❆ item 2
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_ItemizeList snowflake(){
		return TA_ItemizeList.create("list using the UTF-8 snowflake characters '❄', '❅', '❆'", '❄', '❅', '❆');
	}

	/**
	 * An itemize list using the UTF-8 sparkle characters '❇', '❈'.
	 * 
	 * ----
	 * ❇ item 1
	 * ❇ item 2
	 *   ❈ item 1
	 *   ❈ item 2
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_ItemizeList sparkle(){
		return TA_ItemizeList.create("list using the UTF-8 sparkle characters '❇', '❈'", '❇', '❈');
	}

	/**
	 * An itemize list using UTF-8 arrow characters '➔', '➜', '➡', '➞', '➝', '➙' for nested list of depth 6.
	 * 
	 * ----
	 * ➔ item 1
	 * ➔ item 2
	 *  ➜ item 1
	 *    ➜ item 2
	 *      ➡ item 1
	 *      ➡ item 2
	 *        ➞ item 1
	 *        ➞ item 2
	 *          ➝ item 1
	 *          ➝ item 2
	 *            ➙ item 1
	 *            ➙ item 2
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_ItemizeList someArrowsNested(){
		return TA_ItemizeList.create("list using UTF-8 arrow characters '➔', '➜', '➡', '➞', '➝', '➙' for nested list of depth 6", '➔', '➜', '➡', '➞', '➝', '➙');
	}
}
