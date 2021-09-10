
public class question_2 {
	public static void main(String[] args) {
		question_2 reverseString = new question_2();
		System.out.println(reverseString.soulution1("Hello".toCharArray()));
		
	}
	
	
	/*
	 *  H e l l o -> o l l e h 
	 *  ���� ó�� ���ڸ� �Ųٷ� ������ �Լ��� �ۼ��ض�
	 */
	
	
	/* ��Ģ
	 * 4 - 4 -> 0
	 * 4 - 3 -> 1
	 * 4 - 2 -> 2
	 * 4 - 1 -> 3
	 * 4 - 0 -> 4
	 * 
	 *  message.length-1 => length�� 5������ -1�� ����� �Ѵ�.
	 *  
	 *  �ð����⵵�� O(n) -> ������ ��ȸ�ؾ��ϴϱ� 
	 *  �������⵵�� O(n) -> �迭�� 1�� ��������ϱ�
	 */
	
	private char[] soulution1(char[] message) {
		char[] reversedMessage = new char[message.length];

		for (int i = message.length-1; i >= 0; i--) {
			reversedMessage[message.length - 1 - i] = message[i];
		}
 		return reversedMessage;
	}
	
}
