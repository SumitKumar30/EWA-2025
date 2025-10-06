import java.sql.*;
public class App {
    public static void main(String[] args) throws Exception {
        // step 1: load the driver class
        Class.forName("com.mysql.cj.jdbc.Driver");

        // step 2: create the connection object
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "Admin@12345");
        
        // step 3: create the statement object
        Statement stmt = con.createStatement();

        // step 4: execute query
        ResultSet rs = stmt.executeQuery("select * from employee");


        // step 5: process the result set
        while (rs.next())
            System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3)); 
        
        while (rs.next()) {
            System.out.println(rs.getInt("employee_id" +" "+rs.getString("employee_name")));
        }
        



         // insert a new record
        String insertQuery = "insert into employee values (101, 'John Reese', 'john@zyz', 10000, 'New Delhi')";

        stmt.executeUpdate(insertQuery);


        // Update a record
		String updateQuery = "UPDATE employee set emp_address = 'Chennai' WHERE id = 101";

		stmt.executeUpdate(updateQuery);

        // step 6: close the connection object
        con.close();

    }
}
