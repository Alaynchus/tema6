package ejercicio1tanda1;

import inicioArray.Consola;

public class Ejecicio1 {
	static int suma;
	static double media;
	
	static double media (int[] arr){
		for (int i = 0; i < arr.length; i++) {
			suma=+arr[i];
		}
		media=suma/5;
		return media;
	}
	public static void main(String[] args) {
		final int N=5;
		int num;
		int contmayormedia=0;
		int notamax=0, contnotamax=1;
		float porcen;
	
		int[] arr=new int[N];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Hola");
			System.out.println("Introduce un numero del 0 al 10");
			num=Consola.leeInt();
			while (num<0 || num>10) {
				System.out.println("Numero incorrecto. Introduce un numero del 0 al 10");
				num=Consola.leeInt();
			}
			arr[i]=num;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>media(arr)) {
				contmayormedia++;
			}
			if (notamax<=arr[i]) {
				if(notamax<arr[i]) {
				notamax=arr[i];
				contnotamax=1;
				}
				else{
					contnotamax++;
				}
			}
		}
		porcen=contmayormedia*100/5;
		System.out.println("El porcentaje de datos que superan la media es "+porcen+"%");
		System.out.println("La nota maxima es "+notamax+"y ha aparecido "+contnotamax+" veces");
	}
}
