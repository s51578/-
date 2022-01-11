package test_algorithms;

public class Test02 {
	public static boolean solution(String[] phone_book) {


		boolean answer = true;
		if(phone_book.length!=0 && phone_book.length<= 1000000) {
			for(int i=0; i<phone_book.length; i++) {
				if(phone_book[i].length()!=0 || phone_book[i].length() <21) {

					for(int j=0; j<phone_book.length; j++) {
						if(phone_book[i].contains(phone_book[j]) && !phone_book[i].equals(phone_book[j])) {

							return false;
						}

					}

				}

			}
		}

		return answer;
	}
	public static void main(String[] args) {

		String[] input = {"119", "97674223", "1195524421"};


		System.out.println(solution(input));



	}
}
