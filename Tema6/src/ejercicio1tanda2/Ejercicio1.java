package ejercicio1tanda2;

import inicioArray.Consola;

public class Ejercicio1 {
	public  static void cargarMatrizManual(int[][] matriz) {
		
		for (int j = 0; j < matriz[0].length; j++) {
			for (int i = 0; i < matriz.length; i++) {
				System.out.println("Introduce la nota de la  asignatura "+(i+1)+" del alumno "+(j+1));
				matriz [i][j]=Consola.leeInt();
			}
		}
	}
	public  static void cargarMatrizRandom(int[][] matriz) {	
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz [i][j]=(int)(Math.random()*11);
			}
		}
	}
	public static void ver(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static int asigMediaMayor(int[][] mat) {
		int max=0,suma, numasig=0;
		for (int j = 0; j < mat[0].length; j++) {
			suma=0;
			for (int i = 0; i < mat.length; i++) {
				suma+=mat[i][j];
			}
			if(suma>max) {
					numasig=j;
					max=suma;
				}
		}
		return (numasig+1);
	}
	public static int[] suspensos(int[][] mat) {
		int[] arr=new int[mat.length];
		int contsus=0, porcsus;
		for (int i = 0; i < mat.length; i++) {
			contsus=0;
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j]<5) {
					contsus++;
				}
			}
			porcsus=100*contsus/mat[i].length;
			arr[i]=porcsus;
		}
		return arr;
	}
	public static int[][] numnotas(int[][] mat) {
		int[][] matnot=new int[mat.length][4];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j]<5) {
					matnot[i][0]++;
				}
				else {
					if(mat[i][j]<7) {
						matnot[i][1]++;
					}
					else {
						if(mat[i][j]<9) {
							matnot[i][2]++;
						}
						else {
							matnot[i][3]++;
						}
					}
				}
			}	
		}
		return matnot;
	}
	public static void main(String[] args) {
		int [][] matriz, matnot;
		int nfila, mcolumna;
		System.out.println("Introduce el numero de alumnos");
		nfila=Consola.leeInt();
		System.out.println("Introduce el numero de asignaturas");
		mcolumna=Consola.leeInt();
		matriz=new int[nfila][mcolumna];
		cargarMatrizRandom(matriz);
		ver(matriz);
		System.out.println();
		System.out.println(asigMediaMayor(matriz));
		System.out.println();
		int[] arr=suspensos(matriz);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		matnot=numnotas(matriz);
		for (int i = 0; i < matnot.length; i++) {
			for (int j = 0; j < matnot[i].length; j++) {
				System.out.print(matnot[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
