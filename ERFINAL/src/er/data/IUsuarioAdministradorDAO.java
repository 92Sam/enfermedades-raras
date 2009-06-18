package er.data;

import java.sql.Connection;
import java.util.List;

import er.domain.usuarios.UsuarioAdministrador;

public interface IUsuarioAdministradorDAO {

	List selectAllAdministradores();
	UsuarioAdministrador selectAdministrador(String nombre,String pass);
	UsuarioAdministrador selectOID(Connection conn,String oid);
	String selectUsuarioAdministradorOID(Connection conn, String uaoid);
}
