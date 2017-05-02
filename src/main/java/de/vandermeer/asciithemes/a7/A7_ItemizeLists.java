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

package de.vandermeer.asciithemes.a7;

import de.vandermeer.asciithemes.TA_ItemizeList;

/**
 * Collection of {@link TA_ItemizeList} for ASCII characters.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170404 (04-Apr-17) for Java 1.8
 * @since      v0.0.1
 */
public interface A7_ItemizeLists {

	/**
	 * An itemize list the character ` ` for unlimited levels.
	 * 
	 * ----
	 *   item 1
	 *   item 2
	 *     item 1
	 *     item 2
	 *       item 1
	 *       item 2
	 *         item 1
	 *         item 2
	 *           item 1
	 *           item 2
	 *             item 1
	 *             item 2
	 * ----
	 * 
	 * @return the list
	 */
	static TA_ItemizeList allBlank(){
		return TA_ItemizeList.create(' ', "itemize list using the character ' ' for unlimited levels");
	}

	/**
	 * An itemize list the character `.` for unlimited levels.
	 * 
	 * ----
	 * . item 1
	 * . item 2
	 *   . item 1
	 *   . item 2
	 *     . item 1
	 *     . item 2
	 *       . item 1
	 *       . item 2
	 *         . item 1
	 *         . item 2
	 *           . item 1
	 *           . item 2
	 * ----
	 * 
	 * @return the list
	 */
	static TA_ItemizeList allDot(){
		return TA_ItemizeList.create('.', "itemize list using the character '.' for unlimited levels");
	}

	/**
	 * An itemize list the character `.` for unlimited levels.
	 * 
	 * ----
	 * . item 1
	 * . item 2
	 *   .. item 1
	 *   .. item 2
	 *     ... item 1
	 *     ... item 2
	 *       .... item 1
	 *       .... item 2
	 *         ..... item 1
	 *         ..... item 2
	 *           ...... item 1
	 *           ...... item 2
	 * ----
	 * 
	 * @return the list
	 */
	static TA_ItemizeList allDotIncremental(){
		return TA_ItemizeList.createIncremental('.', "itemize list using the character '.' for unlimited levels incremental");
	}

	/**
	 * An itemize list the character `!` for unlimited levels.
	 * 
	 * ----
	 * ! item 1
	 * ! item 2
	 *   ! item 1
	 *   ! item 2
	 *     ! item 1
	 *     ! item 2
	 *       ! item 1
	 *       ! item 2
	 *         ! item 1
	 *         ! item 2
	 *           ! item 1
	 *           ! item 2
	 * ----
	 * 
	 * @return the list
	 */
	static TA_ItemizeList allExclamationMark(){
		return TA_ItemizeList.create('!', "itemize list using the character '!' for unlimited levels");
	}

	/**
	 * An itemize list the character `!` for unlimited levels.
	 * 
	 * ----
	 * ! item 1
	 * ! item 2
	 *   !! item 1
	 *   !! item 2
	 *     !!! item 1
	 *     !!! item 2
	 *       !!!! item 1
	 *       !!!! item 2
	 *         !!!!! item 1
	 *         !!!!! item 2
	 *           !!!!!! item 1
	 *           !!!!!! item 2
	 * ----
	 * 
	 * @return the list
	 */
	static TA_ItemizeList allExclamationMarkIncremental(){
		return TA_ItemizeList.createIncremental('!', "itemize list using the character '!' for unlimited levels incremental");
	}

	/**
	 * An itemize list the character `&gt;` for unlimited levels.
	 * 
	 * ----
	 * &gt; item 1
	 * &gt; item 2
	 *   &gt; item 1
	 *   &gt; item 2
	 *     &gt; item 1
	 *     &gt; item 2
	 *       &gt; item 1
	 *       &gt; item 2
	 *         &gt; item 1
	 *         &gt; item 2
	 *           &gt; item 1
	 *           &gt; item 2
	 * ----
	 * 
	 * @return the list
	 */
	static TA_ItemizeList allGt(){
		return TA_ItemizeList.create('>', "itemize list using the character '>' for unlimited levels");
	}

