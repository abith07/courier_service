package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class registerdao {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public registerdao() {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/image", "root", "root");
            System.out.println("Connection established successfully.");

        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Failed to establish a database connection.");
            e.printStackTrace();
        }
    }

    public void storedata(register x) {
        String Sql = "insert into img(username, pwd) values(?, ?)";
        try {
            pst = con.prepareStatement(Sql);
            pst.setString(1, x.getUsername());
            pst.setString(2, x.getPassword());
            pst.executeUpdate();
            System.out.println("Data stored successfully.");

        } catch (SQLException e) {
            System.err.println("Failed to execute update.");
            e.printStackTrace();
        }
    }
}
