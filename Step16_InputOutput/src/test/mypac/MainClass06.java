package test.mypac;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass06 {
	public static void main(String[] args) {
		PrintStream ps=System.out;
		//g학습을 위해서 PrintStream 객체를 부모type OutputStream 으로 받아보기
		//OutputStream 도 1byte 처리 스트림이다.
		OutputStream os=ps;
		// 2byte 처리 스트림
		OutputStreamWriter osw=new OutputStreamWriter(os);
		
		BufferedWriter bw=new BufferedWriter(osw);
		
		try {
			bw.write("하나");
			//개해기호
			bw.write("\r\n");
			bw.write("두울");
			//개행ㄴ
			bw.newLine();
			bw.write("세엣");
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
