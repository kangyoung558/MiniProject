package student;

import  static student.StudentUtils.*;

public class StudentService {
	// 학생에 대한 관리 (필드)
	// 배열로 학생들을 관리
	Student[] students = new Student[10];
	//Student student = new Student();
	int count;
	int i = 0;
	{	
		students[count++] = new Student(1, "둘리", 90, 70, 70);
		students[count++] = new Student(2, "도우너", 88, 88, 88);
		students[count++] = new Student(3, "또치", 77, 77, 77);
	}
	// 기능에 대한 관리 (CRUD)
	// 추가
	// 1. 삭제 로직 구현 
	// 2. 모든 필드에 대해(student) private로 변경 게터세터 생성 
	void add() {
		while (true) {
			System.out.println("입력하시겠습니까? [Y/N] 모두다 회이팅!!!!!!");
			String flags = StudentUtils.nextLine();
			if (flags.equals("y") || flags.equals("Y")) {
				Student student = new Student();
				
				System.out.println("학번을 입력하세요");
				student.sno = nextInt();
				
				System.out.println("이름 입력하세요");
				student.sname = nextLine();
				
				System.out.println("국어점수를 입력하세요");
				student.kor = nextInt();
				
				System.out.println("영어점수를 입력하세요");
				student.eng = nextInt();
				
				System.out.println("수학점수를 입력하세요");
				student.math = nextInt();
				
		 		students[count++] = student;
		 		
		 		System.out.println(" 등록 완료 ");
				
			}else if (flags.equals("n") || flags.equals("N")) {
				break;
			}
		}
	}

	// 조회
	void list() {
		System.out.println("-----------------------------------------------------");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------------");

		for (int i = 0; i < count; i++) {
			System.out.println(students[i]);
		}
	}

	// 수정
	void modiFy() {
		
		list();
		System.out.println("수정할 사람의 학번 : ");
		int input = nextInt();
		
		Student student = findByNo(input);
		
		if(student== null) {
			System.out.println("학번을 찾을수 없습니다.");
		} else {
			System.out.println(students[input]);
			System.out.println();
			System.out.print("수정할 내용은? 1. 이름  2.국어  3.영어  4.수학 : ");
			int modiinput = nextInt();
			switch (modiinput) {
			case 1:
				System.out.print("이름 수정 : ");
	            students[input].sname = nextLine();
	            System.out.println(" 수정 완료 ");
				break;
			case 2:
				System.out.print("국어점수 수정 : ");
	            students[input].kor = nextInt();
	            System.out.println(" 수정 완료 ");
				break;
			case 3:
				System.out.print("영어점수 수정 : ");
	            students[input].eng = nextInt();
	            System.out.println(" 수정 완료 ");
				break;
			case 4:
				System.out.print("수학점수 수정 : ");
	            students[input].math = nextInt();
	            System.out.println(" 수정 완료 ");
				break;

			}
		}
		//  기존 꺼
//		int input =nextInt();
//		for (int i =0; i <=count; i++) {
//			if (students[i].sno == input) {
//				break;
//			}
//		}
		
		
		//System.out.println("modiFy()");
	}
	Student findByNo(int no) {
		Student student = null;
		for(int i = 0; i < count; i++) {
			if(students[i].sno == no)
			student = students[i];
		}
		return student;
	}

	// 삭제
	void remove() {
		System.out.println("remove()");
	}
	
}
