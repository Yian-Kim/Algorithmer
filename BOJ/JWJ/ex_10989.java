import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex_10989 {


	
	public static void main(String[] args) throws NumberFormatException, IOException {
		long start = System.currentTimeMillis();
		
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		   int length = Integer.parseInt(reader.readLine());
		   int[] array = new int[length];
		   
		   int max = 0;
		   for (int i=0; i<array.length; i++) {
			   array[i] = Integer.parseInt(reader.readLine());
			   if (max < array[i]) {
				   max = array[i];
			   }
		   }
		   
		   int[] counting = new int[max+1];
		   
		   // count each element's number in (original) array
		   for (int i : array) {
			   counting[i] += 1 ;
		   }
		   
		   
		   for (int i=0; i<counting.length-1; i++) {
			   counting[i+1] += counting[i];
		   }
		   
		   int[] ordered = new int [length];
		   
		   for (int i=0; i<array.length; i++) {
			   ordered[counting[array[i]]-1] = array[i];
			   counting[array[i]] -= 1;
		   }
		   
		   for (int i=0; i<ordered.length; i++) {
		       System.out.println(ordered[i]);
		   }
		   long end = System.currentTimeMillis();
		   
		   System.out.println( "실행 시간 : " + ( end - start )/1000.0);
	}



}
