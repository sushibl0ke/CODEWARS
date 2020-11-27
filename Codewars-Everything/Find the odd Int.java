import java.util.Arrays;
import java.util.*;

public class FindOdd {
  public static int findIt(int[] a) {
    
    Arrays.sort(a);
    
    int length;
    int tarikat = a[0];
    
        for (int i = 0; i < a.length; i++) {
        length = 1;
          
        while (i < a.length - 1 && a[i] == a[i + 1]) {
                length++;
                i++;
            }
            if (length % 2 == 1) {
                tarikat = a[i];
                break;
            }
        }
        return tarikat;
    }
}
