import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        // create an object of Scanner
        Scanner input = new Scanner(System.in);

        // Input contains a single test case, that
        // contains three integers on a single line, 𝑋, 𝑌 and 𝑁 (1≤𝑋<𝑌≤𝑁≤100).
        int X = input.nextInt();
        int Y = input.nextInt();
        int N = input.nextInt();

        // Print integers from 1 to 𝑁 in order, each on its own line, replacing the ones divisible
        // by 𝑋 with Fizz,
        // the ones divisible by 𝑌 with Buzz and ones divisible by both 𝑋 and 𝑌 with FizzBuzz.
        for (int i = 1; i<=N; i++)
              if (i % (X*Y) == 0 )
                System.out.println("FizzBuzz");
            else if (i % X == 0 )
                System.out.println("Fizz");
            else if (i % Y == 0 )
                System.out.println("Buzz");
            else
                System.out.println(i);

            // Currently we can test how the code works by reading in input from the console
            // Try it, what examples did you use to check it works?
            // Next, how could you automatically test it by just adding some code to this class?
            //  Which "test cases" did you come up with why and why?
            // Do this using "pair programming" but in groups of three or four students...
            // Later, try using Junit for defining and running these test cases.
            // You will probably refactor the code and the tests several times until you are happy!
    } // main
} // class
