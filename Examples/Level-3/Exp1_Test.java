package Kalıtım_Inheritance;

public class Exp1_Test {


		
	public static void main(String[] args) 
	{
		
		Exp1_Personel personelNesne = new Exp1_Personel(" Senior "," Developer ",21);
		
		System.out.println(personelNesne.getIdInformation());
		
		System.out.println(personelNesne.toString());
		
		System.out.println();
		
		Exp1_Ogrenci_3 ogrenci3 = new Exp1_Ogrenci_3(" Junior ", " Javaci " , 12321 , 20 );
		System.out.println(ogrenci3.getIdInformation());
		// toString metodunu çağıralım
		System.out.println(ogrenci3.toString());
		System.out.println();
		
		
		
		
		//Exp1_Ogrenci ogrenciNesne = new Exp1_Ogrenci(" Junior " , " Oguzhan " , 12253075 , 21);
		// Ogrenci 1 ve Ogrenci2 ornekleri için .
		// Nesnede atama yaptık.
		
		
		/*		
		System.out.println(ogrenciNesne.getKimlikBilgileri());
		System.out.println(ogrenciNesne.toString());
		
	    System.out.println();
			ogrenci2 ve ogrenci 1 ornekleri için kullanıldı		*/
		
		
	}
	

}
