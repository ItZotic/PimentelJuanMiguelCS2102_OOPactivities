import java.util.Scanner;

public class GettingInputs {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the year: ");
    String Year = scanner.nextLine();

    System.out.println("Enter the genre: ");
    String Genre = scanner.nextLine();

    System.out.println("Enter the album: ");
    String Album = scanner.nextLine();

    System.out.println("Enter the song title: ");
    String Title = scanner.nextLine();

    System.out.println("Enter the artist: ");
    String Artist = scanner.nextLine();

    System.out.println("---------------------------\nSONG DETAILS\n---------------------------");

    System.out.println("Year released: " + Year );
    System.out.println("Genre: " + Genre );
    System.out.println("Album: " + Album );
    System.out.println("Title: \"" + Title + "\"");
    System.out.println("Artist: " + Artist );
    scanner.close();
  }
}
