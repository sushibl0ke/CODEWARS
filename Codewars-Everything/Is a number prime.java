public class Prime {
        public static boolean isPrime(int num) {
          
            if(num <= 1)return false;
            if(num == 2 || num == 3)return true;
            if(num % 6 != 5 && num % 6 != 1)return false;
          
            int a = 5;
          
            while(a <= (int)Math.sqrt(num)){
                if(num%(a) == 0 || num%(a+2) == 0)return false;
                a+=6;
              
            }
          
            return true;
        }
    }
