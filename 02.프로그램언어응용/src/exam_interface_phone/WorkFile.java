package exam_interface_phone;

public interface WorkFile {
	
	// 파일을 업로드, 다운로드 할 때 이름을 이렇게 사용하자라는 인터페이스임
	public abstract void fileUpload();
	public abstract void fileDownload(); // 추상메서드, public abstract 생략가능
	
}
