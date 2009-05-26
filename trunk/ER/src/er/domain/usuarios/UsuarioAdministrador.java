package er.domain.usuarios;

import er.domain.comun.Nif;

public class UsuarioAdministrador implements IUsuario{
	
	private String nombre;
	private String apellidos;
	private String contrasena;
	private String  nif;
	private String EMail;
	
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
	public String getNif() {
		// TODO Auto-generated method stub
		return nif;
	}
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}
	@Override
	public void setApellidos(String ape) {
		// TODO Auto-generated method stub
		this.apellidos = ape;
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
	public void setNif(String nif) {
		// TODO Auto-generated method stub
		this.nif = nif;
	}
	@Override
	public void setNombre(String nom) {
		// TODO Auto-generated method stub
		this.nombre = nom;
	}
	
}
