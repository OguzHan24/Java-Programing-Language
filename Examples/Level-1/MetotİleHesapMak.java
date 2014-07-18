import java.util.Scanner;
import java.util.Random;

public class MetotİleHesapMak 
{

	public static void main(String[] args) 
	{
		double num1,num2,result;
		int secim=0;
		int faktoriyel;
		
		do{
							// Menüyü ayrı bir metotta yazıp burada çağıracağız.
		//	MenuGoster(); 	// Metodu çağırdık. (MenudegerAl metodunda çağırdığımız için burada yazmayabiliriz.)
			secim = MenuDegerAl();// Yine bir metotla çağırıcaz Parametre almayan değer döndüren metotla.
			 
	
			switch (secim) {
			case 1:
				num1= OndalıkSayıAl();			// Metotla alacağız.
				num2 = OndalıkSayıAl();
				result = Toplama(num1, num2);	// İşlemleri yapan bir sonuc metodu çağıracağız.
				// parametrelerini atıyoruz ! 
				SonucuGoster(result);
				break;
			case 2:
				num1 = OndalıkSayıAl();
				num2 = OndalıkSayıAl();
				result = Cikarma(num1, num2);
				SonucuGoster(result);
				break;
			case 3: 
				num1 = OndalıkSayıAl();
				num2 = OndalıkSayıAl();
				result = Carpma(num1, num2);
				SonucuGoster(result);
				break;
				
			case 4:
				num1 = OndalıkSayıAl();
				num2 = OndalıkSayıAl();
				result = Bolme(num1, num2);
				SonucuGoster(result);
				break;
			case 5:
				faktoriyel = TamSayiAl();
				result = FaktoriyelHesapla(faktoriyel);
				SonucuGoster(result);
				break;
			case 6:
				faktoriyel = TamSayiAl();
				result = RastgeleSayiUret(faktoriyel);
				SonucuGoster(result);
				break;
				default:
					System.out.println("Hesap mak. kullandığınız için teşekkürler cnm. :-D");
					break;
			}
		}while(secim != 7);
			System.out.println("Çıkış yaptınız!");
			
	}
	
	public static void 	MenuGoster() // Parametre almayan değer döndürmeyen 
	{
		System.out.println("1-Toplama\n" + 
						"2-Çıkarma\n" + 
						"3-Çarpma\n" + 
						"4-Bölme\n" + 
						"5-Faktöriyel\n" + 
						"6-Rastgele Sayı\n" + 
						"7-Çıkış\n");
	}
	
	public static int MenuDegerAl()
	{
		Scanner input = new Scanner(System.in); // Kullanıcıdan veri alacağız.
		int sayi;
		MenuGoster();
		sayi= input.nextInt(); // Kullanıcının girdiği değer.
		
		 while(sayi<1 || sayi > 7)
		{
			MenuGoster();
			System.out.println("Lütfen menüden geçerli bir seçim yapınız.\n");
			sayi=input.nextInt(); // Burayı yazmassak sürekli  menüyü ve uyarı mesajını ekrana yazar. 
		} 	
			
		return sayi;
	}
	
	public static double OndalıkSayıAl()
	{
		Scanner input = new Scanner(System.in);
		double sayi;
		System.out.println("Bir ondalıklı sayı giriniz: ");
		sayi= input.nextDouble();
		return sayi;
	}
	
	public static double Toplama(double number1, double number2) 	// Değer döndürüp parametre alan bir metot ile sonuc işlemini yapacağız.
	{
		return number1 + number2;
	}
	
	public static double Cikarma(double number1 , double number2)
	{
		return number1 - number2;
	}
	
	
	public static double Carpma(double number1 , double number2)
	{
		return number1 * number2;
	}
	
	
	public static double Bolme(double number1 , double number2)
	{
		return number1 / number2;
	}
	

	public static int TamSayiAl()
	{
		Scanner  input = new Scanner(System.in);
		int sayi;
		System.out.println("Bir tamsayi giriniz: ");
		sayi = input.nextInt();
		
		// try - catch bloğu yerleştirilmeli. . . 
		return sayi;
	}
	
	
	public static int FaktoriyelHesapla(int num) // parametre alıp değer döndürecek.
	{
		int fakt=1;
		for(int i =1; i<=num; i++)
			fakt*=i;
		return fakt;
	}


	public static int RastgeleSayiUret(int num) // Bu parametre değerleri ayrı metotlarda olduğu için alınabilir.
	{
		Random rnd = new Random();
		return rnd.nextInt(num)+1; // parametre değerini kullanıcıdan aldığımız değeri atayacak.
		
		
	}
	
	public static void SonucuGoster(double num)
	{
		System.out.println("İşleminizin sonucu : " + num);
	}
	
}






















