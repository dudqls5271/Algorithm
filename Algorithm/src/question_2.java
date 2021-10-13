
public class question_2 {
	public static void main(String[] args) {
		question_2 reverseString = new question_2();
		System.out.println(reverseString.soulution2("Hello".toCharArray()));
		
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
	
	
	// h e l l o
	// he l lo
	// 4 - 0 -> 4
	// 4 - 1 = 3
	
	/*
	 * 가운데이 있는 인덱스는 바꿔줄 필요가 없다.
	 * 홀수 일때는 가운데 값보다 1개 빼고
	 * 짝수 일때는 가운데 까지 순회하면 된다.
	 * 
	 * 시간복잡도는 O(n)
	 * 공간복잡도는 O(1) -> 별다른 array를 지정해주지 않고 기존에있던 array을 사용했기에 
	 * */
	
	private char[] soulution2(char[] message) {
		for(int i = 0; i < message.length/2; i++) {
			char temp = message[i];
			message[i] = message[message.length-  1 - i];
			message[message.length - 1 - i] = temp;
		}
 		return message;
	}
	
	
	
	/*
	 * StringBuilder 사용법 학습 하기
	 *
	 * StringBuilder란 
	 * String은 소위 불변(immutable)객체라고 한다. 
	 * 
	 * String str1 = "abc" 
	 * String str2 = "dfg"
	 * 이 두개의 String 객체가 있을 때 만약, 
	 * 
	 * str1 + str2
	 * 
	 * 와 같은 연산을 하게 되면 새로운 String을 생성하게 된다.
	 * StringBuilder은 이와 같이 새로운 String의 생성을 막기 위해 사용하는것이다.
	 * 
	 * StringBuilder는 String과 문자열을 더할 때 새로운 객체를 생성하는 것이 아니라
	 * 기존의 데이터에 더하는 방식을 사용하기 때문에 속도고 빠르며 상대적으로 부하가 적다
	 * 
	 * 따라서 긴 문자열을 더하는 상황이 발생할 경우 StringBuilder을 적극적으로 사용하면 된다.
	 * 
	 * 
	 * 
	 */
	
}
