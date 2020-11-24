public class Kata {

  public static int[] checkIsContained(int[][] mat1, int[][] mat2) {
    
    for (int i = 0; i <= mat1.length - 3; i++) {
      for (int j = 0; j <= mat1[i].length - 3; j++) {
        if (isPresent(mat1, mat2, i, j)) return new int[] {i, j};
        
      }
    }
    
    return new int[] { -1, -1 };
    
  }
  
  private static boolean isPresent(int[][] mat1, int[][] mat2, int i, int j) {
    
    for (int a = 0; a < 3; a++) {
      for (int z = 0; z < 3; z++) {
        if (mat1[i + a][j + z] != mat2[a][z]) return false;
        
      }
    }
    
    return true;
    
  }
}
