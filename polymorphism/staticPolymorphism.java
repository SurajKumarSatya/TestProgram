package polymorphism;

import org.junit.Test;

public class staticPolymorphism  
{
	public void add(int num1, int num2)  //method overloading
	{
		int sum=num1+num2; //adding the two integers
		System.out.println("The Sum is " +sum);
	}	
		
	public void add(int num1, int num2, int num3)  //method overloading
	{
		int sum=num1+num2+num3;  //adding the three integers
		System.out.println("The Sum is " +sum);
	}	
	
	
	@Test
	public void calculate_Test()
	{
		add(20,35); //function call
		add(20,35,40);  //function call
	}

}
