package objetosArray;

public class Vendedor {
	private String nombre;
	private Venta[] arrayVentas;
	private int ocupados;
	
	public Vendedor(String nom, int maxVentas){
		nombre=nom;
		arrayVentas=new Venta[maxVentas];
	}
	public void agregarVentas(Venta v){
		if (ocupados==arrayVentas.length) {
			System.out.println("No se pueden meter mas venatas a este vendedor");
		}
		else {
			arrayVentas[ocupados]=v;
			System.out.println("Venta introducida correctamente");
			ocupados++;
		}
	}
	public void ver() {
		System.out.println(nombre);
		for (int i = 0; i <ocupados; i++) {
			arrayVentas[i].ver();
		}
	}
	public static void main(String[] args) {
		Venta v=new Venta("moto", 4, 1500);
		Vendedor vend=new Vendedor("Mikel", 3);
		vend.ver();
		vend.agregarVentas(v);
		vend.ver();
		vend.agregarVentas(v);
		vend.agregarVentas(v);
		vend.agregarVentas(v);
		vend.ver();
		
	}
}
