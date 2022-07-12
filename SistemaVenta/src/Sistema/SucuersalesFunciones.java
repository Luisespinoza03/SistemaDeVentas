package Sistema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SucuersalesFunciones {
		PreparedStatement preparedStatement;
		ResultSet resultSet;
		Connection connection;
		Connexion conexion = new Connexion();
		BranchOfi branchOfi = new BranchOfi();
		Object [][] listar ;
		
		
		public void crear(String nombre, String direccion, String correo, int telefono) {
			String sql = "INSERT INTO sucursales(nombre,direccion,correo,telefono)VALUES(?,?,?,?)";
			try {
				connection = conexion.Conectar();
				preparedStatement = connection.prepareStatement(sql);
				
				preparedStatement.setString(1, nombre);
				preparedStatement.setString(2, direccion);
				preparedStatement.setString(3, correo);
				preparedStatement.setInt(4, telefono);
				preparedStatement.executeUpdate();
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
		
		
		public void modificar(BranchOfi branchOfi) {
			String sql = "UPDATE sucursales SET nombre=?, direccion=?,correo=?, telefono=? WHERE codigo=?";
			try {
				connection = conexion.Conectar();
				preparedStatement = connection.prepareStatement(sql);
				
				preparedStatement.setString(1, branchOfi.getName());
				preparedStatement.setString(2, branchOfi.getDirection());
				preparedStatement.setString(3, branchOfi.getMail());
				preparedStatement.setInt(4, branchOfi.getPhone());
				preparedStatement.setInt(5, branchOfi.getCode());
				preparedStatement.executeUpdate();
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
			
		}
		
		public void eliminar(int id) {
			String sql = "DELETE FROM sucursales WHERE codigo=? ";
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
		
		
		public Object[][] litar() {
			String sql = "SELECT * FROM sucursales";
			int filas = 0;
			try {
				connection = conexion.Conectar();
				preparedStatement = connection.prepareStatement(sql);
				resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					filas ++;
				}
				
				listar = new Object[filas][5];
				int y= 0;
				connection = conexion.Conectar();
				preparedStatement = connection.prepareStatement(sql);
				resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()) {		
					listar[y][0] = resultSet.getInt(1);
					listar[y][1] = resultSet.getString(2);
					listar[y][2] = resultSet.getString(3);
					listar[y][3] = resultSet.getString(4);
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
