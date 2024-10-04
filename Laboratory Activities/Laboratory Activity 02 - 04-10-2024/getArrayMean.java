import java.util.Scanner;

public class getArrayMean{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idx = 0;
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i<n; i++){
            System.out.print("Enter number: ");
            sum+= scanner.nextInt();
        }

        double mean = (double) sum / n;
        System.out.printf("Mean of array is: %.2f\n", mean);
        
        scanner.close();
}
}


