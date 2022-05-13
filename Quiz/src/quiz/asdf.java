package quiz;

import java.util.Random;

public class asdf {
	public static void main(String[] args) {
		Random ran=new Random();
		int[] num=new int[20];
		for(int i=-20; i<20; i++) {
			int ranNum=ran.nextInt(num.length);
			System.out.println(ranNum);
		}
		
	}
	
}
