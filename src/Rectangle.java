public class Rectangle
{
	int length;
	int breath;

	public Rectangle(int length,int breath){
	this.length=length;
	this.breath=breath;
}

	public int areaOfRectangle(){
	return length*breath;
}

	public int perimeterOfRectangle(){
	return 2*(length+breath);
}


}

	