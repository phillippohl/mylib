/**
 * 
 */
package errorhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Phillipp Ohl
 * @version 0.1
 */
public class ChoiceStackTrace {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static String input = "";
	private static boolean running = true;
	
	public static void EnableStackTrace(Exception e){
		System.out.println("Do you wish to print the stack trace (y/n)?");
		try {
			while(running){
				input = br.readLine();
				if (input.trim().equalsIgnoreCase("y")){
					e.printStackTrace();
					running = false;
				}
				else if (input.trim().equalsIgnoreCase("n")){		
					System.out.println("Goodbye!");
					running = false;
				}
				else{
					continue;
				}				
			}			
			System.exit(-1);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public static void EnableStackTrace(Exception e, String message){
		System.out.println(message);
		System.out.println();
		EnableStackTrace(e);
	}
}
