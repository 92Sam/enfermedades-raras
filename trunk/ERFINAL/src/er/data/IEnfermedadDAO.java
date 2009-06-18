package er.data;

import java.sql.Connection;
import java.util.List;

import er.domain.enfermedades.Enfermedad;
import er.domain.enfermedades.Tratamiento;

public interface IEnfermedadDAO {
	
	public Enfermedad selectEnfermedad (Connection conn,String enfermedad);
	public List selectAllEnfermedades();
	public Tratamiento selectTratamiento(Connection con, String tratoid);
	public String selectEnfermedadOID(Connection conn,String enfoid);
}
