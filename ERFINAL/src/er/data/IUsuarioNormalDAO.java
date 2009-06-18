package er.data;

import er.domain.usuarios.UsuarioNormal;

public interface IUsuarioNormalDAO {

	public UsuarioNormal selectUsuarioNormal(String usu, String password);
	public void insertUsuario(UsuarioNormal u);
	public void delete(String nombre);
}
