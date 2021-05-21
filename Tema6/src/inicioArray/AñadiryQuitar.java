package inicioArray;



public class AñadiryQuitar {
	public static void main(String[] args) {
	
	int[] arr={2,8,12,30,7,3};
	int cuantosllenos=6;
	
	for (int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+"\t");
	}
	System.out.println();
	arr[2]=0;
	cuantosllenos--;
	for (int i = 3; i <= cuantosllenos; i++) {
		arr[i-1]=arr[i];
	}
	for (int i=0; i<cuantosllenos; i++) {
		System.out.print(arr[i]+"\t");
	}
	System.out.println();
	for (int i = cuantosllenos; i > 2; i--) {
		arr[i]=arr[i-1];
	}
	arr[2]=100;
	cuantosllenos++;

	for (int i=0; i<cuantosllenos; i++) {
		System.out.print(arr[i]+"\t");
	}
	}
}
