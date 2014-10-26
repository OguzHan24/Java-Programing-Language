package Kalıtım_Inheritance;

//Kutu
	public class Box {		
		
		double width;	/* Genişlik */
		double height; 	/* Yükseklik */
		double depth;	/* Derinlik */
		
		public Box()
		{
			
		}
		
		public Box(double w, double h, double d)
		{
			width = w;
			height = h;
			depth = d;
		}
		public void getvolume()	/* Hacim değerini hesaplayan metot*/
		{
			System.out.println("Volume is : " + width * height * depth);
			
		}
		
}
