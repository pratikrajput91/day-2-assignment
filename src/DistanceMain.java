public class DistanceMain
{
public static void main(String []args)
{
	Distance d1=new Distance();
	d1.set(5,6);
d1.display();
	
	Distance d2=new Distance();
	d2.set(6,2);
d2.display();
	Distance d3=d1.sum(d2);
	
	d3.display();
}
}