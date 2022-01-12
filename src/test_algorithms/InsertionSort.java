package test_algorithms;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		
		int[] insertion = {5,3,4,7,2,8,6,9,1};
		int change =0;
		for(int i=1; i<insertion.length; i++) {
			change = insertion[i];
			for(int j=i; j>=0;j--) {
				
				if(insertion[i]<insertion[j]) {
					
					
					insertion[i] = insertion[j];
					insertion[j] = change;
					i--;
					
				}
			}
			
		}
		
		System.out.println(Arrays.toString(insertion));
	}
}
