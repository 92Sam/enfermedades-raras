package er.domain.enfermedades;

import java.util.List;

public class Medicamento {
	
	private String nombre;
	private List<Enfermedad> enfermedades;
	
	public Medicamento(String nom, List<Enfermedad> enf){
		nombre = nom;
		enfermedades = enf;
	}
	


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
