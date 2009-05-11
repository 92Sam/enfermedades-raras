package er.domain.usuarios;

public class Usuario implements IUsuario{
	private Integer id;
	private String nombre;
	
	public String getNombre(){
		return this.nombre;
	}

}
