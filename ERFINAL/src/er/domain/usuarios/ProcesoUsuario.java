package er.domain.usuarios;

import er.data.JDBCFirmaDAO;
import er.data.JDBCUsuarioAdministradorDAO;
import er.data.JDBCUsuarioNormalDAO;
import er.domain.proyectos.Firma;

public class ProcesoUsuario {
	private JDBCUsuarioNormalDAO undao= new JDBCUsuarioNormalDAO();
	private JDBCFirmaDAO fdao = new JDBCFirmaDAO();
	private JDBCUsuarioAdministradorDAO uadao = new JDBCUsuarioAdministradorDAO();
	public boolean introduceUsuario(UsuarioNormal un) {
        undao.insertUsuario(un);
        return true;
    }
	
	public boolean compruebaUsuario(String usu,String pass){
		boolean esta = false;
		UsuarioNormal un = undao.selectUsuarioNormal(usu,pass);
		if(un == null)
			return false;
		else if(un.getNombre().equals(usu) && un.getContrasena().equals(pass))
			esta = true;
		return esta;
	}
	
	public boolean introduceFirma(Firma f){
		fdao.insertFirma(f);
		return true;
	}
	
	public boolean compruebaFirma(String nif){
		boolean firmado = false;
		Firma f = fdao.selectFirma(nif);
		if(f == null)
			return false;
		else if(f.getNif().getCadena().equals(nif))
			firmado=true;
		return firmado;
	}
	
	public boolean eliminaUsuario(String nombre) {
        undao.delete(nombre);
        return true;
    }
	
	public boolean compruebaAdministrador(String nombre,String password){
		boolean esadmin = false;
		if(uadao.selectAdministrador(nombre, password) != null)
			esadmin = true;
		return esadmin;
	}
	
	public UsuarioAdministrador selectAdministrador(String nom,String pas){
		return uadao.selectAdministrador(nom, pas);
	}
}
