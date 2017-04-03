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

import de.vandermeer.asciithemes.TA_EnumerateList;

/**
 * Collection of {@link TA_EnumerateList} for ASCII characters.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170331 (31-Mar-17) for Java 1.8
 * @since      v0.0.1
 */
public abstract class A7_EnumerateLists {

	/**
	 * An enumerate using {@link A7_NumberingSchemes#blank()}.
	 * 
	 * ----
	 *   item 1
	 *   item 2
	 *     item 1
	 *     item 2
	 *       item 1
	 *       item 2
	 * 
	 *  item 1
	 *  item 1/2
	 *  item 1/2/3
	 *  item 1/2/3/4
	 *  item 1/2/3/4/5
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_EnumerateList blank(){
		return TA_EnumerateList.create(A7_NumberingSchemes.blank(), "enumerate list using ' ' for unlimeted levels");
	}

	/**
	 * An enumerate using {@link A7_NumberingSchemes#number()}.
	 * 
	 * ----
	 * 1 item 1
	 * 1 item 2
	 *   2 item 1
	 *   2 item 2
	 *     3 item 1
	 *     3 item 2
	 * 
	 * 1. item 1
	 * 1.2. item 1/2
	 * 1.2.3. item 1/2/3
	 * 1.2.3.4. item 1/2/3/4
	 * 1.2.3.4.5. item 1/2/3/4/5
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_EnumerateList number(){
		return TA_EnumerateList.create(A7_NumberingSchemes.number(), "enumerate list using '0-9' for unlimeted levels");
	}

	/**
	 * An enumerate using {@link A7_NumberingSchemes#alpha()}.
	 * 
	 * ----
	 * a item 1
	 * a item 2
	 *   b item 1
	 *   b item 2
	 *     c item 1
	 *     c item 2
	 * 
	 * a. item 1
	 * a.b. item 1/2
	 * a.b.c. item 1/2/3
	 * a.b.c.d. item 1/2/3/4
	 * a.b.c.d.e. item 1/2/3/4/5
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_EnumerateList alpha(){
		return TA_EnumerateList.create(A7_NumberingSchemes.alpha(), "enumerate list using 'a-z' for unlimeted levels");
	}

	/**
	 * An enumerate using {@link A7_NumberingSchemes#Alpha()}.
	 * 
	 * ----
	 * A item 1
	 * A item 2
	 *   B item 1
	 *   B item 2
	 *     C item 1
	 *     C item 2
	 * 
	 * A. item 1
	 * A.B. item 1/2
	 * A.B.C. item 1/2/3
	 * A.B.C.D. item 1/2/3/4
	 * A.B.C.D.E. item 1/2/3/4/5
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_EnumerateList Alpha(){
		return TA_EnumerateList.create(A7_NumberingSchemes.Alpha(), "enumerate list using 'A-Z' for unlimeted levels");
	}

	/**
	 * An enumerate using {@link A7_NumberingSchemes#roman()}.
	 * 
	 * ----
	 * i item 1
	 * i item 2
	 *   ii item 1
	 *   ii item 2
	 *     iii item 1
	 *     iii item 2
	 * 
	 * i. item 1
	 * i.ii. item 1/2
	 * i.ii.iii. item 1/2/3
	 * i.ii.iii.iv. item 1/2/3/4
	 * i.ii.iii.iv.v. item 1/2/3/4/5
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_EnumerateList roman(){
		return TA_EnumerateList.create(A7_NumberingSchemes.roman(), "enumerate list using Roman number literals with lower case ASCII characters for unlimeted levels");
	}

	/**
	 * An enumerate using {@link A7_NumberingSchemes#Roman()}.
	 * 
	 * ----
	 * I item 1
	 * I item 2
	 *   II item 1
	 *   II item 2
	 *     III item 1
	 *     III item 2
	 * 
	 * I. item 1
	 * I.II. item 1/2
	 * I.II.III. item 1/2/3
	 * I.II.III.IV. item 1/2/3/4
	 * I.II.III.IV.V. item 1/2/3/4/5
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_EnumerateList Roman(){
		return TA_EnumerateList.create(A7_NumberingSchemes.Roman(), "enumerate list using Roman number literals with upper case ASCII characters for unlimeted levels");
	}

	/**
	 * An enumerate using {@link A7_NumberingSchemes#number()}, {@link A7_NumberingSchemes#Alpha()}, {@link A7_NumberingSchemes#alpha()}, {@link A7_NumberingSchemes#roman()}, and {@link A7_NumberingSchemes#Roman()}.
	 * 
	 * ----
	 * 1 item 1
	 * 1 item 2
	 *   2 item 1
	 *   2 item 2
	 *     3 item 1
	 *     3 item 2
	 * 
	 * 1. item 1
	 * 1.B. item 1/2
	 * 1.B.c. item 1/2/3
	 * 1.B.c.IV. item 1/2/3/4
	 * 1.B.c.IV.v. item 1/2/3/4/5
	 * ----
	 * 
	 * @return the list
	 */
	public static TA_EnumerateList arabic_Alpha_alpha_Roman_roman(){
		return TA_EnumerateList.create(
				"enumerate list using the following schemes for 5 levels: numbers, Alpha numeric, alpha numeric, upper case Roman literals, lower case Roman literals",
				A7_NumberingSchemes.number(),
				A7_NumberingSchemes.Alpha(),
				A7_NumberingSchemes.alpha(),
				A7_NumberingSchemes.Roman(),
				A7_NumberingSchemes.roman()
		);
	}
}
