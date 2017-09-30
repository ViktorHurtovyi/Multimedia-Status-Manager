import java.sql.*;

public class Chenger {
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/bussiness?useSSL=true&serverTimezone=UTC";
    private static final String NAME = "root";
    private static final String PASSWORD = "root";
    public Object chengeName;

    public static void chengeStatus(String name, String status, String type) {
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
        sql = "Update manager SET status = '"+status+"' WHERE name = '"+name+"'&&type = '"+type+"'";
        try {
            statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public static void chengeName(String name, String newname, String type) {
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
        sql = "Update manager SET name = '"+newname+"' WHERE name = '"+name+"'&&type = '"+type+"'";
        try {
            statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
