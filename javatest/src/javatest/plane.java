package javatest;

public class plane extends Viecle{
     private int flight; 
	public plane(int f) {
		// TODO 自動生成されたコンストラクター・スタブ
		flight = f;
		System.out.println("便名" + flight + "の飛行機を作成しました。") ;
		
		
	}
	
	public void show()
	{
		System.out.println("飛行機の便は" + flight + "です") ;
		System.out.println("速度は" + speed + "です");
		

	}

}
