package test_algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class Test10 {
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        
        Queue<Integer> truckque = new LinkedList<Integer>();
        Queue<Integer> bridge = new LinkedList<Integer>();
        for(int i : truck_weights) {
        	truckque.add(i);
        }
        
        for(int i=0; i<bridge_length; i++) {
        	bridge.add(0);
        }
        
        int cnt=0;
        int sum=0;
        while(!bridge.isEmpty()) {
        	int truck =0;
        	
        	
        	sum -= bridge.poll();
        	
        	if(truckque.isEmpty()) {
        		
        		cnt += bridge_length;
        		
        		break;
        	} 
        	
        	
    		truck = truckque.peek();
    		sum += truck;
    		if(sum<=weight) {
    			bridge.add(truckque.poll());
    			
    		} else {
    			
    			bridge.add(0);
    			sum -= truck;
    		}
        		
        	
        	
        	cnt++;
        	
        	
        }
        answer = cnt;
        
        
        
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		int bridge_length = 100;
		int weight = 100;
		int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};
		
		System.out.println(solution(bridge_length,weight,truck_weights));
	}
}
