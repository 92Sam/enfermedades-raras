package er.domain.usuarios;

import er.domain.comun.Nif;

public interface IUsuario {
	public String getNombre();
	public String getApellidos();
	public String getContrasena();
	public Nif getNif();
	public String getEMail();
	public void setNombre(String nom);
	public void setApellidos(String ape);
	public void setContrasena(String cont);
	public void setNif(Nif nif);
	public void setEMail(String email);
}
