public class PasswordHider {
  public static String hidePasswordFromConnection(String urlString) {
    
    int index = urlString.indexOf("password=");
    int end = urlString.indexOf("&", index);
    end = end == -1 ? urlString.length() : end;
    
    char[] result = urlString.toCharArray();
    for (int i=index + 9; i<end; i++) {
      result[i] = '*';
    }
    
    return new String(result);
  }
}