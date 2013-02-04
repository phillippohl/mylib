/**
 * 
 */
package sql;

/**
 * @author Phillipp Ohl
 * @version 0.1
 */
public interface SqlConnector {
	public int createTable(String query);
	public int dropTable(String query);
	public int executeQuery(String query);
	public int insert(String query);
	public String select(String query);
}
