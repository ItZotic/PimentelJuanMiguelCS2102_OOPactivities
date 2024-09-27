import java.util.Scanner;

public class GettingGreater {
  public static void main(String[] args) {
    Scanner chValue = new Scanner(System.in);

    System.out.println("Getting the Greater Value");
    System.out.println("Enter the first character: ");
    char ch1 = chValue.next().charAt(0);

    System.out.println("Enter the second character: ");
    char ch2 = chValue.next().charAt(0);

    char greaterChar = (char) Math.max(ch1, ch2);

    System.out.println("---------------------------------------");
    System.out.println("The character with the greater value is: " + greaterChar);
    System.out.println("---------------------------------------");

    System.out.println("Showing the ASCII Codes");
    System.out.println(ch1);
    System.out.println(ch2);
    chValue.close();
  }
}
