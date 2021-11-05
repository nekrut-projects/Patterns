package lesson_6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDataMapper extends DataMapper{
    private static ProductDataMapper instance;
    private ProductDataMapper(ServerDB serverDB) {
        super(serverDB);
    }

    public Product findById(int id) throws ResourceNotFoundException {
        Connection connection = connect();
        String query = "SELECT id FROM products WHERE product_id = ?;";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet result = ps.executeQuery();
            disconnect();
            if (result.next()){
                Product product = new Product();
                product.setId(result.getInt(1));
                product.setTitle(result.getString(2));
                product.setPrice(result.getBigDecimal(3));
                return product;
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        throw new ResourceNotFoundException("Product not found by id - " + id);

    }

    public void add(Product product){
        Connection connection = connect();
        String query = "INSERT INTO users (title, price) VALUES (?, ?);";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, product.getTitle());
            ps.setBigDecimal(2, product.getPrice());
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        disconnect();
    }

    public static ProductDataMapper getInstance(ServerDB serverDB) {
        if (instance == null){
            instance = new ProductDataMapper(serverDB);
        }
        return instance;
    }
}
