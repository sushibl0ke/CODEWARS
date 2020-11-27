import java.util.*;
public class Kata {

  public static int findLongest(final String str) {
    String[] asd = str.split(" ");
    int longest = 0;
    for (int i=0; i<asd.length; i++) {
      if (asd[i].length() > longest) {
        longest = asd[i].length();
      }
    }
    return longest;
  }
  
}
