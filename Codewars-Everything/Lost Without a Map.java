import java.util.*;

public class Maps {
  public static int[] map(int[] arr) {
    return Arrays.stream(arr)
                 .map(i -> i*2)
                 .toArray();
  }
}
