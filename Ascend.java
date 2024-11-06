// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);

        int a = (int)(Math.random() *(lim+1));

        int b = (int)(Math.random() *(lim+1));

        int c =(int)(Math.random() *(lim+1));

		int sum = a+b+c;

		int max = Math.max(a,b);
		 max = Math.max(max,c);

		int min = Math.min(a,b);
		min = Math.min(min,c);	

		int mid = sum-max-min;

		System.out.println(min +" " + mid +" " + max);

	}
}
