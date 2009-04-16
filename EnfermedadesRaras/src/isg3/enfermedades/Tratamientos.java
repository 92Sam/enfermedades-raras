package isg3.enfermedades;

import java.util.Collection;

public class Tratamientos {
	
	private String frecuencia;
	private String duracion;
	private Collection<Medicamentos> lmedicamentos;
	
	public String getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(String frecuencia) {
		this.frecuencia = frecuencia;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public Collection<Medicamentos> getLmedicamentos() {
		return lmedicamentos;
	}
	public void setLmedicamentos(Collection<Medicamentos> lmedicamentos) {
		this.lmedicamentos = lmedicamentos;
	}

}
