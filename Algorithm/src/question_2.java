
public class question_2 {
	public static void main(String[] args) {
		question_2 reverseString = new question_2();
		System.out.println(reverseString.soulution1("Hello".toCharArray()));
		
	}
	
	
	/*
	 *  H e l l o -> o l l e h 
	 *  위에 처럼 문자를 거꾸로 뒤집는 함수를 작성해라
	 */
	
	
	/* 규칙
	 * 4 - 4 -> 0
	 * 4 - 3 -> 1
	 * 4 - 2 -> 2
	 * 4 - 1 -> 3
	 * 4 - 0 -> 4
	 * 
	 *  message.length-1 => length는 5임으로 -1을 해줘야 한다.
	 *  
	 *  시간복잡도는 O(n) -> 루프를 순회해야하니깐 
	 *  공간복잡도는 O(n) -> 배열을 1개 만들었으니깐
	 */
	
	private char[] soulution1(char[] message) {
		char[] reversedMessage = new char[message.length];

		for (int i = message.length-1; i >= 0; i--) {
			reversedMessage[message.length - 1 - i] = message[i];
		}
 		return reversedMessage;
	}
	
}
