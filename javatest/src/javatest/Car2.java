package javatest;

public class Car2  implements Iviecle{

	private int num;
	private double gas ;
	
	public Car2(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("�i���o�[" + num + "�K�\������" + gas + "�̎Ԃ��쐬���܂����B");
		
	}
	
	public void show()
	{
		System.out.println("�M���̎Ԃ̃i���o�[��" + num + "�ł�");
		System.out.println("�M���̎Ԃ̃K�\�����ʂ�" + gas + "�ł�");	
	}
	
}
