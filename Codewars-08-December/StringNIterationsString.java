public class JomoPipi {
  
  public static String jumbledString(String s, long n) {
    
    String temp = s;
    
    for (long i = 0; i < n; i++) {
      temp = jumble(temp);
      if (temp.equals(s))
        return jumbledString(s, n % (i + 1));
    }
    return temp;
  }

  private static String jumble(String temp) {
    
    StringBuilder build = new StringBuilder();
    
    for (int j = 0; j < 2; j++) {
      
      for (int z = j; z < temp.length(); z += 2) {
        build.append(temp.charAt(z));
      }
    }
    return build.toString();
  }

}