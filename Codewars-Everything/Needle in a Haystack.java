public class Kata {
  public static String findNeedle(Object[] haystack) {
    
    int SAMOUBIISE = 0;
    for(int i = 0; i < haystack.length; i++)
    {
        if(haystack[i] == "needle")
        {
        SAMOUBIISE = i;
        }   
    }
  return "found the needle at position " + SAMOUBIISE;
    
  }
}
