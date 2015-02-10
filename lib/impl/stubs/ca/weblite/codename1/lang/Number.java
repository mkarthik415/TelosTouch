package ca.weblite.codename1.lang;


/**
 *  The abstract superclass of the classes which represent numeric base types
 *  (that is {@link Byte}, {@link Short}, {@link Integer}, {@link Long},
 *  {@link Float}, and {@link Double}. 
 */
public abstract class Number {

	/**
	 *  Empty default constructor.
	 */
	public Number() {
	}

	/**
	 *  Returns this object's value as a byte. Might involve rounding and/or
	 *  truncating the value, so it fits into a byte.  
	 *  
	 *  @return the primitive byte value of this object.
	 */
	public byte byteValue() {
	}

	/**
	 *  Returns this object's value as a double. Might involve rounding.
	 *  
	 *  @return the primitive double value of this object.
	 */
	public abstract double doubleValue() {
	}

	/**
	 *  Returns this object's value as a float. Might involve rounding.
	 *  
	 *  @return the primitive float value of this object.
	 */
	public abstract float floatValue() {
	}

	/**
	 *  Returns this object's value as an int. Might involve rounding and/or
	 *  truncating the value, so it fits into an int.
	 *  
	 *  @return the primitive int value of this object.
	 */
	public abstract int intValue() {
	}

	/**
	 *  Returns this object's value as a long. Might involve rounding and/or
	 *  truncating the value, so it fits into a long.
	 *  
	 *  @return the primitive long value of this object.
	 */
	public abstract long longValue() {
	}

	/**
	 *  Returns this object's value as a short. Might involve rounding and/or
	 *  truncating the value, so it fits into a short.
	 *  
	 *  @return the primitive short value of this object.
	 */
	public short shortValue() {
	}
}
