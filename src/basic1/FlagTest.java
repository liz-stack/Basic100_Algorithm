package basic1;

import java.util.Scanner;

public class FlagTest {

	public static void main(String[] args) {
		int num;
		int sum=0;
		boolean flag = true;

		Scanner sc = new Scanner(System.in);

		while(flag){
			System.out.print(">>");
			String input = sc.nextLine();

			num = Integer.parseInt(input);
			if(num!=0){
				sum += num;
			} else{
				flag = false;
			}
		}

		System.out.println("합계: "+sum);
	}

}
