import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



public class question_1 {
	
	//	숫자로 구성된 배열이 주어졌을때 중복된 숫자가 있는지 확인하는 함수를 작성해라. 
	//	중복된 숫자가 있다면 true 아니면 false.
	
	
	/*  
	    시간 복잡도 : O(n2)
		공간 복잡도 : O(1) 
		
		공간 복잡도는 메우 좋으나 시간 복잡도가 n2인 것은 보통은 답이 아니다.
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
	 * 	배열이 문제가 나오면 항상 정렬이 되어있느지을 생각하자
	 *	ex) 1 2 2 3 4
	 *  Arrays.sort을 사용하면 시간 복잡도는 O(N longN), 공간복잡도는 O(logN)이 된다.
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
	 * Set은 중복을 허용하지 않고, 
	 * 똑같은 엘리먼트를 어려번 넣을수 없다.
	 * Set은 Hash값으로 조회를 하기 때문에 O(1)이다. 
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
