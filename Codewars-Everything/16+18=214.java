public class SillyAdditon {

    public static int add(int num1,int num2){
        return num1 + num2 == 0 ? 0 : Integer.parseInt(add(num1 / 10, num2 / 10) + "" + (num1 % 10 + num2 % 10));
    }
}
