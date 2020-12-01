public class Solution {

    public static int[] withdraw(int kys) {
    int result[] = new int[] {0, 0, 0};

    while (kys > 0) {
      if (kys >= 100 && kys % 20 == 0) {
        result[0] += 1;
        kys -= 100;
      } else if (kys >= 50 && kys % 20 != 0) {
        
        result[1] += 1;
        kys -= 50;
      } else if (kys >= 20) {
        
        result[2] += 1;
        kys -= 20;
      }
    }
      //shte se grumna
    return result;
  }
}
