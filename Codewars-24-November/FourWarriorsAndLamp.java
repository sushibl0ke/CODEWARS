//https://www.codewars.com/kata/57bff92049324c0fd00012fd

import java.util.Arrays;
public class Kata {

  public static int shortestTime(int[] speed) {
    
    Arrays.sort(speed);
    
    int firstC = speed[0] * 2 + speed[1] + speed[2] + speed [3];
    int secondC = speed[0] + speed[1] * 3 + speed[3];
    return Math.min(firstC, secondC);
  }
}
