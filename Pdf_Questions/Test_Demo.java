package Pdf_Questions;

class Demo
{
	int ns;
	static int s;
	Demo(int ns)
	{
		if(s<ns)
		{
			s=ns;
			this.ns=ns;
		}
	}
	void display()
	{
		System.out.println("ns = "+ns+"  s = "+s);
	}
}
public class Test_Demo
{
	public static void main(String[] args) 
	{
		Demo d1= new Demo(50);	
		Demo d2= new Demo(125);	
		Demo d3= new Demo(100);	
		d1.display();
		d2.display();
		d3.display();
	}
}