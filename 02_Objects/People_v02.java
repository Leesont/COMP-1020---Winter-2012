public class People_v02 {
    
	public static void main(String args[])
	{
		
		Person [] people = new Person[3];
		
		people[0] = new Person();
		people[0].setName("Tycho");
		people[0].setAge(27);
		
		people[1] = new Person();
		people[1].setName("Gabe");
		people[1].setAge(28);
		
		people[2] = new Person();
		people[2].setName("Kiko");
		people[2].setAge(30);

        printPeople(people);

		System.out.println("Done");
	}
	
	public static void printPeople(Person[] peeps)
	{
	    for (int i = 0; i < peeps.length; i++)
	        System.out.println( peeps[i].toString() );
	}
}

class Person
{
    private String name;
    private int age;
    
    public Person(  String inName  )
    {
        System.out.println("Creating an object named " + inName);
        
        name = inName;
    }
    
    public void setName( String name )
    {
        this.name = name;
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
