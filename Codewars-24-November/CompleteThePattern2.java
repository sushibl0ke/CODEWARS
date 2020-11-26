//https://www.codewars.com/kata/55733d3ef7c43f8b0700007c

public class CompleteThePattern {
    public static String pattern ( int n) {
      String answer = "";
          for (int i = 0; i<n;i++){
            for (int j = 0; j<(n-i); j++){
             answer+=(n-j);
            }
            if (i<n-1){
            answer += "\n";
            }
          } 
          return answer;
    }
}
