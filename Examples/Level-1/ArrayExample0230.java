package JavaKitapOrnekleri;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayExample0230 {
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
			int ElemanSayisi;
		   System.out.println("Diziniz kaç elemana sahip olsun ?");
		   
		   ElemanSayisi = input.nextInt();
		   double[] myList = new double [ElemanSayisi];
		   for(int i=0; i<myList.length;i++)
		   { 
		   System.out.println(i+1 + ".terimi giriniz: ");
		   myList[i]=input.nextDouble(); // Kullanıcının girdiği değer mutlaka dizinin indislerine atanmalı ..
		   }
		   for(int i=0; i<myList.length; i++)
		   {
		   System.out.println(myList[i]); // Girdiğimiz değerlerin tamamını yazdırır.
		   }
		   
		   
		// double[] myList = {2.1,5.6,7.3,9.1,4.2};
		
		// Tüm dizi elemanlarını göster (Print all the array elements )
		for (int i = 0; i < myList.length; i++) {
			System.out.println(" Dizinin elemanları: " + myList[i] + " ");
		}
		// Dizinin elemanlarını topla (Summing array elements)
		double toplam=0;
		for (int i = 0; i < myList.length; i++) {
			toplam += myList[i];
		}
		System.out.println("Elemanlar toplamı : " + toplam );
	
		// Dizinin en büyük elemanını bul ! (Finding the largest elements ! )
		double max= myList[0]; // dizimin 1. elemanını (0. indisteki elemanı ) değer olarak atayalım
		for(int i=0; i<myList.length;i++)
		{
			if(myList[i] > max)
				max = myList[i];
		}
		System.out.println("Dizinin max. elemanı : " + max);
		
	}
	

}
