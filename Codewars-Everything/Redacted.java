import java.util.stream.IntStream;

public class Dinglemouse {

  public static boolean redacted(String doc1, String doc2) {
      return doc1.length() == doc2.length() && IntStream.range(0, doc1.length()).allMatch(i -> doc1.charAt(i) == doc2.charAt(i) || doc1.charAt(i) == 'X' && doc2.charAt(i) != '\n');     
  }

}
