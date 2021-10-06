import java.util.Arrays;

public class question_4 {
	public static void main(String[] args) {
		question_4 sorByArray = new question_4();
		System.out.println(Arrays.toString(sorByArray.solution(new int[]{2,3,5,7,4,9})));
		
	}
//	문제
//	1부터 100까지의 숫자 중에서 50개의 랜덤한 숫자가 들어있는 배열이다.
//	이 배열을 O(n)의 시간 복잡도로 정렬하라
	
	
	/*
	 * 입력값이 제한이 되어있다.
	 * 배열의 인덱스를 사용하는 방법
	 */
	
	private int[] solution(int[] number) {
		//boolean형태로 배열을 100까지 만들어준다. 문제에 100까지라고 적혀있음
		boolean [] booleans = new boolean[100];
		
		// 위에서 만들어중 배열을 돌면서 number에 있는 숫자가 있다면,
		// true 넣어준다.
		for (int num : number) {
			booleans[num] = true;
		}
		
		int index = 0;
		
		// 그 값의 index을 넣어주면 된다.
		for (int i = 0; i < booleans.length; i++) {
			if (booleans[i]) {
				number[index++] = i;
			}
		}
		
		return number;
	}
}
