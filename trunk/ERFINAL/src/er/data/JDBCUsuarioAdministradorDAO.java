package er.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import er.domain.comun.Nif;
import er.domain.usuarios.UsuarioAdministrador;

public class JDBCUsuarioAdministradorDAO implements IUsuarioAdministradorDAO {

private Connection conn;
	
	public JDBCUsuarioAdministradorDAO() {
		conn = ConnectionManager.getInstance().checkOut();
		}

	protected void finalize() {
		ConnectionManager.getInstance().checkIn(conn);
		}
	
	@Override
	public List selectAllAdministradores() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioAdministrador selectAdministrador(String nombre,String pass) {
		// TODO Auto-generated method stub
		PreparedStatement stmt = null;
		ResultSet result = null;
		UsuarioAdministrador ua = null;
		String sql = "SELECT * FROM usuarioadministrador WHERE (nombre = ? AND contrasena = ?) ";

		        try {
		            stmt = conn.prepareStatement(sql);
		            stmt.setString(1, nombre);
		            stmt.setString(2, pass);
		            result = stmt.executeQuery();
		            
		            if(result.next()){
		            ua = new UsuarioAdministrador();
		            ua.setNombre(result.getString("nombre"));
		            ua.setContrasena(result.getString("contrasena"));
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
		        return ua;
	}
	
	public UsuarioAdministrador selectOID(Connection conn, String uaoid){
		PreparedStatement stmt = null;
		ResultSet result = null;
		UsuarioAdministrador ua = null; 
		String sql = "SELECT * FROM usuarioadministrador WHERE (oid = ?) ";

		        try {
		            stmt = conn.prepareStatement(sql);
		            stmt.setString(1, uaoid);
		            result = stmt.executeQuery();

		            result.next();
		            ua = new UsuarioAdministrador();
		            ua.setNombre(result.getString("nombre"));
		            ua.setApellidos(result.getString("apellidos"));
		            ua.setContrasena(result.getString("contrasena"));
		            ua.setEMail(result.getString("email"));
		            Nif nuevo = new Nif(result.getString("nif"));
		            ua.setNif(nuevo);
		        } catch (SQLException ex) {
		            System.out.println("Message: " + ex.getMessage());
		            System.out.println("SQLState: " + ex.getSQLState());
		            System.out.println("ErrorCode: " + ex.getErrorCode());
		        } finally {
		            try {
		                if (result != null) {
		                    result.close();
		                }
		                if (stmt != null) {
		                    stmt.close();
		                }
		            } catch (SQLException ex) {
		            }
		        }
		        return ua;
		    }
	
	public String selectUsuarioAdministradorOID(Connection conn, String nombre) {
        PreparedStatement stmt = null;
        ResultSet result = null;
        String oid = null;
        String sql = "SELECT * FROM usuarioadministrador WHERE (nombre = ?) ";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, nombre);
            result = stmt.executeQuery();

            result.next();
            oid= result.getString("oid");
            
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
        return oid;
    }

}
