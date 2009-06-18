package er.data;

import er.domain.proyectos.Firma;

public interface IFirmaDAO {
	
	public Firma selectFirma(String nif);
	public void insertFirma(Firma f);

}
