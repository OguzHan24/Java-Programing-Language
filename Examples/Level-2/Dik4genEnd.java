package JavaKitapOrnekleri;

public class Dik4genEnd 
{
	private double en;
	private double boy;
	
	public double getEn()
	{
		return en ;
	}
	public void setEn(double x)
	{
		if(x<0)
		x=0;
		else
		en=x;
	}
	public double getBoy()
	{
		return boy;
	}
	public void setBoy(double y)
	{
		if(y<0)
			boy = 0;
		else 
			boy=y;
	}
	public double DiktorgenArea()
	{
		return en*boy;
	}
	

}
