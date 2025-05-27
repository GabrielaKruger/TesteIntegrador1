
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 * @author thatiane.galvan
 */
public class SimpleDBConnection {

    private final String url = "jdbc:postgresql://192.168.180.60:5432/mbcentral";
    private final String user = "postgres";
    private final String pwd = "ctv$#3264";
    private final Connection conn;

    public SimpleDBConnection() throws Exception {
//		Class.forName("org.postgresql.Driver"); // force driver load
        conn = DriverManager.getConnection(url, user, pwd);
    }

    public ResultSet runQuery(String query) throws Exception {
        return conn.prepareStatement(query).executeQuery();
    }

    public void close() throws Exception {
        conn.close();
    }

}
