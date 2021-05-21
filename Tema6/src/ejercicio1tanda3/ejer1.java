package ejercicio1tanda3;

import java.util.ArrayList;
import java.util.Iterator;

public class ejer1 {
	static  public void ver(ArrayList arr) {
		 Iterator<Integer> it=arr.iterator();
			while(it.hasNext()) {
				Integer num=it.next();
				System.out.print(num.intValue()+"\t");
			}
	}
	static public void cargarDivisores( ArrayList arr, int n) {
		int cont=1;
		while(cont<=n/2 && arr.size()<10) {
			while(n%cont!=0) {
				cont++;
			}
			arr.add(cont);
			cont++;
		}
	}
	static public void cargarNoDupes(ArrayList arr) {
		for (int i = 0; i < 20; i++) {
			int num=(int)(Math.random()*41)-20;
			while(arr.indexOf(num)!=-1) {
				num=(int)(Math.random()*41)-20;
			}
			arr.add(num);
		}
	}
	public static void main(String[] args) {
		ArrayList <Integer> arr=new ArrayList <Integer>();
		for (int i = 0; i < 20; i++) {
			arr.add((int)(Math.random()*201)-100);
		}
		ver(arr);
		arr.clear();
		ver(arr);
		cargarDivisores(arr, 15);
		System.out.println();
		ver(arr);
		arr.clear();
		ver(arr);
		System.out.println();
		cargarNoDupes(arr);
		ver(arr);
		
	}
}
