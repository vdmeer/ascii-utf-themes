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

import java.lang.reflect.InvocationTargetException;

import org.junit.Test;

import de.vandermeer.asciithemes.TA_Numbering;

/**
 * Test {@link U8_NumberingSchemes}, the roman literals.
 *
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170331 (31-Mar-17) for Java 1.8
 * @since      v0.0.1
 */
public class Test_U8_NumberingRoman {

	@Test
	public void test_romanNumberForms() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		TA_Numbering num = U8_NumberingSchemes.romanNumberForms();
		for(int i=1; i<31; i++){
			System.out.println(num.getNumber(i));
		}
	}

	@Test
	public void test_RomanNumberForms() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		TA_Numbering num = U8_NumberingSchemes.RomanNumberForms();
		for(int i=1; i<31; i++){
			System.out.println(num.getNumber(i));
		}
	}
}
