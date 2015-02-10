/**
 * 
 * This package holds classes used to parse CFF/Type2-Fonts (aka Type1C-Fonts).
 */
package org.apache.fontbox.cff;


/**
 *  This class represents a CID-Keyed CFF/Type2 Font.
 * 
 *  @author Villu Ruusmann
 *  @author John Hewson
 */
public class CFFFontROS extends CFFFont {

	public CFFFontROS() {
	}

	/**
	 *  Returns the registry value.
	 *  * @return the registry
	 */
	public String getRegistry() {
	}

	/**
	 *  Sets the registry value.
	 * 
	 *  @param registry the registry to set
	 */
	public void setRegistry(String registry) {
	}

	/**
	 *  Returns the ordering value.
	 * 
	 *  @return the ordering
	 */
	public String getOrdering() {
	}

	/**
	 *  Sets the ordering value.
	 * 
	 *  @param ordering the ordering to set
	 */
	public void setOrdering(String ordering) {
	}

	/**
	 *  Returns the supplement value.
	 * 
	 *  @return the supplement
	 */
	public int getSupplement() {
	}

	/**
	 *  Sets the supplement value.
	 * 
	 *  @param supplement the supplement to set
	 */
	public void setSupplement(int supplement) {
	}

	/**
	 *  Returns the font dictionaries.
	 * 
	 *  @return the fontDict
	 */
	public java.util.List getFontDict() {
	}

	/**
	 *  Sets the font dictionaries.
	 * 
	 *  @param fontDict the fontDict to set
	 */
	public void setFontDict(java.util.List fontDict) {
	}

	/**
	 *  Returns the private dictionary.
	 * 
	 *  @return the privDict
	 */
	public java.util.List getPrivDict() {
	}

	/**
	 *  Sets the private dictionary.
	 * 
	 *  @param privDict the privDict to set
	 */
	public void setPrivDict(java.util.List privDict) {
	}

	/**
	 *  Returns the fdSelect value.
	 * 
	 *  @return the fdSelect
	 */
	public CIDKeyedFDSelect getFdSelect() {
	}

	/**
	 *  Sets the fdSelect value.
	 * 
	 *  @param fdSelect the fdSelect to set
	 */
	public void setFdSelect(CIDKeyedFDSelect fdSelect) {
	}

	/**
	 *  Returns the Width value of the given Glyph identifier
	 * 
	 *  @param cid CID
	 *  @return -1 if the CID is missing from the Font.
	 *  @throws IOException
	 */
	public int getWidth(int cid) {
	}

	/**
	 *  Returns the defaultWidthX for the given CID.
	 * 
	 *  @param cid CID
	 *  @return defaultWidthX
	 */
	protected int getDefaultWidthX(int cid) {
	}

	/**
	 *  Returns the nominalWidthX for the given CID.
	 * 
	 *  @param cid CID
	 *  @return defaultWidthX
	 */
	protected int getNominalWidthX(int cid) {
	}
}
