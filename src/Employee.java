public class Employee{
	int id;
	String name;
	double monthly_basic;
	int medical=1800;
	int conveance=1000;
	double pf;
	double esic;
	double prof_tax;
	
	
	public Employee(int id,String name,double monthly_basic){
	this.id=id;
	this.name=name;
	this.monthly_basic=monthly_basic;
	if(monthly_basic/10<=6500)
	this.pf=monthly_basic/10;
	else
	this.pf=6500;
	if(monthly_basic<=5000)
	this.esic=4.75*monthly_basic/100;
	if(GetmonthlyGross()<=10000)
	this.prof_tax=50;
	else
	this.prof_tax=100;
	
	

	

}
	public double GetAnnualBasic(){
	return 12*monthly_basic;
}
	
	public double GetmonthlyGross(){
	return (monthly_basic+medical+conveance);
}
	public double GetAnnualGross(){
	return 12*GetmonthlyGross();
}
	public double GetMonthlyDeduction(){
	return pf+esic+prof_tax;
}
	public double getMonthlyTakeHome(){
	return GetmonthlyGross()-GetMonthlyDeduction();
}
	public double GetAnnualTakeHome(){
	return 12*getMonthlyTakeHome();
}
}