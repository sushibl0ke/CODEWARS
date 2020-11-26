//https://www.codewars.com/kata/582c6b7cfb3179eb6e000027/

public class Dinglemouse {

  public static double zigZagCamel(final double d, final double h) {  
        if (Math.sin(h / d) <= Math.toRadians(30))
            return Math.sqrt(d * d + h * h);
        else 
            return h / Math.sin(Math.toRadians(30));
  }
}
