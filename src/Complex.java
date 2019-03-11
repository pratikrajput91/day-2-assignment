public class Complex
	{
	double real;
	double imag;

	public void set(double real,double imag)
	{
	this.real=real;
	this.imag=imag;
	}
	public void display(){
	if(imag>=0)
	{
	System.out.println(real+" + "+imag+"i");
	}
	else
	{
	System.out.println(real+" - "+Math.abs(imag)+"i");
	
	}
	}
}
