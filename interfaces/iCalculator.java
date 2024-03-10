package interfaces;

import services.ComplexNumber;

/**
 * Интерфейс для калькулятора комплексных чисел.
 */
public interface iCalculator {
    /**
     * Метод для сложения.
     * @param arg комплексное число для сложения
     */
    iCalculator sum(ComplexNumber arg);
    /**
     * Метод для умножения.
     * @param arg комплексное число для умножения
     */
    iCalculator multi(ComplexNumber arg);
    /**
     * Метод для деления.
     * @param arg комплексное число для деления
     */
    iCalculator division(ComplexNumber arg);
    /**
     * Метод для вычитания.
     * @param arg комплексное число для вычитания
     */
    iCalculator subtract(ComplexNumber arg);
    /**
     * Метод для получения вычислений.
     */
    ComplexNumber getResult();
}
