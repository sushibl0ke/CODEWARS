public class Kata {

  public static int[][] rotateCounterclockwise(int[][] matrix, int times){
    
        int kys = matrix.length;
    
        for (int n = 0; n < times % 4; n++) {
            int[][] dontcare = new int[kys][kys];
            for (int i = 0; i < kys; i++) {
                for (int j = 0; j < kys; j++) {
                    dontcare[i][j] = matrix[j][kys - 1 - i];
                }
            }
          
            matrix = dontcare;
        }
    
        return matrix;
  }
}
