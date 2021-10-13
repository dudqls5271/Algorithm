import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class question_3 {

	public static void main(String[] args) {
		question_3 twoSumSolutions = new question_3();
		System.out.println(Arrays.toString(twoSumSolutions.solution2(new int[]{2,3,5,7,4}, 9)));
		
	}

	
	/*
	 * ���ڷ� ������ �迭 nummers�� target ���ڰ� �ϳ��� �־������� nummders �迭�� ����ִ� ��
	 * ���� ���� target ���ڸ� ���� �� �ִ� �ε��� �ΰ��� ã�� �Լ��� �ۼ��϶�.
	 * 
	 * Ex) nummbers = [2,3,5,7] target = 8
	 * 8�� ���� �� �ִ� 3�� 5�� �ε����� 1,2�� �����ؾ� �Ѵ�.
	 * Ex) nummbers = [1,2,6,8] target = 9
	 * 9�� ���� �� �ִ� 1�� 8�� �ε����� 0,3�� �����ؾ��Ѵ�.
	 */
	
	
	/*
	 * ������ 2�� �������ϱ�
	 * �������⵵ : O(n��)
	 * 
	 * �������⵵�� �迭 1�� �����̴�.
	 * ������ �迭�� ���ִ� ������ �׻� 2���� ������ �Ǿ��ֱ⿡
	 * �ð����⵵ : O(1)
	 * */
	
	private int[] solution1(int[] numbers, int target) {
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] + numbers[j] == target) {
					return new int[] {i, j};
				}
			}
		}
		return null;
	}
	
	
	
	
	/*
	 * Map�� ä���� O(n)�� ���� get�ϰ� �� �ѰŴ� O(1)������ �Ű��� ���ʿ䰡 ����.
	 * �ð����⵵ : O(n)
	 * 
	 * Map�� 1���� ��������ϱ�
	 * �������⵵ : O(n)
	 */
	
	private int[] solution2(int[] numbers, int target) {
		// Map ����
		Map<Integer, Integer> numberMap = new HashMap<>();
		
		// Map�� �ִ� �����̴�. 
		// ���� Key�� �ְ�, values���ٰ� index�� �ִ´�.
//		for (int i = 0; i< numbers.length; i++) {
//			numberMap.put(numbers[i], i);
//		}
		
		for(int i = 0; i < numbers.length; i++) {
			// target�� 9 ���� ù��°�� �ִ� ���ڴ� 2
			// �׷����� 2 + x = 9�� �����ϸ�
			// 9 - 2�� �ϸ� x �� ���´�.
			int numbersToFind = target - numbers[i];
			
			// 2 3 4 5 -> 6�� ã�ƾ� �Ѵٸ� �ϸ�
			// ������ 3�� 2�� ������ �ȵǱ� ������ 
			// (numberMap.containsKey(numbersToFind) && numberMap.get(numbersToFind) != i) 
			// �� ���� if���� �߰� ���� ���̴�.
			
			if (numberMap.containsKey(numbersToFind) && numberMap.get(numbersToFind) != i) {
				return new int[] {i, numberMap.get(numbersToFind)};
 			}
			
			// x�� Key�� ������ �ִٸ� ~ 
			numberMap.put(numbers[i], i);
		}
		return null;
	}
	
	
	
	/*
	 * ���� �������� 3sum ������ �����Ͽ� ����
	 * 
	 * 2 3 4 
	 * 
	 * �̰� ������ 2�� ���ļ� Ǯ�����.
	 * */
	
	
	private int[] solution3(int[] numbers, int target) {
		Map<Integer, Integer> numberMap = new HashMap<>();
		
		// 2 + x + x = 
		for(int i = 0; i < numbers.length; i++) {
			
		}
		return null;
	}
	
	private int[] solution3_1(int[] numbers, int target){
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				for(int k = j + 1; k < numbers.length; k++) {
			  		if (numbers[i] + numbers[j] + numbers[k] == target) {
						return new int[] {i, j, k};
				  	}
			  	}
			}
		}
		return null;
  	}
	
	private static int[] arrayTwoSumTarget3(int[] numArr, int target){
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < numArr.length; i++) {
            int result = target - numArr[i];
            for (int j = i+1; j < numArr.length; j++) {
                int result2 = result - numArr[j];

                if(numMap.containsKey(result2) && numMap.get(result2) != j && numMap.get(result2) != i){
                    return new int[]{i, j, numMap.get(result2)};
                }
            }
            numMap.put(numArr[i], i);
        }

        return null;
    }
}
