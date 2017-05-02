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

import de.vandermeer.asciithemes.TA_Border_Strings;
import de.vandermeer.asciithemes.TA_Corner_Strings;
import de.vandermeer.asciithemes.TA_Frame;
import de.vandermeer.asciithemes.TA_Line_String;

/**
 * Collection of {@link TA_Frame} for resembling comments in various languages.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170404 (04-Apr-17) for Java 1.8
 * @since      v0.0.1
 */
public interface A7_Frames_Doc {

	/**
	 * A frame for bash style comments.
	 * 
	 * @return the frame
	 */
	static TA_Frame bash(){
		return TA_Frame.create(
				TA_Line_String.create("", "empty line"),
				TA_Corner_Strings.create("", "", "", "", "corner tuple for a bash comment"),
				TA_Border_Strings.create("# ", "", "border pair for a bash comment"),
				"a frame for bash style comments"
		);
	}

	/**
	 * A frame for bash style comments with a double hashmark start.
	 * 
	 * @return the frame
	 */
	static TA_Frame bashStart2Hash(){
		return TA_Frame.create(
				TA_Line_String.create("", "empty line"),
				TA_Corner_Strings.create("", "", "", "", "corner tuple for a bash comment"),
				TA_Border_Strings.create("## ", "", "border pair for a bash comment"),
				"a frame for bash style comments with a double hashmark start"
		);
	}

	/**
	 * A frame for bash style comments with a double hashmark start and top/bottom line.
	 * 
	 * @return the frame
	 */
	static TA_Frame bashStart2HashTB(){
		return TA_Frame.create(
				TA_Line_String.create("", "empty line"),
				TA_Corner_Strings.create("##", "", "##", "", "corner tuple for a bash comment"),
				TA_Border_Strings.create("## ", "", "border pair for a bash comment"),
				"a frame for bash style comments with a double hashmark start and top/bottom line"
		);
	}

	/**
	 * A frame for bash style comments with top/bottom lines.
	 * 
	 * @return the frame
	 */
	static TA_Frame bashTB(){
		return TA_Frame.create(
				TA_Line_String.create("", "empty line"),
				TA_Corner_Strings.create("# ", "", "# ", "", "corner tuple for a bash comment"),
				TA_Border_Strings.create("# ", "", "border pair for a bash comment"),
				"a frame for bash style comments with top/bottom lines"
		);
	}

	/**
	 * A frame for HTML style comments.
	 * 
	 * @return the frame
	 */
	static TA_Frame html(){
		return TA_Frame.create(
				TA_Line_String.create("", "empty line"),
				TA_Corner_Strings.create("", "", "", "", "corner tuple for an HTML comment"),
				TA_Border_Strings.create("<!-- ", " -->", "border pair for an HTML comment"),
				"a frame for HTML style comments"
		);
	}

	/**
	 * A frame for HTML style comments with top/bottom line.
	 * 
	 * @return the frame
	 */
	static TA_Frame htmlTB(){
		return TA_Frame.create(
				TA_Line_String.create(" ", "blank line"),
				TA_Corner_Strings.create("<!-- ", " -->", "<!-- ", " -->", "corner tuple for an HTML comment"),
				TA_Border_Strings.create("<!-- ", " -->", "border pair for an HTML comment"),
				"a frame for HTML style comments with top/bottom line"
		);
	}

	/**
	 * A frame for LaTeX style comments.
	 * 
	 * @return the frame
	 */
	static TA_Frame latex(){
		return TA_Frame.create(
				TA_Line_String.create("", "empty line"),
				TA_Corner_Strings.create("", "", "", "", "corner tuple for a LaTeX comment"),
				TA_Border_Strings.create("% ", "", "border pair for a LaTeX comment"),
				"a frame for LaTeX style comments"
		);
	}

	/**
	 * A frame for LaTeX style comments with a double percent start.
	 * 
	 * @return the frame
	 */
	static TA_Frame latexStart2Percent(){
		return TA_Frame.create(
				TA_Line_String.create("", "empty line"),
				TA_Corner_Strings.create("", "", "", "", "corner tuple for a LaTeX comment"),
				TA_Border_Strings.create("%% ", "", "border pair for a LaTeX comment"),
				"a frame for LaTeX style comments with a double percent start"
		);
	}

	/**
	 * A frame for LaTeX style comments with a double percent start and top/bottom line.
	 * 
	 * @return the frame
	 */
	static TA_Frame latexStart2PercentTB(){
		return TA_Frame.create(
				TA_Line_String.create("", "empty line"),
				TA_Corner_Strings.create("%%", "", "%%", "", "corner tuple for a LaTeX comment"),
				TA_Border_Strings.create("%% ", "", "border pair for a LaTeX comment"),
				"a frame for LaTeX style comments with a double percent start and top/bottom line"
		);
	}

	/**
	 * A frame for LaTeX style comments with top/bottom lines.
	 * 
	 * @return the frame
	 */
	static TA_Frame latexTB(){
		return TA_Frame.create(
				TA_Line_String.create("", "empty line"),
				TA_Corner_Strings.create("% ", "", "% ", "", "corner tuple for a LaTeX comment"),
				TA_Border_Strings.create("% ", "", "border pair for a LaTeX comment"),
				"a frame for LaTeX style comments with top/bottom lines"
		);
	}

	/**
	 * A frame for multi-line Java/C++ style comments using `/` and `*`.
	 * 
	 * @return the frame
	 */
	static TA_Frame multiLine(){
		return TA_Frame.create(
				TA_Line_String.create("", "empty line"),
				TA_Corner_Strings.create("/*", "", " */", "", "corner tuple for a multi-line comment"),
				TA_Border_Strings.create(" * ", "", "border pair for a multi-line comment"),
				"a frame for multi-line Java/C++ style comments using `/` and `*`"
		);
	}

	/**
	 * A frame for Javadoc style multi-line comments using `/` and `*`.
	 * 
	 * @return the frame
	 */
	static TA_Frame multiLineJavaDoc(){
		return TA_Frame.create(
				TA_Line_String.create("", "empty line"),
				TA_Corner_Strings.create("/**", "", " */", "", "corner tuple for a multi-line comment"),
				TA_Border_Strings.create(" * ", "", "border pair for a multi-line comment"),
				"a frame for Javadoc style multi-line comments using `/` and `*`"
		);
	}

	/**
	 * A frame for single-line Java/C++ style comments using `//`.
	 * 
	 * @return the frame
	 */
	static TA_Frame singleLine(){
		return TA_Frame.create(
				TA_Line_String.create("", "empty line"),
				TA_Corner_Strings.create("//", "", "//", "", "corner tuple for a multi-line comment"),
				TA_Border_Strings.create("// ", "", "border pair for a multi-line comment"),
				"a frame for single-line Java/C++ style comments using `//`"
		);
	}
}
