public class Ghostbusters {
  
  public static String ghostBusters(String building) {
    
    if (building.contains(" ")){
      return building.replace(" ", "");
    
    }else {
      
      return "You just wanted my autograph didn't you?";
    }
  }
}