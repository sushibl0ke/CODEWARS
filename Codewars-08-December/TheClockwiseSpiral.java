public class TheClockwiseSpiral {

    public static int[][] createSpiral(int N) {
      
    int[][] solut = new int[N][N];
    int row = 0;
    solut[0][0] = 1;
    int col = 0;
      
    for (int i = 2; i <= N*N; i++) {
      
      if ((row == 0 || solut[row - 1][col] !=0) && (col + 1 < N && solut[row][col + 1] == 0)) {
        col++;
      } else if (row + 1 < N && solut[row + 1][col] == 0) {
        row++;
      } else if (col - 1 >= 0 && solut[row][col - 1] == 0) {
        col--;
      } else {
        row--;
      }
      solut[row][col] = i;
      
    }
    
    return solut;
    }
}