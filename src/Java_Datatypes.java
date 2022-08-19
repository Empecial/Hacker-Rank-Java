import java.util.Scanner;

public class Java_Datatypes {

  public static void main(String[] args) {
    /*
Input Format

The first line contains an integer, T, denoting the number of test cases.
Each test case, T, is comprised of a single line with an integer, n, which can be arbitrarily large or small.

Output Format

For each input variable n and appropriate primitive datatype, you must determine if the given primitives are capable of storing it. If yes, then print:

n can be fitted in:
* dataType

If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.: byte < short < int < long ).

If the number cannot be stored in one of the four aforementioned primitives, print the line:

n can't be fitted anywhere. */

    Scanner in = new Scanner(System.in);

    int T = in.nextInt();

    in.close();

    for (int i = 0; i < T; i++) {}
  }
}
