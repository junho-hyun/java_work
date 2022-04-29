package test.main;

import java.util.HashMap;
import java.util.Map;

public class MainClass07 {
	public static void main(String[] args) {
		//HashMap ��� Map ���� �޾� �� �� �ִ�. interface �ذ�����.
		final Map<String, Object> map1=new HashMap<>();
		/*
         *  HashMap<key ���� type, value ���� type>
         *  
         *  key �� generic class �� String ���� �����ϴ°��� �Ϲ����̴�.
         *  value �� generic class �� ���� ������ type �� �����ϸ�ȴ�.
         *  �������� type �� ��� �����Ÿ� Object �� �����ϸ� �ȴ�.  
         */

		/*
		 * ������ ������ HashMap ��ü�� ������ ���� ���� 3������ ��� ������.
		 * 
		 * ��ȣ : 1
		 * �̸� : �豸��
		 * �������� ���� : true
		 * 
		 */
		map1.put("num", 1);
		map1.put("name", "�豸��");
		map1.put("isMan", true);
		
		// map1 �� ��� ��ȣ�� num, �̸��� name, �������� ���δ� isMan �̶�� ���� ������ ��� ������.
		int num=(int) map1.get("num");
		String name=(String) map1.get("name");
		boolean isMan=(boolean)map1.get("isMan");
		
		//������ key ������ �ٽ� ������ ����
		map1.put("name", "������");
		
		//Ư�� key ������ ��� ���� ����, �����ϸ� true, �����ϸ� false ����
		map1.remove("isMan");
		
		//��� ����
		map1.clear();
	}
}







