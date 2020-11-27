public class Solution {

    public static long[] productArray(int[] n) {
      
      int duljina = n.length;
      
      long prod = 1, ary[] = new long[duljina];
      for (int a : n) prod *= a;      
      
      for (int i = 0; i < duljina; i++) ary[i] = prod / n[i];
      
      return ary;
    }
}
