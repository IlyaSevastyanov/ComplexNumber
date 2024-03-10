import srcc.work.domen.CalculatorComplexNumber;
import srcc.work.services.Decorator;
import srcc.work.services.Logger;
import srcc.work.view.ViewCalculator;

/**
 * Основной класс программы.
 */
public class Main {
    public static void main(String[] args) {
       CalculatorComplexNumber calc = new CalculatorComplexNumber();
       Decorator decoratedCalc = new Decorator(calc, new Logger());
        ViewCalculator view = new ViewCalculator(decoratedCalc);
        view.run();
    }
}