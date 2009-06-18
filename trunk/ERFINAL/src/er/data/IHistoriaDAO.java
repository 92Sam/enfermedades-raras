package er.data;

import java.util.List;

public interface IHistoriaDAO {

	public List<String> selectAllHistorias();
	public void insertHistoria(String nif, String texto);
	
	
}
