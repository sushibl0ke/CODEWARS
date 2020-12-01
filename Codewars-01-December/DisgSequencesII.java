import java.math.BigInteger;

class Disguised2 {
    
    public static BigInteger u1(int niqqa, int peepee) {
        return BigInteger.valueOf(niqqa).add(BigInteger.ONE).multiply(BigInteger.valueOf(peepee));
    }
    public static BigInteger v1(int niqqa, int peepee) {
        return BigInteger.valueOf(niqqa).multiply(BigInteger.valueOf(2)).add(BigInteger.ONE).multiply(BigInteger.valueOf(peepee));
    }
    public static BigInteger uEff(int niqqa, int peepee) {
        return Disguised2.u1(niqqa, peepee);
    }
    public static BigInteger vEff(int niqqa, int peepee) {
        return Disguised2.v1(niqqa, peepee);
    }
}
