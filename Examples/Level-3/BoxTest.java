package Kalıtım_Inheritance;
import java.util.Scanner;
public class BoxTest 
{
	public static void main(String [] args)
	{
		double agırlık,genislik,yukseklik,derinlik;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kibrit kutunuzun genişlik, yükseklik, derinlik ve ağırlık " +
				"değerlerini sırasıyla giriniz");
		genislik = input.nextDouble();
		yukseklik = input.nextDouble();		
		derinlik = input.nextDouble();
		agırlık = input.nextDouble();
		
		MatchBox mtchbx = new MatchBox(genislik,yukseklik,derinlik,agırlık);
		mtchbx.getvolume(); // Hacmini göster.
		
		System.out.println("Kibrit kutusunun genişliği :  " + mtchbx.width);
		System.out.println("Kibrit kutusunun yüksekliği: " + mtchbx.height);
		System.out.println("Kibrit kutusunun derinliği : " +  mtchbx.depth);
		System.out.println("Kibrit kutusunun ağırlığı  : " + mtchbx.weight);
	}

}
