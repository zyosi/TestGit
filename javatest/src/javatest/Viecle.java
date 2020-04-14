package javatest;
// 抽象クラス
public abstract class Viecle {
	protected int speed;
	public void setspeed(int s) {
		speed = s;
		System.out.println("速度を" + speed + "にしました。");
	}
	 abstract void show();
	
}
