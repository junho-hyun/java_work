package test.mypac;

public class MacBook {
	//�ܺο��� ���� �Ұ��ϵ��� ���� �����ڸ� private �� �ؼ� �ʵ� 3�� �����ϱ�
 	private Cpu cpu;
	private Memory memory;
	private HardDisk hardDisk;
	
	//������ ( �����ڸ� �ϳ��� �����ϸ� default �����ڴ� ������� )
	public MacBook(Cpu cpu, Memory memory, HardDisk hardDisk) {
		//���������� �����Ƿ� this. �� ���� �� �� ����.
		this.cpu=cpu;
		this.memory=memory;
		this.hardDisk=hardDisk;
	}
	//�޼ҵ�
	public void doGame() {
			//���⼱ ȥ���� ������ ���� ������ this.�� �Ⱥٿ� ��� �����ϴ�.
			// ���� Ŭ���� �ȿ� �ֱ� ������.
		if(cpu==null || memory==null || hardDisk==null) {
			System.out.println("��ǰ�� �����ؼ� �ƺ��� ������ �� �� �����ϴ�.");
			return; // �޼ҵ带 ���⼭ ������
		}
		System.out.println("�ų��� ������ �ؿ�!");
	}
}
