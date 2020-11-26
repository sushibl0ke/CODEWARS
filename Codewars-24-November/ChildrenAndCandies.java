//https://www.codewars.com/kata/582933a3c983ca0cef0003de

import static java.util.stream.IntStream.of;
import java.util.*;
class CircleOfChildren {

  static int[] distributionOfCandy(int[] candy) {
    
    int x = 0;
    
    while (of(candy).distinct().count() != 1) {
      int prev = (candy[0] + candy[0] % 2) / 2;
      
      for (int i = candy.length - 1; i >= 0; i--) {
        candy[i] = prev + (prev = (candy[i] + candy[i] % 2) / 2);
      }
      x++;
    }
    return new int[]{x, candy[0]};
    
  }
}
