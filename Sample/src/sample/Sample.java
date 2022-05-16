package sample;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("출력할 구구단 단수 입력 : ");
		int dan = scan.nextInt();

		System.out.println(dan);

		if (dan == 2) {
			for (int i = 1; i < 10; i++)
				System.out.println(dan + "x" + i + "=" + dan * i+ " ");	
		}
	}
}
