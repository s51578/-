package test_algorithms;

import java.util.HashMap;

public class Test01 {
	
	    public static String solution(String[] participant, String[] completion) {
	        String answer = "";
	        
	        HashMap<String, Integer> finish_check = new HashMap<String, Integer>();
	        
	        for(String finish : participant) {
	        	
	        	if(finish_check.get(finish) != null)
	        	{
	        	finish_check.put(finish, finish_check.get(finish) +1);
	        	}
	        	else {
	        		finish_check.put(finish, 1);
	        	}
	        }
	        for(String finish : completion) {
	        	finish_check.put(finish, finish_check.get(finish)-1);
	        }
	        
	        
	        System.out.println(finish_check);
	        
	        for (String key : finish_check.keySet()) {
	        	if(finish_check.get(key) != 0) {
	        		answer = key;
	        	}
	        }
	        
	       
	        
	        return answer;
	    }
	public static void main(String[] args) {
		
		String[] part = {"mislav", "stanko", "mislav", "ana"};
		String[] comp = {"stanko", "ana", "mislav"};
		System.out.println(solution(part,comp));
		
		
		
		
	}
	
	
}
