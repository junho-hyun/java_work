package test.main;

import test.mypac.Reload;
import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		//�������� ���� Ŭ������ ����� ��ü ������ �ؼ� �Ʒ��� useWeapon() �޼ҵ带 ȣ���� ������.
		Weapon w1=new Reload();
		//MainClass02.useWeapon(w1);
		useWeaponsz(w1);
	}
	//�� �޼ҵ�� ���� ������ ������ �ϴ� �޼ҵ��� ��������
	public static void useWeaponsz(Weapon we) {
		we.prepare();
		we.attack();
	}
}
