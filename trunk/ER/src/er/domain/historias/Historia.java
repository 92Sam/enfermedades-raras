package er.domain.historias;

import er.domain.enfermedades.Enfermedad;
import er.domain.usuarios.UsuarioNormal;

public class Historia {
	private Enfermedad enf;
	private UsuarioNormal usuario;
	private String historia;
	
	public Historia(Enfermedad e, UsuarioNormal u, String his){
		this.enf = e;
		this.usuario = u;
		this.historia = his;
	}
	
	public UsuarioNormal getUsuario(){
		return usuario;
	}
	
	public String getHistoria(){
		return historia;
	}
	
	public Enfermedad getEnfermedad(){
		return enf;
	}
	
}
