public class R {
  public static String removeBang(String str) {
    
    return str.replaceAll("\\b!+", "");
  }
}