//https://www.codewars.com/kata/5893e0c41a88085c330000a0

public class Kata {
    public static int shapeArea(int n) {
        int all = 1;
        int num = 0;

        for (int i = 1; i <= n; i++) {
            all += num;
            num += 4;
        }
        return all;
    }
}
