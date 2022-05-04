package test.mypac;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class MainClass15_1 {
   public static void main(String[] args) {
		//필요한 참조값을 담을 지역 변수를 미리 만든다.
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream("c:/acorn202203/myFolder/1.jpg");
			fos=new FileOutputStream("c:/acorn202203/myFolder/copied.jpg");
			//해보시용~	(읽어낸 int 값을 그대로 출력하면 됨)
			
			int fr;
			while((fr =fis.read())==-1) {
				break;
			}
			fos.write(fr);
			fos.flush();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
	         try {
	            if (fos != null)fos.close();
	            if (fis != null)fis.close();
	         } catch (IOException e) {
	            e.printStackTrace();
	         }
	   }
   }
}