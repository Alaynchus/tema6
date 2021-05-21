package objetosArray;

import inicioArray.Consola;

public class ArrayAscendente {
	
	public static void main(String[] args) {
		
		int[] arr=new int[5];
		int ocupados=0;
		int resp;
		System.out.println("Introduce el numemo 1");
		arr[0]=Consola.leeInt();
		ocupados++;
		for (int i = 1; i < arr.length; i++) {
			System.out.println("Introduce el numero "+(i+1));
			resp=Consola.leeInt();
			while(resp<arr[i-1]) {
				System.out.println("Numero menor al anterior. Introduce el numero "+(i+1));
				resp=Consola.leeInt();
			}
			arr[i]=resp;
			ocupados++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}	
}
