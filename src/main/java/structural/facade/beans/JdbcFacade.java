package structural.facade.beans;

import structural.facade.api.DbSingleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {

    DbSingleton instance = null;

    public JdbcFacade() {
        instance = DbSingleton.getInstance();
    }

    public int createTabl(String sql) {
        int count = 0;

        try (Connection conn = instance.getConnection();
             Statement st = conn.createStatement();) {
            count = st.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public int insertIntoTable(int id, String streetName, String city) {
        int count = 0;

        try (Connection conn = instance.getConnection();
             Statement st = conn.createStatement();) {
            count = st.executeUpdate("INSERT INTO Address(ID, StreetName, CIty) values (" + id + ", '" + streetName + "', '" + city + "')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public List<Address> getAddresses() {
        List<Address> result = new ArrayList<>();

        try (Connection conn = instance.getConnection();
             Statement st = conn.createStatement();) {
            ResultSet rs = st.executeQuery("SELECT * FROM Address");
            while (rs.next()) {
                result.add(new Address(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }


}
