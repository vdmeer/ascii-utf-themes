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

import org.apache.commons.lang3.text.StrBuilder;

/**
 * Corner tuple (top left, top right, bottom left, bottom right).
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 160319 (19-Mar-16) for Java 1.8
 * @since      v0.0.1
 */
public interface TA_Corner extends IsTextArt {

	/**
	 * Returns the corner.
	 * @param mode the mode for processing a corner (use one of {@link #MODE_TOP_LEFT}, {@link #MODE_TOP_RIGHT}, {@link #MODE_BOTTOM_LEFT}, {@link #MODE_BOTTOM_RIGHT})
	 * @return corner
	 */
	default StrBuilder getCorner(int mode){
		return this.getCorner(mode, null);
	}

	/**
	 * Returns the corner.
	 * @param mode the mode for processing a corner (use one of {@link #MODE_TOP_LEFT}, {@link #MODE_TOP_RIGHT}, {@link #MODE_BOTTOM_LEFT}, {@link #MODE_BOTTOM_RIGHT})
	 * @param builder builder to append the corner to, new builder will be created if null
	 * @return corner
	 */
	StrBuilder getCorner(int mode, StrBuilder builder);

	/**
	 * Returns the corner.
	 * @param mode the mode for processing a corner (use one of {@link #MODE_TOP_LEFT}, {@link #MODE_TOP_RIGHT}, {@link #MODE_BOTTOM_LEFT}, {@link #MODE_BOTTOM_RIGHT})
	 * @return corner
	 */
	default String getCornerAsString(int mode){
		return this.getCorner(mode).toString();
	}

	/**
	 * Returns the corner.
	 * @param mode the mode for processing a corner (use one of {@link #MODE_TOP_LEFT}, {@link #MODE_TOP_RIGHT}, {@link #MODE_BOTTOM_LEFT}, {@link #MODE_BOTTOM_RIGHT})
	 * @param builder builder to append the corner to, new builder will be created if null
	 * @return corner
	 */
	default String getCornerAsString(int mode, StrBuilder builder){
		return this.getCorner(mode, builder).toString();
	}

	/** Mode for processing the top left corner. */
	static int MODE_TOP_LEFT     = 1;

	/** Mode for processing the top right corner. */
	static int MODE_TOP_RIGHT    = 2;

	/** Mode for processing the bottom left corner. */
	static int MODE_BOTTOM_LEFT  = 3;

	/** Mode for processing the bottom right corner. */
	static int MODE_BOTTOM_RIGHT = 4;
}
