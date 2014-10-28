package Kalıtım_Inheritance;

public class Exp2_Araba 
{
	/*
	 * Kompozisyon kullanım itibari ile iki farklı şekilde karşımıza çıkabilir.
	 * İlk kullanım şekli ; oluşturulan diğer sınıfa ait nesnenin private oluşturulup diğeri içinde 
	 * kullanılması şeklindedir.
	 * Aşağıda private Exp2_Motor motor = new Exp2_Motor şeklinde kullanılmıştır. 
	 * */
	
	private Exp2_Motor motor = new Exp2_Motor();
	
	// Yukarıda Motor sınıfını motor nesnesini oluşturarak araba sınıfında çağırdık fakat biraz farklı bir yöntemle.
	public void hareketEt()
	{
		motor.calistir(); // Motorumuzu çalıştırdık. ve bunu hareketEt metodunda çağırdık.
		System.out.println("Yola çıkıyoruuzz.");
	}
	public void durArtık()
	{
		motor.motorDur(); // Motor durduruldu.
		System.out.println("Eve geldik.. :)");
	}
	
	
	
	

}
