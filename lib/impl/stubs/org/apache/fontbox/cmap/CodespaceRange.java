/**
 * 
 * This package holds classes that are necessary to parse cmap files.
 */
package org.apache.fontbox.cmap;


/**
 *  This represents a single entry in the codespace range.
 * 
 *  @author Ben Litchfield (ben@benlitchfield.com)
 *  @version $Revision: 1.1 $
 */
public class CodespaceRange {

	/**
	 *  Creates a new instance of CodespaceRange.
	 */
	public CodespaceRange() {
	}

	/**
	 * Getter for property end.
	 *  @return Value of property end.
	 */
	public byte[] getEnd() {
	}

	/**
	 * Setter for property end.
	 *  @param endBytes New value of property end.
	 */
	public void setEnd(byte[] endBytes) {
	}

	/**
	 * Getter for property start.
	 *  @return Value of property start.
	 */
	public byte[] getStart() {
	}

	/**
	 * Setter for property start.
	 *  @param startBytes New value of property start.
	 */
	public void setStart(byte[] startBytes) {
	}

	/**
	 *   Check whether the given byte array is in this codespace range or ot.
	 *   @param code The byte array to look for in the codespace range.
	 *   @param offset The starting offset within the byte array.
	 *   @param length The length of the part of the array.
	 *   
	 *   @return true if the given byte array is in the codespace range.
	 */
	public boolean isInRange(byte[] code, int offset, int length) {
	}
}
