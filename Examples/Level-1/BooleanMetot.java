import java.util.Scanner;
public class BooleanMetot 
{

	
	public static void main(String[] args) 
	{
		int sayi1;
		boolean durum;
		sayi1=SayiGir();
		durum=Kontrol(sayi1);
		if(durum)
		System.out.println("Girdiğiniz sayı çifttir. ");
		else
			System.out.println("Girdiğiniz sayı tektir.");
	
	}
	public static boolean Kontrol(int CTSayi)
	{	
		if(CTSayi % 2==0)
			return true;
		else
			return false;
	}
	
	
	public static int SayiGir()
	{
		Scanner input = new Scanner(System.in);
		int sayi;
		System.out.println("Bir sayi giriniz: ");
		sayi = input.nextInt();
		return sayi;
	}

}
