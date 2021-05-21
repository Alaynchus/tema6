package ejercicio2tanda2;

public class Matriz1 {
	private int[][] matriz;
	private final int NF=10, NC=7;
	
	public Matriz1() {
		matriz=new int [NF][NC];
		cargarPorFilas();
	}
	public Matriz1(int numf, int numc) {
		if(numf>NF && numc>NC) {
			matriz=new int[NF][NC];
		}
		else {
			if(numf>NF) {
				matriz=new int[NF][numc];
			}
			else {
				if(numc>NC) {
					matriz=new int[numf][NC];
				}
				else {
					matriz=new int[numf][numc];
				}
			}
		}
		cargarPorFilas();
	}
	public void cargarPorFilas() {
		int cont=1;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]=(int)(Math.random()*10)+cont;
			}
			cont+=10;
		}
	}
	public void ver() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public void invertirFilas() {
		int cont=0, aux;
		for (int i = 0; i < matriz.length; i++) {
			while((matriz[i].length/2)-1>=cont) {
				aux=matriz[i][matriz[i].length-cont-1];
				matriz[i][matriz[i].length-cont-1]=matriz[i][cont];
				matriz[i][cont]=aux;
				cont++;
			}
			cont=0;
		}
	}
	public boolean intercambiarFilas(int numfila1, int numfila2) {
		if(numfila1>matriz.length-1 || numfila2>matriz.length-1) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Matriz1 m1=new Matriz1(3,5);
		m1.ver();
		m1.invertirFilas();
		System.out.println();
		m1.ver();
		System.out.println(m1.intercambiarFilas(4, 2));
	}
}
