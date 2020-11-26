//https://www.codewars.com/kata/58841cb52a077503c4000015/

public class CircleOfNumbers {
    public static int circleOfNumbers(int n, int firstNumber) {
    int half = n / 2;
    int temp = firstNumber + half;
    int solution = temp % n;
    return solution;
    }
}
