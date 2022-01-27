package test_algorithms;


import java.util.LinkedList;

import java.util.Queue;

public class Test09 {
	
	static class printer{
		
		private int priorities;
		private int location;
		public int getPriorities() {
			return priorities;
		}
		public void setPriorities(int priorities) {
			this.priorities = priorities;
		}
		public int getLocation() {
			return location;
		}
		public void setLocation(int location) {
			this.location = location;
		}
	}
	
	
	public static int solution(int[] priorities, int location) {



		Queue<printer> que = new LinkedList<>();
		
		for(int i=0; i<priorities.length; i++) {
			printer print = new printer();
			
			print.setLocation(i);
			print.setPriorities(priorities[i]);
			
			que.add(print);
			
			
		}
		
		
		

		int answer = 0;
		int cnt = 0;
		while(!que.isEmpty()) {
			
			printer poll = new printer();
			
			poll = que.poll();
			boolean flag = true;
			
			for(printer p : que) {
				
				if(p.getPriorities()>poll.getPriorities()) {
					flag = false;
				}
			}
			
			if(!flag) {
				que.offer(poll);
				continue;
			}
			cnt++;
			if(poll.getLocation()==location) {
				answer = cnt;
				break;
			}
			
			
			
			
			
			
			
		}
		
		
		
		
		return answer;
		
		
		
	}

	public static void main(String[] args) {

		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;

		System.out.println(solution(priorities,location));
	}
}
