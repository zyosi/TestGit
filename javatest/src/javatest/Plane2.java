package javatest;

public class Plane2  implements Iviecle{

	private int flight;
	
	public Plane2(int n)
	{
		flight= n;

		System.out.println("フライトナンバー" + n +  "の飛行機を作成しました。");
		
	}
	
	public void show()
	{
		System.out.println("貴方の飛行機のフライトは" + flight + "です");
	
	}
	
}
