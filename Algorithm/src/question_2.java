
public class question_2 {
	public static void main(String[] args) {
		question_2 reverseString = new question_2();
		System.out.println(reverseString.soulution2("Hello".toCharArray()));
		
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
	
	
	// h e l l o
	// he l lo
	// 4 - 0 -> 4
	// 4 - 1 = 3
	
	/*
	 * ����� �ִ� �ε����� �ٲ��� �ʿ䰡 ����.
	 * Ȧ�� �϶��� ��� ������ 1�� ����
	 * ¦�� �϶��� ��� ���� ��ȸ�ϸ� �ȴ�.
	 * 
	 * �ð����⵵�� O(n)
	 * �������⵵�� O(1) -> ���ٸ� array�� ���������� �ʰ� �������ִ� array�� ����߱⿡ 
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
	 * StringBuilder ���� �н� �ϱ�
	 *
	 * StringBuilder�� 
	 * String�� ���� �Һ�(immutable)��ü��� �Ѵ�. 
	 * 
	 * String str1 = "abc" 
	 * String str2 = "dfg"
	 * �� �ΰ��� String ��ü�� ���� �� ����, 
	 * 
	 * str1 + str2
	 * 
	 * �� ���� ������ �ϰ� �Ǹ� ���ο� String�� �����ϰ� �ȴ�.
	 * StringBuilder�� �̿� ���� ���ο� String�� ������ ���� ���� ����ϴ°��̴�.
	 * 
	 * StringBuilder�� String�� ���ڿ��� ���� �� ���ο� ��ü�� �����ϴ� ���� �ƴ϶�
	 * ������ �����Ϳ� ���ϴ� ����� ����ϱ� ������ �ӵ��� ������ ��������� ���ϰ� ����
	 * 
	 * ���� �� ���ڿ��� ���ϴ� ��Ȳ�� �߻��� ��� StringBuilder�� ���������� ����ϸ� �ȴ�.
	 * 
	 * 
	 * 
	 */
	
}
