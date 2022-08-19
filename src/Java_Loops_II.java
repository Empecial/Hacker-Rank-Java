import java.util.Scanner;

public class Java_Loops_II {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int q = input.nextInt();

    for (int i = 0; i < q; i++) {
      int a = input.nextInt();
      int b = input.nextInt();
      int n = input.nextInt();

      int result = a;

      for (int j = 0; j < n; j++) {
        result += b * Math.pow(2, j);

        System.out.print(result + " ");
      }

      System.out.println();
    }

    input.close();
  }
}
