public class Solution {
    public static int travelChessboard(String s) {
      
        int x1 = s.charAt(1) - 48;
        int x2 = s.charAt(6) - 48;
        int y1 = s.charAt(3) - 48;
        int y2 = s.charAt(8) - 48;
      
        int iwill = shootmyself((x2 - x1) + (y2 - y1)) / (shootmyself(x2 - x1) * shootmyself(y2 - y1));
        return iwill;
    }
    public static int shootmyself (int n){
        return n == 0 ? 1 : n * shootmyself(n - 1);
    }
}
