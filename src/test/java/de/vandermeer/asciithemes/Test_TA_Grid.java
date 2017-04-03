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

import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.lang3.text.StrBuilder;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.Test;

/**
 * Test {@link TA_Grid}.
 *
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170331 (31-Mar-17) for Java 1.8
 * @since      v0.0.1
 */
public class Test_TA_Grid {

	@Test
	public void test_2By2(){
		TA_Grid tg = TA_Grid.create("test me")
				.addCharacterMap(TA_GridConfig.RULESET_NORMAL, ' ', '═', '║', '╔', '╗', '╚', '╝', '╠', '╣', '╬', '╦', '╩')
		;

		String[] col1 = new String[]{"abcd21", "efgh22", "ijkl"};
		String[] row1 = new String[]{"mnop11", "qrst12", "uvwx"};
		String[][] ar1 = new String[][]{row1, col1};

		String[] col2 = new String[]{"row2  ", "y1234567123"};
		String[] row2 = new String[]{"row1  ", "z1234567123"};
		String[][] ar2 = new String[][]{row2, col2};

		Collection<Object> coll = new ArrayList<>();
		coll.add(TA_GridConfig.RULESET_NORMAL);
		coll.add(Pair.of(TA_GridConfig.RULESET_NORMAL, ar1));
		coll.add(TA_GridConfig.RULESET_NORMAL);
		coll.add(Pair.of(TA_GridConfig.RULESET_NORMAL, ar2));
		coll.add(TA_GridConfig.RULESET_NORMAL);

		this._printGrid(tg.addGrid(coll, TA_GridThemes.FULL));
//		this._printGrid(tg.addGrid(coll, TA_GridOptions.THEME_OUTSIDE));
//		this._printGrid(tg.addGrid(coll, TA_GridOptions.THEME_INSIDE));
//		this._printGrid(tg.addGrid(coll, TA_GridOptions.THEME_INSIDE_HORIZONTAL));
//		this._printGrid(tg.addGrid(coll, TA_GridOptions.THEME_HORIZONTAL));
//		this._printGrid(tg.addGrid(coll, TA_GridOptions.THEME_BOTTOM));
//		this._printGrid(tg.addGrid(coll, TA_GridOptions.THEME_TOP));
//		this._printGrid(tg.addGrid(coll, TA_GridOptions.THEME_TOPBOTTOM));
//		this._printGrid(tg.addGrid(coll, TA_GridOptions.THEME_LINE_TOPBOTTOM));
//		this._printGrid(tg.addGrid(coll, TA_GridOptions.THEME_BOTTOM));
//		this._printGrid(tg.addGrid(coll, TA_GridOptions.THEME_CORNERS_ONLY));
//		this._printGrid(tg.addGrid(coll, TA_GridOptions.THEME_CC_ONLY));
//		this._printGrid(tg.addGrid(coll, TA_GridOptions.THEME_VERTICAL));
//		this._printGrid(tg.addGrid(coll, TA_GridOptions.THEME_INSIDE_VERTICAL));
//		this._printGrid(tg.addGrid(coll, TA_GridOptions.THEME_NO_GRID));

//		System.err.println(map);
	}

	@Test
	public void test_ToDoc(){
		TA_Grid tg = TA_Grid.create("test to doc")
				.addCharacterMap(TA_GridConfig.RULESET_NORMAL, ' ', '═', '║', '╔', '╗', '╚', '╝', '╠', '╣', '╬', '╦', '╩')
		;

		String[] row1 = new String[]{"top row col span 3, single line "};
		String[][] ar1 = new String[][]{row1};

		String[] row2 = new String[]{"second row col1", "second row col2 "};
		String[][] ar2 = new String[][]{row2};

		String[] col3 = new String[]{"r3, c1, l1", "r3, c2, l1", "r3, c3, l1"};
		String[] row3 = new String[]{"r3, c1, l2", "r3, c2, l2", "r3, c3, l2"};
		String[][] ar3 = new String[][]{row3, col3};

		Collection<Object> coll = new ArrayList<>();
		coll.add(TA_GridConfig.RULESET_NORMAL);
		coll.add(Pair.of(TA_GridConfig.RULESET_NORMAL, ar1));
		coll.add(TA_GridConfig.RULESET_NORMAL);
		coll.add(Pair.of(TA_GridConfig.RULESET_NORMAL, ar2));
		coll.add(TA_GridConfig.RULESET_NORMAL);
		coll.add(Pair.of(TA_GridConfig.RULESET_NORMAL, ar3));
		coll.add(TA_GridConfig.RULESET_NORMAL);

		this._printGrid(tg.addGrid(coll, TA_GridThemes.FULL));
//		this._printGrid(tg.addGrid(coll, TA_GridOptions.THEME_OUTSIDE));
//		this._printGrid(tg.addGrid(coll, TA_GridOptions.THEME_INSIDE));
//		this._printGrid(tg.addGrid(coll, TA_GridOptions.THEME_INSIDE_HORIZONTAL));
//		this._printGrid(tg.addGrid(coll, TA_GridOptions.THEME_HORIZONTAL));
//		this._printGrid(tg.addGrid(coll, TA_GridOptions.THEME_CORNERS_ONLY));
//		this._printGrid(tg.addGrid(coll, TA_GridOptions.THEME_CC_ONLY));
//		this._printGrid(tg.addGrid(coll, TA_GridOptions.THEME_VERTICAL));
//		this._printGrid(tg.addGrid(coll, TA_GridOptions.THEME_INSIDE_VERTICAL));
//		this._printGrid(tg.addGrid(coll, TA_GridOptions.THEME_NO_GRID));

//		System.err.println(map);
	}

	private void _printGrid(Collection<StrBuilder> grid){
		System.out.println(
				  "\n***************************************************************************\n"
				+ new StrBuilder().appendWithSeparators(grid, "\n")
				+ "\n***************************************************************************\n\n"
		);
	}
}
