public class Positive{
    public static int sum(int[] arr){
      int result = 0;
        for (int i : arr) {
            if (i > 0) {
                result += i;
            }
        }
        return result;
    }
}
