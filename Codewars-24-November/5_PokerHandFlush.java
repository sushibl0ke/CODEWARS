// https://www.codewars.com/kata/5acbc3b3481ebb23a400007d

import java.util.HashSet;
import java.util.Set;

public class Kata{
  public static boolean CheckIfFlush(String[] cards){
    
    Set<Character> kys = new HashSet<Character>();
    for (String card : cards) {
      kys.add(card.charAt(card.length() - 1));
      
    }
    
    return kys.size() == 1;
  }
}
