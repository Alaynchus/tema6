package bidimensional;

public class Repetidos {
	
	public static void cargarMatriz(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				int num=(int)(Math.random()*3)+1;
				int k=0;
				//boolean encontrado=false;
				while(k<j) {
					while(num==mat[i][k]) {
						num=(int)(Math.random()*3)+1;
						k=0;
					}
					k++;
				}
				mat[i][j]=num;
			}
		}
	}
	public static boolean estaContenido(int[][] mat, int[] arr) {
		
		for (int i = 0; i < mat.length; i++) {
			boolean lotiene=true;
			for (int j = 0; j < mat.length && lotiene; j++) {
				if(arr[j]!=mat[i][j]) {
					lotiene=false;
				}
			}
			if(lotiene) {
				return true;
			}
		}
		return false;
	}
	public static void ver(int[][] mat) {
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] matriz= new int[3][3];
		int[] array= {1,2,3};
		cargarMatriz(matriz);
		ver(matriz);
		System.out.println(estaContenido(matriz, array));
	}
}
