package javatest;

public class Norimonosample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Viecle[] vc;
		vc = new Viecle[2];
		vc[0] = new Car(1233,20.55);
		vc[0].setspeed(60);
		
		vc[1] = new plane(9998);
		vc[1].setspeed(1200);
		
		for (int i=0; i<vc.length; i++) {
			vc[i].show();
		}
		
	}

}
