import java.util.Random;
	public class mohammed {

	    static void bubbleSort(int[] ar) 
	    {
	        
	        for (int i = 0; i < ar.length; i++)
	            for (int j = 0; j < ar.length - 1; j++)
	                if (ar[j] > ar[j + 1]) 
	                {
	                	ar[j] = ar[j] + ar[j + 1];
	                	ar[j + 1] = ar[j] - ar[j + 1];
	                	ar[j] = ar[j] - ar[j + 1];
	                	return;
	                }
	    }
	 
	    static void display(int[] elephant) 
	    {
	        for (int i = 0; i < elephant.length; i++)
	            System.out.print(elephant[i] + " ");
	    }
	 
	    public static void main(String args[]) 
	    {
	        Random r = new Random();
	        int[] ar = new int[10];
	 
	        for (int i = 0; i < ar.length; i++)
	            ar[i] = Math.abs(r.nextInt(10));
	 
	        System.out.println("\nOriginal: ");
	        System.out.println("\nSorted: ");
	    }
	}