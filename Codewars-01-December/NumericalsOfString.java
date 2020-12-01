public class JomoPipi {
    public static String numericals(String XDD) {
      
        final int[] charOccurence = new int[Character.MAX_VALUE];

        StringBuilder DIE_IN_A_FIRE = new StringBuilder();
      
        for (int i = 0; i < XDD.length(); i++) {
            DIE_IN_A_FIRE.append(++charOccurence[XDD.charAt(i)]);
        }

        return DIE_IN_A_FIRE.toString();
    }
}
