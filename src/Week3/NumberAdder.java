package Week3;

public class NumberAdder {

  public static void main(String[] args) {

  }




  public static int factorialWithRecursion(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n * factorialWithRecursion(n - 1);
    }
  }
}
