//https://www.codewars.com/kata/5862fb364f7ab46270000078

class BasicEncrypt {
  static String encrypt(String temp, int rule) {
    char[] chars = temp.toCharArray();
    
    for (int i = 0; i < chars.length; i++) {
      chars[i] = (char) ((chars[i] + rule) % 256);
    }
    
    return new String(chars);
  }
}
