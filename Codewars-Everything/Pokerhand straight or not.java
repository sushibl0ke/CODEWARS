import java.util.ArrayList;

public final class PokerHand {
  public static boolean IsStraight(ArrayList<Integer> cards) {
    int sequenceCount = 1;
    for (int card : cards) {
      if (card == 2 && cards.contains(14)) {
        sequenceCount++;
      }
      
      int nextInSequence = card +1;
      while (cards.contains(nextInSequence)) {
        sequenceCount++;
        nextInSequence++;
      }
      if (sequenceCount >= 5) {
        return true;
      }
      
      sequenceCount = 1;
    }
    
    return false;
  }
}
