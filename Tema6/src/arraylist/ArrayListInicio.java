package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListInicio {
	public static void main(String[] args) {
		boolean lotiene=false;
		float suma=0;
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for (int i = 0; i < 8; i++) {
			arr.add((int)(Math.random()*201)-100);
		}
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i).intValue()+"\t");
			suma=suma+arr.get(i).intValue();
		}
		System.out.println();
		System.out.println(suma/arr.size());
		suma=0;
		Iterator<Integer> it=arr.iterator();
		while(it.hasNext()) {
			Integer num=it.next();
			System.out.print(num.intValue()+"\t");
			suma=suma+num.intValue();
		}
		System.out.println();
		System.out.println(suma/arr.size());
		suma=0;
		for(Integer num:arr) {
			System.out.print(num+"\t");
			suma+=num;
		}
		System.out.println();
		System.out.println(suma/arr.size());
		it=arr.iterator();
		while(it.hasNext()&&lotiene==false) {
			if(it.next().intValue()==13) {
				System.out.print("Lo contiene");
				lotiene=true;
			}
		}
		if(lotiene==false) {
			System.out.println("No lo tiene");
		}
		
	}
	
}
