public class MyCalc {
    public static void main(String[] args) {
    MCalculator calculator = new MCalculator();
    calculator.setFirstNumber(10);
    calculator.setSecondNumber(5);
    double additionResult = calculator.getaAdditionResult();
    double subtractionResult = calculator.getSubtractionResult();
    double multiplicationResult = calculator.getMultiplicationResult();
    double divisionResult = calculator.getDivisionResult();
    System.out.println("Addition Result " + additionResult);
    System.out.println("Subtraction Result " + subtractionResult);
    System.out.println("Multiplication Result " + multiplicationResult);
    System.out.println("Division Result " + divisionResult);

    }

  }
