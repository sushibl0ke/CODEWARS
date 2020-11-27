public class Kata {

  public static int stantonMeasure(int[] arr) {
   int c=0;
   for(int i=0;i<arr.length;i++)
   {
    if(arr[i]==1)
    c++;
 }
 int count=0;
 for(int i=0;i<arr.length;i++)
  {
  if(arr[i]==c)
  count++;
}
return count;
  }
  
}
