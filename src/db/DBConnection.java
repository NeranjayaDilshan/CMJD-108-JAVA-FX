package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
private static DBConnection dbConnection;
    private Connection connection=null;
    private DBConnection() throws ClassNotFoundException, SQLException {
   Class.forName("com.mysql.jdbc.Driver");
        connection=DriverManager.
                getConnection("jdbc:mysql://localhost" +
                                ":3306/supermarket",
                        "root","4569");
     
    }

    public static DBConnection getInstance() throws SQLException, ClassNotFoundException {
            return (null==dbConnection)?
                    (dbConnection= new DBConnection()):(dbConnection);
    }

    public Connection getConnection(){return connection;}
}