	/**
	 * An itemize list the character `&gt;` for unlimited levels.
	 * 
	 * ----
	 * &gt; item 1
	 * &gt; item 2
	 *   &gt;&gt; item 1
	 *   &gt;&gt; item 2
	 *     &gt;&gt;&gt; item 1
	 *     &gt;&gt;&gt; item 2
	 *       &gt;&gt;&gt;&gt; item 1
	 *       &gt;&gt;&gt;&gt; item 2
	 *         &gt;&gt;&gt;&gt;&gt; item 1
	 *         &gt;&gt;&gt;&gt;&gt; item 2
	 *           &gt;&gt;&gt;&gt;&gt;&gt; item 1
	 *           &gt;&gt;&gt;&gt;&gt;&gt; item 2
	 * ----
	 * 
	 * @return the list
	 */
	static TA_ItemizeList allGtIncremental(){
		return TA_ItemizeList.createIncremental('>', "itemize list using the character '>' for unlimited levels incremental");
	}

	/**
	 * An itemize list the character `&lt;` for unlimited levels.
	 * 
	 * ----
	 * &lt; item 1
	 * &lt; item 2
	 *   &lt; item 1
	 *   &lt; item 2
	 *     &lt; item 1
	 *     &lt; item 2
	 *       &lt; item 1
	 *       &lt; item 2
	 *         &lt; item 1
	 *         &lt; item 2
	 *           &lt; item 1
	 *           &lt; item 2
	 * ----
	 * 
	 * @return the list
	 */
	static TA_ItemizeList allLt(){
		return TA_ItemizeList.create('<', "itemize list using the character '<' for unlimited levels");
	}

	/**
	 * An itemize list the character `&lt;` for unlimited levels.
	 * 
	 * ----
	 * &lt; item 1
	 * &lt; item 2
	 *   &lt;&lt; item 1
	 *   &lt;&lt; item 2
	 *     &lt;&lt;&lt; item 1
	 *     &lt;&lt;&lt; item 2
	 *       &lt;&lt;&lt;&lt; item 1
	 *       &lt;&lt;&lt;&lt; item 2
	 *         &lt;&lt;&lt;&lt;&lt; item 1
	 *         &lt;&lt;&lt;&lt;&lt; item 2
	 *           &lt;&lt;&lt;&lt;&lt;&lt; item 1
	 *           &lt;&lt;&lt;&lt;&lt;&lt; item 2
	 * ----
	 * 
	 * @return the list
	 */
	static TA_ItemizeList allLtIncremental(){
		return TA_ItemizeList.createIncremental('<', "itemize list using the character '<' for unlimited levels incremental");
	}

	/**
	 * An itemize list the character `-` for unlimited levels.
	 * 
	 * ----
	 * - item 1
	 * - item 2
	 *   - item 1
	 *   - item 2
	 *     - item 1
	 *     - item 2
	 *       - item 1
	 *       - item 2
	 *         - item 1
	 *         - item 2
	 *           - item 1
	 *           - item 2
	 * ----
	 * 
	 * @return the list
	 */
	static TA_ItemizeList allMinus(){
		return TA_ItemizeList.create('-', "itemize list using the character '-' for unlimited levels");
	}

	/**
	 * An itemize list the character `-` for unlimited levels.
	 * 
	 * ----
	 * - item 1
	 * - item 2
	 *   -- item 1
	 *   -- item 2
	 *     --- item 1
	 *     --- item 2
	 *       ---- item 1
	 *       ---- item 2
	 *         ----- item 1
	 *         ----- item 2
	 *           ------ item 1
	 *           ------ item 2
	 * ----
	 * 
	 * @return the list
	 */
	static TA_ItemizeList allMinusIncremental(){
		return TA_ItemizeList.createIncremental('-', "itemize list using the character '-' for unlimited levels incremental");
	}

	/**
	 * An itemize list the character `+` for unlimited levels.
	 * 
	 * ----
	 * + item 1
	 * + item 2
	 *   + item 1
	 *   + item 2
	 *     + item 1
	 *     + item 2
	 *       + item 1
	 *       + item 2
	 *         + item 1
	 *         + item 2
	 *           + item 1
	 *           + item 2
	 * ----
	 * 
	 * @return the list
	 */
	static TA_ItemizeList allPlus(){
		return TA_ItemizeList.create('+', "itemize list using the character '+' for unlimited levels");
	}

