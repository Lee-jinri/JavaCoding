package 컬렉션2;

public class Student implements Comparable<Student> {
	private int sno;
	private String name;
	
// 생성자 (규칙: 이름은 클래스와 동일하고 반환형 가지지 않음)
	public Student(int sno, String name) {
		this.name = name;
		this.sno = sno;
	}
	
	public Student(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}

	// 중복을 무엇으로 판단할건지 
	// 학번과 이름이 둘 다 같을 때 같은 객체로 판단하겠다
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (sno==student.sno)&&(name.equals(student.name));
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}
	
	// 내가 출력하고 싶은 방식으로 toString 재정의
	@Override
	public String toString() {
		return "이름 : "+ name + " 학번 : " + sno ;
	}

	@Override
	public int compareTo(Student o) {
		if (this.sno > o.sno)
			return 1;
		else if (this.sno == 0)
			return 0;
		else 
			return -1;
		}

	

	
}
