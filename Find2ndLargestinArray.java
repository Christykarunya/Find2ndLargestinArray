package week1.day2;

import java.util.Arrays;

public class Find2ndLargestinArray {

	public static void main(String[] args) {
		//input
		int[] data= {3,2,11,4,6,7};
		int length=data.length;
		//sorting array
		Arrays.sort(data);
		System.out.println("Sorted array");
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		System.out.println("Second largest number is :" + data[length-2]);
	}

}
