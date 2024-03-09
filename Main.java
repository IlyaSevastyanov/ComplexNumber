public class Main {
    public static void main(String[] args) {
       CalculatorComplexNumber calc = new CalculatorComplexNumber();
       Decorator decoratedCalc = new Decorator(calc, new Logger());
        ViewCalculator view = new ViewCalculator(decoratedCalc);
        view.run();
    }
}