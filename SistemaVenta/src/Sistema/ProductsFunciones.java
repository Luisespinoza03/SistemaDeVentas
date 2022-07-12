package Sistema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductsFunciones {
	
	PreparedStatement preparedStatement;
	ResultSet resultSet;
	Connection connection;
	Connexion connexion =  new Connexion();
	Products products = new Products();
	Object [][] listar;
	
	public void agregar(String nombre, String descripcion, int cantidad, int precio ) {
		String sql = "INSERT INTO productos(nombre, descripcion, cantidad, precio)VALUES(?,?,?,?) ";
	
		try {
			connection = connexion.Conectar();
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, nombre);
			preparedStatement.setString(2, descripcion);
			preparedStatement.setInt(3, cantidad);
			preparedStatement.setInt(4, precio);
			preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	public void modificar(Products products) {
		String sql = "UPDATE productos SET nombre=?, descripcion=?, cantidad=?, precio=? WHERE codigo=?";
		
		try {
			
			connection = connexion.Conectar();
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, products.getName());
			preparedStatement.setString(2, products.getDescription());
			preparedStatement.setInt(3, products.getQuantity());
			preparedStatement.setInt(4, products.getPrice());
			preparedStatement.setInt(5, products.getCode());
			preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	public void eliminar(int id) {
		String sql ="DELETE FROM productos WHERE codigo=?";
		try {
			connection =  connexion.Conectar();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	
	public 	Object [][] listar(){
		String sql = "SELECT * FROM productos ";
		int filas = 0;
		try {	
			connection = connexion.Conectar();
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				filas ++;
			}
			
			listar = new Object[filas][5];
			int y= 0;
			connection = connexion.Conectar();
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {	
				listar[y][0] = resultSet.getInt(1);
				listar[y][1] = resultSet.getString(2);
				listar[y][2] = resultSet.getString(3);
				listar[y][3] = resultSet.getInt(4);
				listar[y][4] = resultSet.getInt(5);
				y++;
			}
	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		return listar;
		
	}
	

}
