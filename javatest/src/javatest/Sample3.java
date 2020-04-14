package javatest;

class Sample3
{
	
	
	public static void main(String[] args)
	{
		Iviecle [] ivc;
		ivc = new Iviecle[2];
		
		ivc[0] = new Car2(12345, 20.5);
		ivc[1] = new Plane2(6666);
		
		for (int i=0; i<ivc.length; i++) {
				ivc[i].show();
		}
			
	
	}
	
}
