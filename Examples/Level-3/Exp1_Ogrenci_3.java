package Kalıtım_Inheritance;

public class Exp1_Ogrenci_3 extends Exp1_Personel { 
	/* Ogrenci Sınıfımızı Personel sınıfından oluşturacağız.
	 */
	private int ogrenciNumarasi=0;
	
	public Exp1_Ogrenci_3() // Default Yapılandırıcı (Constructor.)
	{
		super();
		/* super deyimi ile personel sınıfındaki (super classdaki) default yapılandırıcının özellikler
		 * ini kullanabiliriz.*/
		ogrenciNumarasi =0;
	}

	public Exp1_Ogrenci_3(String isim, String soyIsim, int yas , int ogrenciNumarasi) {
		super();	// Yukarıda tanımlandığı gibi süper classın defaılt const. taki değerleri kullanır.
		
		setOgrenciNumarasi(ogrenciNumarasi); // Beklenmedik durumlara engel olmak için kısıtlama getirerek yazıyoruz.
			
		
		//this.ogrenciNumarasi = ogrenciNumarasi;
	}

	public int getOgrenciNumarasi() {
		return ogrenciNumarasi;
	}

	public void setOgrenciNumarasi(int ogrenciNumarasi) {
		if(ogrenciNumarasi<0)
			ogrenciNumarasi =0;
		else
			
		this.ogrenciNumarasi = ogrenciNumarasi;
	}
	@Override public String getIdInformation()
	{
		return super.getIdInformation() + "ogrenci no : " + ogrenciNumarasi;
	}
	
	
}
