package objetosArray;

public class ParamentosMain {
	public static void main(String[] args) {
		int[] arr1=new int[Integer.parseInt(args[0])];
		int[] arr2=new int[Integer.parseInt(args[1])];
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+"\t");
		}
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+"\t");
		}
	}
}
