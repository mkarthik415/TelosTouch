/**
 * 
 * This package holds classes that are necessary to parse cmap files.
 */
package org.apache.fontbox.cmap;


/**
 *  This will parse a CMap stream.
 * 
 *  @author <a href="mailto:ben@benlitchfield.com">Ben Litchfield</a>
 *  
 */
public class CMapParser {

	/**
	 *  Creates a new instance of CMapParser.
	 */
	public CMapParser() {
	}

	/**
	 *  This will parse the stream and create a cmap object.
	 * 
	 *  @param resourceRoot The root path to the cmap file.  This will be used
	 *                      to find referenced cmap files.  It can be null.
	 *  @param input The CMAP stream to parse.
	 *  
	 *  @return The parsed stream as a java object.
	 * 
	 *  @throws IOException If there is an error parsing the stream.
	 */
	public CMap parse(String resourceRoot, java.io.InputStream input) {
	}
}
