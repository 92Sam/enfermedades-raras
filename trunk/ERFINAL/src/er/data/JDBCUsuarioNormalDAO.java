package er.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import er.domain.usuarios.UsuarioNormal;
import er.domain.utilidades.UIDGenerator;

public class JDBCUsuarioNormalDAO implements IUsuarioNormalDAO {
	
	private Connection conn;
	
	public JDBCUsuarioNormalDAO() {
		conn = ConnectionManager.getInstance().checkOut();
		}

	protected void finalize() {
		ConnectionManager.getInstance().checkIn(conn);
		}

	@Override
	public UsuarioNormal selectUsuarioNormal(String usu,String password) {
		// TODO Auto-generated method stub
		PreparedStatement stmt = null;
		ResultSet result = null;
		UsuarioNormal u = null;
		String sql = "SELECT * FROM usuarionormal WHERE (nombre = ? AND contrasena = ?) ";

		        try {
		            stmt = conn.prepareStatement(sql);
		            stmt.setString(1, usu);
		            stmt.setString(2, password);
		            result = stmt.executeQuery();
		            
		            if(result.next()){
		            u = new UsuarioNormal();
		            u.setNombre(result.getString("nombre"));
		            u.setContrasena(result.getString("contrasena"));
		            }
		            else
		            	return null;
		        } catch (SQLException e) {
		            System.out.println("Message: " + e.getMessage());
		            System.out.println("SQLState: " + e.getSQLState());
		            System.out.println("ErrorCode: " + e.getErrorCode());
		        } finally {
		            try {
		                if (result != null) {
		                    result.close();
		                }
		                if (stmt != null) {
		                    stmt.close();
		                }
		            } catch (SQLException e) {
		            }
		        }
		        return u;
		    }
	
	 public void insertUsuario(UsuarioNormal u) {
	        String ung = UIDGenerator.getInstance().getKey();
	        PreparedStatement stmt = null;
	        String sql = "INSERT INTO usuarionormal ( oid, nombre , apellidos, contrasena, nif, email) VALUES (?, ?, ?, ?, ?, ?) ";
	        try {
	            stmt = conn.prepareStatement(sql);

	            stmt.setString(1, ung);
	            stmt.setString(2, u.getNombre());
	            stmt.setString(3, u.getApellidos());
	            stmt.setString(4, u.getContrasena());
	            stmt.setString(5, u.getNif().getCadena());
	            stmt.setString(6, u.getEMail());

	            stmt.executeUpdate();

	        } catch (SQLException e) {
	            System.out.println("Message: " + e.getMessage());
	            System.out.println("SQLState: " + e.getSQLState());
	            System.out.println("ErrorCode: " + e.getErrorCode());
	        } finally {
	            try {
	                if (stmt != null) {
	                    stmt.close();
	                }
	            } catch (SQLException e) {
	            }
	        }
	    }

	@Override
	public void delete(String nombre) {
		// TODO Auto-generated method stub
        PreparedStatement stmt = null;
        String sql = "delete from usuarionormal where nombre= ? ";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, nombre);
     
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Message: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("ErrorCode: " + e.getErrorCode());
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
            }
        }
	}

}
