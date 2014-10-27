package Polymorphism_CokBicimlilik;

	
// import java.util.Scanner;
public class Rectangle extends GeometricalFigure
{
	private double uzunKenar;
	private double kısaKenar;
	//Scanner input = new Scanner(System.in);
	
	public Rectangle() 
	{
		kısaKenar =0;
		uzunKenar =0;
	}
	
	public double getUzunKenar() {
		return uzunKenar;
	}
	
	public void setUzunKenar(double uzunKenar) {
		if(uzunKenar<0)
			uzunKenar=0;
		else
			this.uzunKenar = uzunKenar;
	}
	
	public double getKısaKenar() {
		return kısaKenar;
	}
	
	public void setKısaKenar(double kısaKenar) {
		
		if(kısaKenar<0)
			kısaKenar=0;
		else
			this.kısaKenar = kısaKenar;
		
		/*	while(kısaKenar <= 0)
		{
			System.out.println("Kısa kenarı negatif olamaz! ");
			kısaKenar= input.nextInt();
		} */
		
	}
	
	public Rectangle(double kısaKenar , double uzunKenar)
	{
		setKısaKenar(kısaKenar);
		setUzunKenar(uzunKenar); 	// Böylece istenmeyen durumlara kısıtlama getirmiş oluruz.
		/* this.uzunKenar = uzunKenar;	Şeklinde de yazılabilir.
		this.kısaKenar = kısaKenar; */ 
		
	}
	
		@Override public double areaCalculation()
		{
			return kısaKenar * uzunKenar;
		}


}
