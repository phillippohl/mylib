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
 * @version 0.6
 */
public class FileLogger {	
	protected String filename						= null;
	protected final static String DEFAULT_FILENAME	= "logfile";
	protected File log								= null;
	protected BufferedReader br						= null;
	protected PrintWriter pw						= null;
	protected Calendar calendar						= null;
	/**
	 * Default constructor
	 */
	public FileLogger() {
		this.createFile(DEFAULT_FILENAME);
	}
	/**
	 * @param filename for the log file
	 */
	public FileLogger(String filename) {
		this.createFile(filename);
	}
	/**
	 * @param filename for the log file
	 * @return name of created file
	 */
	protected String createFile(String filename){
		this.calendar = Calendar.getInstance();
		this.filename = filename + "_" + this.calendar.get(Calendar.YEAR) + "_" + (this.calendar.get(Calendar.MONTH) + 1) + "_" + this.calendar.get(Calendar.DAY_OF_MONTH) + ".log";
		this.log = new File(this.filename);
		return this.filename;
	}
	/**
	 * @return current entries from log file
	 */
	protected String readFromLog() {
		String input = "";
		System.out.println("Reading from " + this.filename + "...");
		try {
			this.br = new BufferedReader(new FileReader(this.filename));
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
	 * @return check value if operation was executed successfully (1) or not (-1)
	 */
	public int writeToLog(String message) {
		String input = "";
		if(log.exists()){
			input = this.readFromLog();
		}		
		System.out.println("Writing to " + this.filename + "...");
		try {
			this.pw = new PrintWriter(new FileWriter(this.log));
			this.pw.print(input);
			this.pw.print(getTimeStamp() + " " + message);
			this.pw.flush();
			this.pw.close();
		} catch (IOException ioe) {
			errorhandling.ChoiceStackTrace.EnableStackTrace(ioe, "Error wtihin in-/output");
			return -1;
		}
		System.out.println("Writing finished...");
		return 1;
	}
	/**
	 * @param message to write into the log file
	 * @param category that message belongs to
	 */
	public void writeToLog(String message, int category) {
		message = this.addCategory(category) + " " + message;
		this.writeToLog(message);
	}
	/**
	 * @return current time stamp
	 */
	protected String getTimeStamp(){
		String timeStamp = "";
		timeStamp = "[" + this.calendar.get(Calendar.HOUR_OF_DAY) + ":" + this.calendar.get(Calendar.MINUTE) + ":" + this.calendar.get(Calendar.SECOND) + "]";
		return timeStamp;
	}
	/**
	 * @param categoryNumber to specify the message's category
	 * @return derived category from specified number
	 */
	protected String addCategory(int categoryNumber){
		String category = "";
		switch(categoryNumber){
		case 0:
			category = LogCategory.INFO;
			break;
		case 1:
			category = LogCategory.ERROR;
			break;
		default:
			category = LogCategory.UNKNOWN;
			break;
		}
		return category;
	}
}