/**
 * 
 * This package contains classes to parse a TTF file.
 */
package org.apache.fontbox.ttf;


/**
 *  A class to hold true type font information.
 *  
 *  @author Ben Litchfield (ben@benlitchfield.com)
 *  @version $Revision: 1.2 $
 */
public class TrueTypeFont {

	/**
	 *  Close the underlying resources.
	 *  
	 *  @throws IOException If there is an error closing the resources.
	 */
	public void close() {
	}

	/**
	 *  @return Returns the version.
	 */
	public float getVersion() {
	}

	/**
	 *  @param versionValue The version to set.
	 */
	public void setVersion(float versionValue) {
	}

	/**
	 *  Add a table definition.
	 *  
	 *  @param table The table to add.
	 */
	public void addTable(TTFTable table) {
	}

	/**
	 *  Get all of the tables.
	 *  
	 *  @return All of the tables.
	 */
	public java.util.Collection getTables() {
	}

	/**
	 *  This will get the naming table for the true type font.
	 *  
	 *  @return The naming table.
	 */
	public NamingTable getNaming() {
	}

	/**
	 *  Get the postscript table for this TTF.
	 *  
	 *  @return The postscript table.
	 */
	public PostScriptTable getPostScript() {
	}

	/**
	 *  Get the OS/2 table for this TTF.
	 *  
	 *  @return The OS/2 table.
	 */
	public OS2WindowsMetricsTable getOS2Windows() {
	}

	/**
	 *  Get the maxp table for this TTF.
	 *  
	 *  @return The maxp table.
	 */
	public MaximumProfileTable getMaximumProfile() {
	}

	/**
	 *  Get the head table for this TTF.
	 *  
	 *  @return The head table.
	 */
	public HeaderTable getHeader() {
	}

	/**
	 *  Get the hhea table for this TTF.
	 *  
	 *  @return The hhea table.
	 */
	public HorizontalHeaderTable getHorizontalHeader() {
	}

	/**
	 *  Get the hmtx table for this TTF.
	 *  
	 *  @return The hmtx table.
	 */
	public HorizontalMetricsTable getHorizontalMetrics() {
	}

	/**
	 *  Get the loca table for this TTF.
	 *  
	 *  @return The loca table.
	 */
	public IndexToLocationTable getIndexToLocation() {
	}

	/**
	 *  Get the glyf table for this TTF.
	 *  
	 *  @return The glyf table.
	 */
	public GlyphTable getGlyph() {
	}

	/**
	 *  Get the cmap table for this TTF.
	 *  
	 *  @return The cmap table.
	 */
	public CMAPTable getCMAP() {
	}

	public ca.weblite.pisces.Font getFont(String asName, float size) {
	}

	/**
	 *  This permit to get the data of the True Type Font
	 *  program representing the stream used to build this 
	 *  object (normally from the TTFParser object).
	 *  
	 *  @return COSStream True type font program stream
	 *  
	 *  @throws IOException If there is an error getting the font data.
	 */
	public java.io.InputStream getOriginalData() {
	}
}
