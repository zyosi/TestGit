package javatest;

public class plane extends Viecle{
     private int flight; 
	public plane(int f) {
		// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
		flight = f;
		System.out.println("�֖�" + flight + "�̔�s�@���쐬���܂����B") ;
		
		
	}
	
	public void show()
	{
		System.out.println("��s�@�̕ւ�" + flight + "�ł�") ;
		System.out.println("���x��" + speed + "�ł�");
		

	}

}
