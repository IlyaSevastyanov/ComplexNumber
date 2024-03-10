package view;

import interfaces.iCalculator;
import services.ComplexNumber;
import java.util.Scanner;

/**
 * Класс, представляющий интерфейс для калькулятора комплексных чисел.
 */
public class ViewCalculator {
    private iCalculator calculator;

    /**
     * Конструктор класса view.ViewCalculator.
     *
     * @param calculator объект, реализующий интерфейс interfaces.iCalculator
     */
    public ViewCalculator(iCalculator calculator) {
        this.calculator = calculator;
    }
    /**
     * Метод для запуска калькулятора комплексных чисел.
     */
    public void run() {
        while (true) {
            double realPart = promptDouble("Введите первое число комплексного числа: ");
            double imaginaryPart = promptDouble("Введите второе число комплексного числа: ");
            ComplexNumber num1 = new ComplexNumber(realPart, imaginaryPart);
            calculator.sum(num1);
            while (true) {
                String cmd = prompt("Введите операцию:( ' * ' >> умножение, ' + ' >> сложение, ' - ' >> вычитание, ' / ' >> деление): ");
                double realPart2 = promptDouble("Введите первое число комплексного числа: ");
                double imaginaryPart2 = promptDouble("Введите второе число комплексного числа: ");
                ComplexNumber num2 = new ComplexNumber(realPart2, imaginaryPart2);
                switch (cmd) {
                    case "*":
                        calculator.multi(num2);
                        break;

                    case "/":

                        calculator.division(num2);
                        break;

                    case "-":

                        calculator.subtract(num2);
                        break;

                    case "+":

                        calculator.sum(num2);
                        break;

                    default:
                        System.out.println("Некорректная операция. Попробуйте снова.");
                }
                ComplexNumber result4 = calculator.getResult();
                System.out.println("Результат: " + result4.getReal() + " + " + result4.getImaginary() + "i");
                String answer= prompt("Еще посчитать (Y/N)?");
                if (!answer.equals("Y")) {
                    return;
                }
            }
        }
    }
    /**
     * Метод для запроса ввода пользователя.
     *
     * @param message сообщение для вывода пользователю
     * @return введенная пользователем строка
     */
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    /**
     * Метод для запроса ввода числа с плавающей точкой от пользователя.
     *
     * @param message сообщение для вывода пользователю
     * @return введенное пользователем число с плавающей точкой
     */
    private double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}
