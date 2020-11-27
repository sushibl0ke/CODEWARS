public class GreetMe{
  public static String greet(String name){
    StringBuilder sb = new StringBuilder();
    sb.append("Hello ").append(name.substring(0,1).toUpperCase()).append(name.substring(1).toLowerCase()).append("!");
    return sb.toString();
  }
}
