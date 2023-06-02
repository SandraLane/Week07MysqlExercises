/**
 * 
 */
package projects;

import java.sql.Connection;

import projects.dao.DbConnection;

/**
 * @author sandralane
 *
 */
public class Projects {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection conn = DbConnection.getConnection();

	}

}
