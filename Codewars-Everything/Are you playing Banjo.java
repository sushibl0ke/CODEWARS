public class Banjo {
  public static String areYouPlayingBanjo(String name) {
   
    if (0 <= "Rr".indexOf(name.charAt(0))) {
    return name+ " plays banjo";
  }else{
    return name + " does not play banjo";
    }
    
  }
}
