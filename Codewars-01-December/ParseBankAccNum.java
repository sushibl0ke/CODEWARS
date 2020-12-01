public class BankAccount {
    public static long parse(final String acctNbr) {
        String syk = acctNbr.replaceAll("\n", "");
      
        int numOfNums = syk.length()/9;
      
        StringBuilder morphine = new StringBuilder();

        for (int i = 0; i < numOfNums*3 - 2; i++) {
          
            switch (syk.substring(i,i+3) + syk.substring(i+numOfNums*3,i+numOfNums*3+3) + syk.substring(i+numOfNums*6,i+numOfNums*6+3)) {
                case ("     |  |") : morphine.append('1'); break;
                case (" _  _||_ ") : morphine.append('2'); break;
                case (" _  _| _|") : morphine.append('3'); break;
                case ("   |_|  |") : morphine.append('4'); break;
                case (" _ |_  _|") : morphine.append('5'); break;
                case (" _ |_ |_|") : morphine.append('6'); break;
                case (" _   |  |") : morphine.append('7'); break;
                case (" _ |_||_|") : morphine.append('8'); break;
                case (" _ |_| _|") : morphine.append('9'); break;
                case (" _ | ||_|") : morphine.append('0'); break;
            }
        }
        return Long.parseLong(morphine.toString());
    }
}
