/**
 * 
 */
package log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

/**
 * @author phillippohl
 * @version 0.4
 */
public class FileLogger {	
	private String FILENAME			= null;
	private File log				= null;
	private BufferedReader br		= null;
	private PrintWriter pw			= null;
	private Calendar calendar		= null;
	/**
	 * Default constructor
	 */
	public FileLogger() {
		this.calendar = Calendar.getInstance();
		this.FILENAME = "logfile_" + this.calendar.get(Calendar.YEAR) + "_" + (this.calendar.get(Calendar.MONTH) + 1) + "_" + this.calendar.get(Calendar.DAY_OF_MONTH) + ".log";
		this.log = new File(FILENAME);
	}
	/**
	 * @param filename if provided, the filename for the log file
	 */
	public FileLogger(String filename) {
		this.calendar = Calendar.getInstance();
		this.FILENAME = filename + "_" + this.calendar.get(Calendar.YEAR) + "_" + (this.calendar.get(Calendar.MONTH) + 1) + "_" + this.calendar.get(Calendar.DAY_OF_MONTH) + ".log";
		this.log = new File(FILENAME);
	}
	/**
	 * @return current entries from log file
	 */
	private String readFromLog() {
		String input = "";
		System.out.println("Reading from " + FILENAME + "...");
		try {
			this.br = new BufferedReader(new FileReader(this.FILENAME));
			while(this.br.ready()){
				input += this.br.readLine() + '\n';
			}
			this.br.close();
		} catch (IOException ioe) {
			errorhandling.ChoiceStackTrace.EnableStackTrace(ioe, "Error wtihin in-/output");
		}
		System.out.println("Reading finished...");
		return input;
	}
	/**
	 * @param message to write into the log file
	 * @return check value if operation executed successfully (1) or not (-1)
	 */
	public int writeToLog(String message) {
		String input = "";
		if(log.exists()){
			input = this.readFromLog();
		}		
		System.out.println("Writing to " + FILENAME + "...");
		try {
			this.pw = new PrintWriter(new FileWriter(this.log));
			this.pw.print(input);
			this.pw.print(message);
			this.pw.flush();
			this.pw.close();
		} catch (IOException ioe) {
			errorhandling.ChoiceStackTrace.EnableStackTrace(ioe, "Error wtihin in-/output");
			return -1;
		}
		System.out.println("Writing finished...");
		return 1;
	}
}