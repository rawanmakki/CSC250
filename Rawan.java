import java.util.Random;


public class Rawan {
	
	public static void main(String args){
		
	Random r = new Random();
	int[] ar = new int[10];
	
	for(int i = 0; i < ar.length; i++){
		
	ar[i] = (r.nextInt(10));
 
	}

	Rawan.display(ar);
	Rawan.bubbleSort(ar);
	Rawan.display(ar);
         }
	
	static int[] bubbleSort(int[] ar){
	     int temp;
		 for (int i = 0; i < ar.length; i++)
	            for (int j = 0; j < ar.length - 1; j++)
	                if (ar[j] > ar[j + 1]) 
	                {
	                	temp = ar[j] + ar[j + 1];
	                	ar[j + 1] = ar[j] - ar[j + 1];
	                	ar[j] = temp;
	                }
	                return ar;
				}
		
		
	//perform the bubble sort algorithm in place/

	static void display(int[] elephant){

	System.out.println("\n Orignal Numbers");

	for(int i = 0; i < elephant.length; i++){
		System.out.println(elephant[i]);
	}
	System.out.println("\n BubbleSort");
	}
        
}
	