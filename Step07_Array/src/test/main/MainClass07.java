package test.main;
/*
 * 
 * 
 * 	1.	cherry, apple, banana, melon, 7
 * 		5���� ���ڿ� �߿��� 1���� �����ϰ� ��µǰ� �� ������.
 * 
 * 	2.	5���� ���ڿ� �߿��� 3���� ���ٿ� �ѹ��� �����ϰ� ��µǰ� �� ������.
 * 		��) cherry | apple | cherry
 * 			7	|	appble	| melon
 * 			7	|	7	|	7
 * 
 * 	- hint
 * 
 * 	String[] items={"cherry", "apple", "banana", "melon", "7"};
 * 
 *  Random ran=new Random();
 *  int ranNum=ran.nextInt(5);
 */

import java.util.Random;

public class MainClass07 {
	public static void main(String[] args) {
		String[] items= {"cherry", "apple", "banana", "melon", "7"};
		Random ran=new Random();
		int ranNum=ran.nextInt(5);	
		System.out.println(items[ranNum]);
		
		// -------------------------------------
		/*
		 * 0~4 ������ �����߿��� ������ ���� 3�� ����
		 * int num1=ran.nextInt(5);
		 * int num2=ran.nextInt(5);
		 * int num3=ran.nextInt(5);
		 */
		//����� ���ڿ��� �����ϱ�
		/*
		 * String line=items[num1]+" | " +items[num2]+" | "+items[num3];
		 */
		//����ϱ�
		/*
		 * System.out.println(line);
		 */
		

		String[] items2=new String[3];
		for(int i=0; i<items2.length; i++) {
			int ranNum2=ran.nextInt(items.length);
			items2[i]=items[ranNum2];
		}
		System.out.println(items2[0]+"|"+items2[1]+"|"+items2[2]);
	}
}
