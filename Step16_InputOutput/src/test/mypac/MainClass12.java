package test.mypac;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/*
 *  c:/acorn202203/myFolder/memo.txt���Ͽ� ��ϵ� ���ڿ��� �о
 *  �ܼ�â�� ����� ������.
 *  
 *  - hint
 *  FileReader ��ü�� �� Ȱ���� ������.
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
			//���Ͽ��� ���ڿ��� �о� ���� �� �ִ� ��ü ����
//			FileReader fr=new FileReader(memoFile);
//			//�ݺ��� ���鼭
//			while(true) {
				//���� code �ϳ��� �о��.
//				int code=fr.read();
				//���� ���̻� ���� code ���� ������
//				if(code==-1) {
//					break; //�ݺ��� Ż��
//				}
				//�ڵ尪�� ���ڷ� ��ȯ�ؼ�
//				char ch=(char)code;
				//���ر�ȣ ���� ����ϱ�
				//print �� �����ȣ ���� println �� �����ȣ ����
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


