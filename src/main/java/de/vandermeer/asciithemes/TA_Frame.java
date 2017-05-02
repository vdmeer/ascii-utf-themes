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

import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.text.StrBuilder;

/**
 * A frame (box) using ASCII and/or UTF characters.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170404 (04-Apr-17) for Java 1.8
 * @since      v0.0.1
 */
public interface TA_Frame extends IsTextArt {

	/**
	 * Creates a new frame theme using the same top/bottom lines.
	 * @param line the frame top/bottom line
	 * @param corner the frame corner
	 * @param border the frame border
	 * @param description a description for the line, cannot be blank
	 * @return new frame theme
	 */
	static TA_Frame create(final TA_Line line, final TA_Corner corner, final TA_Border border, final String description){
		Validate.notNull(line);
		Validate.notNull(corner);
		Validate.notNull(border);
		Validate.notBlank(description);

		return new TA_Frame() {
			@Override
			public TA_Border getBorder() {
				return border;
			}

			@Override
			public TA_Line getBottomline() {
				return line;
			}

			@Override
			public TA_Corner getCorner() {
				return corner;
			}

			@Override
			public String getDescription(){
				return description;
			}

			@Override
			public TA_Line getTopline() {
				return line;
			}
		};
	}

	/**
	 * Creates a new frame theme using different lines and the same top/bottom corners.
	 * @param topline the frame top line
	 * @param bottomline the frame bottom line
	 * @param corner the frame corner
	 * @param border the frame border
	 * @param description a description for the line, cannot be blank
	 * @return new frame theme
	 */
	static TA_Frame create(final TA_Line topline, final TA_Line bottomline, final TA_Corner corner, final TA_Border border, final String description){
		Validate.notNull(topline);
		Validate.notNull(bottomline);
		Validate.notNull(corner);
		Validate.notNull(border);
		Validate.notBlank(description);

		return new TA_Frame() {
			@Override
			public TA_Border getBorder() {
				return border;
			}

			@Override
			public TA_Line getBottomline() {
				return bottomline;
			}

			@Override
			public TA_Corner getCorner() {
				return corner;
			}

			@Override
			public String getDescription(){
				return description;
			}

			@Override
			public TA_Line getTopline() {
				return topline;
			}
		};
	}

	/**
	 * Changes the input collection by adding a frame.
	 * The return list will have
	 * - one line added as first element with the frame top line,
	 * - one line added at the end with the frame bottom line, and
	 * - for each original element border characters will be added left and right.
	 * 
	 * The methods assumes that all line (members of the collection) have the same length.
	 * 
	 * The following exceptions apply:
	 * 
	 * - top line will not be added if the frame does not define a top line nor top corners
	 * - bottom line will not be added if the frame does not define a bottom line nor bottom corners
	 * - left borders will only be added if the frame defines a border with left border character
	 * - right borders will only be added if the frame defines a border with right border character
	 * 
	 * The method does guarantee that all lines (member of the final collection) have the same length.
	 * 
	 * @param coll the collection to add a frame to
	 * @param mode options for the frame
	 * @return new list with frame
	 */
	default ArrayList<StrBuilder> addFrame(Collection<StrBuilder> coll, int mode){
		Validate.notNull(coll);
		Validate.noNullElements(coll);
		int width = 0;
		for(StrBuilder sb : coll){
			width = sb.length();
		}

		ArrayList<StrBuilder> ret = new ArrayList<>();
		if(TA_FrameOptions.someTopCharacters(mode)){
			// first, all clear to add topline
			StrBuilder top = this.renderTopLine(mode, width);
			if(top.length()>0){
				ret.add(top);
			}
		}

		for(StrBuilder sb : coll){
			// add border
			if(TA_FrameOptions.borderLeft(mode)){
				sb.insert(0, this.getBorder().getBorder(TA_Border.MODE_LEFT));
			}
			else if(TA_FrameOptions.borderLeftNeeded(mode)){
				sb.insert(0, new StrBuilder().appendPadding(this.getBorder().getBorder(TA_Border.MODE_LEFT).length(), ' '));
			}
			if(TA_FrameOptions.borderRight(mode)){
				sb.append(this.getBorder().getBorder(TA_Border.MODE_RIGHT));
			}
			else if(TA_FrameOptions.borderRightNeeded(mode)){
				sb.appendPadding(this.getBorder().getBorder(TA_Border.MODE_RIGHT).length(), ' ');
			}
			ret.add(sb);
		}

		// add bottom line
		if(TA_FrameOptions.someBottomCharacters(mode)){
			StrBuilder bottom = this.renderBottomLine(mode, width);
			if(bottom.length()>0){
				ret.add(bottom);
			}
		}

		return ret;
	}

