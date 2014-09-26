package Calculator;

public class Calc 
{
	public static double Toplama(double sayi1 ,double sayi2)
	{
		return sayi1 + sayi2;
	}
	
	public static double Cikarma(double sayi1 ,double sayi2)
	{
		return sayi1 - sayi2;
	}
	
	public static double Carpma(double sayi1 ,double sayi2)
	{
		return sayi1 * sayi2;
	}
	
	public static double Bolme(double sayi1 ,double sayi2)
	{
		return sayi1 / sayi2;
	}
	public static double KuvvetAl(int sayi1 ,int sayi2)
	{
		return Math.pow(sayi1, sayi2);
		
			
		/*	Math.pow(sayi1, sayi2);
		return 0;	 */	// Şeklinde de yazılabilir.
	}
	public static double MutlakDeger(int sayi)
	{
		if(sayi > 0)
		{
			return sayi;
		}
		else
			return sayi * -1;
	}
	
	public static int Faktoriyel(int sayi)
	{
		int sonuc = 1;
		
		for(int i=1; i<=sayi; i++)					// for(int i = sayi; i>0 ; i--)
		sonuc=sonuc * i; // sonuc = sonuc * i;				// sonuc = sonuc * i;  --**--> şeklinde de yazılabilir.
		
		return 0;
	}

}
