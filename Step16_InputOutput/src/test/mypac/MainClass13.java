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
public class MainClass13 {
	public static void main(String[] args) {
		File memoFile=new File("c:/acorn202203/myFolder/memo.txt");

		try {
			//파일에서 문자열을 읽어 들일 수 있는 객체 생성
			FileReader fr=new FileReader(memoFile);
			BufferedReader br=new BufferedReader(fr);
			//반복문 돌면서
			while(true) {
				//한줄씩 읽어내고
				String line=br.readLine();
				//만일 더이상 읽을 문자열이 없다면
				if(line==null) {
					break;//반복문 탈출
				}
				//읽어낸 문자열 콘솔에 출력하기
				System.out.println(line);
			}
				
		} catch (Exception e) {
			e.printStackTrace();

		}
			
		
	}
}