	/**
	 * Returns a string containing the input collection with the requested frame.
	 * @param coll input collection
	 * @param mode frame mode
	 * @return string with the framed collection
	 */
	default String addFrameString(Collection<StrBuilder> coll, int mode){
		return new StrBuilder().appendWithSeparators(this.addFrame(coll, mode), "\n").toString();
	}

	/**
	 * Returns the border for the frame.
	 * @return frame border, cannot be null
	 */
	TA_Border getBorder();

	/**
	 * Returns the bottom line of the theme.
	 * @return line character, cannot be null
	 */
	TA_Line getBottomline();

	/**
	 * Returns the corner.
	 * @return corner, cannot be null
	 */
	TA_Corner getCorner();

	/**
	 * Returns the top line of the theme.
	 * @return line character, cannot be null
	 */
	TA_Line getTopline();

	/**
	 * Renders a bottom line for the frame.
	 * @param mode the frame mode
	 * @param width the width of lines in the frame
	 * @return a builder with bottom line, empty if none was created
	 */
	default StrBuilder renderBottomLine(int mode, int width){
		StrBuilder ret = new StrBuilder(width);
		if(TA_FrameOptions.cornerBottomLeft(mode)){
			ret.append(this.getCorner().getCorner(TA_Corner.MODE_BOTTOM_LEFT));
		}
		else if(TA_FrameOptions.cornerBottomLeftNeeded(mode)){
			ret.appendPadding(this.getCorner().getCorner(TA_Corner.MODE_BOTTOM_LEFT).length(), ' ');
		}
		if(TA_FrameOptions.lineBottom(mode)){
			ret.append(this.getBottomline().getLine(width));
		}
		else if(TA_FrameOptions.lineBottomNeeded(mode)){
			ret.appendPadding(width, ' ');
		}
		if(TA_FrameOptions.cornerBottomRight(mode)){
			ret.append(this.getCorner().getCorner(TA_Corner.MODE_BOTTOM_RIGHT));
		}
		else if(TA_FrameOptions.cornerBottomRightNeeded(mode)){
			ret.appendPadding(this.getCorner().getCorner(TA_Corner.MODE_BOTTOM_RIGHT).length(), ' ');
		}
		return ret;
	}

	/**
	 * Renders a top line for the frame.
	 * @param mode the frame mode
	 * @param width the width of lines in the frame
	 * @return a builder with top line, empty if none was created
	 */
	default StrBuilder renderTopLine(int mode, int width){
		StrBuilder ret = new StrBuilder(width);
		// for TLC, TL and TRC check if corner is wanted, then do corner
		// else -> check if any other relevant setting is done (other left for TLC, other Top for TL, other right for TRC)
		//2 important cases: (a)something is set for top line, (b)nothing is set for top line

		if(TA_FrameOptions.cornerTopLeft(mode)){
			ret.append(this.getCorner().getCorner(TA_Corner.MODE_TOP_LEFT));
		}
		else if(TA_FrameOptions.cornerTopLeftNeeded(mode)){
			ret.appendPadding(this.getCorner().getCorner(TA_Corner.MODE_TOP_LEFT).length(), ' ');
		}
		if(TA_FrameOptions.lineTop(mode)){
			ret.append(this.getTopline().getLine(width));
		}
		else if(TA_FrameOptions.lineTopNeeded(mode)){
			ret.appendPadding(this.getTopline().getLine(width).length(), ' ');
		}
		if(TA_FrameOptions.cornerTopRight(mode)){
			ret.append(this.getCorner().getCorner(TA_Corner.MODE_TOP_RIGHT));
		}
		else if(TA_FrameOptions.cornerTopRightNeeded(mode)){
			ret.appendPadding(this.getCorner().getCorner(TA_Corner.MODE_TOP_RIGHT).length(), ' ');
		}
		return ret;
	}

	@Override
	default StrBuilder toDoc() {
		ArrayList<StrBuilder> doc = new ArrayList<>();
		doc.add(new StrBuilder(18).append("Lorem ipsum dolor"));
		doc.add(new StrBuilder(18).append("Lorem ipsum dolor"));
		return new StrBuilder().appendWithSeparators(this.addFrame(doc, TA_FrameOptions.THEME_FULL_FRAME), "\n");
	}
}
