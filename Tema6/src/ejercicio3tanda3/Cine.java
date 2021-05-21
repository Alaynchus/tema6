package ejercicio3tanda3;

import java.util.ArrayList;
import java.util.Iterator;

public class Cine {
	private String nombre;
	private ArrayList <Pelicula> pelis;
	private Pelicula[] salas;
	
	Cine (String nom, int numsalas){
		nombre=nom;
		pelis=new ArrayList <Pelicula>();
		for (int i = 0; i < numsalas; i++) {
			pelis.add(null);
		}
		salas=new Pelicula[numsalas];
	}
	public int salaPeli(Pelicula pel ) {
		int cont=1;
		Iterator <Pelicula> it=this.pelis.iterator();
		while(it.hasNext() && it.next()!=null) {
			if(it.next().esIgual(pel)) {
				return cont;
			}
			cont++;
		}
		return 0;
	}
	public void anadepeli(Pelicula pel) {
		
		pelis.add(pel);
	}
	public void anadepeli(Pelicula pel, int numsala) {
		pelis.add(numsala-1, pel);
	}
	public void ver() {
		Iterator <Pelicula> it=this.pelis.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public static void main(String[] args) {
		Pelicula pel1=new Pelicula("Alatv", 20, 2012);
		Pelicula pel2=new Pelicula("Alapc", 15, 2012);
		Pelicula pel3=new Pelicula("Unai", 15, 2012);
		Cine c1=new Cine("Yelmo", 8);
		c1.anadepeli(pel1);
		c1.anadepeli(pel2, 1);
		c1.ver();
		System.out.println(c1.salaPeli(pel2));
		System.out.println(c1.salaPeli(pel1));
	}
}

