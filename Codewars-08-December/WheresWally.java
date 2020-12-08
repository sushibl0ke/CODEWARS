public class WallyFinder {

    public static int wheresWally(String str) {
      
    str = str.replaceAll("\\.Wally", "XXXXXX");
    str = str.replaceAll(";Wally", "XXXXXX");
    str = str.replaceAll(":Wally", "XXXXXX");
    str = str.replaceAll("-Wally", "XXXXXX");
    str = str.replaceAll(",Wally", "XXXXXX");
    str = str.replaceAll("[\\w]Wally", "XXXXXX");
    str = str.replaceAll("Wally[\\w]", "XXXXXX");
    str = str.replaceAll("'Wally", "XXXXXX");
    str = str.replaceAll("\\+Wally", "XXXXXX");
   
    return str.indexOf("Wally");
  }

}