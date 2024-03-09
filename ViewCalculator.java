import java.util.Scanner;

public class ViewCalculator {
    private  iCalculator calculator;

    public ViewCalculator( iCalculator calculator) {
        this.calculator = calculator;
    }

    public void run() {
        while (true) {
            double realPart = promptInt("Введите первое число комплексного числа: ");
            double imaginaryPart  = promptInt("Введите второе число комплексного числа: ");
            ComplexNumber num1 = new ComplexNumber(realPart, imaginaryPart);
            calculator.sum(num1);
            while (true) {


                String cmd = prompt("Введите операцию (* - умножение, + - сложение, = - получить результат): ");
                if (cmd.equals("*")) {
                    double realPart2 = promptInt("Введите первое число комплексного числа: ");
                    double imaginaryPart2  = promptInt("Введите второе число комплексного числа: ");
                    ComplexNumber num2 = new ComplexNumber(realPart2, imaginaryPart2);
                    calculator.multi(num2);
                    continue;
                }
                if (cmd.equals("/")) {
                    double realPart2 = promptInt("Введите первое число комплексного числа: ");
                    double imaginaryPart2  = promptInt("Введите второе число комплексного числа: ");
                    ComplexNumber num2 = new ComplexNumber(realPart2, imaginaryPart2);
                    calculator.division(num2);
                    continue;
                }
                if (cmd.equals("-")) {
                    double realPart2 = promptInt("Введите первое число комплексного числа: ");
                    double imaginaryPart2  = promptInt("Введите второе число комплексного числа: ");
                    ComplexNumber num2 = new ComplexNumber(realPart2, imaginaryPart2);
                    calculator.subtract(num2);
                    continue;
                }
                if (cmd.equals("+")) {
                    double realPart2 = promptInt("Введите первое число комплексного числа: ");
                    double imaginaryPart2  = promptInt("Введите второе число комплексного числа: ");
                    ComplexNumber num2 = new ComplexNumber(realPart2, imaginaryPart2);
                    calculator.sum(num2);
                    continue;
                }

                 if (cmd.equals("=")) {
                    ComplexNumber result = calculator.getResult();
                    System.out.println("Результат: " + result.getReal() + " + " + result.getImaginary() + "i");
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
