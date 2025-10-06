import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcStatementsDemo {
	public static void main(String[] args) {
        String url  = "jdbc:mysql://localhost:3306/employee_db?useSSL=false";
        String user = "root";
        String pass = "Admin@12345";

        Connection conn = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // 1. Connect
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected to DB!");

            // 2. Create table
            stmt = conn.createStatement();
            stmt.execute("DROP TABLE IF EXISTS users");
            stmt.execute("CREATE TABLE users (id INT PRIMARY KEY AUTO_INCREMENT, username VARCHAR(50), password VARCHAR(50))");

            // 3. Insert one user
            stmt.executeUpdate("INSERT INTO users(username, password) VALUES('alice', 'alice123')");
            System.out.println("Inserted demo user: alice / alice123");

            // 4. Login attempt with Statement (UNSAFE)
            String userInput = "alice' OR '1'='1"; // malicious username
            String passInput = "wrong";
            String sql = "SELECT * FROM users WHERE username='" + userInput + "' AND password='" + passInput + "'";
            System.out.println("\n[Statement] Executing: " + sql);
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                System.out.println("Statement login SUCCESS → vulnerable to SQL Injection!");
            } else {
                System.out.println("Statement login FAILED");
            }
            rs.close();

            // 5. Login attempt with PreparedStatement (SAFE)
            String sql2 = "SELECT * FROM users WHERE username=? AND password=?";
            pstmt = conn.prepareStatement(sql2);
            pstmt.setString(1, userInput);   // same malicious input
            pstmt.setString(2, passInput);
            System.out.println("\n[PreparedStatement] Executing with parameters");
            rs = pstmt.executeQuery();
            if (rs.next()) {
                System.out.println("PreparedStatement login SUCCESS");
            } else {
                System.out.println("PreparedStatement login FAILED → injection blocked!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close manually (no try-with-resources)
            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (stmt != null) stmt.close(); } catch (Exception e) {}
            try { if (pstmt != null) pstmt.close(); } catch (Exception e) {}
            try { if (conn != null) conn.close(); } catch (Exception e) {}
        }

    }
}
