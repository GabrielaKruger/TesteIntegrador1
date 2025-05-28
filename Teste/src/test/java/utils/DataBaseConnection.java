package utils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DataBaseConnection {
    private static final String url = "jdbc:oracle:thin:@192.168.180.165:1521/tst";
    private static final String user = "auto";
    private static final String pwd = "max";
    private Connection conn;

    public static void executeQuery(String query) {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, user, pwd);
            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(query);
            System.out.println("Linhas afetadas: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<Integer> executeQueryReturnList(String query) {
        Connection connection = null;
        List<Integer> resultList = new ArrayList<>();

        try {
            connection = DriverManager.getConnection(url, user, pwd);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                resultList.add(id);
            }
            resultSet.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return resultList;
    }

    public static Boolean executeQueryReturnBoolean(String query) {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, user, pwd);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                System.out.println("Consulta retornou resultados.");
                return true;
            } else {
                System.out.println("Consulta não retornou resultados.");
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static String executeQueryReturnValor(String query, String nameColumn) {
        Connection connection = null;
        String value = null;

        try {
            connection = DriverManager.getConnection(url, user, pwd);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                // Recupera o valor da coluna especificada
                value = resultSet.getString(nameColumn);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return value;
    }
}