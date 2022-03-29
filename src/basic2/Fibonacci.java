package basic2;

//피보나치 수열 출력
public class Fibonacci {

	public static void main(String[] args) {

		/* 1. 배열 사용해 출력 */
		int[] arr = new int[100];
		// An = An-1 + An-2
		arr[1] = 1;
		arr[2] = 1;

		for (int i = 3; i < 100; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}

		for (int i = 1; i < 100; i++) {
			System.out.print(arr[i] + " ");
		}

		
		/* 2. 배열 쓰지 않고 출력하기 */

		int preNum1 = 1;
		int preNum2 = 1;
		System.out.print(preNum1 + " ");
		System.out.print(preNum2 + " ");

		for (int i = 3; i <= 20; i++) {
			int num = preNum1 + preNum2;
			System.out.print(num + " ");
			preNum2 = num;
			preNum1 = preNum2;
		}

	}

}
