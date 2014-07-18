package PauLab;

public class MountainBike extends Bicycle
{
	private int gear;
	public MountainBike(Vector2d position ,Vector2d velocity ,int gear)
	{
		super(position,velocity);
		this.gear = gear;
	}
	
	public MountainBike()
	{
		super();
	}
	public MountainBike(Vector2d position,Vector2d vecolity)
	{
		super(position,vecolity);
	}
	public int getGear(){
		return gear;
	}
	
	public int setGear(int gear){
		return gear;
	}
	public String toString()
	{
		
		return String.format("%s\n%s\nGear: %s", "I'm a mountain bike", super.toString(),getGear());
	}
	public void  move()
	{
		double speed = gear*10;
		setVelocity(getVelocity().normalize().product(speed));
		super.move();
		
	}
	
	
	
	
}
