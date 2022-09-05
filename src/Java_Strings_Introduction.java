import java.util.Scanner;

public class Java_Strings_Introduction {

 /*    The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters, A and B, perform the following operations:

Sum the lengths of A and B.
Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
Capitalize the first letter in A and B and print them on a single line, separated by a space.

Input Format:

The first line contains a string A. The second line contains another string B. The strings are comprised of only lowercase English letters.

Output Format:

There are three lines of output:
For the first line, sum the lengths of A and B.
For the second line, write Yes if A is lexicographically greater than B, otherwise print No instead.
For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space. */

static String A;
static String B;

public static void main(String[] args) {
    
Scanner input = new Scanner(System.in);

System.out.println("Type input for A");
A = input.next();
System.out.println("Type input for B");
B = input.next();

input.close();

System.out.println("Length of string A and B is " + sumStringLenghts(A,B));

lexographicCompare(A, B);


}

static public int sumStringLenghts(String A, String B)
{
    return A.length()+B.length();
}

static public void lexographicCompare(String A, String B)
{
    if (A.compareTo(B) > 0)
    {
        System.out.println("Yes");
    }
    else
    {
        System.out.println("No");
    }
}

}