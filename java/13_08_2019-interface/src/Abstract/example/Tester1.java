package Abstract.example;
import java.util.Arrays;
import java.util.Stack;
public class Tester1 {
public static void main(String[] args) {
	int arr[]= {
			100,1,-20,30,0
	};
	for(int i=0; i<arr.length;i++) {
		System.out.print(" "+arr[i]);
	}
	Arrays.sort(arr);
	for(int i=arr.length-1; i>0;i--) {
		System.out.println(" "+arr[i]);
	}
	System.out.println(Arrays.toString(arr));
	System.out.println(Arrays.binarySearch(arr, 100));
	Arrray array=new Arrray();
	System.out.println(array.findElement(100));
	
}
	
}

