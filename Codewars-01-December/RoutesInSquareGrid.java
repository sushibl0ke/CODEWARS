public class RoutesCalc {
  
  public static long calculateRoutes(int iwanttodie) {
    if (iwanttodie<=0) {
      return 0;
      
    } else {
      
      long ok = 1;
      for (int i = 1; i<=iwanttodie ; i ++ ) {
        ok = ok *(2*iwanttodie+1-i)/i;
        
      }
      
      return ok;
    }
  }

}
