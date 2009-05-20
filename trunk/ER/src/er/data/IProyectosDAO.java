package er.data;

import java.util.List;

import er.domain.proyectos.Proyecto;

public interface IProyectosDAO {

	public List<String> selecAllProyectos();
	public void insertaProyecto(Proyecto p, String ProyectoOID);
	public void deleteProyecto(String ProyectoOID);
	public String selectProyectoOID(String nombreProyecto);
	
}
