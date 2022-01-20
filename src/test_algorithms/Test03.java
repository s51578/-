package test_algorithms;


import java.util.ArrayList;
import java.util.HashMap;

public class Test03 {
	public static int solution(String[][] clothes) throws Exception {

		
//		if(clothes==null)
//			throw new Exception();
		
		int answer = 0;

		HashMap<String, Integer> clothesMap = new HashMap<String, Integer>();
		
		if(clothes.length!=0 && clothes.length<= 30) {
			for(int i=0; i<clothes.length; i++) {
				String name = clothes[i][0];
				String category = clothes[i][1];
				
				if(name==null) //exception
					continue;
				
				if(category==null) //ex
					continue;
				
				
				if(clothesMap.get(category)!=null) {
					int value = clothesMap.get(category);
					clothesMap.put(category, value+1);
				}
				else {

					clothesMap.put(category, 1);
				}
			}
			
			
			
			
			
			
			
			int cnt=1;
			if(clothesMap.size()>1) {



				for(int i=0; i<clothesMap.size(); i++) {

					cnt *= clothesMap.get(clothes[i][1])+1;

					answer = cnt-1;
				}
			}
			else {
				cnt = clothes.length;
				answer = cnt;
			}



			ArrayList<String> arr = new ArrayList<String>();

			for(int i=0; i<clothes.length; i++) {
				String name = clothes[i][0];
				String category = clothes[i][1];
				
				arr.add(name);
				
				
				for(int j=i+1; j<clothes.length; j++) {
					
					if(!category.equals(clothes[j][1]))
					arr.add(name +" "+ clothes[j][0]);
					
				}
				
			}
			System.out.println(arr);
		}
		return answer;
	}

	public static void main(String[] args) {

		String[][] clothes = {{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}};

		try {
			System.out.println(solution(clothes));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
