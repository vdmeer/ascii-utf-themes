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
import org.junit.Test;

import de.vandermeer.asciithemes.u8.U8_Frames;

/**
 * Test {@link TA_Frame}.
 *
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170331 (31-Mar-17) for Java 1.8
 * @since      v0.0.1
 */
public class Test_TA_Frame {

	@Test
	public void test_Options(){
		TA_Frame frame = U8_Frames.borderLight();
		System.out.println(frame.toDoc());
		System.out.println();

		System.out.println(frame.addFrameString(this.getTestCollection(), TA_FrameOptions.THEME_FULL_FRAME));
		System.out.println();

		System.out.println(frame.addFrameString(this.getTestCollection(), TA_FrameOptions.THEME_LINE_TOPBOTTOM));
		System.out.println();

		System.out.println(frame.addFrameString(this.getTestCollection(), TA_FrameOptions.THEME_BORDERS_ONLY));
		System.out.println();

		System.out.println(frame.addFrameString(this.getTestCollection(), TA_FrameOptions.THEME_LINES_ONLY));
		System.out.println();

		System.out.println(frame.addFrameString(this.getTestCollection(), TA_FrameOptions.THEME_CORNERS_ONLY));
		System.out.println();

		System.out.println(frame.addFrameString(this.getTestCollection(), TA_FrameOptions.OPT_LINE_TOP));
		System.out.println();

		System.out.println(frame.addFrameString(this.getTestCollection(), TA_FrameOptions.OPT_BORDER_RIGHT));
		System.out.println();
	}

	protected Collection<StrBuilder> getTestCollection(){
		ArrayList<StrBuilder> ret = new ArrayList<>();
		ret.add(new StrBuilder().append("Lorem ipsum"));
		ret.add(new StrBuilder().append("Lorem ipsum"));
		ret.add(new StrBuilder().append("Lorem ipsum"));
		return ret;
	}
}
