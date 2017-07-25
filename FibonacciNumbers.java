import java.util.Scanner;

public class FibonacciNumbers {
  public static void main(String[] args) {
    int i = 0;
    int comparisonVariable = 0;
    int theEnteredNumber = 0;
    boolean numberTrueOrNot = false;
    Scanner reader = new Scanner(System.in);
    try {
      System.out.println("Please, enter a number: ");
      theEnteredNumber = reader.nextInt();
      if (theEnteredNumber < 0) {
        System.out.println("Your number is less than zero. The program stops working!");
        return;
      }
    } catch (Exception e) {
      System.out.println("You did not enter a number or your number is very large. The program stops working!");
      return;
    }
    FibonacciNumbers object = new FibonacciNumbers();
    while (!numberTrueOrNot) {
      try {
        comparisonVariable = object.fibonacciNumbersReturn(i);
        if (comparisonVariable == theEnteredNumber) {
          System.out.println("The entered number a Fibonacci number!");
          numberTrueOrNot = true;
        }
        if (comparisonVariable > theEnteredNumber) {
          System.out.println("The entered number is not a Fibonacci number!");
          numberTrueOrNot = true;
        }
        i++;
      } catch (Exception d) {
        System.out.println("The program stops working. In the calculation, the number is out of the allowable value!");
        return;
      }
    }
  }

  private int fibonacciNumbersReturn(int i) {
    if ((i == 0) || (i == 1)) {
      return i;
    } else {
      return fibonacciNumbersReturn(i - 2) + fibonacciNumbersReturn(i - 1);
    }
  }
}
