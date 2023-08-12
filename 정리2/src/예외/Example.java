package 예외;


public class Example {
	public static void main (String[] args) {
		try{
		     int[] arr = new int[-10];     
		     System.out.println("try");
		} catch(NumberFormatException e){
		     System.out.println("숫자 형식 오류");
		} catch (NegativeArraySizeException e){
		     System.out.println("배열 크기 음수 오류");
		} catch (Exception e){
		     System.out.println("오류");
		} finally{
		     System.out.println("처리 끝");
		}
	}
}
