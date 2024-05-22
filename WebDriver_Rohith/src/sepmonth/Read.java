package sepmonth;

import java.io.*;

public class Read {

	public static void main(String[] args) throws Throwable {
		//read path of file
		FileReader fr = new FileReader("D:/Login.txt");
		BufferedReader br = new BufferedReader(fr);
		String str="";
		while ((str=br.readLine())!=null) {
			Thread.sleep(500);
			System.out.println(str);
		}
		br.close();
		
	}

}
