/**
 * 
 * This package holds classes used to parse AFM(Adobe Font Metrics) files.
 * <br/>
 * More information about AFM files can be found at
 * <a href="http://partners.adobe.com/asn/developer/type/">http://partners.adobe.com/asn/developer/type/</a>
 */
package org.apache.fontbox.afm;


/**
 *  This class is used to parse AFM(Adobe Font Metrics) documents.
 * 
 *  @see <A href="http://partners.adobe.com/asn/developer/type/">AFM Documentation</A>
 * 
 *  @author Ben Litchfield (ben@benlitchfield.com)
 *  
 */
public class AFMParser {

	/**
	 *  This is a comment in a AFM file.
	 */
	public static final String COMMENT = "Comment";

	/**
	 *  This is the constant used in the AFM file to start a font metrics item.
	 */
	public static final String START_FONT_METRICS = "StartFontMetrics";

	/**
	 *  This is the constant used in the AFM file to end a font metrics item.
	 */
	public static final String END_FONT_METRICS = "EndFontMetrics";

	/**
	 *  This is the font name.
	 */
	public static final String FONT_NAME = "FontName";

	/**
	 *  This is the full name.
	 */
	public static final String FULL_NAME = "FullName";

	/**
	 *  This is the Family name.
	 */
	public static final String FAMILY_NAME = "FamilyName";

	/**
	 *  This is the weight.
	 */
	public static final String WEIGHT = "Weight";

	/**
	 *  This is the font bounding box.
	 */
	public static final String FONT_BBOX = "FontBBox";

	/**
	 *  This is the version of the font.
	 */
	public static final String VERSION = "Version";

	/**
	 *  This is the notice.
	 */
	public static final String NOTICE = "Notice";

	/**
	 *  This is the encoding scheme.
	 */
	public static final String ENCODING_SCHEME = "EncodingScheme";

	/**
	 *  This is the mapping scheme.
	 */
	public static final String MAPPING_SCHEME = "MappingScheme";

	/**
	 *  This is the escape character.
	 */
	public static final String ESC_CHAR = "EscChar";

	/**
	 *  This is the character set.
	 */
	public static final String CHARACTER_SET = "CharacterSet";

	/**
	 *  This is the characters attribute.
	 */
	public static final String CHARACTERS = "Characters";

	/**
	 *  This will determine if this is a base font.
	 */
	public static final String IS_BASE_FONT = "IsBaseFont";

	/**
	 *  This is the V Vector attribute.
	 */
	public static final String V_VECTOR = "VVector";

	/**
	 *  This will tell if the V is fixed.
	 */
	public static final String IS_FIXED_V = "IsFixedV";

	/**
	 *  This is the cap height attribute.
	 */
	public static final String CAP_HEIGHT = "CapHeight";

	/**
	 *  This is the X height.
	 */
	public static final String X_HEIGHT = "XHeight";

	/**
	 *  This is ascender attribute.
	 */
	public static final String ASCENDER = "Ascender";

	/**
	 *  This is the descender attribute.
	 */
	public static final String DESCENDER = "Descender";

	/**
	 *  The underline position.
	 */
	public static final String UNDERLINE_POSITION = "UnderlinePosition";

	/**
	 *  This is the Underline thickness.
	 */
	public static final String UNDERLINE_THICKNESS = "UnderlineThickness";

	/**
	 *  This is the italic angle.
	 */
	public static final String ITALIC_ANGLE = "ItalicAngle";

	/**
	 *  This is the char width.
	 */
	public static final String CHAR_WIDTH = "CharWidth";

	/**
	 *  This will determine if this is fixed pitch.
	 */
	public static final String IS_FIXED_PITCH = "IsFixedPitch";

	/**
	 *  This is the start of character metrics.
	 */
	public static final String START_CHAR_METRICS = "StartCharMetrics";

	/**
	 *  This is the end of character metrics.
	 */
	public static final String END_CHAR_METRICS = "EndCharMetrics";

	/**
	 *  The character metrics c value.
	 */
	public static final String CHARMETRICS_C = "C";

