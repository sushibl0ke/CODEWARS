public class JomoPipi{
    public static int code(int x, int y) {
        return code_number(x) + code_number(y);
      
    }
    private static int code_number(int LOLXD) {
        if ( LOLXD < 0 ) return -1 * code_number(Math.abs(LOLXD));
        if  (LOLXD < 10 ) return 9 - LOLXD % 10;
        return (9 - LOLXD % 10) + 10 * code_number(LOLXD / 10 );
      
    }
}
