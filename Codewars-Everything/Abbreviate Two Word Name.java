public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    String kys = name.charAt(0) + ".";
  
    for (int i = 0; i < name.length(); i++) {
      
      if (name.charAt(i) == ' ') {
        i++;
        kys += name.charAt(i);
  
      }
    }
    return kys.toUpperCase();
    
  }
}
