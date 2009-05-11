package er.domain.enfermedades;

import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import er.domain.comun.Nif;
import er.domain.historias.Historia;
import er.domain.proyectos.Firma;
import er.domain.proyectos.Proyecto;
import er.domain.usuarios.UsuarioCualificado;
import er.domain.usuarios.UsuarioNormal;

public class datos {
	
	private static datos cd;
	public static synchronized datos getInstance() {
		if (cd == null)
			cd = new datos();
		return cd;
	}
	private List<Enfermedad> lenf;
	private List<Firma> lfir;
	private List<Historia> lhis;
	private List<UsuarioCualificado> usuarios;
	private List<Proyecto> lpro;
	Enfermedad e1 = new Enfermedad("Xeroderma Pigmentario");
	Proyecto p1 = new Proyecto("Proyecto 1", new GregorianCalendar(2009, Calendar.MAY,7),new GregorianCalendar(2009, Calendar.DECEMBER, 17),e1);
	Enfermedad e2 = new Enfermedad("Aminoaciduria Dicarboxilica");
	Proyecto p2 = new Proyecto("Proyecto 2", new GregorianCalendar(2009, Calendar.JULY,12),new GregorianCalendar(2010, Calendar.FEBRUARY, 22),e2);
	Enfermedad e3 = new Enfermedad("Mal de San Vito");
	Proyecto p3 = new Proyecto("Proyecto 3", new GregorianCalendar(2009, Calendar.JUNE,20),new GregorianCalendar(2010, Calendar.APRIL, 14),e3);
	Enfermedad e4 = new Enfermedad("Escapula Elevada");
	Proyecto p4 = new Proyecto("Proyecto 4", new GregorianCalendar(2009, Calendar.JANUARY,2),new GregorianCalendar(2009, Calendar.AUGUST, 16),e4);
	Proyecto p5 = new Proyecto("Proyecto 5", new GregorianCalendar(2009, Calendar.JANUARY,14),new GregorianCalendar(2009, Calendar.NOVEMBER, 22),e4);
	Historia h1 = new Historia(e1,new UsuarioNormal("Pepe"),new String("esta es la historia de prueba 1 escrita por Pepe"));
	Historia h2 = new Historia(e1,new UsuarioNormal("Francisco"),new String("esta es la historia de prueba 2 escrita por Francisco y es un poco mas larga para ver como queda"));
	Firma f1 = new Firma("Manuel","Molero",new Nif("47013928L"));
	Firma f2 = new Firma("Francisco","Benitez",new Nif("47013928M"));
	UsuarioCualificado u1 = new UsuarioCualificado("Luis", lenf);
	
	
	private datos(){
		lpro = new LinkedList<Proyecto>();
		usuarios = new LinkedList<UsuarioCualificado>();
		usuarios.add(u1);
		lpro.add(p1);
		lpro.add(p2);
		lpro.add(p3);
		lpro.add(p4);
		lpro.add(p5);
		lhis = new LinkedList<Historia>();
		lhis.add(h1);
		lhis.add(h2);
		e1.addProyecto(p1);
		e2.addProyecto(p2);
		e3.addProyecto(p3);
		e4.addProyecto(p4);
		e4.addProyecto(p5);
		lfir = new LinkedList<Firma>();
		lenf = new LinkedList<Enfermedad>();
		lenf.add(e1);
		lenf.add(e2);
		lenf.add(e3);
		lenf.add(e4);
		lfir.add(f1);
		lfir.add(f2);
		
	}
	
	public boolean comprueba(String nombre){
		Iterator it = lenf.iterator();
		boolean esta=false;
		Enfermedad aux = null;
		while(it.hasNext() && !esta){
			aux = (Enfermedad)it.next();
			if(nombre.equals(aux.getNombreComun()))
				esta=true;
		}
		return esta;
	}
	
	public Enfermedad getEnfermedad(String nombre){
		Iterator it = lenf.iterator();
		boolean esta=false;
		Enfermedad aux = null;
		while(it.hasNext() && !esta){
			aux = (Enfermedad)it.next();
			if(nombre.equals(aux.getNombreComun()))
				esta=true;
		}
		return aux;
	}
	
	
	public boolean compruebaFirma(String dni){
		Iterator it = lfir.iterator();
		boolean esta=false;
		Firma aux = null;
		while(it.hasNext() && !esta){
			aux = (Firma)it.next();
			if(aux.getNif().getCadena().equals(dni))
				esta=true;
		}
		return esta;
	}
	public Proyecto getProyecto(String nom){
		Iterator it = lenf.iterator();
		Iterator it2 =null;
		Enfermedad aux=null;
		Proyecto ret = null;
		Proyecto auxp = null;
		Collection proyectos=null;
		while(it.hasNext()){
			aux = (Enfermedad)it.next();
			proyectos = aux.getProyectos();
			it2 = proyectos.iterator();
			while(it2.hasNext()){
				auxp = (Proyecto)it2.next();
				if(auxp.getNombre().equals(nom))
					ret = auxp;
			}
		}
		return ret;
	}
	
	public List getHistorias(){
		return lhis;
	}
	
	public List getUsuariosC(){
		return this.usuarios;
	}
	
	public List getProyectos(){
		return this.lpro;
	}
}
