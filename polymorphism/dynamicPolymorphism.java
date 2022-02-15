package polymorphism;

//public class dynamicPolymorphism 

	class Animal
	{
		public void move()
		{
			System.out.println("Animals can move");
		}
	}
	
	//   child       //parent
	class Dog extends Animal //inheritance
	{
		public void move()
		{
			System.out.println("Animals can Walk");
		}
	}
	
	public class dynamicPolymorphism
	{
		public static void main(String args[])
		{
			Animal animal1 = new Animal();  //
			Animal animal2 = new Dog();
			
			animal1.move();
			animal2.move();
		}
	}


