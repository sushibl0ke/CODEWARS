public class Sum {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
   int kys = 0;
   int sb = 0;
    
    for (int num : arr1){
      kys = kys+num;
    }
    for (int num : arr2) {
      sb = sb+num;
    }
    return kys+sb;
  }

}
