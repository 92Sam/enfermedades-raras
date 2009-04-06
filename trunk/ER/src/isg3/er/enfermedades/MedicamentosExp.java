package isg3.er.enfermedades;

public class MedicamentosExp extends Medicamentos {
	
	//CD donde se esta experimentando
	private CDiagnostico cdiagnostico;
	//posibles sintomas donde se podria aplicar
	private Sintomas sintomas;
	//posible solucion a una enfermedad
	private Enfermedades enfermedad;
	
	public CDiagnostico getCdiagnostico() {
		return cdiagnostico;
	}
	public void setCdiagnostico(CDiagnostico cdiagnostico) {
		this.cdiagnostico = cdiagnostico;
	}
	public Sintomas getSintomas() {
		return sintomas;
	}
	public void setSintomas(Sintomas sintomas) {
		this.sintomas = sintomas;
	}
	public Enfermedades getEnfermedad() {
		return enfermedad;
	}
	public void setEnfermedad(Enfermedades enfermedad) {
		this.enfermedad = enfermedad;
	}
}
