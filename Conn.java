import java.sql.*;
public class Conn {
    Connection c;
    Statement s;

    Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagementsystem", "root", "ideal@2005");
            s = c.createStatement();
            // further processing here
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}

