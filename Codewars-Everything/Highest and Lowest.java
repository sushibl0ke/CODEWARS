public class Kata {
  public static String highAndLow(String numbers) {
    String[] arrOfStr = numbers.split(" ", numbers.length());
    int[] arrOfNums = new int[arrOfStr.length];
    
    Integer maximum = arrOfNums[0];
    Integer minimum = arrOfNums[0];
  
    for (int i = 0; i < arrOfStr.length; i++) {
      arrOfNums[i] = Integer.parseInt(arrOfStr[i]);
    }
    for (int i = 0; i < arrOfNums.length; i++) {
        if(maximum < arrOfNums[i])
          maximum = arrOfNums[i];
        if(minimum > arrOfNums[i])
          minimum = arrOfNums[i];
      }  
    return maximum.toString() + " " + minimum.toString();
  }
}
