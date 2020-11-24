public class Kata {
  
  public static int[][] matrixAddition(int[][] a, int[][] b) {
    
    int[][] arr = new int[a.length][b.length];
    
    for(int i = 0;i<arr.length;i++) {
      for(int j =0;j<arr.length;j++) {
        arr[i][j] = a[i][j] + b[i][j];
        
      }
    }
    
  return arr;
    
  }
}
