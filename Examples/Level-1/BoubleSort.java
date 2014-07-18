import java.util.Scanner;

public class BoubleSort 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int sayilar[], kac_sayi,yedek;
		int UnSort[];
		System.out.println("Kaç sayı gireceksiniz ?");
		kac_sayi = input.nextInt();
		
		sayilar = new int [kac_sayi];
		UnSort = new int[kac_sayi];
		
		for(int i=0; i<kac_sayi; i++)
		{
			System.out.println(i+1 + " . Sayiyi girin");
			sayilar[i]=input.nextInt();
			UnSort[i]= sayilar[i];
			 
		}
		for(int j=1; j<kac_sayi ; j++)  
		{
			for(int i=0; i < kac_sayi-j; i++) // Burada j yi çıkarmamızın sebebi bu döngü içerideki döngüdür.bir kez döndükten sonra 
											//dış döngüye gelir ve j bir artar . Ve büylece son indise gelen sayi en büyük olacağından 
											// karşılaştırmaya tekrar tekrar girmez.
			{
				if(sayilar[i] > sayilar[i+1])
				{
					yedek = sayilar[i];
					sayilar[i] = sayilar[i+1];
					sayilar[i+1] = yedek;
				}
			}
		}
		
		System.out.println("Dizinin sıralanmamış ve sıralanmış şekli şu şekildedir.  ");
		
		for(int i=0; i<kac_sayi; i++)
		{
			System.out.print(UnSort[i] + "-");
		}
		System.out.println();
		
		for(int i=0; i<kac_sayi; i++)
		{
			System.out.print(sayilar[i] + "-");
		}
		
	}

}
