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
 * Left and right border pair.
 * 
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170404 (04-Apr-17) for Java 1.8
 * @since      v0.0.1
 */
public interface TA_Border extends IsTextArt {

	/**
	 * Returns the border.
	 * @param mode the mode for processing a corner (use one of {@link #MODE_LEFT}, {@link #MODE_RIGHT})
	 * @return border
	 */
	default StrBuilder getBorder(int mode){
		return this.getBorder(mode, null);
	}

	/**
	 * Returns the border.
	 * @param mode the mode for processing a corner (use one of {@link #MODE_LEFT}, {@link #MODE_RIGHT})
	 * @param builder builder to append the border to, new builder will be created if null
	 * @return border
	 */
	StrBuilder getBorder(int mode, StrBuilder builder);

	/**
	 * Returns the border.
	 * @param mode the mode for processing a corner (use one of {@link #MODE_LEFT}, {@link #MODE_RIGHT})
	 * @return border
	 */
	default String getBorderAsString(int mode){
		return this.getBorder(mode).toString();
	}

	/**
	 * Returns the border.
	 * @param mode the mode for processing a corner (use one of {@link #MODE_LEFT}, {@link #MODE_RIGHT})
	 * @param builder builder to append the border to, new builder will be created if null
	 * @return border
	 */
	default String getBorderAsString(int mode, StrBuilder builder){
		return this.getBorder(mode, builder).toString();
	}

	/** Mode for processing the left border. */
	static int MODE_LEFT     = 1;

	/** Mode for processing the right border. */
	static int MODE_RIGHT    = 2;
}
