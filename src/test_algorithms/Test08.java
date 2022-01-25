package test_algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test08 {
	public static int[] solution(int[] progresses, int[] speeds) {
        
		Queue<Integer> que = new LinkedList<Integer>();
		List<Integer> returnList = new ArrayList<Integer>();
		
		for(int i=0; i<speeds.length; i++) {
			int time =0;
			if((100-progresses[i]) % speeds[i] == 0 ) {
				time = (100-progresses[i]) / speeds[i];
			} else {
				time = (100-progresses[i]) / speeds[i] +1;
			}
			
			if(!que.isEmpty() && que.peek() < time) {
				returnList.add(que.size());
				que.clear();
			}
			
			que.offer(time);
			
		}
		
		returnList.add(que.size());
		
		int[] answer = new int[returnList.size()];
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = returnList.get(i);
		}
		
		
        return answer;
    }
	
	public static void main(String[] args) {
		
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		
		System.out.println(Arrays.toString(solution(progresses,speeds)));
	}
}
