package er.domain.usuarios;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import er.domain.comun.Nif;
import er.domain.enfermedades.Enfermedad;
import er.domain.enfermedades.datos;

public class UsuarioCualificado implements IUsuario{
	private String nombre;
	private String apellidos;
	private String contrasena;
	private Nif nif;
	private String EMail;
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
	public void setEnfermedades (List<Enfermedad> le){
		this.enfermedades = le;
	}

	@Override
	public String getApellidos() {
		// TODO Auto-generated method stub
		return apellidos;
	}

	@Override
	public String getContrasena() {
		// TODO Auto-generated method stub
		return contrasena;
	}

	@Override
	public String getEMail() {
		// TODO Auto-generated method stub
		return EMail;
	}

	@Override
	public Nif getNif() {
		// TODO Auto-generated method stub
		return nif;
	}

	@Override
	public void setApellidos(String ape) {
		// TODO Auto-generated method stub
		apellidos = ape;
	}

	@Override
	public void setContrasena(String cont) {
		// TODO Auto-generated method stub
		this.contrasena = cont;
	}

	@Override
	public void setEMail(String email) {
		// TODO Auto-generated method stub
		this.EMail = email;
	}

	@Override
	public void setNif(Nif nif) {
		// TODO Auto-generated method stub
		this.nif = nif;
	}

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		this.nombre = nombre;
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
