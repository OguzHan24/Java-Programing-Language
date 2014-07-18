import java.util.Scanner;

public class ForDöngüsüOrnek {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sayac;
		System.out.println("Kaç satırlık üçgen çizeceksiniz ? ");
		sayac= input.nextInt();
	 //-------Bu kısım iç içe iki for öngüsü ile ekrana üçgen çizdirdiğimiz kısım------------//
		
		/* for(int i=1; i <= sayac ; i++)
		{
			for(int j=0; j<i ; j++) 	
			{
				System.out.print("*");
			}
			System.out.println(); 	*/
	
		//--------------------------------------------------------------------------------------//		
		for(int i=1;i<sayac;i++){	// Bu genel döngü girdiğimiz sayac değerinin koşulu sağlanana kadar içerideki döngülerin iş yapmasını sağlar.
				for(int j=0;j<sayac-i;j++) // BU döngü girilen değerin i eksiği kadar yıldızın önünde boşluk bırakır.
				{
					System.out.print(" "); // print şeklinde değilde println şeklinde yazarsak o zaman yıldızları aşağı goğru boşluklu çizer.
				}
				for(int k=0;k<2*i-1;k++) // Bu döngüde yıldızı çizer. 2*i -1 ile biz çizilecek yıldız değerini tek sayı haline getiriririz
				{ 						// Yani eğer sayac 5 ise 1-3-5-7-9 kadar yıldızı alt alta sırayla çizecek
					System.out.print("*");
				}
					System.out.println();
			}
		for(int i= sayac-2; i>0; i--) // sayac tan 2 çıkarırız çünkü en son satırın tekrar çizilmemesi için.
		{
			for(int j=0;j<sayac-i; j++)
			{
				System.out.print(" ");
			}
				for(int k=0;k<2*i-1; k++)
				{
					System.out.print("*");
				}
				System.out.println();
		}
		
		// Mantığı iyi anlamak gerekiyor. Bİr üçgeni eşkenar olarak çizeceksek 2n-1 koşulunu unutmamalıyız.
		// ve üçgenin satır başındaki boşluk miktarını belli bir şarta göre belirleyeceksek bu da ayrı bir for 
		// döngüsü ile hesaplanmalı...
			
			
			
		
		
	}
}


     