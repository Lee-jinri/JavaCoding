package 컬렉션;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

/* 한 명의 학생 정보를 Student 클래스에는 이름, 학과, 학번, 학점평균을 저장하는 필드가 있다.
 * [요구사항]
 * 실행 클래스의 이름은 StudentManager이다.
 * 사용자로 하여금 학생정보를 입력받아 Student 객체를 생성하고 4명의 학생 정보를 ArrayList<Student> 컬렉션에 저장한 후에 (read()), 
 * ArrayList<Student>의 모든 학생(4명) 정보를 출력한다(printAll())
 * 반복문을 통해서 학생 이름을 입력받아 학생의 정보를 출력하되 종료를 입력하면 프로그램을 종료하도록(processQuery()) 프로그램을 작성하세요
 */

public class StudentManager {
	private Scanner sc = new Scanner(System.in);
	private ArrayList<Student>dept = new ArrayList<Student>();
		
	// 메소드 1
	private void read() {
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.(, 구분자)");
		for(int i=0; i<4; i++) {
			System.out.println(">> ");
			String text = sc.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken().trim();  // trim 공백 제거하는 거
			String department = st.nextToken().trim();
			String id = st.nextToken().trim();
			double grade = Double.parseDouble(st.nextToken().trim());
			
			Student student = new Student(name, department, id, grade);
			dept.add(student); // ArrayList에 저장
		}
	}
	
	// 메소드2
	private void printAll() { // Iterator로 작성해보았음, toString해도 됨
		Iterator<Student> it = dept.iterator();
		System.out.println("----------------------");
		while(it.hasNext()) {
			Student student = it.next();
			System.out.println("이름 : " + student.getName());
			System.out.println("학과 : " + student.getDepartment());
			System.out.println("학번 : " + student.getID());
			System.out.println("학점평균 : " + student.getGrade());
			System.out.println("----------------------------------");
		}
	} 

	// 메소드3
	private void processQuery() {
		while(true) {
			System.out.println("학생 이름 >>");
			String name = sc.nextLine(); // 학생 이름 입력
			if(name.equals("종료")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			
			for(int i=0; i<dept.size(); i++) { // dept에 있는 모든 학생 겁색
				Student student = dept.get(i); // i번째 학생 객체
				if(student.getName().equals(name)) { // 이름이 같은 student찾음
					System.out.println(student.getName() + ", ");
					System.out.println(student.getDepartment() + ", ");
					System.out.println(student.getID() + ", ");
					System.out.println(student.getGrade() + ", ");
					break; // for문을 벗어남
				}
			}
		}// while 끝남
	}		
	public void run() {
		read();
		printAll();
		processQuery();
	}
			
	public static void main(String[] args) {
		// 인스턴스 생성
		StudentManager man = new StudentManager();
		man.run();
	}
}
