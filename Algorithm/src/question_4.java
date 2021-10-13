import java.util.Arrays;

public class question_4 {
	public static void main(String[] args) {
		question_4 sorByArray = new question_4();
		System.out.println(Arrays.toString(sorByArray.solution(new int[]{2,3,5,7,4,9})));
		
	}
//	����
//	1���� 100������ ���� �߿��� 50���� ������ ���ڰ� ����ִ� �迭�̴�.
//	�� �迭�� O(n)�� �ð� ���⵵�� �����϶�
	
	
	/*
	 * �Է°��� ������ �Ǿ��ִ�.
	 * �迭�� �ε����� ����ϴ� ���
	 */
	
	private int[] solution(int[] number) {
		//boolean���·� �迭�� 100���� ������ش�. ������ 100������� ��������
		boolean [] booleans = new boolean[100];
		
		// ������ ������� �迭�� ���鼭 number�� �ִ� ���ڰ� �ִٸ�,
		// true �־��ش�.
		for (int num : number) {
			booleans[num] = true;
		}
		
		int index = 0;
		
		// �� ���� index�� �־��ָ� �ȴ�.
		for (int i = 0; i < booleans.length; i++) {
			if (booleans[i]) {
				number[index++] = i;
			}
		}
		
		return number;
	}
}
