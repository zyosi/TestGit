package javatest;

public class Plane2  implements Iviecle{

	private int flight;
	
	public Plane2(int n)
	{
		flight= n;

		System.out.println("�t���C�g�i���o�[" + n +  "�̔�s�@���쐬���܂����B");
		
	}
	
	public void show()
	{
		System.out.println("�M���̔�s�@�̃t���C�g��" + flight + "�ł�");
	
	}
	
}