	/**
	 * An itemize list using the character `+` for unlimited levels.
	 * 
	 * ----
	 * + item 1
	 * + item 2
	 *   ++ item 1
	 *   ++ item 2
	 *     +++ item 1
	 *     +++ item 2
	 *       ++++ item 1
	 *       ++++ item 2
	 *         +++++ item 1
	 *         +++++ item 2
	 *           ++++++ item 1
	 *           ++++++ item 2
	 * ----
	 * 
	 * @return the list
	 */
	static TA_ItemizeList allPlusIncremental(){
		return TA_ItemizeList.createIncremental('+', "itemize list using the character '+' for unlimited levels incremental");
	}

	/**
	 * An itemize list the character `?` for unlimited levels.
	 * 
	 * ----
	 * ? item 1
	 * ? item 2
	 *   ? item 1
	 *   ? item 2
	 *     ? item 1
	 *     ? item 2
	 *       ? item 1
	 *       ? item 2
	 *         ? item 1
	 *         ? item 2
	 *           ? item 1
	 *           ? item 2
	 * ----
	 * 
	 * @return the list
	 */
	static TA_ItemizeList allQuestionMark(){
		return TA_ItemizeList.create('?', "itemize list using the character '?' for unlimited levels");
	}

	/**
	 * An itemize list the character `?` for unlimited levels.
	 * 
	 * ----
	 * ? item 1
	 * ? item 2
	 *   ?? item 1
	 *   ?? item 2
	 *     ??? item 1
	 *     ??? item 2
	 *       ???? item 1
	 *       ???? item 2
	 *         ????? item 1
	 *         ????? item 2
	 *           ?????? item 1
	 *           ?????? item 2
	 * ----
	 * 
	 * @return the list
	 */
	static TA_ItemizeList allQuestionMarkIncremental(){
		return TA_ItemizeList.createIncremental('?', "itemize list using the character '?' for unlimited levels incremental");
	}

	/**
	 * An itemize list the character `*` for unlimited levels.
	 * 
	 * ----
	 * * item 1
	 * * item 2
	 *   * item 1
	 *   * item 2
	 *     * item 1
	 *     * item 2
	 *       * item 1
	 *       * item 2
	 *         * item 1
	 *         * item 2
	 *           * item 1
	 *           * item 2
	 * ----
	 * 
	 * @return the list
	 */
	static TA_ItemizeList allStar(){
		return TA_ItemizeList.create('*', "itemize list using the character '*' for unlimited levels");
	}

	/**
	 * An itemize list the character `*` for unlimited levels.
	 * 
	 * ----
	 * * item 1
	 * * item 2
	 *   ** item 1
	 *   ** item 2
	 *     *** item 1
	 *     *** item 2
	 *       **** item 1
	 *       **** item 2
	 *         ***** item 1
	 *         ***** item 2
	 *           ****** item 1
	 *           ****** item 2
	 * ----
	 * 
	 * @return the list
	 */
	static TA_ItemizeList allStarIncremental(){
		return TA_ItemizeList.createIncremental('*', "itemize list using the character '*' for unlimited levels incremental");
	}

	/**
	 * An itemize list the character `~` for unlimited levels.
	 * 
	 * ----
	 * ~ item 1
	 * ~ item 2
	 *   ~ item 1
	 *   ~ item 2
	 *     ~ item 1
	 *     ~ item 2
	 *       ~ item 1
	 *       ~ item 2
	 *         ~ item 1
	 *         ~ item 2
	 *           ~ item 1
	 *           ~ item 2
	 * ----
	 * 
	 * @return the list
	 */
	static TA_ItemizeList allTilde(){
		return TA_ItemizeList.create('~', "itemize list using the character '~' for unlimited levels");
	}

	/**
	 * An itemize list the character `~` for unlimited levels.
	 * 
	 * ----
	 * ~ item 1
	 * ~ item 2
	 *   ~~ item 1
	 *   ~~ item 2
	 *     ~~~ item 1
	 *     ~~~ item 2
	 *       ~~~~ item 1
	 *       ~~~~ item 2
	 *         ~~~~~ item 1
	 *         ~~~~~ item 2
	 *           ~~~~~~ item 1
	 *           ~~~~~~ item 2
	 * ----
	 * 
	 * @return the list
	 */
	static TA_ItemizeList allTildeIncremental(){
		return TA_ItemizeList.createIncremental('~', "itemize list using the character '~' for unlimited levels incremental");
	}
}
