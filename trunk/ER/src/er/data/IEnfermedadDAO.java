package er.data;

import java.util.List;

public interface IEnfermedadDAO {

	public List<String> selectAllProyectos (String enfermedad);
	public boolean selectEnfermedad (String enfermedad);
	public List<String> selectEnfermedades();
	
	
	
}
