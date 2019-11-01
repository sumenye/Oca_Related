package Pdf_Questions;

public class Planet1 {
	public String name;
	public int moons;
	public Planet1(String name,int moons) {
		this.name=name;
		this.moons=moons;
	}

	public static void main(String[] args) {
		Planet1[] planets= {new Planet1("Mercury",0), new Planet1("Venus",0), new Planet1("Earth",1),new Planet1("Mars",2)};
	
	System.out.println(planets);
	System.out.println(planets[2]);
	System.out.println(planets[2].moons);
	}


}
