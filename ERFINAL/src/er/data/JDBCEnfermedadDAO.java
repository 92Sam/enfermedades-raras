package er.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import er.domain.enfermedades.Enfermedad;
import er.domain.enfermedades.Tratamiento;


public class JDBCEnfermedadDAO implements IEnfermedadDAO {

	
	
	public List selectAllEnfermedades(){
		Connection conn = ConnectionManager.getInstance().checkOut();
        PreparedStatement stmt = null;
        List searchResults = new LinkedList();
        ResultSet result = null;

        try {

            String sql = "SELECT * FROM enfermedad";
            stmt = conn.prepareStatement(sql); //conn es una conexi�n v�lida
            result = stmt.executeQuery();

            while (result.next()) {
                Enfermedad temp = new Enfermedad();
                temp.setNombre(result.getString("nombre"));
                temp.setDescripcion(result.getString("descripcion"));
                Tratamiento t = selectTratamiento(conn,result.getString("tratamiento_oid"));
                temp.setTratamiento(t);
                searchResults.add(temp);
            }
        } catch (SQLException e) {
            System.out.println("Message: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("ErrorCode: " + e.getErrorCode());
        } finally {
            ConnectionManager.getInstance().checkIn(conn);
            try {
                if (result != null)
                    result.close();
                	System.out.println("La conexion se ha cerrado");
                if (stmt != null)
                    stmt.close();
            } catch (SQLException e) {
            }

        }
        return searchResults;
	}
	
	
	public Enfermedad selectEnfermedad(Connection conn,String enfermedad) {
		// TODO Auto-generated method stub
		PreparedStatement stmt = null;
		ResultSet result = null;
		Enfermedad e = null;
		String sql = "SELECT * FROM enfermedad WHERE (nombre = ?) ";

		        try {
		            stmt = conn.prepareStatement(sql);
		            stmt.setString(1, enfermedad);
		            result = stmt.executeQuery();

		            result.next();
		            e = new Enfermedad();
		            e.setDescripcion(result.getString("descripcion"));
		            e.setNombre(result.getString("nombre"));
		            Tratamiento t = selectTratamiento(conn, result.getString("tratamiento_oid"));
		            e.setTratamiento(t);
		        } catch (SQLException ex) {
		            System.out.println("Message: " + ex.getMessage());
		            System.out.println("SQLState: " + ex.getSQLState());
		            System.out.println("ErrorCode: " + ex.getErrorCode());
		        } finally {
		            try {
		                if (result != null) {
		                    result.close();
		                    System.out.println("La conexion se ha cerrado");
		                }
		                if (stmt != null) {
		                    stmt.close();
		                }
		            } catch (SQLException ex) {
		            }
		        }
		        return e;
		    }
	
	public Tratamiento selectTratamiento(Connection conn, String tratoid){
		PreparedStatement stmt = null;
		ResultSet result = null;
		Tratamiento t = null; 
		String sql = "SELECT * FROM tratamiento WHERE (oid = ?) ";

		        try {
		            stmt = conn.prepareStatement(sql);
		            stmt.setString(1, tratoid);
		            result = stmt.executeQuery();

		            result.next();
		            t = new Tratamiento();
		            t.setNombre(result.getString("nombre"));
		            t.setFrecuencia(result.getString("frecuencia"));
		            t.setDuracion(result.getString("duracion"));
		        } catch (SQLException ex) {
		            System.out.println("Message: " + ex.getMessage());
		            System.out.println("SQLState: " + ex.getSQLState());
		            System.out.println("ErrorCode: " + ex.getErrorCode());
		        } finally {
		            try {
		                if (result != null) {
		                    result.close();
		                    System.out.println("La conexion se ha cerrado");
		                }
		                if (stmt != null) {
		                    stmt.close();
		                }
		            } catch (SQLException ex) {
		            }
		        }
		        return t;
		    }
	public Enfermedad selectOID(Connection conn,String enoid){
	PreparedStatement stmt = null;
	ResultSet result = null;
	Enfermedad e = null; 
	String sql = "SELECT * FROM enfermedad WHERE (oid = ?) ";

	        try {
	            stmt = conn.prepareStatement(sql);
	            stmt.setString(1, enoid);
	            result = stmt.executeQuery();

	            result.next();
	            e = new Enfermedad();
	            e.setNombre(result.getString("nombre"));
	            e.setDescripcion(result.getString("descripcion"));
	            Tratamiento t = selectTratamiento(conn,result.getString("tratamiento_oid"));
	            e.setTratamiento(t);
	        } catch (SQLException ex) {
	            System.out.println("Message: " + ex.getMessage());
	            System.out.println("SQLState: " + ex.getSQLState());
	            System.out.println("ErrorCode: " + ex.getErrorCode());
	        } finally {
	            try {
	                if (result != null) {
	                    result.close();
	                    System.out.println("La conexion se ha cerrado");
	                }
	                if (stmt != null) {
	                    stmt.close();
	                }
	            } catch (SQLException ex) {
	            }
	        }
	        return e;
	}
	
	public String selectEnfermedadOID(Connection conn, String nombre) {
        PreparedStatement stmt = null;
        ResultSet result = null;
        String oide = null;
        String sql = "SELECT * FROM enfermedad WHERE (nombre = ?) ";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, nombre);
            result = stmt.executeQuery();

            result.next();
            oide = result.getString("oid");
            
        } catch (SQLException e) {
            System.out.println("Message: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("ErrorCode: " + e.getErrorCode());
        } finally {
            try {
                if (result != null) {
                    result.close();
                    System.out.println("La conexion se ha cerrado");
                }
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
            }
        }
        return oide;
    }

	}
	
