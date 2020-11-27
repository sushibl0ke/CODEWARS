public class Kata {

  public static double[][] getMatrixProduct(double[][] a, double[][] b) {
    int ac = a[0].length, br = b.length;
    if (ac != br) {
      return null;
    }
    
    int bc = b[0].length, ar = a.length;
    double[][] kys = new double[ar][bc];
    
    for (int r = 0; r < ar; r++) {
      
      for (int c = 0; c < bc; c++) {
        
        for (int i = 0; i < ac; i++) {
          
          kys[r][c] += a[r][i] * b[i][c];
        }
        
      }
      
    }
    
    return kys;
  }

}
