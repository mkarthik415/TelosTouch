/**
 * 
 * This package contains utility classes used by various font types.
 */
package org.apache.fontbox.util;


/**
 *  This is an implementation of a bounding box.  This was originally written for the
 *  AMF parser.
 * 
 *  @author Ben Litchfield (ben@benlitchfield.com)
 *  @version $Revision: 1.1 $
 */
public class BoundingBox {

	/**
	 *  Default constructor.
	 */
	public BoundingBox() {
	}

	/**
	 *  Constructor.
	 *  
	 *  @param minX lower left x value
	 *  @param minY lower left y value
	 *  @param maxX upper right x value
	 *  @param maxY upper right y value
	 */
	public BoundingBox(float minX, float minY, float maxX, float maxY) {
	}

	/**
	 *  Getter for property lowerLeftX.
	 * 
	 *  @return Value of property lowerLeftX.
	 */
	public float getLowerLeftX() {
	}

	/**
	 *  Setter for property lowerLeftX.
	 * 
	 *  @param lowerLeftXValue New value of property lowerLeftX.
	 */
	public void setLowerLeftX(float lowerLeftXValue) {
	}

	/**
	 *  Getter for property lowerLeftY.
	 * 
	 *  @return Value of property lowerLeftY.
	 */
	public float getLowerLeftY() {
	}

	/**
	 *  Setter for property lowerLeftY.
	 * 
	 *  @param lowerLeftYValue New value of property lowerLeftY.
	 */
	public void setLowerLeftY(float lowerLeftYValue) {
	}

	/**
	 *  Getter for property upperRightX.
	 * 
	 *  @return Value of property upperRightX.
	 */
	public float getUpperRightX() {
	}

	/**
	 *  Setter for property upperRightX.
	 * 
	 *  @param upperRightXValue New value of property upperRightX.
	 */
	public void setUpperRightX(float upperRightXValue) {
	}

	/**
	 *  Getter for property upperRightY.
	 * 
	 *  @return Value of property upperRightY.
	 */
	public float getUpperRightY() {
	}

	/**
	 *  Setter for property upperRightY.
	 * 
	 *  @param upperRightYValue New value of property upperRightY.
	 */
	public void setUpperRightY(float upperRightYValue) {
	}

	/**
	 *  This will get the width of this rectangle as calculated by
	 *  upperRightX - lowerLeftX.
	 * 
	 *  @return The width of this rectangle.
	 */
	public float getWidth() {
	}

	/**
	 *  This will get the height of this rectangle as calculated by
	 *  upperRightY - lowerLeftY.
	 * 
	 *  @return The height of this rectangle.
	 */
	public float getHeight() {
	}

	/**
	 *  Checks if a point is inside this rectangle.
	 *  
	 *  @param x The x coordinate.
	 *  @param y The y coordinate.
	 *  
	 *  @return true If the point is on the edge or inside the rectangle bounds. 
	 */
	public boolean contains(float x, float y) {
	}

	/**
	 *  Checks if a point is inside this rectangle.
	 *  
	 *  @param point The point to check
	 *  
	 *  @return true If the point is on the edge or inside the rectangle bounds. 
	 */
	public boolean contains(com.codename1.ui.geom.Point point) {
	}

	/**
	 *  This will return a string representation of this rectangle.
	 * 
	 *  @return This object as a string.
	 */
	public String toString() {
	}
}
