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
	
	public static String getStringInputWithPrompt(String message) throws IOException{		
		/**
		 * @return Method returns the user's input casted as String
		 */
		return getStringInput(prompt + message);
	}
	
	public static char getCharacterInputWithPrompt(String message) throws IOException{
		/**
		 * @return Method returns the user's input casted as character
		 */
		return getCharacterInput(prompt + message);
	}
	
	public static double getByteInputWithPrompt(String message) throws IOException{
		/**
		 * @return Method returns the user's input casted as byte
		 */
		return getByteInput(prompt + message);
	}	
	
	public static double getShortInputWithPrompt(String message) throws IOException{
		/**
		 * @return Method returns the user's input casted as short
		 */
		return getShortInput(prompt + message);
	}	
	
	public static double getIntegerInputWithPrompt(String message) throws IOException{
		/**
		 * @return Method returns the user's input casted as integer
		 */
		return getIntegerInput(prompt + message);
	}
	
	public static double getLongInputWithPrompt(String message) throws IOException{
		/**
		 * @return Method returns the user's input casted as long
		 */
		return getLongInput(prompt + message);
	}
	
	public static double getFloatInputWithPrompt(String message) throws IOException{
		/**
		 * @return Method returns the user's input casted as float
		 */
		return getFloatInput(prompt + message);
	}
	
	public static double getDoubleInputWithPrompt(String message) throws IOException{
		/**
		 * @return Method returns the user's input casted as double
		 */
		return getDoubleInput(prompt + message);
	}
}
