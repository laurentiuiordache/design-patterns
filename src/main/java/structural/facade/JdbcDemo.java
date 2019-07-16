package structural.facade;

import structural.facade.api.DbSingleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();

        try {
            Connection conn = instance.getConnection();

            Statement st = conn.createStatement();
            int count;// = st.executeUpdate("CREATE TABLE Address (ID INTEGER, StreetName VARCHAR(20), CIty VARCHAR(20))");
            System.out.println("Table creted.");
            st.close();

            st = conn.createStatement();
            count = st.executeUpdate("INSERT INTO Address(ID, StreetName, CIty) values (1, '1234 Some street', 'Layton')");
            System.out.println(count + "record(s) created.");
            st.close();

            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Address");

            while(rs.next()){
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
