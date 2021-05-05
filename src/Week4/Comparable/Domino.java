package Week4.Comparable;

public class Domino {
  public static int factorialWithRecursion(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n * factorialWithRecursion(n - 1);
    }
  }

}
