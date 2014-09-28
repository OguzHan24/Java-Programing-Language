import java.util.Scanner;
public class BaklavaDilimi {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int sayac;
		System.out.println("kaç satırlı üçgen gireceksin canım");
		sayac=input.nextInt();
		for(int i=1; i<sayac;i++)
		{
			for(int j=0; j<sayac-i; j++)
			{
				System.out.print(" ");
			}
				for(int k=0; k<2*i-1;k++)
				{
					System.out.print("*");
				}
				System.out.println();
				
		}
		for(int i = sayac-2; i>0; i--)
		{
			for(int j=0;j<sayac-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0; k<2*i-1;k++)
			{
				System.out.print("*");
				
			}
			System.out.println();
			
			
		}
	
	}

}
