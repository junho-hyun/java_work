package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass04 {
	public static void main(String[] args) {
		File f=new File("c:/acorn202203/myFolder/memo.txt");
		
		//���� ��ο� ������ ������ ����� �ִ� File ��ü�� �޼ҵ带 ã�Ƽ� �����ϰ�
		//������ ������ ��������� �� Ȯ���� ������.
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("main �޼ҵ尡 ���� ���� �˴ϴ�.");
	}
}
