/**
 * 
 */
package io;

import java.io.IOException;

/**
 * @author Phillipp Ohl
 * @version 0.1
 */
public class BasicInputWithPrompt extends BasicInput {

	/**
	 * 
	 */
	public BasicInputWithPrompt() {
		
	}
	
	private static String prompt = "> ";
	
	/**
	 * @param message The message, which is supposed to be printed to the command line 
	 * in order to guide the user's input
	 * @return Method returns the user's input casted as String
	 */
	public static String getStringInputWithPrompt(String message) throws IOException{		
		/**
		 * @return Method returns the user's input casted as String
		 */
		return getStringInput(prompt + message);
	}
	
	/**
	 * @param message The message, which is supposed to be printed to the command line 
	 * in order to guide the user's input
	 * @return Method returns the user's input casted as character
	 */
	public static char getCharacterInputWithPrompt(String message) throws IOException{
		/**
		 * @return Method returns the user's input casted as character
		 */
		return getCharacterInput(prompt + message);
	}
	
	/**
	 * @param message The message, which is supposed to be printed to the command line 
	 * in order to guide the user's input
	 * @return Method returns the user's input casted as byte
	 */
	public static double getByteInputWithPrompt(String message) throws IOException{
		/**
		 * @return Method returns the user's input casted as byte
		 */
		return getByteInput(prompt + message);
	}	
	
	/**
	 * @param message The message, which is supposed to be printed to the command line 
	 * in order to guide the user's input
	 * @return Method returns the user's input casted as short
	 */
	public static double getShortInputWithPrompt(String message) throws IOException{
		/**
		 * @return Method returns the user's input casted as short
		 */
		return getShortInput(prompt + message);
	}	
	
	/**
	 * @param message The message, which is supposed to be printed to the command line 
	 * in order to guide the user's input
	 * @return Method returns the user's input casted as integer
	 */
	public static double getIntegerInputWithPrompt(String message) throws IOException{
		/**
		 * @return Method returns the user's input casted as integer
		 */
		return getIntegerInput(prompt + message);
	}
	
	/**
	 * @param message The message, which is supposed to be printed to the command line 
	 * in order to guide the user's input
	 * @return Method returns the user's input casted as long
	 */
	public static double getLongInputWithPrompt(String message) throws IOException{
		/**
		 * @return Method returns the user's input casted as long
		 */
		return getLongInput(prompt + message);
	}
	
	/**
	 * @param message The message, which is supposed to be printed to the command line 
	 * in order to guide the user's input
	 * @return Method returns the user's input casted as float
	 */
	public static double getFloatInputWithPrompt(String message) throws IOException{
		/**
		 * @return Method returns the user's input casted as float
		 */
		return getFloatInput(prompt + message);
	}
	
	/**
	 * @param message The message, which is supposed to be printed to the command line 
	 * in order to guide the user's input
	 * @return Method returns the user's input casted as double
	 */
	public static double getDoubleInputWithPrompt(String message) throws IOException{
		/**
		 * @return Method returns the user's input casted as double
		 */
		return getDoubleInput(prompt + message);
	}
}
