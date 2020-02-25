import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		int N = Integer.parseInt(str1.split("")[0]);
		int M = Integer.parseInt(str1.split("")[1]);

		int arr[] = new int[N];
		String str2 = br.readLine();

		for (int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(str2.split("")[i]);
		}

		int temp = 0;
		int max = 0;

		for (int i=0; i<arr.length-2; i++) {
	    		for (int j=i+1; j<arr.length-1; j++) {
				for (int k=j+1; k<arr.length; k++) {
					temp = arr[i] + arr[j] + arr[k];

					if(temp <= M && temp > max) {
						max = temp;				
					}											
				}
			}
		}
		System.out.println(max);	
	}
}
