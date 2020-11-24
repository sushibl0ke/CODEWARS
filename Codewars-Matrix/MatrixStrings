import java.util.*;

public class Matrix {
  
    private int[][] matrix;
    
    public Matrix(String matrixAsString){
      String[] rows = matrixAsString.split("\n");
      matrix = Arrays.stream(rows).map(r->Arrays.stream(r.split(" ")).mapToInt(Integer::parseInt).toArray()).toArray(int[][]::new);
    }
    
    public int[] getRow(int rowNumber){
      return matrix[rowNumber];
    }

    public int[] getColumn(int columnNumber){
      return Arrays.stream(matrix).mapToInt(r->r[columnNumber]).toArray();
    }

    public int getRowsCount(){
      return matrix.length;
    }

    public int getColumnsCount(){
      return matrix[0].length;
    }
}
