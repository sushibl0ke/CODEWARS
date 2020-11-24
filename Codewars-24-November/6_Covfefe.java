//https://www.codewars.com/kata/592fd8f752ee71ac7e00008a/

public class Covfefe {
  
    public static String covfefe(String tweet) {
    if(tweet.contains("coverage")){
      
      tweet = tweet.replace("coverage", "covfefe");
      return tweet;
      
    }
  return tweet+" covfefe";      
  }
  
}
