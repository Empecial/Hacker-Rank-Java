import java.util.Scanner;

public class Java_Int_To_String {

    /* You are given an integer N, you have to convert it into a string.

        Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".

        N can range between -100 to 100 inclusive. */

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        ConvertIntToString(N);

        input.close();
    }


    private static void ConvertIntToString(int NumberToConvert)
    {
        if(NumberToConvert > -100 || NumberToConvert < 100)
        {
            String StringNumber = String.valueOf(NumberToConvert);
            System.out.printf("Good job");
        }
        else
        {
            System.out.printf("Wrong answer");
        }
    }
}
