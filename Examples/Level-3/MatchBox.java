package Kalıtım_Inheritance;

public class MatchBox extends Box 
{		
	// Kibrit Kutusu
	
	double weight; 	/* Ağırlık */
	
	public MatchBox()
	{
		// İstersek tanımlamayabiliriz. Java onu default olarak tanımlar.
	}
	public MatchBox(double width, double height, double depth, double m)
	{
		super(width,height,depth);
		weight =m; 
		/* double weight;
		 this.weight = weight; şeklinde de tenımlanabilir. */
	}
}
