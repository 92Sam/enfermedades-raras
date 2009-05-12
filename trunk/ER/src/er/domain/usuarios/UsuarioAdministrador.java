package er.domain.usuarios;

public class UsuarioAdministrador implements IUsuario{
	
	private String nombre;
	private String apellidos;
	private String contrasena;
	private String nif;
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
