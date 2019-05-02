
public class ex_2292 {
	
	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {

			int n = Integer.parseInt(reader.readLine());
			
			int sum = 1;
			int count = -1;
			while (sum<=n) {
				count++;
				sum += 6*count;
			}
			
			System.out.println(count);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
}
