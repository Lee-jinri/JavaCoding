package NetworkProgramming;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

public class URLOpenStreamTest01 {
	public static void main(String[] args) {
		BufferedReader in = null;
		PrintWriter out = null;
		try {
			URL url = new URL("https://www.hanbit.co.kr/");
			// url.openStream()?�� 반환?�� - InputStream => InputStreamReader�?? 바이?�� ?��?��림을 문자?��?��림으�?? �???�� => BufferedReader
			in = new BufferedReader(new InputStreamReader(url.openStream()));
					// 바이?��?��?��X Reader�?? 문자?��?���?? ?��?��?���??(?�� 줄씩 ?��?�� ?�� ?��?��.)
			
			out = new PrintWriter(new FileWriter("index.html"));
					// 출력?��?���??. index.html 출력?��?��?��. PrintWriter?�� 같이 ?���?? ?�� 줄씩 출력�???��
			String inLine;			
			while ((inLine = in.readLine()) != null) { // readLine ?�� ?��?��?�� ?��?��?��. ?��?�� 값이 ?��?�� ?��까�?
			//	System.out.println(inLine);
				out.println(inLine);
			}
			System.out.println("?��?�� 복사 ?��료되?��?��?��?��.");
			
			
		}catch (MalformedURLException e) {
			System.out.println("URL ERROR");
		}catch (IOException i) {
			System.out.println("IO ERROR");
		}finally {
			try {
				if(in != null)  // ?��?�� 복사�?? ?��?��?���?? null?�� ?��?�� => ?��?��복사�?? ?��?��?���??
					in.close();	// ?��?��
			}catch(Exception e) {
				System.out.println("CLOSE ERROR");
			}
		}
	}

}