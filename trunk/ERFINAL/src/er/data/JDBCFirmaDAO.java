package er.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import er.domain.comun.Nif;
import er.domain.proyectos.Firma;
import er.domain.utilidades.UIDGenerator;

public class JDBCFirmaDAO implements IFirmaDAO {
	
private Connection conn;
	
	public JDBCFirmaDAO() {
		conn = ConnectionManager.getInstance().checkOut();
		}

	protected void finalize() {
		ConnectionManager.getInstance().checkIn(conn);
		}

	@Override
	public void insertFirma(Firma f) {
		// TODO Auto-generated method stub
		 String ung = UIDGenerator.getInstance().getKey();
	        PreparedStatement stmt = null;
	        String sql = "INSERT INTO firma ( oid, nombre , apellidos, nif) VALUES (?, ?, ?, ?) ";
	        try {
	            stmt = conn.prepareStatement(sql);

	            stmt.setString(1, ung);
	            stmt.setString(2, f.getNombre());
	            stmt.setString(3, f.getApellidos());
	            stmt.setString(4, f.getNif().getCadena());

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
	public Firma selectFirma(String nif) {
		// TODO Auto-generated method stub
		PreparedStatement stmt = null;
		ResultSet result = null;
		Firma f = null;
		String sql = "SELECT * FROM firma WHERE (nif = ?) ";

		        try {
		            stmt = conn.prepareStatement(sql);
		            stmt.setString(1, nif);
		            result = stmt.executeQuery();
		            if(result.next()){
		            f = new Firma();
		            f.setNombre(result.getString("nombre"));
		            f.setApellidos(result.getString("apellidos"));
		            f.setNif(new Nif(result.getString("nif")));
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
		        return f;
	}

}
