package test.mypac;
// ������ ��Ȯ�� package ���� test.mypac.Car 

/*
 *  class �� ��Ȱ
 *  
 *  1. ��ü�� ���赵 ��Ȱ
 *  
 *  2. data type ��Ȱ
 *  
 *  3. static �ʵ�� �޼ҵ带 �����ϴ� ��Ȱ
 */

public class Car {
	//�����(field)   Ŭ������ ������ ������ �ʵ�.
	public String name;
	
	//�޸��� ���(method)
	public void drive() {
		System.out.println(this.name+" ��(��)�޷���!");
	}				//���⼭ this �� field(�ʵ�)�� ����Ų��. (�ڱ� �ڽ��� ������)
					//drive() ������ ���� �� �ִ� name ����
					//�� string �� �� name 
	//���ߴ� ���(method)
	public void stop() {
		System.out.println("�����!");
		
	}
}