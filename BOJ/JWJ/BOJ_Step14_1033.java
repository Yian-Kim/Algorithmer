import java.util.Scanner;

class ex_1003 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        

        for(int i=0; i<n; i++) {
            int input = Integer.parseInt(scan.nextLine());
            
            if (input==0) {
                System.out.println("1 0");
            } else if (input==1) {
                System.out.println("0 1");
            } else if (input >1) {
            	
            	Node_1003[] array = new Node_1003[input+1];
            	
            	Node_1003 zero = new Node_1003(0);
            	Node_1003 one = new Node_1003(1);
            	
            	array[0] = zero;
            	array[1] = one;
            	
            	fibonacci(array, input);
            }
        }
    }

    public static void fibonacci(Node_1003[] array, int n) {

        if (n>1) {
            
            for (int i=2; i<=n; i++) {

                Node_1003 a = new Node_1003(i);
                
                a.f0 = array[i-1].f0 + array[i-2].f0;
                a.f1 = array[i-1].f1 + array[i-2].f1;
                array[i] = a;
            }

            System.out.print(array[n].f0);
            System.out.print(" ");
            System.out.println(array[n].f1);
        }
    }
}

class Node_1003{
    public int f1;
    public int f0;
    public int index;

    public Node_1003(int n) {
        if (n>1) this.index = n;
        
        else if (n==0) {
            this.index = n;
            this.f1 = 0;
            this.f0 = 1;
        }

        else if (n==1) {
            this.index = n;
            this.f1 = 1;
            this.f0 = 0;
        }
    }
}
