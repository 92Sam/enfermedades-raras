package er.data;

import java.util.List;

import er.domain.enfermedades.Enfermedad;
import er.domain.proyectos.Proyecto;
import er.domain.usuarios.UsuarioAdministrador;

public interface IProyectoDAO {

	public List selecAllProyectos();
	public void insertaProyecto(Proyecto p);
	public void deleteProyecto(String ProyectoOID);
	public String selectProyectoOID(String nombreProyecto);
	
}
