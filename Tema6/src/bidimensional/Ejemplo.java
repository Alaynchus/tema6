package bidimensional;


public class Ejemplo {
	public static void cargarMatriz(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j]=(int)(Math.random()*81)+10;
			}
		}
	}
	public static void verMatrizNormal(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void verMatrizMetodo2(int[][] mat) {
		for (int i = mat.length-1; i >= 0; i--) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void verMatrizMetodo3(int[][] mat) {
		for (int i = mat.length-1; i >= 0; i--) {
			for (int j = mat[i].length-1; j >=0; j--) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void verMatrizMetodo4(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length-i; j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void verMatrizMetodo5(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(i<=j ) {
					System.out.print(mat[i][j]+"\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
	public static void verMatrizMetodo6(int[][] mat) {	
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(i>=j) {
					System.out.print(mat[i][j]+"\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
	public static void verMatrizMetodo7(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i].length-1-i<=j) {
					System.out.print(mat[i][j]+"\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
	public static void verMatrizMetodo8(int[][] mat) {	
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(i==j) {
					System.out.print(mat[i][j]+"\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}

	
	public static void verMatrizMetodo9(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i].length-1-i==j) {
					System.out.print(mat[i][j]+"\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
	public static void verMatrizMetodo10(int[][] mat) {	
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(i==j || mat[i].length-1-i==j) {
					System.out.print(mat[i][j]+"\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
	public static void matrizArray(int[][] mat, int[]arr) {
		for (int i = 0; i < mat.length; i++) {
			int suma=0;
			for (int j = 0; j < mat[i].length; j++) {
				suma+=mat[i][j];
			}
			arr[i]=suma;
			System.out.print(arr[i]+"\t");
		}
	}
	
	public static void main(String[] args) {
		int[][] matriz=new int[5][5];
		int[] arr=new int[matriz.length];
		cargarMatriz(matriz);
		verMatrizNormal(matriz);
		System.out.println();
		/*verMatrizMetodo4(matriz);
		System.out.println();
		verMatrizMetodo5(matriz);
		System.out.println();
		verMatrizMetodo6(matriz);
		System.out.println();
		verMatrizMetodo7(matriz);
		System.out.println();*/
		verMatrizMetodo8(matriz);
		System.out.println();
		verMatrizMetodo9(matriz);
		System.out.println();
		verMatrizMetodo10(matriz);
	}
}
