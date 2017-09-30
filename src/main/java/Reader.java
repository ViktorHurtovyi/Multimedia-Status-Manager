import java.sql.*;

public class Reader {
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/bussiness?useSSL=true&serverTimezone=UTC";
    private static final String NAME = "root";
    private static final String PASSWORD = "root";
    public Object readStatus;
    public Object readList;

    public static void readStatus(String name, String type) {
        ResultSet resultSet;
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
        sql = "SELECT STATUS FROM manager WHERE (name = '"+name+"'&&type = '"+type+"')";
        try {
            statement = connection.createStatement();
           resultSet =  statement.executeQuery(sql);
            while (resultSet.next()){
                String status1 = resultSet.getString("status");
                System.out.println(status1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public static void readList(String type) {
        ResultSet resultSet = null;
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
        sql = "SELECT * FROM manager WHERE type = '"+type+"'";
        try {
            statement = connection.createStatement();
           resultSet = statement.executeQuery(sql);
           while(resultSet.next()){
               String name1 = resultSet.getString("name");
               System.out.println(name1);
           }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
