import java.util.Scanner;

public class Java_Stdin_and_Stdout_II {

  /*
On the first line, print String: followed by the unaltered String read from stdin.
On the second line, print Double: followed by the unaltered double read from stdin.
On the third line, print Int: followed by the unaltered integer read from stdin.
 */

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Input int");
    int a = input.nextInt();

    System.out.println("Input double");
    double b = input.nextDouble();

    System.out.println("Input string");
    input.nextLine();
    String c = input.nextLine();

    input.close();

    System.out.println(c.trim());
    System.out.println(b);
    System.out.println(a);
  }
}
