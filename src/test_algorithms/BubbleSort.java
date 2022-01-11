package test_algorithms;

public class BubbleSort {
	public static void main(String[] args) {

		int[] bubble = {4,9,6,3,5,2,7,1,8};
		int change =0;
		for(int j=0; j<bubble.length; j++) {
			
			for(int k=0; k<bubble.length; k++) {
				System.out.print(bubble[k]+" ");
			}
			System.out.println("");
			for(int i=bubble.length-1; i>0; i--) {
				if(bubble[i]<bubble[i-1]) {
					change = bubble[i];
					bubble[i] = bubble[i-1];
					bubble[i-1] = change;
					
				}

				
				
					
			}
			
		}
		
	}
}
