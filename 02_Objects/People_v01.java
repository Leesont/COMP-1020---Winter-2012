public class People_v01 {
    
	public static void main(String args[])
	{
		
		Person firstPerson = new Person();
		firstPerson.name = "Gabe";
		firstPerson.age = 27;
		
		System.out.println(firstPerson);
		

		System.out.println("Done");
	}
}

class Person
{
    private String name;
    private int age;
}
