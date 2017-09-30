import java.sql.*;

public class Deleter {
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/bussiness?useSSL=true&serverTimezone=UTC";
    private static final String NAME = "root";
    private static final String PASSWORD = "root";
    public Object delete;

    public static void delete(String name, String type) {
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
        sql = "DELETE FROM manager WHERE NAME = '"+name+"'";
        try {
            statement = connection.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
