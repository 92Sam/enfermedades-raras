package er.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

import er.domain.enfermedades.Enfermedad;
import er.domain.proyectos.Proyecto;
import er.domain.usuarios.UsuarioAdministrador;
import er.domain.utilidades.UIDGenerator;

public class JDBCProyectoDAO implements IProyectoDAO {

	
private Connection conn;
	
	public JDBCProyectoDAO() {
		conn = ConnectionManager.getInstance().checkOut();
		}

	protected void finalize() {
		ConnectionManager.getInstance().checkIn(conn);
		}
	
	private JDBCUsuarioAdministradorDAO admin = new JDBCUsuarioAdministradorDAO();
	private JDBCEnfermedadDAO enf = new JDBCEnfermedadDAO();
	@Override
	public void deleteProyecto(String ProyectoOID) {
		// TODO Auto-generated method stub
	}

	@Override
	public void insertaProyecto(Proyecto p) {
		// TODO Auto-generated method stub
			String ung = UIDGenerator.getInstance().getKey();
	        String sql = "INSERT INTO proyecto ( oid, usuarioadministrador_oid,enfermedad_oid,nombre,fechainicio,fechafin) VALUES (?, ?, ?, ?, ?,?) ";
	        PreparedStatement stmt = null;
	        
	        try {
	            stmt = conn.prepareStatement(sql);
	            stmt.clearParameters();
	            stmt.setString(1,ung);
	            stmt.setString(2,admin.selectUsuarioAdministradorOID(conn,p.getAdministrador().getNombre()));
	            stmt.setString(3,enf.selectEnfermedadOID(conn,p.getEnfermedad().getNombre()));
	            stmt.setString(4,p.getNombre());
	            stmt.setObject(5,p.getFechaInicio().getTime());
	            stmt.setObject(6,p.getFechaFinPrevista().getTime());
	            
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
	public List selecAllProyectos() {
		// TODO Auto-generated method stub
		Connection conn = ConnectionManager.getInstance().checkOut();
        PreparedStatement stmt = null;
        List searchResults = new LinkedList();
        ResultSet result = null;

        try {

            String sql = "SELECT * FROM proyecto";
            stmt = conn.prepareStatement(sql); //conn es una conexi�n v�lida
            result = stmt.executeQuery();

            while (result.next()) {
                Proyecto p = new Proyecto();
                p.setNombre(result.getString("nombre"));
                UsuarioAdministrador a = admin.selectOID(conn, result.getString("usuarioadministrador_oid"));
                p.setAdministrador(a);
                GregorianCalendar finicio = new GregorianCalendar();
                String fi = result.getString("fechainicio");
                String[] fechainicio = fi.split("/");
                finicio.set(Integer.valueOf(fechainicio[2]),Integer.valueOf(fechainicio[1]) ,Integer.valueOf(fechainicio[0]));
                p.setFechaInicio(finicio);
                GregorianCalendar ffin = new GregorianCalendar();
                String ff = result.getString("fechafin");
                String[] fechafin = ff.split("/");
                ffin.set(Integer.valueOf(fechainicio[2]),Integer.valueOf(fechainicio[1]) ,Integer.valueOf(fechainicio[0]));
                p.setFechaFinPrevista(ffin);
                Enfermedad e = enf.selectOID(conn,result.getString("enfermedad_oid"));
                p.setEnfermedad(e);
                searchResults.add(p);
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
                if (stmt != null)
                    stmt.close();
            } catch (SQLException e) {
            }

        }
        return searchResults;
	}

	@Override
	public String selectProyectoOID(String nombreProyecto) {
		// TODO Auto-generated method stub
		return null;
	}
}
