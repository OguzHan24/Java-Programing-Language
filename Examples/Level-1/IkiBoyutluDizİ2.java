import java.util.Random;
import java.util.Scanner;
public class IkiBoyutluDizİ2 
{
	public static void main(String[] args)
	{
		Random rnd = new Random();
		
		//int array[][];
		
		int array[][] = new int [rnd.nextInt(9)+1][rnd.nextInt(9)+1];
		// dizinin satır ve sütun sayılarını rastgele üretir.
		
		/*Bu farklı versiyonda dizinin satır ve sütun sayılarını programa rastgele ürettirdik.
		 * for döngüsü içinde dizinin satır ve sütun sayılarını bilmediğimiz için dizinin ne kadar 
		 * uzunluğu varsa o kadar dönmesi için "array.length" şeklinde yazdık.
		 * içteki döngüde ise "array[0].length" şeklinde yazmamız 0. satırdan itibaren programın 
		 * yazması içindi.  
		 * */
		
		for(int i=0; i<array.length; i++) 
 		{
			for(int j=0; j<array[0].length; j++)
			{
				array[i][j] = rnd.nextInt(9)+1;
			}
			
		}
		
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[0].length; j++)
			{
				System.out.print(array[i][j] + " ");
			}
			System.out.println(" ");
		}
		
	 System.out.println("Satır sayınız: " + array.length + " Sütun sayınız : " + array[0].length);
		
		
	}
}
