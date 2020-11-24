public class Kata {

  public static int[][] matrixMultiplication(int[][] a, int[][] b) {
    
    int result[][] = new int[a.length][];
    int alength = a.length;
    
    for(int i=0; i< alength;i++) {
      result[i] = new int[alength];
      
      for(int j=0; j< alength;j++) {
        int sum = 0;
        
        for(int k=0;k<alength;k++) {
          sum+=a[i][k]*b[k][j];
        }
        result[i][j]=sum;
      }
    }
    
    return result;
    
  }
}
