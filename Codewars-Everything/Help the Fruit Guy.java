public class FruitGuy{
 
 public static String[] removeRotten(String[] rotten) {
String[] removed;
    if (rotten != null && rotten.length != 0) {
      
      removed = new String[rotten.length];
      int index = 0;
      
      for (String e : rotten) {
        
        if (e.startsWith("rotten")) {
          removed[index] = e.substring(6).toLowerCase();
          index++;
        } else {
          removed[index] = e.toLowerCase();
          index++;
          
        }
      }
      
    } else {
      removed = new String[0];
    }
    return removed;
 }
}
