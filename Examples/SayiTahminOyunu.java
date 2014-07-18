import java.util.Scanner;
import java.util.Random;
public class SayiTahminOyunu {

	// Üretilen rastgele bir sayiyi kullanıcının tahmin etmesi ve girdiği sayıya göre programın yakınsınız veya uzaksınız 
	// yazacağı bir basit bir program. . .
	// try catch lazım ve ayrıca iki sınıfta object oriented mantığıyla bir daha yazılmalı...
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Random rndm = new Random();
		int RandomSayi,TahminSayisi,FarkSayisi;
		int sayac=0;
		RandomSayi=rndm.nextInt(100)+1; // 1 ile 100 arasında random sayı üretecek. (0'ı istemiyorsak + 1 yazarız.)
		
		do{
			System.out.println("Tahmininizi giriniz: ");
			TahminSayisi = input.nextInt();
			sayac++; // Kullanıcının her tahminnden sonra sayacı 1 artırırız. Aşağıda da kaç adımda bulduğunu yazdıracağız.
 			
			FarkSayisi = Math.abs((RandomSayi-TahminSayisi)); // Random sayıdan tahmin sayısının mutlak değerde farkını aldık.
			 
			if(FarkSayisi > 0 && FarkSayisi <= 5)
				 System.out.println("Sayıya çok yaklaştınız ortam çok sıcak . . . ");
			 else if(FarkSayisi>5 && FarkSayisi <=15)
				 System.out.println("Sayıya yaklaştınız ortam sıcak. . .");
			 else if(FarkSayisi>15 && FarkSayisi<=25)
				 System.out.println("Ortam ılık. . . ");
			 else if(FarkSayisi>25 && FarkSayisi <=35)
				 System.out.println("Sayı nerede sen nerdesin (?) ortam normal . . .");
			 else if(FarkSayisi>35 && FarkSayisi<=45)
				 System.out.println("Sayıdan uzaklaşıyorsunuz ortam soğuk. . . ");
			 else if(FarkSayisi>45) // Bu kısmı belirtmeliyiz...
				 System.out.println("Ortam çook soğuk. . . ");
			 
			
		}while(FarkSayisi!=0); // Aradaki fark 0 olunca while döngüsü dışına çıkacaktır.
		
		System.out.println(" Bulduğunuz sayı " + RandomSayi + " - " + sayac + " adımda buldunuz...");
	}
}
