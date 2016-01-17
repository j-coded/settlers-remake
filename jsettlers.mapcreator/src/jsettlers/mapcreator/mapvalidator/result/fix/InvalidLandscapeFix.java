/*******************************************************************************
 * Copyright (c) 2015 - 2016
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 *******************************************************************************/
package jsettlers.mapcreator.mapvalidator.result.fix;

import javax.swing.JPopupMenu;

import jsettlers.common.position.ShortPoint2D;

/**
 * Fixes the landscape height
 * 
 * @author Andreas Butti
 *
 */
public class InvalidLandscapeFix extends AbstractFix {

	/**
	 * Constructor
	 */
	public InvalidLandscapeFix() {
	}

	public void addPosition(ShortPoint2D p) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isFixAvailable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public JPopupMenu getPopupMenu() {
		// TODO Auto-generated method stub
		return null;
	}

}
