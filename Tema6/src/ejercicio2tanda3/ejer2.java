package ejercicio2tanda3;

import java.util.ArrayList;

public class ejer2{
	ArrayList <Punto> arr;
	
	public ejer2(){
		arr=new ArrayList <Punto>();
		arr.add(new Punto(3,7));
		arr.add(new Punto(4,6));
		arr.add(new Punto(3,7));
		arr.add(new Punto(8,2));
		arr.add(new Punto(6,1));
	}
	public ejer2(ArrayList arrl) {
		arr=new ArrayList <Punto>();
		this.arr=arrl;
	}
	public static void ver(ArrayList <Punto> arr) {
		for(Punto p:arr) {
			System.out.print(p+"\t");
		}
		
	}
	public static void main(String[] args) {
		ejer2 arr=new ejer2();
		ver(arr);
	}
}
