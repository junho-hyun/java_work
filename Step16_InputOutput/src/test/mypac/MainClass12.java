package test.mypac;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/*
 *  c:/acorn202203/myFolder/memo.txt파일에 기록된 문자열을 읽어서
 *  콘솔창여 출력해 보세요.
 *  
 *  - hint
 *  FileReader 객체를 잘 활용해 보세요.
 */
public class MainClass12 {
	public static void main(String[] args) {
		File memoFile=new File("c:/acorn202203/myFolder/memo.txt");
		
		try {
			FileReader fr=new FileReader(memoFile);
			BufferedReader br=new BufferedReader(fr);
			//String line=br.readLine();
			//	System.out.println(line);
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
//		try {
			//파일에서 문자열을 읽어 들일 수 있는 객체 생성
//			FileReader fr=new FileReader(memoFile);
//			//반복문 돌면서
//			while(true) {
				//문자 code 하나신 읽어낸다.
//				int code=fr.read();
				//만일 더이상 읽을 code 값이 없으면
//				if(code==-1) {
//					break; //반복문 탈출
//				}
				//코드값을 문자로 변환해서
//				char ch=(char)code;
				//개해기호 없이 출력하기
				//print 는 개행기호 없이 println 는 개행기호 있이
//				System.out.print(ch);
//			}
		
//		} catch (Exception e) {
//			e.printStackTrace();
//
//		}
			
		
		/*
		 * public class MainClass12 {
   public static void main(String[] args) {
      try {
         BufferedReader br = new BufferedReader(new FileReader(new File("c:/acorn202203/myFolder/memo.txt")));
         while (true) {
            String readLine = br.readLine();
            if (readLine == null) {
               break;
            }
            System.out.println(readLine);
         }
      } catch (FileNotFoundException fnfe) {
         fnfe.printStackTrace();
      } catch (IOException ie) {
         ie.printStackTrace();
      }
 
		 */
	}
}


