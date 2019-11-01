package Pdf_Questions;

public class Employee1 {
	private String name;
	private int age;
	private int salary;
	
	public Employee1(String name,int age) {
		setName(name);
		setAge(age);
		setSalary(2000);
	}
public Employee1(String name, int age, int salary) {
	setSalary(salary);
	//this(name,age);
}
public void printDetails() {
	System.out.println(name+" : "+age+" : "+salary);
}
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
public int getSalary() {
	return salary;
}
public void setName(String name) {
	this.name = name;
}
public void setAge(int age) {
	this.age = age;
}
public void setSalary(int salary) {
	this.salary = salary;
}

}

class Test{
	public static void main(String[] args) {
		//Employee1 e1 = new Employee1();
		Employee1 e2 = new Employee1("Jack",50);
		Employee1 e3 = new Employee1("chloe",40,5000);
		//e1.printDetails();
		
		
	}
}
