package structural.facade.api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/ocp_training";
    static final String USER ="root";
    static final String PASSWORD = "";
    static final DbSingleton instance;

    static {
        instance = new DbSingleton();
    }

    private DbSingleton(){

    }

    public static DbSingleton getInstance(){
        return instance;
    }

    public Connection getConnection(){
        Connection conn = null;

        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER,PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }
}
