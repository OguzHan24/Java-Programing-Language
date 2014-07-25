import java.util.Scanner;
import java.util.Random;
public class RandomBubleSort {
	// try catch eklenmesi lazım...
	
	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);
		Random rndm = new Random();
		int yedek;
		int kac_sayi; //,sayilar[];
		
		System.out.println("Kaç sayı gireceksiniz. ?");
		kac_sayi = input.nextInt(); // try catch konmalı . . . 
		
		int sayilar[] = new int[kac_sayi];
		
		for(int i=0;i<kac_sayi;i++)
		{
			sayilar[i]= rndm.nextInt(101); // içerisindeki 101 ; 0 ile 100 arası sayıları üretimini belirlemek için.
			// (101)+1 şeklinde yazarsak rastgele sayı olarak 0'ı üretmez.
		}
		
		
		System.out.println("Üretilen rastgele sayilar aşağıdaki gibidir.\n");
		
		for(int i=0; i<kac_sayi; i++)
		{
			System.out.print(sayilar[i] + "-");
		}
		System.out.println("\n");
		/*
		 * BubleSort un Basit mantığı...
		 * İç içe iki döngüde biz dış döngü ile girilen sayı adedince işlemin yapılamasını sağlarız
		 * İşlem iç döngüdeyken i=0 değerinde eğer 0. indis 1.indisten büyükse yer değiştirme yapar.
		 * Sonra i nin değeri 1 artar. 0 ve 1 iken < kac_sayi(3 seçelim)-0-1 den 2 dir.
		 * Yani i değeri 0 ve 1 değerleri için döngünün iki defa çalışmasını değeri 2 olunca şart
		 * sağlanmayacağından iç döngüden çıkıp dış döngüye tekrar gelip , işlemin j adımının da
		 * koşuluna bakar. Yani j nin değeri 1 artar ve 0 dan 1 değeri ne geçer. 0 ve 1 için
		 *  < kac_sayi(3 seçmiştik) - 1 = (2) değerinden küçük olacağından dış döngü de iki defa devam
		 *  eder. Son olarak da koşul sağlanmayacağından -2 küçük değildir 2 olacağından- dış döngüden
		 *  çıkar ve ekrana yazma işlemine geçilir.
		 * */
		
		for(int j=0; j < (kac_sayi-1) ; j++) // 1 çıkarmamızın sebebi son indise gelen en büyük sayıyı tekrar tekrar işleme sokmamak içindir
		{
			for(int i=0; i < kac_sayi-j-1 ; i++) // -j-1 çıkarılması dizinin dışına taşmamak içindir. Bunu yazmadığımızda
			// 			java.lang.ArrayIndexOutOfBoundsException "hatasını alırız"...
			{
				if(sayilar[i] > sayilar[i+1])
				{
					yedek= sayilar[i];
					sayilar[i] = sayilar[i+1];
					sayilar[i+1] = yedek;
				}
				
			}
		}
		System.out.println("Üretilen rastgele sayılarınızın küçükten büyüğe sıralanışı aşağıdaki gibidir.\n");
		
		for(int i=0; i<kac_sayi;i++)
		{
			System.out.print(sayilar[i] + "-");
		}
	
	}
}
