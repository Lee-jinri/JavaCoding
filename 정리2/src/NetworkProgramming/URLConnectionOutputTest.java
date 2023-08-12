package NetworkProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionOutputTest {
	public static void main(String[] args) throws MalformedURLException, IOException {
		BufferedReader in = null;
		URL url = new URL("https://www.hanbit.co.kr/search/search_list.html");
		URLConnection con = url.openConnection();
		con.setDoOutput(true);
		
		OutputStream os = con.getOutputStream();
		PrintWriter out = new PrintWriter(os);
		out.println("keyword=오라클");
		out.close();
		
		in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inLine;
		while((inLine = in.readLine()) != null)
			System.out.println(inLine);
	}

}
