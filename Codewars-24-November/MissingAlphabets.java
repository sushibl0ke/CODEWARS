//https://www.codewars.com/kata/58a664bb586e986c940001d5

class MissingAlphabets {
    static String find(final String text) {
      
      String solution = "";
      
      int[] counterArr = new int[26];
      int quantsets = 0;
      
      for(int i = 0; i < text.length(); i++){
        int sets = ++counterArr[text.charAt(i) - 'a'];
        
        if(sets > quantsets){
          quantsets = sets;
        }
      }

      for(int i = 0; i < 26; i++){
       
        while( counterArr[i] < quantsets){
          
          solution += (char) (i + 'a');
          counterArr[i]++;
         }
       }
      return solution;
    }
}
