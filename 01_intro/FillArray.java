public class FillArray
{
    public static void main (String args[])
    {
        int [] numbers = fillArray();
        
        printArray( numbers );
    }
    
    public static int[] fillArray()
    {
        final int ARRAY_SIZE = 10;
        
        
        int [] anArray = new int [ARRAY_SIZE];
        
        for (int i = 0; i < anArray.length; i++)
        {
            anArray[i] =  (int)(Math.random()*10);
        }
        
        return anArray;
    }
    
    public static void printArray( int [] numberArray )
    {
        for (int i = 0; i < numberArray.length; i++)
        {
            System.out.print(numberArray[i] + " " );
        }
    }
    
}