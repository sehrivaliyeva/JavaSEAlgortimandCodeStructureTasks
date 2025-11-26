package jdbcpractise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Practise {
    static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5433/evopractise";
        String user = "postgres";
        String password = "123456";

        Foods food = new Foods("Potato", "Hard8", 0.60, "brown");


        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, user, password);

            /*String sorgu = "select * from foods";
            Statement statement = con.createStatement();
            statement.executeQuery(sorgu);

            ResultSet rs = statement.getResultSet();

            while (rs.next()) {
                System.out.println(rs.getString("name"));
                System.out.println(rs.getDouble("price"));
                System.out.println(rs.getString("consistency"));
                System.out.println(rs.getString("color"));
                System.out.println(rs.getInt("id"));
                System.out.println("-----------------------------------");
            }*/

           /* String sorgu1 = "select name from foods where id=?";
            PreparedStatement prepareStatement = con.prepareStatement(sorgu1);
            prepareStatement.setInt(1, 7);
            ResultSet result = prepareStatement.executeQuery();
            while (result.next()) {
                System.out.println(result.getString("name"));
            }*/

            String sorgu2 = "insert into foods (name, consistency, color, price) values (?, ?, ?, ?)";
            PreparedStatement prepareStatement = con.prepareStatement(sorgu2);
            prepareStatement.setString(1, food.getName());
            prepareStatement.setString(2, food.getConsistency());
            prepareStatement.setString(3, food.getColor());
            prepareStatement.setDouble(4, food.getPrice());
            prepareStatement.executeUpdate();
            con.close();
            prepareStatement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
