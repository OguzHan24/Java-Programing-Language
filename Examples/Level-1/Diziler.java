package Ders16_Diziler;

import java.util.Scanner;

	public class Diziler 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
//		int array[] = {17,24,41,500 };
//		for(int i=0; i<array.length;i++) // Dizinin elemanlarını sırasıyla ekrana yazdıran komut.
//		
//			System.out.println("Dizinin " + i + ".indeksi:" + array[i]);
		
//--------------------------------------------------------------------------------------//		
		int ArrayBoyut;
		
		System.out.println("Dizinizin boyutunu giriniz: ");
		ArrayBoyut = input.nextInt();
		int array[] = new int [ArrayBoyut];
		for(int i =0; i <array.length; i++) // i<10 array.length şeklinde yazılabilir. 
		{
			System.out.println(i+1 + ".sayıyı giriniz: ");
			array[i] = input.nextInt();
			System.out.println();
			
		}
		  // for (int i=0; i<10; i++) 
			 //System.out.println(array[i]);
		/* Kullanıcı tarafından girilen dizi elemanlarını alt alta yazar.	*/
		
		// Dizinin elemanlarının ortalamasını almak istersek...
		
		int toplam=0;
		double ortalama;
		
		for(int i=0; i<ArrayBoyut; i++ )
		 {
			 toplam = toplam + array[i];
		 }
		ortalama = (double)toplam / 10; // (double)toplam şeklinde yazılınca da toplamı orada double olarak görür.
		
		System.out.println("Dizinin elemanları ortalaması : " + ortalama);
		 
		

	}

}
