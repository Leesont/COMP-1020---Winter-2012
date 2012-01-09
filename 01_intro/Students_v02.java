public class Students_v02
{
    public static void main (String args[])
    {
        
        final int NUM_STUDENTS = 3;

        Student frodo = new Student();
        
        frodo.name = "Frodo";
        frodo.id = 1;
        frodo.a1 = 100;
        frodo.a2 = 100;
        frodo.labMark = 0;
        
        System.out.println(frodo.name);
        System.out.println(frodo.id);
        
        Student samwise = new Student();
        
        samwise.name = "Sam";
        samwise.id = 2;
        samwise.a1 = 10;
        samwise.a2 = 10;
        samwise.labMark = 5;
        
        System.out.println(samwise.name);
        System.out.println(samwise.id);
        
        
        Student[] students = new Student[NUM_STUDENTS];
        
        students[2] = new Student();
        students[2].name = "Gandalf";
        students[2].id = 999;
        students[2].a1 = 1000;
        students[2].a2 = 9999;
        students[2].labMark = 0;
        
        
        students[0] = frodo;
        students[1] = samwise;
        
        for (int i = 0 ; i < students.length; i++)
            printArray(students[i]);
        
        
    }
    
    
    public static void printArray( Student student )
    {
        System.out.println(student.name + " " + student.id + " " + student.a1);
    }
}



class Student
{
    String name;
    int id;
    double a1, a2;
    int labMark;
}











