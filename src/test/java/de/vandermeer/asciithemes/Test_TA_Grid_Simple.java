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
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test {@link TA_Grid} with a simple grid.
 *
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170331 (31-Mar-17) for Java 1.8
 * @since      v0.0.1
 */
public class Test_TA_Grid_Simple {

	/** The grid for testing. */
	private static TA_Grid tg;

	/** The table for testing. */
	private static final Collection<Object> table = new ArrayList<>();

	@BeforeClass
	public static void init() {
		tg = TA_Grid.create("test me")
				.addCharacterMap(TA_GridConfig.RULESET_NORMAL, '*', '─', '│', '┌', '┐', '└', '┘', '├', '┤', '┼', '┬', '┴')
		;

		String[] rc1 = new String[]{"aaa", "bbb", "ccc"};
		String[][] ar1 = new String[][]{rc1};

		String[] rc2 = new String[]{"ddd", "eee", "fff"};
		String[][] ar2 = new String[][]{rc2};

		table.add(TA_GridConfig.RULESET_NORMAL);
		table.add(Pair.of(TA_GridConfig.RULESET_NORMAL, ar1));
		table.add(TA_GridConfig.RULESET_NORMAL);
		table.add(Pair.of(TA_GridConfig.RULESET_NORMAL, ar2));
		table.add(TA_GridConfig.RULESET_NORMAL);
	}

	@Test public void test_Themes(){
		for(TA_GridThemes theme : TA_GridThemes.values()){
//			System.err.println(theme.name());
			this._printGrid(theme.name(), tg.addGrid(table, theme, TA_GridThemeOptions.SHOW_EMPTY_ALL));
//			this._printGrid(theme.name(), tg.addGrid(table, theme));
		}
	}

	private void _printGrid(String text, Collection<StrBuilder> grid){
		String line = "======";
		System.out.println(
				  "\n" + line + "[ " + text + " ]" + line + "\n"
				+ new StrBuilder().appendWithSeparators(grid, "\n")
				+ "\n" + line + new StrBuilder().appendPadding(text.length()+4, '=') + line + "\n"
		);
	}
}
