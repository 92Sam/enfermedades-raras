package er.domain.usuarios;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import er.domain.enfermedades.Enfermedad;
import er.domain.enfermedades.datos;

public class UsuarioCualificado extends Usuario {

	private String nombre;
	private List<Enfermedad> enfermedades;
	
	public UsuarioCualificado(String nombre ,List<Enfermedad> lista){
		enfermedades = lista;
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return nombre;
		}
	
	public List getEnfermedades(){
		return enfermedades;
	}
	
	/*public void addEnfermedad(Enfermedad e){
		Iterator it = datos.getInstance().getUsuariosC().iterator();
		UsuarioCualificado usu = null;
		while(it.hasNext()){
			usu = (UsuarioCualificado)it.next();
			if(usu.getNombre().equals(this.getNombre()))
				enfermedades.add(e);
		}
	}*/
}
