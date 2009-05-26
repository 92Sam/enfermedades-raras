package er.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import er.domain.usuarios.UsuarioAdministrador;



public class JDBCUsuarioAdministradorDAO implements IUsuarioAdministradorDAO {
	public static final ConnectionManager conection = ConnectionManager.getInstance();
	
	
	public List<UsuarioAdministrador> selectAllAdministradores() {
		
		Connection con = conection.checkOut();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			String sql = "select * from USUARIO_ADMIN";
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
		} catch (SQLException e) {
			System.out.println("Message: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("ErrorCode: " + e.getErrorCode());
		}
		//convierto a List el resultset
		List<UsuarioAdministrador> resul = new ArrayList<UsuarioAdministrador>();
		try {
			while (rs.next()){
				UsuarioAdministrador uAdmin = new UsuarioAdministrador();
				uAdmin.setNombre(rs.getString("NOMBRE"));
				uAdmin.setApellidos(rs.getString("APELLIDOS"));
				uAdmin.setContrasena(rs.getString("PASSWORD"));
				uAdmin.setNif(rs.getString("NIF"));
				uAdmin.setEMail(rs.getString("EMAIL"));				
				
			}
		} catch (SQLException e) {
			System.out.println("Message: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("ErrorCode: " + e.getErrorCode());
		}finally{
			//despues de tener en un List el resultado cierro las conexion
				try {
					if (rs != null){
						rs.close();
					}
					if (stmt != null){
						stmt.close();
					}
					if (con != null){//duda .... esto hay que cerralo ????????????????
						conection.checkIn(con);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
	
		return resul;
	}


	@Override
	public Set<String> selectAdministrador(String nombre,String pass) {
		
		Connection con = conection.checkOut();
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			String sql = "select NOMBRE,PASSWORD from USUARIO_ADMIN" +
					" where (NOMBRE = ?) and (PASSWORD = ?)";
			stmt = con.prepareStatement(sql);
			stmt.setString(1,nombre);
			stmt.setString(2, pass);
			String q = stmt.toString();
			rs = stmt.executeQuery();
		} catch (SQLException e) {
			System.out.println("Message: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("ErrorCode: " + e.getErrorCode());
		}
		
		//itero el resultset
		Set<String> resul= new HashSet<String>();
		
		try {
			while(rs.next()){
				resul.add(rs.getString("NOMBRE"));
				resul.add(rs.getString("PASSWORD"));
				if (rs.next()){
					System.out.print("No puede haber dos administradores iguales");
					return null;
				}
				
			}
		} catch (SQLException e) {
			System.out.println("Message: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("ErrorCode: " + e.getErrorCode());
		}finally{
			//despues de tener en un List el resultado cierro las conexion
				try {
					if (rs != null){
						rs.close();
					}
					if (stmt != null){
						stmt.close();
					}
					if (con != null){//duda .... esto hay que cerralo ????????????????
						conection.checkIn(con);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		
		

		return resul;
	}
	

}
