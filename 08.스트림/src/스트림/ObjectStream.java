package ½ºÆ®¸²;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStream {

	public static void main(String[] args) {
		ObjectInputStream in = null;
		ObjectOutputStream out = null;
		
		try{
			out = new ObjectOutputStream(new FileOutputStream("object.dat"));
			out.writeObject(new PhoneInfo("È«±æµ¿","010-3432-8796"));
			out.writeObject(new PhoneInfo("±èÈñÁø","010-5901-3546"));
			
			in = new ObjectInputStream(new FileInputStream("object.dat"));
			while(true) {
				PhoneInfo info = (PhoneInfo)in.readObject();
				if(info == null) {
					break;
				}
				System.out.println(info.toString());
			}
		}catch (ClassNotFoundException c) {
			System.out.println("ClassNotFoundException Error");
		}catch(IOException i) {
//			System.out.println("IOException Error");
//			i.printStackTrace();
		}catch (Exception e) {
			System.out.println("Exception Error");
		}finally {
			try {
				if(in != null) {
					in.close();
				}
				if(out != null) {
					out.close();
				}
			}catch(Exception e) {
					System.out.println("close Error");
				}
			}
		
	}

}
