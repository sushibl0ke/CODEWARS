public class Kata {
  public static int[] digitize(long n) {
    int length = 1 + (int) Math.log10(n);
    int[] digits = new int[length];
    int i = 0;
    while (n > 0) {
      digits[i++] = (int) (n % 10);
      n /= 10;
    }
    return digits;
  }
}
