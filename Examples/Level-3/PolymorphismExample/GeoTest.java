package Polymorphism_CokBicimlilik;
import java.util.Scanner;
public class GeoTest 
{
	public static void main(String[] args)
	{
		GeometricalFigure geometric = new GeometricalFigure();
		
		Scanner input = new Scanner(System.in);
		double kenar1,kenar2,uzunKenar2;
		System.out.println("Enter square edge:");
		kenar1 = input.nextDouble();
		System.out.println("Enter Rectangle short edge and long side: ");
		kenar2=input.nextDouble();
		uzunKenar2=input.nextDouble();
		
		Square kare = new Square(kenar1);	// Karenin kenar uzunluğunu kullanıcıyada bırakabiliriz.
		Rectangle dik4gen = new Rectangle(kenar2,uzunKenar2); // (4,9) şeklinde bizde belirte biliriz.
		
		geoFigArea(geometric);
		geoFigArea(kare);
		geoFigArea(dik4gen);
		
	}
	
	public static void geoFigArea(GeometricalFigure geometric1)
	{
		System.out.println("Rectangle and Square area: " + geometric1.areaCalculation());
	}
	// Çok biçimlilik bu metot üzerinde gerçekleşir.
	
	
	
	
	
	
}
