package Kalıtım_Inheritance;

public class Exp1_Personel 
{
	private String personelName;
	private String personelSurName;
	private int personelAge;
	
	public Exp1_Personel()	// Default Constructor.
	{
		personelName = "İsim girilmedi";
		personelSurName = "Soyisim girilmedi";
		personelAge = 0;		
	}

	public Exp1_Personel(String personelName, String personelSurName,
			int personelAge) 
	{
		super();
		this.personelName = personelName;
		this.personelSurName = personelSurName;
		this.personelAge = personelAge;
		
	}

	public String getPersonelName() {
		return personelName;
	}

	public void setPersonelName(String personelName) {
		this.personelName = personelName;
	}

	public String getPersonelSurName() {
		return personelSurName;
	}

	public void setPersonelSurName(String personelSurName) {
		this.personelSurName = personelSurName;
	}

	public int getPersonelAge() {
		return personelAge;
	}

	public void setPersonelAge(int personelAge) 
	{
		if(personelAge<0)
		{
			personelAge=0;
		}
		
		else
		{
	 } 	  this.personelAge = personelAge;
		
   }
	public String getIdInformation()
	{
		return "Kimlik bilgileri: İsmi " + personelName + " Soyismi: " + personelSurName + " Yasi "
				+ personelAge;
	}
		@Override public String toString(){
			return " Kimlik bilgileri:" + personelName + " " + personelSurName + " " + personelAge;
		}
		
	
	

}
