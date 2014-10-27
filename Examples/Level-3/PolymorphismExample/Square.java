package Polymorphism_CokBicimlilik;

public class Square extends GeometricalFigure

{

	private double kenar;
	
	public Square()
	{
		kenar =0;
	}
	
	public double getKenar() {
		return kenar;
	}
	
	public void setKenar(double kenar) {
		if(kenar < 0 )
			kenar = 0;
		else
			this.kenar = kenar;
	}
	public Square(double kenar){
		setKenar(kenar);
	}
	
	@Override public double areaCalculation()
	{
		return kenar*kenar;
	}
}
