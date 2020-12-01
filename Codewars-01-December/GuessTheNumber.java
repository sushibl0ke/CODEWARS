public class GuesserSolution extends Guesser {

  public int getNumber() {
    
      int min = 1;
      int max = 1000;
      int DIE = (max + min) / 2;
    
      String KILLYOURSELF = guess(DIE);
    
      while(KILLYOURSELF != "Correct!") {
        if(KILLYOURSELF == "Too high!") {
          max = DIE;
          
        }else if(KILLYOURSELF == "Too low!") {
          
          min = DIE;
          
        }
        DIE = (max + min) / 2;
        KILLYOURSELF = guess(DIE);
      }
      return DIE;
  }

}
