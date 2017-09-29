import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Writter {
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/bussiness?useSSL=true&serverTimezone=UTC";
    private static final String NAME = "root";
    private static final String PASSWORD = "root";
    public Object write;

    public static void write(String name, String type) {
        Connection connection = null;
        Statement statement = null;
        String sql;
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Registering JDBC driver...");
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(URL, NAME, PASSWORD);
        } catch (SQLException e) {

            e.printStackTrace();
        }
        sql = "INSERT INTO manager(name, status, type) values ('"+name+"', '', '"+type+"')";
        try {
            statement = connection.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
