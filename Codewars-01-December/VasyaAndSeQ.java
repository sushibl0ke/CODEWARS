public class SystemOfEq
{
  public static int Solution(int lol, int lol2) 
  {
    
    int kys=0;   
    for(int a=0;a<=32;a++){
      
      for(int b=0;b<=32;b++){     
        if(a*a+b==lol && a+b*b==lol2){
          
          kys++;
        }
      }
    }
    return kys;
  }
}
