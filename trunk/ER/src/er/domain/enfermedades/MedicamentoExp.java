package er.domain.enfermedades;

public class MedicamentoExp extends Medicamento {
	
	//CD donde se esta experimentando
	private CDiagnostico cdiagnostico;
	//posibles sintomas donde se podria aplicar
	private Sintoma sintomas;
	//posible solucion a una enfermedad
	private Enfermedad enfermedad;
	
	public CDiagnostico getCdiagnostico() {
		return cdiagnostico;
	}
	public void setCdiagnostico(CDiagnostico cdiagnostico) {
		this.cdiagnostico = cdiagnostico;
	}
	public Sintoma getSintomas() {
		return sintomas;
	}
	public void setSintomas(Sintoma sintomas) {
		this.sintomas = sintomas;
	}
	public Enfermedad getEnfermedad() {
		return enfermedad;
	}
	public void setEnfermedad(Enfermedad enfermedad) {
		this.enfermedad = enfermedad;
	}
}
