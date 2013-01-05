/**
 * 
 */
package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Phillipp Ohl
 * @version 0.1
 */
public class BasicInput {

	/**
	 * @param args
	 */
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static String getStringInput(String message) throws IOException{
		System.out.println(message);
		String result = br.readLine();
		/**
		 * @return Method returns the user's input casted as String
		 */
		return result;
	}
	
	public static char getCharacterInput(String message) throws IOException{
		System.out.println(message);
		char result = (char) br.read();	
		/**
		 * @return Method returns the user's input casted as character
		 */
		return result;
	}
	
	public static double getByteInput(String message) throws IOException{
		System.out.println(message);
		String resultStr = br.readLine();
		byte result = Byte.valueOf(resultStr).byteValue();
		/**
		 * @return Method returns the user's input casted as byte
		 */
		return result;
	}
	
	public static double getShortInput(String message) throws IOException{
		System.out.println(message);
		String resultStr = br.readLine();
		short result = Short.valueOf(resultStr).shortValue();
		/**
		 * @return Method returns the user's input casted as short
		 */
		return result;
	}
	
	public static double getIntegerInput(String message) throws IOException{
		System.out.println(message);
		String resultStr = br.readLine();
		int result = Integer.valueOf(resultStr).intValue();
		/**
		 * @return Method returns the user's input casted as integer
		 */
		return result;
	}
	
	public static double getLongInput(String message) throws IOException{
		System.out.println(message);
		String resultStr = br.readLine();
		long result = Long.valueOf(resultStr).longValue();
		/**
		 * @return Method returns the user's input casted as long
		 */
		return result;
	}
	
	public static double getFloatInput(String message) throws IOException{
		System.out.println(message);
		String resultStr = br.readLine();
		float result = Float.valueOf(resultStr).floatValue();
		/**
		 * @return Method returns the user's input casted as float
		 */
		return result;
	}
	
	public static double getDoubleInput(String message) throws IOException{
		System.out.println(message);
		String resultStr = br.readLine();
		double result = Double.valueOf(resultStr).doubleValue();
		/**
		 * @return Method returns the user's input casted as double
		 */
		return result;
	}
}