	/**
	 *  The character metrics c value.
	 */
	public static final String CHARMETRICS_CH = "CH";

	/**
	 *  The character metrics value.
	 */
	public static final String CHARMETRICS_WX = "WX";

	/**
	 *  The character metrics value.
	 */
	public static final String CHARMETRICS_W0X = "W0X";

	/**
	 *  The character metrics value.
	 */
	public static final String CHARMETRICS_W1X = "W1X";

	/**
	 *  The character metrics value.
	 */
	public static final String CHARMETRICS_WY = "WY";

	/**
	 *  The character metrics value.
	 */
	public static final String CHARMETRICS_W0Y = "W0Y";

	/**
	 *  The character metrics value.
	 */
	public static final String CHARMETRICS_W1Y = "W1Y";

	/**
	 *  The character metrics value.
	 */
	public static final String CHARMETRICS_W = "W";

	/**
	 *  The character metrics value.
	 */
	public static final String CHARMETRICS_W0 = "W0";

	/**
	 *  The character metrics value.
	 */
	public static final String CHARMETRICS_W1 = "W1";

	/**
	 *  The character metrics value.
	 */
	public static final String CHARMETRICS_VV = "VV";

	/**
	 *  The character metrics value.
	 */
	public static final String CHARMETRICS_N = "N";

	/**
	 *  The character metrics value.
	 */
	public static final String CHARMETRICS_B = "B";

	/**
	 *  The character metrics value.
	 */
	public static final String CHARMETRICS_L = "L";

	/**
	 *  The character metrics value.
	 */
	public static final String STD_HW = "StdHW";

	/**
	 *  The character metrics value.
	 */
	public static final String STD_VW = "StdVW";

	/**
	 *  This is the start of track kern data.
	 */
	public static final String START_TRACK_KERN = "StartTrackKern";

	/**
	 *  This is the end of track kern data.
	 */
	public static final String END_TRACK_KERN = "EndTrackKern";

	/**
	 *  This is the start of kern data.
	 */
	public static final String START_KERN_DATA = "StartKernData";

	/**
	 *  This is the end of kern data.
	 */
	public static final String END_KERN_DATA = "EndKernData";

	/**
	 *  This is the start of kern pairs data.
	 */
	public static final String START_KERN_PAIRS = "StartKernPairs";

	/**
	 *  This is the end of kern pairs data.
	 */
	public static final String END_KERN_PAIRS = "EndKernPairs";

	/**
	 *  This is the start of kern pairs data.
	 */
	public static final String START_KERN_PAIRS0 = "StartKernPairs0";

	/**
	 *  This is the start of kern pairs data.
	 */
	public static final String START_KERN_PAIRS1 = "StartKernPairs1";

	/**
	 *  This is the start compisites data section.
	 */
	public static final String START_COMPOSITES = "StartComposites";

	/**
	 *  This is the end compisites data section.
	 */
	public static final String END_COMPOSITES = "EndComposites";

	/**
	 *  This is a composite character.
	 */
	public static final String CC = "CC";

	/**
	 *  This is a composite charater part.
	 */
	public static final String PCC = "PCC";

	/**
	 *  This is a kern pair.
	 */
	public static final String KERN_PAIR_KP = "KP";

	/**
	 *  This is a kern pair.
	 */
	public static final String KERN_PAIR_KPH = "KPH";

	/**
	 *  This is a kern pair.
	 */
	public static final String KERN_PAIR_KPX = "KPX";

	/**
	 *  This is a kern pair.
	 */
	public static final String KERN_PAIR_KPY = "KPY";

	/**
	 *  Constructor.
	 * 
	 *  @param in The input stream to read the AFM document from.
	 */
	public AFMParser(java.io.InputStream in) {
	}

	/**
	 *  This will parse the AFM document.  This will close the Input stream
	 *  when the parsing is finished.
	 * 
	 *  @return the parsed FontMetric
	 *  
	 *  @throws IOException If there is an IO error reading the document.
	 */
	public FontMetric parse() {
	}
}
