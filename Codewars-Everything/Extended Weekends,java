import java.util.*;

class Solution{
  
    public static String [] solve(int a, int b){
      
        String[] m = {"JANUARY", "MARCH", "MAY", "JULY", "AUGUST", "OCTOBER", "DECEMBER"};
        int mmy = 0;
      
        List<String> answer = new ArrayList<>();
      
        for (int i = a; i <= b; ++i) {
            StringBuilder string = new StringBuilder();
          
            for (String j : m) {
                string.append(j).append(" 1, ").append(i);
              
                if (new Date(string.toString()).getDay() == 5) {
                    answer.add(j);
                    mmy++;
                }
              
          string = new StringBuilder();
              
         }
        }
    return new String[]{answer.get(0), answer.get(answer.size() - 1), String.valueOf(mmy)};
    }
}
