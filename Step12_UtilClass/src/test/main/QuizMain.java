package test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/*
 * run �� ������ �ζǹ�ȣ6���� �����ϰ� ����ϴ� �ڵ带 �ۼ��� ������.
 * 
 * 1~45 ������ ���� �߿� 6���� ���;� �ϸ�
 * �ߺ��Ǵ� ���ڰ� ������ �ȵǰ�
 * ���� ���ں��� ū���� ���� ���ı��� �ؼ� ����� ������.
 * 
 */
public class QuizMain {
	   public static void main(String[] args) {
	      Random ran=new Random();
	      
	      //�ߺ��� �����Ͱ� ������� �ʴ� ������ �����Ҽ� �ִ� Stack ��ü ����
	      Set<Integer> st=new HashSet<>(); 
		
	      
	      //���� ���� ���鼭 
	      while(true) {
	         //������ ���ڸ� ���� 
	         int ranNum=ran.nextInt(45)+1;
	         //Stack ��ü�� ���� ��Ű��
	         st.add(ranNum);
	         //��ȣ�� 6���� �Ǹ�
	         if(st.size()==6) {
	            break; //�ݺ��� Ż��
	         }
	      }
	      //Set �� �ִ� �����͸� ArrayList �� ���
	      List<Integer> nums=new ArrayList<>(st);
	      //����
	      Collections.sort(nums);
	      //���
	      for(int tmp:nums) {
		      System.out.print(tmp+",");
	      }
	      
	   }
	  
	}
	
	
	
	
	

	
	
	//		public static void main(String[] args) {
//		int[] lotto = new int[6];
//		
//		Random r = new Random();
//		
//		System.out.println("�ζǹ�ȣ");
//		
//		
//		for(int i=0; i<6; i++) {
//			int lotnum=r.nextInt(45) + 1;
//			System.out.println(lotnum);
//			
//		}
//	}
//	
//	
//	


	