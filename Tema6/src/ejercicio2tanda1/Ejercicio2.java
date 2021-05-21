package ejercicio2tanda1;

import inicioArray.Consola;

public class Ejercicio2 {
	public static void main(String[] args) {
		String respuesta;
		int i=0, b=0;
		String[] arr1=new String[10];
		String[] arr2=new String[10];
		System.out.println("Introduce una cadena, quit o QUIT para salir");
		respuesta=Consola.leeString();
		while(!(respuesta.equals("quit")) && !(respuesta.equals("QUIT"))) {
			arr1[i]=respuesta;
			System.out.println("Introduce una cadena, quit o QUIT para salir");
			respuesta=Consola.leeString();
			i++;
		}
		for (int j = 0, h=i-1 ; j < i; j++, h--) {
			arr2[j]=arr1[h];
		}
		String aux="", auxpalabra="";
		for (int j = 0; j < i; j++) {
			aux=arr2[j].trim();
			arr2[j]="";
			while ( aux.indexOf(' ')!=-1) {
				auxpalabra=aux.substring(0,aux.indexOf(' '));
				auxpalabra=auxpalabra.substring(0, 1).toUpperCase();
				auxpalabra=auxpalabra+aux.substring(1, aux.indexOf(' ')+1).toLowerCase();
				aux=aux.substring(aux.indexOf(' ')+1, aux.length());
				arr2[j]=arr2[j]+auxpalabra;
			}
			auxpalabra=aux;
			auxpalabra=auxpalabra.substring(0, 1).toUpperCase();
			auxpalabra=auxpalabra+aux.substring(1, aux.length()).toLowerCase();
			arr2[j]=arr2[j]+auxpalabra;
		}
			
		
		
		for (int j = 0; j < i; j++) {
			System.out.print(arr1[j]+"\t");
		}
		System.out.println();
		for (int j = 0; j < i; j++) {
			System.out.print(arr2[j]+"\t");
		}

	}
}
