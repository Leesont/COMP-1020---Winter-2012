public class People_v03 {
    
	public static void main(String args[])
	{
		Person p = new Person();
		
		
		Person [] people = new Person[3];
		
		people[0] = new Person( "Tycho", 27 );
		
		people[1] = new Person( "Gabe", 28 );
		
		people[2] = new Person( "Kiko", 30 );

        printPeople(people);

		System.out.println("Done");
	}
	
	public static void printPeople(Person[] peeps)
	{
	    for (int i = 0; i < peeps.length; i++)
	        System.out.println(peeps[i]);
	}
}

class Person
{
    String name;
    int age;
    
    public Person (String name, int age)
    {
        this.name = name;
        this.age = age;
        System.out.println("Hi I'm " + name + " and I'm " + age);
    }
    
    public void setName( String in )
    {
        name = in;
    }
    
    public void setAge( int in )
    {
        age = in;
    }
    
    public String toString()
    {
        return name + " is " + age; 
    }
}
