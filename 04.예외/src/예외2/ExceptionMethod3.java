package ¿¹¿Ü2;

import java.io.FileInputStream;

public class ExceptionMethod3 {

	public static void main(String[] args) {
		
		
		byte[] readBytes = new byte[6];
		int readByteNo;
		String data = "";
		
		try (FileInputStream fi = new FileInputStream("test.txt")){
			
			while (true) {
				readByteNo = fi.read(readByte);
			}
		}

	}

}
