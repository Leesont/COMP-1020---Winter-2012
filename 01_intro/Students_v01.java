public class Students_v01
{
    public static void main (String args[])
    {
        final int NUM_STUDENTS = 8;
        
        int [] GPAs = fillGPA(NUM_STUDENTS);
        String [] names = fillNames();
        int [] ids = getIds(NUM_STUDENTS);
        
        printArray( ids, names, GPAs );
    }
    
    
    public static String [] fillNames()
    {
        String [] names = {"Frodo", "Gandalf", "Samwise", "Bilbo", "Eragon", "Kip", "Gollum","Legolas"};
        return names;
    }
    
    
    public static int[] getIds(int numIds)
    {
        int [] ids = new int [numIds];
        for(int i = 1; i <= numIds; i++)
            ids[i-1] = i;
        return ids;
    }
    
    public static int[] fillGPA( int numStudents )
    {
        int [] anArray = new int [numStudents];
        
        for (int i = 0; i < anArray.length; i++)
        {
            anArray[i] =  (int)(Math.random()*10);
        }
        
        return anArray;
    }
    
    public static void printArray( int [] ids, String[] names, int[] GPAs )
    {
        for (int i = 0; i < ids.length; i++)
        {
            System.out.println (ids[i] + " " + names[i] + " " + GPAs[i] );
        }
    }
    
}



class Student
{
    String name;
    int id;
    double a1, a2;
    int labMark;
}











