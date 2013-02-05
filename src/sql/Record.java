/**
 * 
 */
package sql;

/**
 * @author Phillipp Ohl
 * @version 0.1
 */
public class Record {
	protected static int globalId	= 0;
	protected int recordId			= 0;
	/**
	 * 
	 */
	public Record() {
		setId();
	}
	
	protected void setId(){
		recordId = globalId;
		globalId++;
	}
}
