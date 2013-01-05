/**
 * 
 */
package io;

import java.io.IOException;

/**
 * @author Phillipp Ohl
 *
 */
public class BasicInputWithPrompt extends BasicInput {

	/**
	 * 
	 */
	public BasicInputWithPrompt() {
		// TODO Auto-generated constructor stub
	}
	
	private static String prompt = "> ";
	
	public static String getStringInputWithPrompt(String message) throws IOException{		
		return getStringInput(prompt + message);
	}
	
	public static char getCharacterInputWithPrompt(String message) throws IOException{
		return getCharacterInput(prompt + message);
	}
	
	public static double getByteInputWithPrompt(String message) throws IOException{
		return getByteInput(prompt + message);
	}	
	
	public static double getShortInputWithPrompt(String message) throws IOException{
		return getShortInput(prompt + message);
	}	
	
	public static double getIntegerInputWithPrompt(String message) throws IOException{
		return getIntegerInput(prompt + message);
	}
	
	public static double getLongInputWithPrompt(String message) throws IOException{
		return getLongInput(prompt + message);
	}
	
	public static double getFloatInputWithPrompt(String message) throws IOException{
		return getFloatInput(prompt + message);
	}
	
	public static double getDoubleInputWithPrompt(String message) throws IOException{
		return getDoubleInput(prompt + message);
	}
}
