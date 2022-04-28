package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;
import test.mypac.I_Pad;

public class Practice {
	public static void main(String[] args) {
		SmartPhone p1=new SmartPhone();
		p1.doInternet();
		
		HandPhone p2=p1;
		p2.mobileCall();
		p2.takePicture();
		
		Phone p3 = p1;
		p3.call();
		
		SmartPhone p4=new I_Pad();
		I_Pad p5=(I_Pad)p4;
		p5.actLiDar();
		
		I_Pad p6=(I_Pad)p1;
		p6.actLiDar();

	}
}
