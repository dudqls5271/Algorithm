import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



public class question_1 {
	
	//	���ڷ� ������ �迭�� �־������� �ߺ��� ���ڰ� �ִ��� Ȯ���ϴ� �Լ��� �ۼ��ض�. 
	//	�ߺ��� ���ڰ� �ִٸ� true �ƴϸ� false.
	
	
	/*  
	    �ð� ���⵵ : O(n2)
		���� ���⵵ : O(1) 
		
		���� ���⵵�� �޿� ������ �ð� ���⵵�� n2�� ���� ������ ���� �ƴϴ�.
	*/
	
	public static void main(String[] args) {
		question_1 question_1 = new question_1();
		System.out.println(question_1.solution3(new int[] {1,2,3,4,5}));
	}

	
	
	private boolean solution1 (int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					return true;
				}
			}
		}
		return false;
		
	}
	
	
	/*
	 * 	�迭�� ������ ������ �׻� ������ �Ǿ��ִ����� ��������
	 *	ex) 1 2 2 3 4
	 *  Arrays.sort�� ����ϸ� �ð� ���⵵�� O(N longN), �������⵵�� O(logN)�� �ȴ�.
	 */
	
	private boolean solution2 (int[] numbers) {
		Arrays.sort(numbers);  
		
		for(int i = 0; i < numbers.length -1 ; i++) {
			if (numbers[i] == numbers[i + 1]) {
				return true;
			}
		}
		
		return false;
	}
	
	
	/*
	 * Set�� �ߺ��� ������� �ʰ�, 
	 * �Ȱ��� ������Ʈ�� ����� ������ ����.
	 * Set�� Hash������ ��ȸ�� �ϱ� ������ O(1)�̴�. 
	 */
	
	private boolean solution3 (int[] numbers)  {
		Set<Integer> numberSet = new HashSet<>();
		
		for (int num : numbers) {
			if (numberSet.contains(num)) {
				return true;
			} else {
				numberSet.add(num);
			}
		}
		return false;
		
		
	}
	
	
	
	
	
	
}
