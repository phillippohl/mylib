/**
 * 
 */
package log;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Phillipp
 * @version 0.1
 */
public class MessageLog {
	
	private String FILENAME;
	private File log;
	private PrintWriter pw;
	
	/**
	 * 
	 */
	public MessageLog() {
		this.FILENAME = "logfile.log";
		this.log = new File(FILENAME);
	}
	
	/**
	 * @param filename If provided, the filename for the log file
	 */
	public MessageLog(String filename) {
		this.FILENAME = filename;
		this.log = new File(FILENAME);
	}
	
	void create() {
		System.out.println("Creating log file...");
		try {
			this.pw = new PrintWriter(new FileWriter(log));
		} catch (IOException ioe) {
			errorhandling.ChoiceStackTrace.EnableStackTrace(ioe, "Error wtihin in-/output");
		}
		System.out.println("Creation finished...");
	}
}