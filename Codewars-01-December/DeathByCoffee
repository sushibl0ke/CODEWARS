public class Dinglemouse {

  public enum CoffeeType {
      CAFE, DECAF
  }
  
 public static int[] coffeeLimits(final int year, final int month, final int day) {
        
   int h = year * 10000 + month * 100 + day;
        
   int cafeLimit = coffeeLimit(h, CoffeeType.CAFE);
        
   int decafLimit = coffeeLimit(h, CoffeeType.DECAF);
        
   return new int []{cafeLimit, decafLimit};
  
  }

    public static int coffeeLimit(int h, CoffeeType type) {
        Integer ok = Integer.parseInt(type.name(), 16);
        for(int days = 1; days <= 5000; days++) {
            if (Integer.toHexString(h += ok).contains("dead")){
                return days;
            }
        }
        return 0;
    }

}
