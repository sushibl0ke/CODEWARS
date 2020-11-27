class Calculator {
  static Double calculate(double numberOne, String operation, double numberTwo) {
    if (operation == "*") {
      return Math.abs(numberOne * numberTwo);
    } else if (operation == "/" && numberTwo != 0) {
      return numberOne / numberTwo;
    } else if (operation == "+") {
      return numberOne + numberTwo;
    } else if (operation == "-") {
      return numberOne - numberTwo;
    }
    return null;
  }
}
