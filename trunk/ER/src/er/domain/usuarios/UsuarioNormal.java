package er.domain.usuarios;

public class UsuarioNormal implements IUsuario{
	private String nombre;
	
	public UsuarioNormal(String nom){
		this.nombre = nom;
	}
	
	public String getNombre(){
		return nombre;
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
}
