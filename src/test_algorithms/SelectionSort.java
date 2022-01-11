package test_algorithms;

public class SelectionSort {
	public static void main(String[] args) {
		
		int[] selection = {6,1,7,8,9,3,5,4,2};
		
		int change =0;
		int minIndex=0;
		
		for(int i=0; i<selection.length-1; i++) {
			
			int min=selection[i];
			for(int j=i; j<selection.length; j++) {
				if(selection[j]<min) {
					min = selection[j];
					minIndex=j;
				}
				
				
			}
			
			change = selection[i];
			selection[i] = selection[minIndex];
			selection[minIndex] = change;
			
		}
		
		
		
		
	}
}
