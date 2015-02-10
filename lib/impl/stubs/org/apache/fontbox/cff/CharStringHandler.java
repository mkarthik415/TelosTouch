/**
 * 
 * This package holds classes used to parse CFF/Type2-Fonts (aka Type1C-Fonts).
 */
package org.apache.fontbox.cff;


/**
 *  A Handler for CharStringCommands.
 * 
 *  @author Villu Ruusmann
 *  
 */
public abstract class CharStringHandler {

	public CharStringHandler() {
	}

	/**
	 *  Handler for a sequence of CharStringCommands.
	 * 
	 *  @param sequence of CharStringCommands
	 */
	@java.lang.SuppressWarnings("unchecked")
	public void handleSequence(java.util.List sequence) {
	}

	/**
	 *  Handler for CharStringCommands.
	 * 
	 *  @param numbers a list of numbers
	 *  @param command the CharStringCommand
	 */
	public abstract void handleCommand(java.util.List numbers, CharStringCommand command) {
	}
}
