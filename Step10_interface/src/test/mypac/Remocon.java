package test.mypac;
/*
 * 	[ interface ]
 * 
 * 	- �����ڰ� ���� (�ܵ� ��ü ���� �Ұ�)
 * 	- ������ �޼ҵ�� ���� �� ���� ( �߻� �޼ҵ常 ���� �� �ִ� )
 *  - �ʵ�� static final ����� ���� �� �ִ�.
 *  - data type �� ��Ȱ�� �� �� �ִ�.
 *  - interface type �� �������� �ʿ��ϸ� ����(implements) Ŭ������ ����
 *    ��ü�� �����ؾ� �Ѵ�.
 *  - Ŭ���� ����� ���� ���������, �������̽��� ���� ������ �����ϴ�  
 */

public interface Remocon {
	// �ʵ�� static final �ʵ常 ���� �� �ִ�.(���� static final �̶�� ����?���� ����)
	// �׷��Ƿ� public String COMPANY="LG"; ��� �Է��ص� �ȴ�.
	// final �ʵ���� ���ʻ� �� �빮�ڷθ� �Ѵ�.
	// final = ����� �ִ� ���� �ٲ��� �ʴ´�.(�ٲ� �� ����)
	// ����� �� �ִ� ���� ���� �빮���̱⿡ �빮�ڰ� ���δٸ� ������� ��� �˾Ƶ���.
	public static final String COMPANY="LG";
	//public String COMPANY="LG";
	

	//interface ���� �޼ҵ�� �߻� �޼ҵ常 ���� �� �� �ִ�.
	//(���ȣ�� ����� ���ȣ�ȿ� ���Ǹ� �ƹ��͵� �����ذ��� �߻� �޼ҵ�� �Ѵ�.)
	public void up();
	public void down();
}
