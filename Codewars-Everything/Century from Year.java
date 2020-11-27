public class Solution {
  public static int century(int number) {
   
    //int number f.i 1970. 1970 + 99 (99years) = 2069
    //vekut vinagi e po golqmo ot purivte chisla na godinata s edno. i.e 1970 = 20vek
    //dobavqiki 99, garantira da pokaje pravilniq vek pri vsqka situaciq na dadena godina
    //sled tova ostava poluchenoto chislo da se razdeli na 100
    // i.e 1970+99=2069 - 2069/100 = 20.69 = 20vek
    
    return ((number + 99) / 100 );
    
  }
}
