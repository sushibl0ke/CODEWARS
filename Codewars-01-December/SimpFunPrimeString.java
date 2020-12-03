import java.util.regex.Pattern;

public class Kata {
  
  public static boolean primeString(String plesho) {
    
    var pattern = Pattern.compile("^(.+?)\\1{1,}$");
    var matcher = pattern.matcher(plesho);
    return !matcher.find();
    
  }
}
