import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
public class Main {
    public static void main(String args[]) {
    	Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] nums = new int[N];
		for (int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(scan.next());
		}
		Arrays.sort(nums);
		
		//1. 산술평균
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		if (sum >= 0) {
			System.out.println(sum / N);
		} else {
			System.out.println(sum / N - 1);
		}
		
		//2. 중앙값
		Arrays.sort(nums);
		System.out.println(nums[N/2]);
		
		
		//3. 최빈값
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i=0; i<N; i++) {
			if (map.get(nums[i]) == null) {
				map.put(nums[i], 1);
			} else {
				int temp = map.get(nums[i]);
				//System.out.println("temp : " + temp);
				map.put(nums[i], ++temp); // map.get(nums[i])++ : invalid operation에 걸림
			}
		}
		
		//map을 value값 내림차순으로 정렬
		Set<Integer> set = map.keySet();
		Iterator<Integer> iter = set.iterator();
		
		int[] numsKeys = new int[set.size()]; // key값 배열 numsKeys
		int[] numsValues = new int[set.size()]; // key값 배열 numsValues
		int i = 0;
		while (iter.hasNext()) {
			numsKeys[i] = iter.next();
			numsValues[i] = map.get(numsKeys[i]);
			i++;
		}
		
		// Value값에 따라 내림차순으로 정렬
		for (int m=0; m<set.size(); m++) { // 버블 정렬
			for (int n=0; n<set.size()-m-1; n++) {
				if (numsValues[n] < numsValues[n+1]) { // 내림차순
					int temp = numsValues[n];
					numsValues[n] = numsValues[n+1];
					numsValues[n+1] = temp;
					temp = numsKeys[n];
					numsKeys[n] = numsKeys[n+1];
					numsKeys[n+1] = temp;
				} else if (numsValues[n] == numsValues[n+1]) {
					if (numsKeys[n] > numsKeys[n+1]) { // 오름차순
						int temp = numsKeys[n];
						numsKeys[n] = numsKeys[n+1];
						numsKeys[n+1] = temp;
					}
				}
			}
		}
		
		if (set.size() > 1) {
			if (numsValues[0] == numsValues[1]) {
				System.out.println(numsKeys[1]);
			} else {
				System.out.println(numsKeys[0]);
			}
		} else {
			System.out.println(numsKeys[0]);
		}
		
		//4. 범위
		System.out.println(nums[N-1]-nums[0]);
		
    }
}
