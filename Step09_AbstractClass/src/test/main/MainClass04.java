package test.main;

import test.mypac.Weapon;

public class MainClass04 {
	
	//���� Ŭ����(inner class)
	static class YourWeapon extends Weapon{
		@Override
		public void attack() {
			System.out.println("���� ������ �ؿ�!");
		}
	}
	//static main() �޼ҵ�
	
	//static ������ �ö󰡱� ������ static ������ �ִ� �ֵ鸸 ��� �����ϴ�.
	//���� class YourWearpon class �տ� static�� �ٿ�������� 
	//�Ʒ��� main �޼ҵ带 ��� �� �� �ִ�. 
	//(main method �� static �� ���⿡)
	public static void main(String[] args) {
		Weapon w1=new YourWeapon();
		useWeapon(w1);
		
		//local inner class ( method �ȿ� ����� class )
		class OurWeapon extends Weapon{

			@Override
			public void attack() {
				System.out.println("����� ���� �ƹ��� ��������!");
			}
		}
		
		Weapon w2=new OurWeapon();
		useWeapon(w2);
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
		
	}
}






