import java.util.Scanner;
public class FaktöriyelİHesapla {

	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int fakt;
		System.out.println("Hangi sayının faktöriyeli hesaplansın?");
		fakt = input.nextInt();
		Hesapla(fakt); // Metodu çağırdığımız yer.
	}
	
	public static void Hesapla(int KacTane)
	{
		int faktoriyel=1;
		
		for(int i=1; i<=KacTane; i++) // i 1 den başlamalı ilk döngüde sıfır olmamak için.
		{
			faktoriyel = faktoriyel*i;
		}
		System.out.println("Sayınızın faktöriyeli : " + faktoriyel);
		// System.out for döng.nün içinde yazılırsa ekran çıktısı aşağıdaki gibi olur:  
		/* Hangi sayının faktöriyelini alacaksınız ?
		 * 5
		 * Sayınızın faktöriyeli : 1
		 * Sayınızın faktöriyeli : 2
		 * Sayınızın faktöriyeli : 6
		 * Sayınızın faktöriyeli : 24
		 * Sayınızın faktöriyeli : 120
		 */
	}
	 
}
