package ca.weblite.codename1.fontbox;


/**
 *  A font provider for the FontBox library that should be registered with
 *  ca.weblite.pisces.Font so that it can make use of true-type fonts loaded through
 *  fontbox.  
 *  
 *  Currently this only provides a facade for truetype fonts even though fontbox
 *  likely has support for many more kinds.  Additional types would probably require
 *  a little work to be able to generate Glyphs in teh correct format.
 *  @author shannah
 */
public class FontBoxFontProvider implements ca.weblite.pisces.Font.FontProvider {

	public FontBoxFontProvider() {
	}

	public static FontBoxFontProvider getDefaultProvider() {
	}

	/**
	 *  Returns a font that has been previously loaded into the provider in the 
	 *  specified pixel size.
	 *  @param name The name of the font (should match name provided by loadTTF()
	 *  when the font was loaded.
	 *  @param size
	 *  @return The specified font or null if it hasn't been loaded.
	 */
	public ca.weblite.pisces.Font getFont(String name, float size) {
	}

	/**
	 *  Loads a True Type font from an input stream.  This must be called before
	 *  the getFont() method will be able to retrieve the font.
	 *  @param name
	 *  @param is
	 *  @throws IOException 
	 */
	public void loadTTF(String name, java.io.InputStream is) {
	}

	public void clearFontCache() {
	}
}
