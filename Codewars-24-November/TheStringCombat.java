

import java.util.Objects;

public class StringCombat {
    private static final
      char VALUES[] = {'?', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                                          's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                                          'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};


    public static String combat(String s1, String s2) {
        if (s1 == null) {
            return combat("", s2);
        }

        if (s2 == null) {
            return combat(s1, "");
        }

        if (Objects.equals(s1, s2)) {
            return "Draw";
        }

        if (s2.isEmpty()) {
            return winner(1, s1);
        }
        if (s1.isEmpty()) {
            return winner(2, s2);
        }

        final String remS1 = s1.substring(1);
        final String remS2 = s2.substring(1);
        final char warriorS1 = s1.charAt(0);
        final char warriorS2 = s2.charAt(0);

        if (warriorS1 == warriorS2) {
            return combat(remS1, remS2);
        }

        if (healPoints(warriorS1) > healPoints(warriorS2)) {
            return combat(newHP(warriorS1) + remS1, remS2);
        }

        return combat(remS1, newHP(warriorS2) + remS2);
    }

    private static String winner(final int player, final String score) {
        return String.format("Winner: s%d(%s)", player, score);
    }

    private static char newHP(final char warrior) {
        return VALUES[healPoints(warrior) / 3];
    }

    private static int healPoints(final char warrior) {
        return (int) warrior - ((warrior > 96) ? 95 : 37);
    }
}
