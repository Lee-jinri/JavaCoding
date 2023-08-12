package 예외;

public class 예외 {
	/* 
	 * [ 프로그램의 오류 ]
	 * 1, 문법적 오류 : 문법이 올바르지 않은 상태
	 * 2, 논리적 오류 : 개발자가 원하는 결과가 산출되지 않은 상태
	 * 3, 실행 오류 :
	 * 		(1) 오류 : 시스템이 정상적인 기능을 수행할 수없게 된 상태(수습불가)
	 * 		(2) 예외 :  실행 중 예기치 않은 문제가 발생한 상태(수습 가능)
	 * 
	 * 오류의 종류
	 * 1, 에러(Error)
	 * - 하드웨어의 잘못된 동작 or 고장으로 인한 오류
	 * - 에러가 밣생되면 프로그램 종료
	 * - 정상 실행 상태로 돌아갈 수 없음
	 * 2, 예외(Exception)
	 * - 사용자의 잘못된 조작 or부정확한 데이터 처리 or 개발자의 잘못된 코딩으로 인한 오류
	 * - 예외가 발생되면 프로그램 종료
	 * - 예외 처리 추가하면 정상 실행 상태로 돌아갈 수 있음
	 * 
	 * ● 예외 처리 : 미리 코드를 작성해서 대처하는 과정
	 * <예외 처리를 하지 않은 프로그램>
	 * 예외 발생  -> 프로그램의 비정상적인 종료
	 * <예외 처리를 한 프로그램>
	 * 예외 발생 -> 예외 처리 -> 프로그램의 정상적인 실행
	 * 
	 * ● 예외에 대한 설명
	 * - 자바에서는 예외도 하나의 객체로 취급한다
	 * - 오류가 발생하면 발생된 오류를 설명하는 객체를 생성하게 되는데 그 객체를 예외객체(exception object)라고 한다.
	 * - 예외객체는 오류정보, 오류의 타입과 오류 발생 시의 프로그램의 상태 등의 정보를 포함하고 있다.
	 * - 예외객체를 생성하는 것을 흔히 예외를 던진다(throw)고 하고 예외객체를 처리하는 것을 예외를 잡는다(catch)고 한다.
	 * 
	 * ● 예외 처리 코드
	 * 	- 예외 발생시 프로그램 종료를 막고, 정살 실행 유지할 수 있도록 처리
	 * 	- try ~ catch ~ finally 블록 이용해 예외 처리 코드 작성
	 * 
	 * try {
	 * 		// 예외가 발생할 수 있는 코드
	 * } catch (예외종류 참조변수){  // 예외종류 : 예외의 타입, 참조변수 : 값을 받을 수 있는 참조변수
	 * 		// 예외를 처리하는 코드
	 * } finally { 
	 * 		// 해당 코드는 try블록이 끝나면 무조건 실행된다.
	 * }
	 * 
	 *
	 * try {
	 * 		예외 발생 가능 코드
	 * } catch(예외클래스 e){
	 * 		예외 처리
	 * }finally {
	 * 		항상 실행
	 * }
	 *  ● 정상 실행 되었을 경우
	 * ==> catch를 건너뛰고 finally로 간다.
	 *  ● 예외가 발생되었을 경우
	 * ==> try->catch->finally->실행
	 * 
	 * ● 예외가 발생하지 않은 경우
	 * int x = 6, y = 2;
	 * try{
	 * 		int result = x / y;
	 * }catch (ArithmeticException e){
	 * 		system.out("오류발생");
	 * }
	 * system("try/catch통과");
	 * 
	 * ● 예외가 발생한 경우
	 * ????????
	 * 
	 * <예외 정보 얻기>
	 * printStackTrace()
	 * - 예외 발생 코드 추적한 내용을 모두 콘솔에 출력
	 * - 프로그램 테스트하면서 오류 찾을 때 유용하게 활용
	 * 
	 * try{
	 * 		예외 객체 생성
	 * }catch (예외클래스 e){
	 * 		예외가 가지고 있는 message 얻기
	 * 		String message = e.getMessage();
	 * 
	 * 		예외발생 경로를 추적
	 * 		e.printStackTrace();
	 *	
	 * ● finally문은 try 블록에서 사용했던 자원을 해제하기 위해서이다.
	 * - try 블록에서 파일열기, 넹트워크 연결, 데이터베이스 연결과 같은 작업을 했다면
	 *   작업이 완료된 후에는 파일닫기, 네트워크 연결 종료, 데이터베이스 연결 종료 같은 자원 해제 작업을 해야한다.
	 *   (자원 해제 작업을 하지 않으면 다른 프로그램에서 자원들이 필요할 때 사용할 수 없는 상황이 발생할 수 있다.)
	 *   해제 작업이 아니라면 finally를 명시하지 않아도 된다!
	 *   
	 *   ☆★ catch에 catch(Exception e) 걍 Exception 이라고 쓰면됨 ☆★
	 * 
	 * ● 예외의 종류
	 * RuntimeException
	 * - NullPointerExcepton
	 *  객체 참조가 없는 상태
	 *  ex) null값이라서 new Car해도 메모리 할당 안 댐 -> 
 	 *  Car myCar = null;
	 *  			 new Car();
	 *  myCar.speedUp(10);
	 *  
	 * - ArrayIndexOutOfBoundsExcepton 
	 * 배열에서 인덱스 범위 초과하여 사용할 경우 발생
	 * ex) 
	 * arr = new arr[5];
	 * arr[5]=100;  -> 배열이 존재하지 않는 인덱스에 접근
	 * 
	 * - ClassCastException
	 * 타입 변환이 되지 않을 경우 발생
	 * 
	 * ex 1) 클래스 형변환 하는 것 
	 * 슈퍼클래스:Animal(추상클래스) 
	 * 서브클래스:Dog, Cat
	 * 	(정상코드)
	 * 		Animal animal = new Dog();
	 * 		Dog dog = (Dog) animal;  
	 *  (예외 발생 코드)
	 *  	Animal animal = new Dog();
	 *  	Cat cat = (Cat) animal;
	 *  
	 * 
	 * ex 2) 클래스 형변환 하는 것 
	 * 인터페이스:RemoteControl   // 참고: 인터페이스와 구현클래스의 관계는 점선으로 표현한다.
	 * 구현클래스:Television, Audio 
	 * 	(정상코드)
	 * 		RemoteControl rc = new Television();
	 * 		Television tv = (Television)rc;
	 * 	(예외 발생 코드)
	 * 		RemoteControl rc = new Television(); 
	 * 		Audio audio = (Audio)rc;
	 * 
	 * 다운캐스팅?? 업?? 다운???? 클래스의 자동형변환??????
	 * ArithmeticException
	 * 
	 * ● 체크 예외와 비체크 예외
	 * Exeption 계열 예외는 체크 예외(확인된 예외), 비체크 예외(미확인 예외)로 분류한다.
	 * 1. 비체크 예외 (미확인 예외)
	 * 	- RuntimeException과 관련이 있는 객체들
	 *  - 잘못 구현된 프로그램 코드때문에 발생한다. -> 코드 수정하면 실행가능
	 * 2. 체크 예외 (확인된 예외)
	 * 	- RuntimeException과 관련없는 모든 객체
	 *  - 프로그램내에서 통제할 수 없는 조건 때문에 발생 
	 *  - 예외처리 반드시 해야함(안 돼있으면 컴파일 할 수 없다.) -> 소스 파일이 컴파일될때 컴파일러가 예외처리했는지 검사함
	 *  	1) 파일 입출력할 때
	 *  	2) 네트워크 입출력할 때
	 *  	3) 데이터베이스 입출력할 때
	 * 
	 * 
	 * ● 다형성과 예외
	 * - 예외를 처리할 때 상위 클래스를 이용하면 하위 클래스까지 포괄적으로 처리할 수 있다.
	 * Exception <- IOException
	 * 			 <- NumberException <- TooBigException
	 * 								<- TooSmallException
	 * 
	 * try{
	 * 		getInput();
	 * } catch (NumberException e){
	 * 		// NumberException의 하위 클래스를 모두 예외처리 할 수 있다.
	 * 		// Exception을 사용하면 모든 하위 클래스를 예외처리 하기 때문에 무엇이 문제인지 구분하기 힘들다.
	 * 
	 * try {
	 * 		getInput();
	 * } catch (TooSmallException e){
	 * 		// TooSmallException 예외만 처리
	 * } catch (NumberException e){
	 * 		// TooSmallException을 제외한 NumberException을 처리 
	 * 
	 * try {
	 * 		getInput();
	 * } catch (NumberException e){
	 * 		// NumberException 하위 모든 예외 처림
	 * } catch (TooSmallException e){
	 * 		// 아무런 예외도 처리 할 수 없다
	 * }
	 * =====> 여러 개의 catch를 사용하려면 하위클래스 예외처리부터 상위클래로 사용해야한당
	 * 		 (Exception도 클래스라서 한 번에 하나씩밖에 사용 못함) 
	 * 
	 * ● 멀티catch : 자바 7부터 사용, 근데 잘 안씀 
	 *  - 하나의 catch블록에서 여러 개의 예외 처리 가능
	 *  - 동일하게 처리하고 싶은 예외를 |로 연결
	 *  try{
	 *  	ArithmeticExcdption 또는 NullPointerException발생
	 *  	또 다른 Exception 발생
	 *  } catch (ArithmeticException e){
	 *  ??????
	 *  
	 *  ● 예외를 처리하는 다른 방법
	 *  메소드 내부에서 처리하지 않고 메소드를 호출할 때 에러를 처리하도록 만드는 기법 : throws 
	 *  다른 메서드한테 예외 처리를 맡기는 것 (예외 처리를 미룬다)
	 *  
	 *  ex)
	 *  int method(int n) throws IOException {
	 *  	...
	 *  }  --> 여기서 예외처리를 하지 않고 예외를 호출한 곳으로 떠넘기는 것 = 호출할 때 반드시 예외처리를 해야함
	 *  
	 * ● throws 
	 *  - 메소드 선언부 끝에 작성
	 *  리턴타입 메소드명(매개변수) throws,예외클래스,예외클래스2{
	 *  	...
	 *  }
	 *  
	 *  ex)
	 *  public void method1(){   // 호출한 곳에서 예외처리
	 *  	try{
	 *  		method2();
	 *  } catch(ClassNotFoundException e){
	 *  	// 예외처리 코드
	 *  	system.out.println("클래스가 존재하지 않습니다.");
	 *  	}
	 *  }
	 *  
	 *  public void method2() throws ClassNotFoundException{ // throws
	 *  	Class c = Class.forName("exam_class.Car");
	 *  }
	 *  
	 *  메소드 안에서 예외처리하기
	 *  public void writeList(){
	 *  	FileWriter fw = null;
	 *  try{
	 *  	fw = new FileWriter("file.txt");
	 *  	fw.write("java");
	 *  }catch(IOException e){
	 *  	system.out.print("파일 저장에 문제가 있음.");
	 *  }finally{
	 *  	if(fw!-null) fw.close();  fw에 값이 있으면
	 *  	}
	 *  }
	 *  
	 *  public void writeList() throws IOException {
	 *  	FileWriter fw = new FileWriter("file.txt");
	 *  	fw.write("java");
	 *  	fw.close();
	 *  }
	 *  
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
