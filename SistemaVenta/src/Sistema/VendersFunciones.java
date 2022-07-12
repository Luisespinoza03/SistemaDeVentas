package Sistema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VendersFunciones {
	PreparedStatement preparedStatement;
	ResultSet resultSet;
	Connection connection;
	Connexion conexion = new Connexion();

	Venders_ venders_ = new Venders_();
	Object [][] listar ;

	public void agregar(String nombre, int caja, int ventas, String genero, String password) {
		
		String sql = "INSERT INTO vendedores(nombre,caja,ventas,genero,password)VALUES(?,?,?,?,?)";
		
		try {
			
			connection = conexion.Conectar();
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, nombre);
			preparedStatement.setInt(2, caja);
			preparedStatement.setInt(3, ventas);
			preparedStatement.setString(4, genero);
			preparedStatement.setString(5, password);
			preparedStatement.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}
	
	
	public void modificar(Venders_ venders_) {
		
		String sql = "UPDATE vendedores SET nombre=?, caja=?, ventas=?,genero=?,password=? WHERE codigo=?";
		try {
			
			connection = conexion.Conectar();
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, venders_.getName());
			preparedStatement.setInt(2, venders_.getCaja());
			preparedStatement.setInt(3, venders_.getVentas());
			preparedStatement.setString(4, venders_.getGener());
			preparedStatement.setString(5, venders_.getPassword());
			preparedStatement.setInt(6, venders_.getCode());
			preparedStatement.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
	
	public void eliminar(int id) {

		String sql = "DELETE FROM vendedores WHERE codigo=?";
		
		try {
			connection = conexion.Conectar();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
	
	public Object [][] listar(){
		
		String sql = "SELECT * FROM vendedores ";
		int filas = 0;
		
		try {
			connection = conexion.Conectar();
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				filas ++;
			}
			
			listar = new Object[filas][6];
			int y= 0;
			connection = conexion.Conectar();
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {		
				listar[y][0] = resultSet.getInt(1);
				listar[y][1] = resultSet.getString(2);
				listar[y][2] = resultSet.getInt(3);
				listar[y][3] = resultSet.getInt(4);
				listar[y][4] = resultSet.getString(5);
				listar[y][5] = resultSet.getString(6);
				y++;
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
		return listar;
		
	}
}
