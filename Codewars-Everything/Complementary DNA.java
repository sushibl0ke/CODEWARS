public class DnaStrand {
  public static String makeComplement(String dna) {
    
    char[] symb = dna.toCharArray();
    
    for(int i = 0; i < symb.length; i++) {
      symb[i] = getComplement(symb[i]);
    }
    
    return new String(symb);
  }
  
  private static char getComplement(char c) {
    switch(c) {
      case 'A': return 'T';
      case 'T': return 'A';
      case 'C': return 'G';
      case 'G': return 'C';
    }
    return c;
  }
}
