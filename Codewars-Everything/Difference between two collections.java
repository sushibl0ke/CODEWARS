import java.util.*;

public class Kata {
  public static List<Character> diff(Collection<Character> a, Collection<Character> b) {
    
    List<Character> lol = new ArrayList<>(a);
    List<Character> kys = new ArrayList<>(b);
    
    lol.removeAll(b);
    kys.removeAll(a);
    lol.addAll(kys);
    
    lol = new ArrayList<Character>(new HashSet<Character>(lol));
    
    Collections.sort(lol);
    return lol;
  }
}
