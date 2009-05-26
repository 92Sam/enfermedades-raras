package er.data;

import java.util.List;
import java.util.Set;

import er.domain.usuarios.UsuarioAdministrador;

public interface IUsuarioAdministradorDAO {

	List<UsuarioAdministrador> selectAllAdministradores();
	
	Set<String> selectAdministrador(String nombre,String pass);
	
	
}
