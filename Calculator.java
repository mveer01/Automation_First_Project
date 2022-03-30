package day1;

public class Calculator {
	/*1) write the java program that contains method display name
	 2) inside method print name
	 3)from main method call that method to display name
	 4)In that same class add a default constructor, print some text inside default constructor
	 5)Add one or more constructor with parameters, print input para inside the constructor
	 6)call both constructors inside main method to display the text*/

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		Calculator cal2 = new Calculator(40,50);
		int DIFF = cal.SUB(9, 3);
		System.out.println("Diff using with patameter and with return type function= " + DIFF);
		String Print = cal.PntName();
		System.out.println("Printname=" + Print);
	}

	public Calculator()
	{
		System.out.println("Default Constructor");
	}
	public Calculator (int x, int y) 
	{
		int c = x+y;
		System.out.println("Addition using parametarised constructor is="+ c);
	}

	public int SUB(int d, int e) {
		int f = d - e;
		return f;
	}

	public String PntName() {
		String PrintName = "Mahalakshmi Automation Tester";
		return PrintName;
	}

}
