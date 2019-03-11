public class RectangleMain
{
	public static void main(String args[])
{
	Rectangle r1= new Rectangle(4,6);
	Rectangle r2=new Rectangle(5,7);

	System.out.println("Area of rectangle R1:"+r1.areaOfRectangle());
	System.out.println("perimeter of rectangle R1:"+r1.perimeterOfRectangle());

	System.out.println("Area of rectangle R2:"+r2.areaOfRectangle());
	System.out.println("perimeter of rectangleR2:"+r2.perimeterOfRectangle());
}

}