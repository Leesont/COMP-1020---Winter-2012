public class Merge
{
    public static void main (String args[])
    {
        int[] a1 = {2,3,4,5,6,7};
        int[] a2 = {9,8,7,6,5};
        
        int[] a3 = mergeArrays(a1, a2);
        
        printList(a3);
        
        System.out.println();
        //a3 = mergeArraysFancy(a1,a2);
        //printList(a3);
    }
    
    public static int[] mergeArrays(int[] array1, int[] array2)
	{
		int counter;
		int count1;
		int count2;
		int[] array3;

		array3 = new int[array1.length + array2.length];
		count1 = 0;
		for (counter=0; count1<array1.length; counter++, count1++)
		{
			array3[counter] = array1[count1];
		}
		count2 = 0;
		for (counter=counter; count2<array2.length; counter++, count2++)
		{
			array3[counter] = array2[count2];
		}
		return array3;
	}
	
	

	
	public static void printList(int[] list)
	{
		int counter;

		for (counter=0; counter<list.length; counter++)
		{
			System.out.print(list[counter] + "  ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int[] mergeArraysFancy(int[] array1, int[] array2)
	{
	    int[] array3 = new int[array1.length + array2.length];
	    
	    System.arraycopy(array1, 0, array3, 0 , array1.length);
	    System.arraycopy(array2, 0, array3, array1.length, array2.length);
	    
	    return array3;
	    
	}
	
    
}