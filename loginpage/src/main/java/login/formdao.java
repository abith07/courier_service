package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class formdao {
	
	    Connection con;
	    PreparedStatement pst;
	    ResultSet rs;

	    public formdao() {
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


    public void storeData(Form fff) {
        String sql = "insert into ordertable (firstname, lastname, username, email, address, address2, country, state, district, pincode,  productinfo,deliverytype,paymentmethods) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try  {
        	pst=con.prepareStatement(sql);
            pst.setString(1, fff.getFirstName());
            pst.setString(2, fff.getLastName());
            pst.setString(3, fff.getUsername());
            pst.setString(4, fff.getEmail());
            pst.setString(5, fff.getAddress());
            pst.setString(6, fff.getAddress1());
            pst.setString(7, fff.getContact());
            pst.setString(8, fff.getState());
            pst.setString(9, fff.getDate());
            pst.setInt(10, fff.getPin());
            pst.setString(11, fff.getPinf());
            pst.setString(12, fff.getDtv());
            pst.setString(13, fff.getPaymentMethod());

            pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
