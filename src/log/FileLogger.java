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

/**
 * @author Phillipp
 * @version 0.2
 */
public class FileLogger {
	
	private String FILENAME;
	private File log;
	private BufferedReader br;
	private PrintWriter pw;
	/**
	 * Default constructor
	 */
	public FileLogger() {
		this.FILENAME = "logfile.log";
		this.log = new File(FILENAME);
	}
	/**
	 * @param filename if provided, the filename for the log file
	 */
	public FileLogger(String filename) {
		this.FILENAME = filename;
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
	 * @return check value if operation executed successfully
	 */
	public int writeToLog(String message) {
		String input = this.readFromLog();
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
	
	public static void main(String[] args){
		FileLogger m = new FileLogger();
		m.writeToLog("Hello World!");
	}
}