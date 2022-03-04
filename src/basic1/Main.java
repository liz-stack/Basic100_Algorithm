package basic1;

import java.util.ArrayList;
import java.util.Scanner;
//[알고리즘 기초 100제] 1번 학생이름 저장 및 검색
public class Main {
	// 학생 이름 검색하면 학번 출력
	public static void main(String[] args) {

		Student st1 = new Student("최승철", "1011");
		Student st2 = new Student("서정한", "2102");
		Student st3 = new Student("김민규", "1303");
		Student st4 = new Student("박호시", "1314");
		Student st5 = new Student("홍지수", "1465");

		ArrayList<Student> list = new ArrayList<Student>();

		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		list.add(st5);

		for (Student stu : list) {
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
		}

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("계속 검색을 하고싶으시면? y, 종료시 n입력");
			String input = sc.next();
			if (input.equals("y")) {
				System.out.println("학생 이름을 입력하세요.");
				String name = sc.next();
				boolean flag = false;
				
				for (Student stu : list) {
					if (stu.getName().equals(name)) {
						System.out.println("해당하는 학생의 학번은 " + stu.getNo() + "입니다");
						flag=true;
					}
				}
				if(!flag) {
					System.out.println("해당하는 학생 이름이 없습니다.");
				}
				
			} else if (input.equals("n")) {
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");

	}

}
