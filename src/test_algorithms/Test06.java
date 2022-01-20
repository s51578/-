package test_algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class Test06 {
	 public static String solution(int[] numbers) {

		 	String[] convert = new String[numbers.length];
		 	
		 	int i =0;
		 	for(int j : numbers) {
		 		convert[i] = String.valueOf(j);
		 		i++;
		 	}
		 	
		 	Arrays.sort(convert, new Comparator<String>() {
		 		@Override
		 		public int compare(String o1,String o2) {
		 			return (o2+o1).compareTo(o1+o2);
		 		}
			});
		 	
		 	String answer = "";
		 	for(int j=0; j<convert.length; j++) {
		 		if(convert[0].equals("0"))
		 			answer = "0";
		 		else {
		 			answer += convert[j];
		 		}
		 	}
		 	
		 	
	        return answer;
	    }
	 
	 public static void main(String[] args) {
		
		 int[] numbers = {3, 30, 34, 5, 9};
		 
		 System.out.println(solution(numbers));
	}
}
