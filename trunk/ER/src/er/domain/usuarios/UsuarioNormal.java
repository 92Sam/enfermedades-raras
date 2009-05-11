package er.domain.usuarios;

public class UsuarioNormal extends Usuario {
	private String nombre;
	
	public UsuarioNormal(String nom){
		this.nombre = nom;
	}
	
	public String getNombre(){
		return nombre;
	}
}
