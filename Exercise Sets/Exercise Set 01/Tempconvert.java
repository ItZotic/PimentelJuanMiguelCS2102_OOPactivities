import java.util.Scanner;

public class Tempconvert {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a Celcius value:");
    int CelcTemp = input.nextInt();
    int FahrTemp = (CelcTemp * 9)/5 + 32;
    System.out.println(CelcTemp + "Celcius is " + FahrTemp + " Fahrenheit");
    System.out.println();
    input.close();
  }
}