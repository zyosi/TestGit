package javatest;

public class Car extends Viecle {

	private int num;
	private double gas;
	
	public Car(int n , double g) 
		{
		// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
		num = n;
		gas = g;
		System.out.println("�i���o�[" + num + "�K�\������" + gas + "�̎Ԃ��쐬���܂����B");
		}
	public void show() 
		{
			System.out.println("�Ԃ̃i���o�[��" + num + "�ł�");
			System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
			System.out.println("���x��" + speed + "�ł��B");
			
		}
	}


