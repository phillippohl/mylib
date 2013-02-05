/**
 * 
 */
package sql;

import log.FileLogger;

/**
 * @author Phillipp Ohl
 * @version 0.1
 */
public class Connector implements SqlConnector {
	private FileLogger log			= null;
	/**
	 * Default constructor
	 */
	public Connector() {
		this.log = new FileLogger();
	}
	/**
	 * @param query that is supposed to be executed
	 * @return check value if operation was executed successfully (1) or not (-1)
	 */
	@Override
	public int createTable(String query) {
		// TODO Auto-generated method stub
		return 1;
	}
	/**
	 * @param query that is supposed to be executed
	 * @return check value if operation was executed successfully (1) or not (-1)
	 */
	@Override
	public int dropTable(String query) {
		// TODO Auto-generated method stub
		return 0;
	}
	/**
	 * @param query that is supposed to be executed
	 * @return check value if operation was executed successfully (1) or not (-1)
	 */
	@Override
	public int executeQuery(String query) {
		// TODO Auto-generated method stub
		return 0;
	}
	/**
	 * @param query that is supposed to be executed
	 * @return check value if operation was executed successfully (1) or not (-1)
	 */
	@Override
	public int insert(String query) {
		// TODO Auto-generated method stub
		return 0;
	}
	/**
	 * @param query that is supposed to be executed
	 * @return selected row from database
	 */
	@Override
	public String select(String query) {
		// TODO Auto-generated method stub
		return null;
	}
}