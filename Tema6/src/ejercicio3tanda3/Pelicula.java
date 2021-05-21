package ejercicio3tanda3;

public class Pelicula {
	private String nombre;
	private int duracion;
	private int ano;
	
	Pelicula(String nom, int dura, int an){
		nombre=nom;
		duracion=dura;
		ano=an;
	}
	
	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", duracion=" + duracion + ", ano=" + ano + "]";
	}

	public boolean esIgual(Pelicula pel) {
		if(pel.nombre.toUpperCase().equals(nombre.toUpperCase()) && pel.ano==this.ano) {
			if(pel.duracion==this.duracion) {
				return true;
			}
			if(pel.duracion>this.duracion) {
				if(pel.duracion-5<=this.duracion) {
					return true;
				}
			}	
			if(pel.duracion<this.duracion) {
				if(pel.duracion+5>=this.duracion) {
					return true;
				}
			}
			
		}
		return false;
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public int getAno() {
		return ano;
	}

	public static void main(String[] args) {
		Pelicula pel1=new Pelicula("Alatv", 20, 2012);
		Pelicula pel2=new Pelicula("AlaTv", 15, 2012);
		System.out.println(pel1.esIgual(pel2));
	}
}
