import java.util.stream.IntStream;

public class ArraySorter {

  public static int[][] sortTwoArrays(int[] arr1, int[] arr2) {
    return new int[][] {sortArray(arr1, arr2), sortArray(arr2, arr1)};
  }
  
  private static int[] sortArray(int[] arr, int[] order) {
    return IntStream.range( 0, order.length).boxed()
        .sorted((a, b) -> order[a] - order[b] )
        .mapToInt(i -> arr[i] )
        .toArray();
  }

}
