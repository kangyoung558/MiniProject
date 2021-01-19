package student;

// API의 대상
public class Student {
	// 학번 이름 국어 영어 수학

	int sno;
	String sname;
	int kor;
	int eng;
	int math;

	Student(int sno) {
		this.sno = sno;
		
	}
	
	Student(int sno, String sname) {
		this.sno = sno;
		this.sname = sname;
	}
	
	Student(int sno, String sname, int kor) {
		this.sno = sno;
		this.sname = sname;
		this.kor = kor;
	}
	
	Student(int sno, String sname, int kor, int eng) {
		this.sno = sno;
		this.sname = sname;
		this.kor = (int) kor;
		this.eng = eng;
	}
	
	Student(int sno, String sname, int kor, int eng, int math) {
		this.sno = sno;
		this.sname = sname;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public Student() {}
		 
	 
	 int getTotal () {
			return  kor + eng + math;
			
		}

	double getAvg () {
		return getTotal() *100 / 3 / 100.0;
	}
	
	public String toString() {
		return sno + "\t" +
				sname + "\t" +
				kor + "\t" +
				eng + "\t" +
				math + "\t" +
				getTotal() + "\t" +
				getAvg();
	}
}
