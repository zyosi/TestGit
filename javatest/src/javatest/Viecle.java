package javatest;
// ���ۃN���X
public abstract class Viecle {
	protected int speed;
	public void setspeed(int s) {
		speed = s;
		System.out.println("���x��" + speed + "�ɂ��܂����B");
	}
	 abstract void show();
	
}
