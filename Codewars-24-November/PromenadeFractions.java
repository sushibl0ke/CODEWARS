public class Promenade{
  private static int[] step (int[] l, int[] r) {
    return new int[]{l[0]+r[0], l[1] + r[1]};
  }
  //plesho :DDD
  public static int[] promenade (String choice){
    int[] kys = new int[]{1,0};
    int[] niqqer = new int[]{0,1};
    for (int i = 0; i < choice.length(); i++) {
      if (choice.codePointAt(i) == 76) kys = step(kys, niqqer);
      if (choice.codePointAt(i) == 82) niqqer = step(kys, niqqer);
    }
    return step(kys,niqqer);
  }
}
