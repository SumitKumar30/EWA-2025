import java.sql.*;
public class App {
    public static void main(String[] args) throws Exception {
        // step 1: load the driver class
        Class.forName("com.mysql.cj.jdbc.Driver");
        // step 2: create the connection object
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
        // step 3: create the statement object
        Statement stmt = con.createStatement();
        // step 4: execute the query
        ResultSet rs = stmt.executeQuery("select * from users");
        while (rs.next())
            System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
        // step 5: close the connection object
        con.close();
        
    }
}
