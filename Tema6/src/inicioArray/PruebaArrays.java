package inicioArray;

public class PruebaArrays {
		public static void main(String[] args) {
			
			int[] arr=new int [10];
			int num=1;
			for (int i = 0; i < arr.length; i++) {
				arr[i]=num;
				num*=2;
			}		
			int suma=0;
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+"\t");
				suma+=arr[i];
			}
			System.out.println();
			System.out.println(suma);
		}
}
