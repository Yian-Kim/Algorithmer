import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ex_2108 {

	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		
		try {
			
			int n = Integer.parseInt(reader.readLine());
			
			int [] array = new int [n];
			
			// initialize array
			// get max, min
			int max = -4000;
			int min = 4000;
			for (int i=0; i<array.length; i++) {
				array[i] = Integer.parseInt(reader.readLine());
				if (max < array[i]) {
					max = array[i];
				}
				
				if (min > array[i]) {
					min = array[i];
				}
			}
			
			System.out.println(max);
			System.out.println(min);
			
			// get mode
			Map<Integer, Integer> map = new HashMap<Integer, Integer>(); 
			
			for (int i : array) {
				if (map.get(i) == null) {
					map.put(i, 1);
				} else {
					map.put(i, map.get(i) + 1);
				}
			}
			
			int maxCount = 0;
			int secCount = 0;
			int mode = -1;
			Set<Integer> set = map.keySet();
			Iterator<Integer> iterator = set.iterator();
			
			while(iterator.hasNext()) {
				int key = iterator.next();
				int value = map.get(key);
				if (maxCount < value) {
					secCount = maxCount;
					maxCount = value;
					mode = key;
				}
			}
			
			System.out.println(mode);
			
			if (maxCount == secCount) {
				mode = array[array.length-1];
			}
			
			int sum = 0;
			for (int i : array) {
				sum += i;
			}
			long avg = Math.round(sum / n * 1.0);
			
			
			// order the array
			for (int i=0; i<array.length-1; i++) {
				
				for (int j=0; j<array.length-1-i; j++) {
					
					int temp = 0;
					if (array[i] > array[i+1]) {
						temp = array[i];
						array[i] = array[i+1];
						array[i+1] = temp;
					}
				}
			}
			
			// print avg
			System.out.println(avg);
			// print median
			System.out.println(array[(n/2)+1]);
			//print mode
			System.out.println(mode);
			// print range
			System.out.println(max-min);
			
			
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
