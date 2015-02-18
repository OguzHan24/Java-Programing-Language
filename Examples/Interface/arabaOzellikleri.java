package arabalarr;
import java.util.Scanner;

public class arabaOzellikleri implements Arabalar 
{
	public int arabaninOzellikleri(){
		 int arabaYas;
		 String arabaIsim;
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Arabanizin yasini girin: ");
		 arabaYas = input.nextInt();
		 System.out.println("Arabanizin markasini giriniz: ");
				 arabaIsim = input.next();
				 System.out.println("Araba yas ve isim  : " + arabaYas + "\t" + arabaIsim);
		return 0;
	}

	@Override
	public int arabaninPiyasasi() {
		// TODO Auto-generated method stub
		return 0;
	}

}
