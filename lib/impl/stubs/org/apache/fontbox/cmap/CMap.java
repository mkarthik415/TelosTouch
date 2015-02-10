/**
 * 
 * This package holds classes that are necessary to parse cmap files.
 */
package org.apache.fontbox.cmap;


/**
 *  This class represents a CMap file.
 * 
 *  @author Ben Litchfield (ben@benlitchfield.com)
 *  @version $Revision: 1.3 $
 */
public class CMap {

	/**
	 *  Creates a new instance of CMap.
	 */
	public CMap() {
	}

	/**
	 *  This will tell if this cmap has any one byte mappings.
	 *  
	 *  @return true If there are any one byte mappings, false otherwise.
	 */
	public boolean hasOneByteMappings() {
	}

	/**
	 *  This will tell if this cmap has any two byte mappings.
	 *  
	 *  @return true If there are any two byte mappings, false otherwise.
	 */
	public boolean hasTwoByteMappings() {
	}

	/**
	 *  This will tell if this cmap has any CID mappings.
	 *  
	 *  @return true If there are any CID mappings, false otherwise.
	 */
	public boolean hasCIDMappings() {
	}

	/**
	 *  This will perform a lookup into the map.
	 * 
	 *  @param code The code used to lookup.
	 *  @param offset The offset into the byte array.
	 *  @param length The length of the data we are getting.
	 * 
	 *  @return The string that matches the lookup.
	 */
	public String lookup(byte[] code, int offset, int length) {
	}

	/**
	 *  This will perform a lookup into the map.
	 * 
	 *  @param code The code used to lookup.
	 *  @param length The length of the data we are getting.
	 * 
	 *  @return The string that matches the lookup.
	 */
	public String lookup(int code, int length) {
	}

	/**
	 *  This will perform a lookup into the CID map.
	 * 
	 *  @param cid The CID used to lookup.
	 * 
	 *  @return The string that matches the lookup.
	 */
	public String lookupCID(int cid) {
	}

	/**
	 *  This will perform a lookup into the CID map.
	 * 
	 *  @param code The code used to lookup.
	 *  @param offset the offset into the array.
	 *  @param length the length of the subarray.
	 * 
	 *  @return The CID that matches the lookup.
	 */
	public int lookupCID(byte[] code, int offset, int length) {
	}

	/**
	 *  This will add a mapping.
	 * 
	 *  @param src The src to the mapping.
	 *  @param dest The dest to the mapping.
	 * 
	 *  @throws IOException if the src is invalid.
	 */
	public void addMapping(byte[] src, String dest) {
	}

	/**
	 *  This will add a CID mapping.
	 * 
	 *  @param src The CID to the mapping.
	 *  @param dest The dest to the mapping.
	 * 
	 *  @throws IOException if the src is invalid.
	 */
	public void addCIDMapping(int src, String dest) {
	}

	/**
	 *  This will add a CID Range.
	 * 
	 *  @param from starting charactor of the CID range.
	 *  @param to ending character of the CID range.
	 *  @param cid the cid to be started with.
	 */
	public void addCIDRange(char from, char to, int cid) {
	}

	/**
	 *  This will add a codespace range.
	 * 
	 *  @param range A single codespace range.
	 */
	public void addCodespaceRange(CodespaceRange range) {
	}

	/**
	 *  Getter for property codeSpaceRanges.
	 * 
	 *  @return Value of property codeSpaceRanges.
	 */
	public java.util.List getCodeSpaceRanges() {
	}

	/**
	 *  Implementation of the usecmap operator.  This will
	 *  copy all of the mappings from one cmap to another.
	 *  
	 *  @param cmap The cmap to load mappings from.
	 */
	public void useCmap(CMap cmap) {
	}

	/**
	 *   Check whether the given byte array is in codespace ranges or not.
	 *   
	 *   @param code The byte array to look for in the codespace range.
	 *   
	 *   @return true if the given byte array is in the codespace range.
	 */
	public boolean isInCodeSpaceRanges(byte[] code) {
	}

	/**
	 *   Check whether the given byte array is in codespace ranges or not.
	 *   
	 *   @param code The byte array to look for in the codespace range.
	 *   @param offset The starting offset within the byte array.
	 *   @param length The length of the part of the array.
	 *   
	 *   @return true if the given byte array is in the codespace range.
	 */
	public boolean isInCodeSpaceRanges(byte[] code, int offset, int length) {
	}

	/**
	 *  Returns the WMode of a CMap.
	 * 
	 *  0 represents a horizontal and 1 represents a vertical orientation.
	 *  
	 *  @return the wmode
	 */
	public int getWMode() {
	}

	/**
	 *  Sets the WMode of a CMap.
	 *  
	 *  @param newWMode the new WMode.
	 */
	public void setWMode(int newWMode) {
	}

	/**
	 *  Returns the name of the CMap.
	 *  
	 *  @return the CMap name.
	 */
	public String getName() {
	}

	/**
	 *  Sets the name of the CMap.
	 *  
	 *  @param name the CMap name.
	 */
	public void setName(String name) {
	}

	/**
	 *  Returns the version of the CMap.
	 *  
	 *  @return the CMap version.
	 */
	public String getVersion() {
	}

	/**
	 *  Sets the version of the CMap.
	 *  
	 *  @param version the CMap version.
	 */
	public void setVersion(String version) {
	}

	/**
	 *  Returns the type of the CMap.
	 *  
	 *  @return the CMap type.
	 */
	public int getType() {
	}

	/**
	 *  Sets the type of the CMap.
	 *  
	 *  @param type the CMap type.
	 */
	public void setType(int type) {
	}

	/**
	 *  Returns the registry of the CIDSystemInfo.
	 *  
	 *  @return the registry.
	 */
	public String getRegistry() {
	}

	/**
	 *  Sets the registry of the CIDSystemInfo.
	 *  
	 *  @param newRegistry the registry.
	 */
	public void setRegistry(String newRegistry) {
	}

	/**
	 *  Returns the ordering of the CIDSystemInfo.
	 *  
	 *  @return the ordering.
	 */
	public String getOrdering() {
	}

	/**
	 *  Sets the ordering of the CIDSystemInfo.
	 *  
	 *  @param newOrdering the ordering.
	 */
	public void setOrdering(String newOrdering) {
	}

	/**
	 *  Returns the supplement of the CIDSystemInfo.
	 *  
	 *  @return the supplement.
	 */
	public int getSupplement() {
	}

	/**
	 *  Sets the supplement of the CIDSystemInfo.
	 *  
	 *  @param newSupplement the supplement.
	 */
	public void setSupplement(int newSupplement) {
	}

	/**
	 * 
	 *  Returns the mapping for the space character.
	 *  
	 *  @return the mapped code for the space character
	 */
	public int getSpaceMapping() {
	}
}
