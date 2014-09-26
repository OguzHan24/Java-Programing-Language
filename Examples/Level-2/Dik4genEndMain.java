package JavaKitapOrnekleri;
import java.io.ObjectInputStream.GetField;
import java.util.Scanner;
public class Dik4genEndMain {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double eni, boyu,eni2,boyu2;
		Dik4genEnd diktorgen1 = new Dik4genEnd();	// Nesneyi oluşturduk
		Dik4genEnd diktorgen2 = new Dik4genEnd();
		System.out.println("Lütfen birinci diktötgenin enini ve boyunu girin: ");
		
		eni=input.nextDouble();
		boyu=input.nextDouble();
		
		diktorgen1.setEn(eni);
		diktorgen1.setBoy(boyu);
		System.out.println("İkinci diktörtgenin enini ve boyunu girin : ");
		eni2=input.nextDouble();
		boyu2=input.nextDouble();
		
		diktorgen2.setEn(eni2);
		diktorgen2.setBoy(boyu2);

		
		System.out.println("Dİktötgenlerin alanları : ");
		System.out.println();
		System.out.println("diktorgen1 : " + diktorgen1.DiktorgenArea());
		System.out.println("diktorgen2 : " + diktorgen2.DiktorgenArea());
		
		
				

	}

}
