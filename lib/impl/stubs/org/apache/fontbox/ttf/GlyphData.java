/**
 * 
 * This package contains classes to parse a TTF file.
 */
package org.apache.fontbox.ttf;


/**
 *  A glyph data record in the glyf table.
 *  
 *  @author Ben Litchfield (ben@benlitchfield.com)
 *  @version $Revision: 1.1 $
 */
public class GlyphData {

	public GlyphData() {
	}

	/**
	 *  This will read the required data from the stream.
	 *  
	 *  @param ttf The font that is being read.
	 *  @param data The stream to read the data from.
	 *  @throws IOException If there is an error reading the data.
	 */
	public void initData(TrueTypeFont ttf, TTFDataStream data) {
	}

	/**
	 *  @return Returns the boundingBox.
	 */
	public org.apache.fontbox.util.BoundingBox getBoundingBox() {
	}

	/**
	 *  @param boundingBoxValue The boundingBox to set.
	 */
	public void setBoundingBox(org.apache.fontbox.util.BoundingBox boundingBoxValue) {
	}

	/**
	 *  @return Returns the numberOfContours.
	 */
	public short getNumberOfContours() {
	}

	/**
	 *  @param numberOfContoursValue The numberOfContours to set.
	 */
	public void setNumberOfContours(short numberOfContoursValue) {
	}

	/**
	 *  Returns the description of the glyph.
	 *  @return the glyph description
	 */
	public GlyphDescription getDescription() {
	}

	/**
	 *  Returns the xMax value.
	 *  @return the XMax value
	 */
	public short getXMaximum() {
	}

	/**
	 *  Returns the xMin value.
	 *  @return the xMin value
	 */
	public short getXMinimum() {
	}

	/**
	 *  Returns the yMax value.
	 *  @return the yMax value
	 */
	public short getYMaximum() {
	}

	/**
	 *  Returns the yMin value.
	 *  @return the yMin value
	 */
	public short getYMinimum() {
	}
}
