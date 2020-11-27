public class Kata {

  public static String solution(String str) {
    
   String lol="";
    
    for (int i = str.length()-1; i>=0;i--){
      lol +=str.charAt(i);
      
    }
    
    return lol;
  }

}
