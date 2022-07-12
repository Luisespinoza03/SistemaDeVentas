package Sistema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomersFunciones {
	
	PreparedStatement preparedStatement;
	ResultSet resultSet;
	Connection connection;
	Connexion conexion = new Connexion();
	Customers customers = new Customers();
	Object [][] listar ;
	
	
	public void crear( String nombre, int NIT, String correo, String genero) {
		
		String sql = "INSERT INTO cliente(nombre,NIT,correo,genero)VALUES(?,?,?,?)";
		try {
			
			connection = conexion.Conectar();
			preparedStatement = connection.prepareStatement(sql);
			
			
			
			preparedStatement.setString(1, nombre);
			preparedStatement.setInt(2, NIT);
			preparedStatement.setString(3, correo);
			preparedStatement.setString(4, genero);
			preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	
	public void modificar(Customers customers) {
		String sql = "UPDATE cliente SET nombre=?, NIT=?, correo=?, genero=?  WHERE codigo=?";
		try {
			
			connection = conexion.Conectar();
			preparedStatement = connection.prepareStatement(sql);
			
			
			preparedStatement.setString(1, customers.getName());
			preparedStatement.setInt(2, customers.getNit());
			preparedStatement.setString(3, customers.getMail());
			preparedStatement.setString(4, customers.getGender());
			preparedStatement.setInt(5, customers.getCode());
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	public void eliminar(int id){
		
		String sql = "DELETE FROM cliente WHERE codigo=?";
		
		try {
			
			connection = conexion.Conectar();
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	
	public Object [][] listar(){
		String sql = "SELECT * FROM cliente";
		int filas = 0;
		try {
			connection = conexion.Conectar();
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				filas++;
			}
			
			listar = new Object[filas][5];
			int y = 0;
			connection = conexion.Conectar();
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				
				listar[y][0] = resultSet.getInt(1);
				listar[y][1] = resultSet.getString(2);
				listar[y][2] = resultSet.getInt(3);
				listar[y][3] = resultSet.getString(4);
				listar[y][4] = resultSet.getString(5);
				
				y++;

			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
		return listar;
		
	}
}
