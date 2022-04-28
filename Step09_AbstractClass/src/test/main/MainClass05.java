package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	//
	static Weapon w1=new Weapon() {
		// { } �ȿ� �ۼ��Ȱ� method�̰� method �� class �ȿ� ���� 
		// �� �ֱ⿡ �̰��� �͸��� class �� �����Ǿ��ٶ�� �θ���.
		@Override
		public void attack() {
			System.out.println("���� �𸣰����� ��������!");
		}
		
	};
	
	public static void main(String[] args) {
		useWeapon(w1);
		
		//�͸��� class ����. �߻�
		Weapon w2=new Weapon() {

			@Override
			public void attack() {		
				System.out.println("���� �̰͵� �����ϳ�?");
			}
			
		};
		
		useWeapon(w2);
		
		//�߻� Ŭ���� Ÿ�� �Ｎ���� ����.
		useWeapon(new Weapon() {

			@Override
			public void attack() {		
				System.out.println("���� �̰͵� �����ϳ�?");
			}
			
		});
	}
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
