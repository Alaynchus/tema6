package ejercicio3tanda1;

import inicioArray.Consola;


public class OpArray {
	int[] arr;
	int[] arrpro={1, 4, 6};
	final int N=3;
	int llenos=0;
	OpArray(){
		arr=new int[N];
	}
	OpArray(int num) {
		arr=new int[num];
	}
	void cargarArray() {
		int zenbakia;
		System.out.println("Introduce un numero, 0 para salir");
		zenbakia=Consola.leeInt();
		for (int i = 0; i < arr.length && zenbakia!=0; i++) {
			if (zenbakia!=arrpro[0] && zenbakia!=arrpro[1] && zenbakia!=arrpro[2]) {
				arr[i]=zenbakia;
				llenos++;
			}
			else {
				System.out.println("Numero prohibido");
				i--;
			}
			if(i<arr.length-1) {
				System.out.println("Introduce un numero, 0 para salir");
				zenbakia=Consola.leeInt();
			}
		}		
	}
	
	void ver() {
		for (int j = 0; j < llenos; j++) {
			System.out.print(arr[j]+"\t");
		}
	}
	
	
	public String toString() {
		String numero="";
		for (int i = 0; i < llenos; i++) {
			numero=numero+arr[i];
		}
		return numero;
	}
	boolean esPrimo(int p) {
		boolean esprimo=true;
		int cont=2;
		while (cont<=p/2 && esprimo==true) {
			if (p%cont==0) {
				esprimo=false;
			}
			cont++;
		}
		return esprimo;
	}
	int indicePrimo() {
		int s=-1;
		for (int i = 0; i < llenos; i++) {
			if (esPrimo(arr[i])==true) {
				return i+1;
			}
		}
		return s;
	}
	void rotar() {
		int aux=0, aux2;
		aux=arr[0];
		for (int i = 0; i < llenos-1; i++) {
			aux2=arr[i+1];
			arr[i+1]=aux;
			aux=aux2;	
		}
		arr[0]=aux;
		
	}
	
	public static void main(String[] args) {
		OpArray arr1=new OpArray();
		OpArray arr2=new OpArray(4);
		arr2.cargarArray();
		arr2.ver();
		System.out.println();
		System.out.println(arr2.toString());
		arr2.indicePrimo();
		arr2.rotar();
		arr2.ver();
	}
}
