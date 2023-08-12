package 예제;
/* words.txt 파일에는 한 라인에 하나의 영어 단어가 들어있다. 이 파일을 한 라인씩 읽어 Vector<String>에 라인별로 삽입하여 저장하고.
 * 영어 단어를 입력받아 그 단어로 시작하는 모든 단어를 벡터에서 찾아 출력하는 프로그램을 작성하라. 
 * [실행 예시]
 * 프로젝트 폴더 밑의 words.txt 파일을 읽었습니다...
 * 단어 >> lov
 * love
 * lovebird
 * lovelorn
 * 단어 >> asfh
 * 발견할 수 없음
 * 단어 >> 그만
 * 종료합니다.
 * */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class WordSearch {
	private Vector<String> wordVector = new Vector<String>();
	
	// 디폴트 생성자
	public WordSearch() {}

	// words.txt 파일 읽기
	private boolean readFile() {
		try {
			// 파일 읽을 때도 Scanner 사용할 수 있음
			Scanner fScanner = new Scanner(new FileInputStream("words.txt"));
			while(fScanner.hasNext())
				wordVector.add(fScanner.nextLine()); // 한 라인에 한 단어 벡터에 저장함
			fScanner.close();
		}catch(FileNotFoundException e) {
			System.out.println("프로젝트 폴더 밑의 words.txt 파일이 없습니다.");
			return false;
		}
		System.out.println("프로젝트 폴더 밑의 word.txt 파일을 읽었습니다.");
		return true;
	}
	
	// 단어 검색
	private void processQuery() { 
		Scanner sc = new Scanner(System.in);
		while(true) {
			boolean found = false;
			System.out.print("단어 >>");
			String searchWord = sc.nextLine(); // 검색할 단어 입력
			if(searchWord.equals("그만")) {
				break; // 검색 종료
			}
			
			// 벡터에서 검색
			for(int i =0; i<wordVector.size(); i++) {
				String word = wordVector.get(i); // 벡터 내의 문자열
				if(word.length() < searchWord.length()) // 벡터의 문자열이 검색 문자열보다 짧은 경우
					continue;
				
				// 벡터 문자열의 앞부분을 검색 문자열 크기만큼 잘라내기
				String frontPart = word.substring(0, searchWord.length());
				
				if(searchWord.equals(frontPart)) { // 검색 문자열과 잘라낸 앞 부분 비교
					System.out.println(word);  // 벡터에서 발견한 단어 출력
				}
			}
			if(!found) // 한 단어도 발견 못했다면 found가 지금까지 false이면
				System.out.println("발견할 수 없음");
		}
		sc.close();
	
	}
	
	public void run() {
		boolean res = readFile(); // res가 false이면 단어 파일 읽기 실패
		if(res == true) 
			processQuery();
		System.out.println("종료합니다.");
	}
	
	public static void main(String[] args) {
	WordSearch ws = new WordSearch();
	ws.run();
	}

}
