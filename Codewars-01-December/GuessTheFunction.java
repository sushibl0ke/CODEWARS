import java.security.*;
import java.nio.charset.*;
import javax.xml.bind.DatatypeConverter;

public class Kata {
  public static String F(String s) {
  
    byte[] inBytes = s.getBytes(StandardCharsets.UTF_8);
    for (byte b : inBytes) {
      int sb = b & 0xFF;
      
      if (sb < 0x20 || sb > 0x7E)
        return "";
    }
    try {
    
      MessageDigest md = MessageDigest.getInstance("md5");
      byte[] outBytes = md.digest(inBytes);
      char[] outChars = DatatypeConverter.
        printHexBinary(outBytes).toLowerCase().toCharArray();
      String result = new String();
      for (char c : outChars)
        result = c + result;
      return result;
    }
    catch (NoSuchAlgorithmException e) {
      return "";
      
    }
  }
}
