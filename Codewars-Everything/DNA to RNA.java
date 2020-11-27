public class Bio {
    public String dnaToRna(String dna) {
       char [] dna1=dna.toCharArray();
      for (int i=0;i<dna1.length;i++){
        if (dna1[i]=='T'){
          dna1[i]='U';
        }
      }
      String answer = new String (dna1);
      return answer;
      
    } 
}
