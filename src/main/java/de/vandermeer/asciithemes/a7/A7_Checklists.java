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

import de.vandermeer.asciithemes.TA_Checklist;

/**
 * Collection of {@link TA_Checklist} for ASCII characters.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170331 (31-Mar-17) for Java 1.8
 * @since      v0.0.1
 */
public abstract class A7_Checklists {

	/**
	 * A checklist using {@link A7_CheckedItems#brX()} for unlimited levels.
	 * 
	 * ----
	 * (X) checked item
	 * ( ) unchecked item
	 *   (X) checked item
	 *   ( ) unchecked item
	 *     (X) checked item
	 *     ( ) unchecked item
	 *       (X) checked item
	 *       ( ) unchecked item
	 *         (X) checked item
	 *         ( ) unchecked item
	 *           (X) checked item
	 *           ( ) unchecked item
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_Checklist brX(){
		return TA_Checklist.create(A7_CheckedItems.brX(), "checklist using \"(X)\" and \"( )\" for unlimited levels");
	}

	/**
	 * A checklist using {@link A7_CheckedItems#brx()} for unlimited levels.
	 * 
	 * ----
	 * (x) checked item
	 * ( ) unchecked item
	 *   (x) checked item
	 *   ( ) unchecked item
	 *     (x) checked item
	 *     ( ) unchecked item
	 *       (x) checked item
	 *       ( ) unchecked item
	 *         (x) checked item
	 *         ( ) unchecked item
	 *           (x) checked item
	 *           ( ) unchecked item
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_Checklist brx(){
		return TA_Checklist.create(A7_CheckedItems.brx(), "checklist using \"(x)\" and \"( )\" for unlimited levels");
	}

	/**
	 * A checklist using {@link A7_CheckedItems#sbrX()} for unlimited levels.
	 * 
	 * ----
	 * [X] checked item
	 * [ ] unchecked item
	 *   [X] checked item
	 *   [ ] unchecked item
	 *     [X] checked item
	 *     [ ] unchecked item
	 *       [X] checked item
	 *       [ ] unchecked item
	 *         [X] checked item
	 *         [ ] unchecked item
	 *           [X] checked item
	 *           [ ] unchecked item
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_Checklist sbrX(){
		return TA_Checklist.create(A7_CheckedItems.sbrX(), "checklist using \"[X]\" and \"[ ]\" for unlimited levels");
	}

	/**
	 * A checklist using {@link A7_CheckedItems#sbrx()} for unlimited levels.
	 * 
	 * ----
	 * [x] checked item
	 * [ ] unchecked item
	 *   [x] checked item
	 *   [ ] unchecked item
	 *     [x] checked item
	 *     [ ] unchecked item
	 *       [x] checked item
	 *       [ ] unchecked item
	 *         [x] checked item
	 *         [ ] unchecked item
	 *           [x] checked item
	 *           [ ] unchecked item
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_Checklist sbrx(){
		return TA_Checklist.create(A7_CheckedItems.sbrx(), "checklist using \"[x]\" and \"[ ]\" for unlimited levels");
	}

	/**
	 * A checklist using {@link A7_CheckedItems#cbrX()} for unlimited levels.
	 * 
	 * ----
	 * {X} checked item
	 * { } unchecked item
	 *   {X} checked item
	 *   { } unchecked item
	 *     {X} checked item
	 *     { } unchecked item
	 *       {X} checked item
	 *       { } unchecked item
	 *         {X} checked item
	 *         { } unchecked item
	 *           {X} checked item
	 *           { } unchecked item
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_Checklist cbrX(){
		return TA_Checklist.create(A7_CheckedItems.cbrX(), "checklist using \"{X}\" and \"{ }\" for unlimited levels");
	}

	/**
	 * A checklist using {@link A7_CheckedItems#cbrx()} for unlimited levels.
	 * 
	 * ----
	 * {x} checked item
	 * { } unchecked item
	 *   {x} checked item
	 *   { } unchecked item
	 *     {x} checked item
	 *     { } unchecked item
	 *       {x} checked item
	 *       { } unchecked item
	 *         {x} checked item
	 *         { } unchecked item
	 *           {x} checked item
	 *           { } unchecked item
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_Checklist cbrx(){
		return TA_Checklist.create(A7_CheckedItems.cbrx(), "checklist using \"{x}\" and \"{ }\" for unlimited levels");
	}

	/**
	 * A checklist using {@link A7_CheckedItems#gtltX()} for unlimited levels.
	 * 
	 * ----
	 * &lt;X&gt; checked item
	 * &lt; &gt; unchecked item
	 *   &lt;X&gt; checked item
	 *   &lt; &gt; unchecked item
	 *     &lt;X&gt; checked item
	 *     &lt; &gt; unchecked item
	 *       &lt;X&gt; checked item
	 *       &lt; &gt; unchecked item
	 *         &lt;X&gt; checked item
	 *         &lt; &gt; unchecked item
	 *           &lt;X&gt; checked item
	 *           &lt; &gt; unchecked item
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_Checklist gtltX(){
		return TA_Checklist.create(A7_CheckedItems.gtltX(), "checklist using \"<X>\" and \"< >\" for unlimited levels");
	}

	/**
	 * A checklist using mixed styles for 4 levels.
	 * 
	 * ----
	 * [X] checked item
	 * [ ] unchecked item
	 *   {X} checked item
	 *   { } unchecked item
	 *     (X) checked item
	 *     ( ) unchecked item
	 *       &lt;X&gt; checked item
	 *       &lt; &gt; unchecked item
	 * 
	 * @return the list
	 */
	public static TA_Checklist gtltx(){
		return TA_Checklist.create(A7_CheckedItems.gtltx(), "checklist using \"<x>\" and \"< >\" for unlimited levels");
	}

	public static TA_Checklist mix(){
		return TA_Checklist.create("checklist using mixed styles for 4 levels", A7_CheckedItems.sbrX(), A7_CheckedItems.cbrX(), A7_CheckedItems.brX(), A7_CheckedItems.gtltX());
	}
}
