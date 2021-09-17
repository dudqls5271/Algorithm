import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class question_3 {

	public static void main(String[] args) {
		question_3 twoSumSolutions = new question_3();
		System.out.println(Arrays.toString(twoSumSolutions.solution2(new int[]{2,3,5,7,4}, 9)));
		
	}

	
	/*
	 * 숫자로 구성된 배열 nummers와 target 숫자가 하나가 주어졌을때 nummders 배열에 들어있는 두
	 * 수를 더해 target 숫자를 만들 수 있는 인덱스 두개를 찾는 함수를 작성하라.
	 * 
	 * Ex) nummbers = [2,3,5,7] target = 8
	 * 8을 만들 수 있는 3과 5의 인덱스인 1,2를 리턴해야 한다.
	 * Ex) nummbers = [1,2,6,8] target = 9
	 * 9를 만들 수 있는 1과 8의 인덱스인 0,3를 리턴해야한다.
	 */
	
	
	/*
	 * 루프를 2번 돌았으니깐
	 * 공간복잡도 : O(n²)
	 * 
	 * 공간복잡도는 배열 1개 정도이다.
	 * 하지만 배열이 들어가있는 갯수가 항상 2개로 고정이 되어있기에
	 * 시간복잡도 : O(1)
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
	 * Map을 채워서 O(n)이 들어갔고 get하고 뭐 한거는 O(1)임으로 신경을 쓸필요가 없다.
	 * 시간복잡도 : O(n)
	 * 
	 * Map을 1개더 만들었으니깐
	 * 공간복잡도 : O(n)
	 */
	
	private int[] solution2(int[] numbers, int target) {
		// Map 선언
		Map<Integer, Integer> numberMap = new HashMap<>();
		
		// Map에 넣는 과정이다. 
		// 값을 Key로 넣고, values에다가 index을 넣는다.
//		for (int i = 0; i< numbers.length; i++) {
//			numberMap.put(numbers[i], i);
//		}
		
		for(int i = 0; i < numbers.length; i++) {
			// target은 9 현제 첫번째에 있는 숫자는 2
			// 그럼으로 2 + x = 9을 성립하며
			// 9 - 2을 하면 x 가 나온다.
			int numbersToFind = target - numbers[i];
			
			// 2 3 4 5 -> 6을 찾아야 한다면 하면
			// 위에서 3을 2번 꺼내면 안되기 때문에 
			// (numberMap.containsKey(numbersToFind) && numberMap.get(numbersToFind) != i) 
			// 와 같은 if문을 추가 해준 것이다.
			
			if (numberMap.containsKey(numbersToFind) && numberMap.get(numbersToFind) != i) {
				return new int[] {i, numberMap.get(numbersToFind)};
 			}
			
			// x가 Key로 가지고 있다면 ~ 
			numberMap.put(numbers[i], i);
		}
		return null;
	}
	
	
	
	/*
	 * 위의 문제들을 3sum 문제로 변경하여 제출
	 * 
	 * 2 3 4 
	 * 
	 * 이거 위에꺼 2개 합쳐서 풀어야함
	 * */
	
	
	private int[] solution3(int[] numbers, int target) {
		Map<Integer, Integer> numberMap = new HashMap<>();
		
		// 2 + x + x = 
		for(int i = 0; i < numbers.length; i++) {
			
		}
		return null;
	}
}
