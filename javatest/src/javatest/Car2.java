package javatest;

public class Car2  implements Iviecle{

	private int num;
	private double gas ;
	
	public Car2(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
		
	}
	
	public void show()
	{
		System.out.println("貴方の車のナンバーは" + num + "です");
		System.out.println("貴方の車のガソリン量は" + gas + "です");	
	}
	
}
