package er.domain.proyectos;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import er.data.JDBCProyectoDAO;
import er.domain.enfermedades.Enfermedad;
import er.domain.usuarios.UsuarioAdministrador;

public class ProyectoFactoria {
	
	private static ProyectoFactoria pf;
	private List proyectos;
	private JDBCProyectoDAO pdao = new JDBCProyectoDAO();
	
	public static synchronized ProyectoFactoria getInstance() {
        if (pf == null)
            pf = new ProyectoFactoria();
        return pf;
    }
	
	private ProyectoFactoria(){
		proyectos = new JDBCProyectoDAO().selecAllProyectos();
	}
	
	public List getProyectos(){
		return proyectos;
	}
	
	public boolean insertaProyecto(Proyecto p){
		pdao.insertaProyecto(p);
		return true;
	}
	
	public boolean compruebaProyecto(Proyecto p){
		boolean esta = false;
		Iterator it = this.proyectos.iterator();
		while(it.hasNext() && !esta){
			Proyecto aux = (Proyecto)it.next();
			if(aux.equals(p)){
				esta=true;
			}
		}
		return esta;
	}
	

}
