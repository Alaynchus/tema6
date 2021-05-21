package ejemarraylistalumno;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
	private ArrayList <Alumno> alumnos;
	
	public Test() {
		alumnos=new ArrayList<Alumno>();
	}
	public void verInfo() {
		Iterator <Alumno> it=this.alumnos.iterator();
		while(it.hasNext()) {
			it.next().ver();
			System.out.println();
		}
	}
	public boolean borrarAlumno(String str) {
		boolean borrado=false;
		Iterator <Alumno> it=this.alumnos.iterator();
		while(it.hasNext()) {
			Alumno alum=it.next();
			if(alum.getNombre().substring(0, str.length()).equals(str)) {
				it.remove();
				borrado=true;
			}
		}
		return borrado;
	}
	public boolean esta(Alumno a) {
		Iterator <Alumno> it=this.alumnos.iterator();
		while(it.hasNext()) {
			Alumno aux=it.next();
			if(a.getNombre()==aux.getNombre() && a.getEdad()==aux.getEdad()) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		float [] arr1= {5, 6, 7, 2, 5};
		Alumno al1=new Alumno("Alayn", 18, arr1);
		float [] arr2= {4, 3, 7, 2, 5};
		Alumno al2=new Alumno("Paco", 18, arr2);
		float [] arr3= {5, 6, 7, 2, 5};
		Alumno al3=new Alumno("Alfredo", 18, arr1);
		Alumno al4=new Alumno("Alayn", 18, arr1);
		Test test1=new Test();
		test1.alumnos.add(al1);
		test1.alumnos.add(al2);
		test1.alumnos.add(al3);
		test1.verInfo();
		System.out.println(test1.esta(al4));
		
		
	}
}
