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

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test {@link TA_GridConfig}.
 *
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 160319 (19-Mar-16) for Java 1.8
 * @since      v0.0.1
 */
public class Test_TA_GridConfig {

	@Test
	public void test_Silly(){
		assertEquals(1, TA_GridConfig.TYPE_UP);
		assertEquals(2, TA_GridConfig.TYPE_DOWN);
		assertEquals(4, TA_GridConfig.TYPE_LEFT);
		assertEquals(8, TA_GridConfig.TYPE_RIGHT);

		assertEquals(TA_GridConfig.TYPEPOS_HORIZONTAL, TA_GridConfig.TYPE_LEFT | TA_GridConfig.TYPE_RIGHT);
		assertEquals(12, TA_GridConfig.TYPE_LEFT | TA_GridConfig.TYPE_RIGHT);

		assertEquals(TA_GridConfig.TYPEPOS_VERTICAL, TA_GridConfig.TYPE_UP | TA_GridConfig.TYPE_DOWN);
		assertEquals(3, TA_GridConfig.TYPE_UP | TA_GridConfig.TYPE_DOWN);

		assertEquals(TA_GridConfig.TYPEPOS_TOP_LEFT, TA_GridConfig.TYPE_RIGHT | TA_GridConfig.TYPE_DOWN);
		assertEquals(10, TA_GridConfig.TYPE_RIGHT | TA_GridConfig.TYPE_DOWN);

		assertEquals(TA_GridConfig.TYPEPOS_TOP_RIGHT, TA_GridConfig.TYPE_LEFT | TA_GridConfig.TYPE_DOWN);
		assertEquals(6, TA_GridConfig.TYPE_LEFT | TA_GridConfig.TYPE_DOWN);

		assertEquals(TA_GridConfig.TYPEPOS_BOTTOM_LEFT, TA_GridConfig.TYPE_RIGHT | TA_GridConfig.TYPE_UP);
		assertEquals(9, TA_GridConfig.TYPE_RIGHT | TA_GridConfig.TYPE_UP);

		assertEquals(TA_GridConfig.TYPEPOS_BOTTOM_RIGHT, TA_GridConfig.TYPE_LEFT | TA_GridConfig.TYPE_UP);
		assertEquals(5, TA_GridConfig.TYPE_LEFT | TA_GridConfig.TYPE_UP);

		assertEquals(TA_GridConfig.TYPEPOS_MID_LEFT, TA_GridConfig.TYPE_RIGHT | TA_GridConfig.TYPE_UP | TA_GridConfig.TYPE_DOWN);
		assertEquals(11, TA_GridConfig.TYPE_RIGHT | TA_GridConfig.TYPE_UP | TA_GridConfig.TYPE_DOWN);

		assertEquals(TA_GridConfig.TYPEPOS_MID_RIGHT, TA_GridConfig.TYPE_LEFT | TA_GridConfig.TYPE_UP | TA_GridConfig.TYPE_DOWN);
		assertEquals(7, TA_GridConfig.TYPE_LEFT | TA_GridConfig.TYPE_UP | TA_GridConfig.TYPE_DOWN);

		assertEquals(TA_GridConfig.TYPEPOS_MID_BOTH, TA_GridConfig.TYPE_LEFT | TA_GridConfig.TYPE_RIGHT | TA_GridConfig.TYPE_UP | TA_GridConfig.TYPE_DOWN);
		assertEquals(15, TA_GridConfig.TYPE_LEFT | TA_GridConfig.TYPE_RIGHT | TA_GridConfig.TYPE_UP | TA_GridConfig.TYPE_DOWN);

		assertEquals(TA_GridConfig.TYPEPOS_MID_DOWN, TA_GridConfig.TYPE_LEFT | TA_GridConfig.TYPE_RIGHT | TA_GridConfig.TYPE_DOWN);
		assertEquals(14, TA_GridConfig.TYPE_LEFT | TA_GridConfig.TYPE_RIGHT | TA_GridConfig.TYPE_DOWN);

		assertEquals(TA_GridConfig.TYPEPOS_MID_UP, TA_GridConfig.TYPE_LEFT | TA_GridConfig.TYPE_RIGHT | TA_GridConfig.TYPE_UP);
		assertEquals(13, TA_GridConfig.TYPE_LEFT | TA_GridConfig.TYPE_RIGHT | TA_GridConfig.TYPE_UP);
	}
}
