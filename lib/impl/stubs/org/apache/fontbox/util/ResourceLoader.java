/**
 * 
 * This package contains utility classes used by various font types.
 */
package org.apache.fontbox.util;


/**
 *  This class will handle loading resource files(AFM/CMAP).  This was originally
 *  written for PDFBox but FontBox uses it as well.  For now each project will
 *  have their own version.
 * 
 *  @author <a href="mailto:ben@benlitchfield.com">Ben Litchfield</a>
 *  @version $Revision: 1.1 $
 */
public class ResourceLoader {

	/**
	 *  This will attempt to load the resource given the resource name.
	 * 
	 *  @param resourceName The resource to try and load.
	 * 
	 *  @return The resource as a stream or null if it could not be found.
	 *  
	 *  @throws IOException If there is an error while attempting to load the resource.
	 */
	public static java.io.InputStream loadResource(String resourceName) {
	}
}
