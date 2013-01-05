/**
 * 
 */
package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Phillipp Ohl
 *
 */
public class BasicInput {

	/**
	 * @param args
	 */
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static String getStringInput(String message) throws IOException{
		System.out.println(message);
		String result = br.readLine();
		return result;
	}
	
	public static char getCharacterInput(String message) throws IOException{
		System.out.println(message);
		char result = (char) br.read();	
		return result;
	}
	
	public static double getByteInput(String message) throws IOException{
		System.out.println(message);
		String resultStr = br.readLine();
		byte result = Byte.valueOf(resultStr).byteValue();
		return result;
	}
	
	public static double getShortInput(String message) throws IOException{
		System.out.println(message);
		String resultStr = br.readLine();
		short result = Short.valueOf(resultStr).shortValue();
		return result;
	}
	
	public static double getIntegerInput(String message) throws IOException{
		System.out.println(message);
		String resultStr = br.readLine();
		int result = Integer.valueOf(resultStr).intValue();
		return result;
	}
	
	public static double getLongInput(String message) throws IOException{
		System.out.println(message);
		String resultStr = br.readLine();
		long result = Long.valueOf(resultStr).longValue();
		return result;
	}
	
	public static double getFloatInput(String message) throws IOException{
		System.out.println(message);
		String resultStr = br.readLine();
		float result = Float.valueOf(resultStr).floatValue();
		return result;
	}
	
	public static double getDoubleInput(String message) throws IOException{
		System.out.println(message);
		String resultStr = br.readLine();
		double result = Double.valueOf(resultStr).doubleValue();
		return result;
	}
}
