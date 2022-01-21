package test_algorithms;

import java.util.Arrays;

public class Test05 {
	public static int[] solution(int[] array, int[][] commands) {
        
	
		int[] answer = new int[commands.length];
		for(int i=0; i<commands.length; i++) {
			
			
			int a = commands[i][0];
			int b = commands[i][1];
			int c = commands[i][2];
			int[] array2 = Arrays.copyOfRange(array, a-1, b); // copyOfRange = (복사할 배열,시작인덱스,배열크기)
			System.out.println(Arrays.toString(array2));
			Arrays.sort(array2); //Arrays.sort = 배열을 오름차순으로 정렬
			
			answer[i] = array2[c-1];
		}
		
		
		
		
		
        return answer;
    }
	
	
	public static void main(String[] args) {
		
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};
		
		
		
		System.out.println(Arrays.toString(solution(array,commands)));
 	}
}
