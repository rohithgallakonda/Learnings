package sepmonth;

import java.io.*;

public class Writetext {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		File f = new File("D:/sample.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("iam so lazy to attend class");
		bw.newLine();
		bw.write("But i want job in top Mnc");
		bw.newLine();
		bw.write("with 20L package");
		bw.flush();
		bw.close();

	}


	}


