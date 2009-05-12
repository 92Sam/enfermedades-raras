package er.domain.usuarios;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import er.domain.enfermedades.Enfermedad;
import er.domain.enfermedades.datos;

public class UsuarioCualificado implements IUsuario{

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

	@Override
	public String getApellidos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getContrasena() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEMail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNif() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setApellidos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setContrasena() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEMail() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setNif() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setNombre() {
		// TODO Auto-generated method stub
		
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
