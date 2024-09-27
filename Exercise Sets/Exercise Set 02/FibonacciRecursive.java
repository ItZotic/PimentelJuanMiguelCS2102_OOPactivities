import java.util.Scanner;

public class FibonacciRecursive {
    public static int fibonacci(int n) {
        if ( n<=1 ) {
            return n;

        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter Fibonacci position: ");
		int position = input.nextInt();
		System.out.println("Position: " + position);
		System.out.println("Fibonacci number: " + fibonacci(position));
        input.close();
	}
}