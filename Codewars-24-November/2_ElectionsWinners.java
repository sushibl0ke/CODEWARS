// https://www.codewars.com/kata/58881b859ab1e053240000cc

class ElectionWinners {
    static int find(final int[] votes, final int k) {
      
      int ma=0,
      count = 0;
      int result = 0;
      
      for(int a:votes){
        if(ma==a)
          count++;
        
        if(ma<a)
          ma=a;
      }
      
      if(k>0)
      for(int a:votes){
        if(ma<a+k)
          result++;
      }
      
      else if(count<=0)
        result++;
      else
        result = 0;
      
      return result;
      
    }
}
