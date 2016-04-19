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

import de.vandermeer.asciithemes.TA_CheckedItem;

/**
 * Collection of {@link TA_CheckedItem} for ASCII characters.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 160319 (19-Mar-16) for Java 1.8
 * @since      v0.0.1
 */
public abstract class A7_CheckedItems {

	/**
	 * A checked item using `[X]` and `[ ]`.
	 * 
	 * ----
	 * [X] checked item
	 * [ ] unchecked item
	 * ----
	 * 
	 * @return the checked item
	 */
	public static TA_CheckedItem sbrX(){
		return TA_CheckedItem.create("[X]", "[ ]", "checked item using \"[X]\" and \"[ ]\"");
	}

	/**
	 * A checked item using `[x]` and `[ ]`.
	 * 
	 * ----
	 * [x] checked item
	 * [ ] unchecked item
	 * ----
	 * 
	 * @return the checked item
	 */
	public static TA_CheckedItem sbrx(){
		return TA_CheckedItem.create("[x]", "[ ]", "checked item using \"[x]\" and \"[ ]\"");
	}

	/**
	 * A checked item using `{X}` and `{ }`.
	 * 
	 * ----
	 * {X} checked item
	 * { } unchecked item
	 * ----
	 * 
	 * @return the checked item
	 */
	public static TA_CheckedItem cbrX(){
		return TA_CheckedItem.create("{X}", "{ }", "checked item using \"{X}\" and \"{ }\"");
	}

	/**
	 * A checked item using `{x}` and `{ }`.
	 * 
	 * ----
	 * {x} checked item
	 * { } unchecked item
	 * ----
	 * 
	 * @return the checked item
	 */
	public static TA_CheckedItem cbrx(){
		return TA_CheckedItem.create("{x}", "{ }", "checked item using \"{x}\" and \"{ }\"");
	}

	/**
	 * A checked item using `(X)` and `( )`.
	 * 
	 * ----
	 * (X) checked item
	 * ( ) unchecked item
	 * ----
	 * 
	 * @return the checked item
	 */
	public static TA_CheckedItem brX(){
		return TA_CheckedItem.create("(X)", "( )", "checked item using \"(X)\" and \"( )\"");
	}

	/**
	 * A checked item using `(x)` and `( )`.
	 * 
	 * ----
	 * (x) checked item
	 * ( ) unchecked item
	 * ----
	 * 
	 * @return the checked item
	 */
	public static TA_CheckedItem brx(){
		return TA_CheckedItem.create("(x)", "( )", "checked item using \"(x)\" and \"( )\"");
	}

	/**
	 * A checked item using `&lt;X&gt;` and `&lt; &gt;`.
	 * 
	 * ----
	 * &lt;X&gt; checked item
	 * &lt; &gt; unchecked item
	 * ----
	 * 
	 * @return the checked item
	 */
	public static TA_CheckedItem gtltX(){
		return TA_CheckedItem.create("<X>", "< >", "checked item using \"<X>\" and \"< >\"");
	}

	/**
	 * A checked item using `&lt;x&gt;` and `&lt; &gt;`.
	 * 
	 * ----
	 * &lt;x&gt; checked item
	 * &lt; &gt; unchecked item
	 * ----
	 * 
	 * @return the checked item
	 */
	public static TA_CheckedItem gtltx(){
		return TA_CheckedItem.create("<x>", "< >", "checked item using \"<x>\" and \"< >\"");
	}
}
