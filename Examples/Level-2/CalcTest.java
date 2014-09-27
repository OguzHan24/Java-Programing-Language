package Calculator;

public class CalcTest 
{
	
	public static void main(String args[])
	{
		double sayi;
		
		double sayi1=Calc.Toplama(15, 25);
		double sayi2 =Calc.Cikarma(23, 45);
		double sayi3=Calc.Carpma(3, 7);
		double sayi4=Calc.Bolme(15, 4);
		double sayi5=Calc.Faktoriyel(4);
		sayi= Calc.KuvvetAl(3, 4);
		double sayi6=Calc.MutlakDeger(-24);
		
		System.out.println("Toplama : " +	 sayi1 );
		System.out.println("Cikarma : " +	 sayi2 );
		System.out.println("Carpma:   " +	 sayi3 );
		System.out.println("BOlme :   " +	 sayi4 );
		System.out.println("Faktoriyel : " + sayi5 );
		System.out.println("Kuvvet : "  +     sayi );
		System.out.println("Mutlak deger :" + sayi6 );
		
	}

}
