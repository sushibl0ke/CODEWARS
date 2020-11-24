public class JomoPipi {

  public static char[][] diagonalSort(char[][] m) {
    
    int kys1 = m.length, kys2 = m[0].length;
    
    char[][] r = new char[m.length][m[0].length];
    
    int d = 0, y = 0, x = 0;
    
    for (int i = 0; i < kys1; i++) {
      for (int j = 0; j < kys2; j++) {
        
        r[y--][x++] = m[i][j];
        if (y < 0 || x == kys2) {
          d++;
          y = kys1 - 1;
          x = d - y;
          if (x < 0) {
            y += x;
            x = 0;
          }
        }
      }
    }
    return r;
  }

}
