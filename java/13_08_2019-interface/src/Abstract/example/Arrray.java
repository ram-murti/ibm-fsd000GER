package Abstract.example;

import java.util.Arrays;

public class Arrray {
private char arr[];
public int arr1[]= {
		2, 10, 33,100
};

public Arrray() {
	
}
public void createArrray(int length) {
	arr= new char[length];
	for(int i=0;i<arr.length;i++) {
		arr[i]=(char)('A'+i);
	}
}
public char[] getArray() {
	return arr;
}
public boolean findElement(int item) {
	int i=Arrays.binarySearch(arr1, item);
	System.out.println(Arrays.binarySearch(arr1, item));
			if(i>=0) {
				return true;
			}
			else {
				return false;
			}
}

}
