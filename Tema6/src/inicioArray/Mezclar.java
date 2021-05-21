package inicioArray;

public class Mezclar {
	public static void main(String[] args) {
		int[] arr1= {0,2,4,6,8};
		int[] arr2= {1,3,5,7,9};
		int[] arr3=new int[10];
		for (int i=0, j=0; i < arr1.length; i++, j=j+2) {
			arr3[j]=arr1[i];
			arr3[j+1]=arr2[i];
		}
		
		for (int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i]+"\t");
		}
		System.out.println();
	}
}
