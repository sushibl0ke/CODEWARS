public class Accumul {
    
    public static String accum(String s) {
        String result = "";
        for(int i = 0; i != s.length(); i++)
        {
            for(int j = 1; j != i+2; j++)
                result = result + (j == 1 ? s.toUpperCase().charAt(i) : s.toLowerCase().charAt(i));
            result = result + (i != s.length()-1 ? '-' : "");
        }
        return result;
    }
}
