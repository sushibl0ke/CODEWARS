import java.util.Arrays;

public class Kata {

  public static int[] flattenAndSort(int[][] array) { 
    
    int duljina = 0;
    for (int l=0; l<array.length;l++){
      duljina += array[l].length;
    }
    
    int[] arrnew = new int[duljina];
    int counter = 0;
    for (int i=0; i<array.length;i++) {
      for (int j=0; j<array[i].length;j++){
          arrnew[counter] = array[i][j];
          counter++;
      }
    }  
    
    Arrays.sort(arrnew);
    return arrnew;
  }

}
