package ejemarraylistalumno;

public class Alumno {
	private String nombre;
	private int edad;
	private float [] notas;
	
	Alumno(String nom, int ed, float [] not){
		nombre=nom;
		edad=ed;
		notas=not;
	}
	public void ver() {
		System.out.println(nombre+", "+edad+" años, sus notas:");
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i]+"\t");
		}
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	
	
}
