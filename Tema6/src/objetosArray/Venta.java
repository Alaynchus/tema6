package objetosArray;

public class Venta {
	private String producto;
	private int cantidad;
	private float precio;

	Venta(String pro, int cant, int pre){
		producto=pro;
		cantidad=cant;
		precio=pre;
	
	}
	public float ganancia() {
		return(cantidad*precio);
	}
	public void ver() {
		System.out.println("Venta [producto=" + producto + ", cantidad=" + cantidad + ", precio=" + precio + "]");
	}
	
	
}
