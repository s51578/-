package test_algorithms;

//import java.util.Arrays;


public class Test07 {
	public static int solution(int[] citations) {
        
//정렬을 썼을 때		
		
//		Arrays.sort(citations);
//		int answer = 0;
//		int cnt=0;
//		for(int i=citations.length; i>0; i--) {
//            cnt++;
//			if(citations[i-1]>=cnt) {
//				answer = cnt;
//			}
//			
//			
//		}
//		
//		
//        return answer;
		
//정렬을 쓰지 않았을 때		
		
		int answer = 0;
		
		for(int i=1; i<=citations.length; i++) {
			int cnt=0;
			for(int j=0; j<citations.length; j++) {
				if(citations[j]>=i) {
					cnt++;
				}
			}
			
			if(cnt>=i) {
				answer = i;
			}
			
		}
		
		
        return answer;
    }
	
	public static void main(String[] args) {
		
		int[] citations = {3, 0, 6, 1, 5, 4,2,5,6,7,8};
		
		System.out.println(solution(citations));
	}
}
