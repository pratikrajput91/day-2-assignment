public class Distance
{
	private double inches;
	private int feet;
	
	public void set(int feet,double inches)
{	
	this.feet=feet;
	this.inches=inches;
}
	

	public void display()
{	
	System.out.println("total distance is:"+feet+ "and"+inches);
}

public Distance sum(Distance d3)
{
	d3.feet+=this.feet;
	d3.inches+=d3.inches+this.inches;
	return d3;	
}
}

