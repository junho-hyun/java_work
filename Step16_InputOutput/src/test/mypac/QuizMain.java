package test.mypac;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class QuizMain {
	public static void main(String[] args) {
		/*
		 * Scanner ��ü�� �̿��ؼ� ���ڿ� ������ �Է� ���� ����
		 * c:/acorn202203/myFolder/quiz.txt ������ ����
		 * �ش� ���Ͽ� ���ڿ��� ������ ������
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("���ڿ� �Է�: ");
		String str=scan.nextLine();
		
		FileWriter fw=null;
		try {
			//new FileWriter(�ؽ�Ʈ ������ ��ġ, append ��� ����) true �� �̾��. false = ����Ʈ��,����� 
			fw=new FileWriter("c:/acorn202203/myFolder/quiz.txt",true);
			fw.write(str);
			fw.write("\r\n");
			fw.flush();
			System.out.println("���Ͽ� �����߽��ϴ�");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			}catch(Exception e) {}
		}
	}
}
