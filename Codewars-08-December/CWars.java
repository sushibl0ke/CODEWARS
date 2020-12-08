import java.lang.*;
import java.util.*;

import static java.util.stream.Collectors.*;

class CWars {

    public static String initials(String plesho){ 
        String []lol = plesho.split(" ");
        return Arrays.stream(lol).map(i -> i.substring(0,1).toUpperCase()).collect(joining(".")) + lol[lol.length - 1].substring(1);
    }

}