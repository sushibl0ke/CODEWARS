public class Kata
{
    public static String[][] matrixSquareUp(int b)
    {
        String[][] square = new String[b][b];
      
        for (int kys = 0; kys < b; kys++)
            for (int z = 0; z < b; z++)
                square[kys][z] = z < b-kys-1 ? "x" : String.valueOf(b-z);
      
        return square;
    }
}
