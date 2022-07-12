package Sistema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;

public class SaleFunctions {

    PreparedStatement preparedStatement;
    ResultSet resultSet;
    Connection connection;

    Connexion conexion = new Connexion();

    public CustomerComboBox listar(Ventas venta) {
        CustomerComboBox customerComboBox = new CustomerComboBox(0, "NO SE ENCONTRO NINGUN DATO");

        String sql = "SELECT * FROM cliente WHERE nombre = ? OR nit = ? OR correo = ? LIMIT 1";

        try {
            connection = conexion.Conectar();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, venta.getName());
            preparedStatement.setInt(2, venta.getNit());
            preparedStatement.setString(3, venta.getEmail());

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                customerComboBox.setId(resultSet.getInt("codigo"));
                customerComboBox.setNombre(resultSet.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return customerComboBox;
    }

    public Products buscarProducto(int idProducto) {
        Products product = new Products(-1, "Producto", "Descripcion", 10, 50, 500);
        try {
            String sql = "SELECT * FROM productos WHERE codigo = ? LIMIT 1";
            connection = conexion.Conectar();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, idProducto);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                product.setCode(resultSet.getInt("codigo"));
                product.setName(resultSet.getString("nombre"));
                product.setDescription(resultSet.getString("descripcion"));
                product.setQuantity(resultSet.getInt("cantidad"));
                product.setPrice(resultSet.getInt("precio"));
            }
        } catch (SQLException e) {
            product.setCode(-1);
            return product;
        }
        return product;
    }

    public void insertarVenta(int idCliente, int total, JTable tabla) {
        int index = 0;
        try {
            String sql = "SELECT * FROM productos_ventas ORDER BY id_productoVentas DESC LIMIT 1";
            connection = conexion.Conectar();
            preparedStatement = connection.prepareStatement(sql);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                index = resultSet.getInt(1);
            }

            String sql2 = "";
            for (int i = 0; i < tabla.getRowCount(); i++) {
                sql2 = "INSERT INTO productos_ventas (codigo, cantidad, subtotal) VALUES (?, ?, ?)";

                connection = conexion.Conectar();
                preparedStatement = connection.prepareStatement(sql2);
                
                preparedStatement.setObject(1, tabla.getValueAt(i, 0));
                preparedStatement.setObject(2, tabla.getValueAt(i, 2));
                preparedStatement.setObject(3, tabla.getValueAt(i, 4));

                resultSet = preparedStatement.executeQuery();
            }

            while (resultSet.next()) {

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
