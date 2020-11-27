import java.util.*;
public class Kata{
  
    public static char findMissingLetter(char[] array) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
      
        abc = abc + abc.toUpperCase();
        int a = abc.indexOf(array[0]);
        for (int i = 0; i < array.length; i++) {
          
            if (abc.charAt(a + i) != array[i])
                return (char) ((int) array[i] - 1);  
        }
        return ' ';
    }
}
