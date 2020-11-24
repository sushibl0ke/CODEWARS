public class Sid {
    public static int sumOfElements(int matrix[][]) {
      
        int kys1 = 0;
        
        for (int i = 0 ; i < matrix.length ; i++)
        {
            
            for (int j = 0 ; j < matrix[i].length ; j++)
            {
                kys1 = kys1 + matrix[i][j];
            }
        }
      
        return kys1;
      
    }    
}
