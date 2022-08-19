import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_Loops_I {

  public static void main(String[] args) throws IOException {
    /*
Given an integer, N, print its first 10 multiples. Each multiple N * i (where 1 <= i <= 10) should be printed on a new line in the form: N x i = result.
 */

    BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter an integer between 2-20");
    int N = Integer.parseInt(bfr.readLine());

    for (int i = 1; i <= 10; i++) {
      int Result = N * i;

      System.out.printf("%d x %d = %d%n", N, i, Result);
    }

    bfr.close();
  }
}
