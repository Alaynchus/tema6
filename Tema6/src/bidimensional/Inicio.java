package bidimensional;
public class Inicio {
	public static void cargarMatriz(int[][] mat) {
		int num=1;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j]=num;
				num++;
			}
		}
	}
	public static void verMatriz(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] matriz=new int[6][8];
		cargarMatriz(matriz);
		verMatriz(matriz);
	}
}
