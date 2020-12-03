import static java.util.stream.LongStream.of;

import java.util.List;

interface SqProd2Sum {
  static List<long[]> prod2Sum(long a, long b, long c, long d) {
    
    var plesho = of(a * c + b * d, Math.abs(a * d - b * c)).sorted().toArray();
    
    var etup = of(a * d + b * c, Math.abs(a * c - b * d)).sorted().toArray();
    
    return plesho[0] == etup[0] ? List.of(plesho) : List.of(plesho, etup);
  }
}
