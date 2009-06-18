package er.domain.enfermedades;

import java.util.Iterator;
import java.util.List;

import er.data.JDBCEnfermedadDAO;

public class EnfermedadFactoria {
	
	private static EnfermedadFactoria ef;
	private List enfermedades;
	
	public static synchronized EnfermedadFactoria getInstance() {
        if (ef == null)
            ef = new EnfermedadFactoria();
        return ef;
    }
	
	private EnfermedadFactoria(){
		enfermedades = new JDBCEnfermedadDAO().selectAllEnfermedades();
	}
	
	public List getEnfermedades(){
		return enfermedades;
	}
	
	public Enfermedad getEnfermedad(String nombre) {
		Enfermedad result = null;
        for (Iterator iter = enfermedades.iterator(); iter.hasNext();) {
            Enfermedad e = (Enfermedad) iter.next();
            if (e.getNombre().equals(nombre)) {
                result = e;
            }
        }
        return result;
    }
}
