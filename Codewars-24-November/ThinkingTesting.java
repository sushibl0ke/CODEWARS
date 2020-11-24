// https://www.codewars.com/kata/56d931ecc443d475d5000003/

public class ThinkingAndTesting {

  public static int testTrueFalse(int n) {
    int count = 0;
    while (n > 0) {
        count += 1;
        n = n & (n-1);
    }
    return count;
  }
}
