package srcc.work.services;

import srcc.work.interfaces.iCalculator;

/**
 * Класс Декоратор для калькулятора, который добавляет логирование операций.
 */
public class Decorator implements iCalculator {
    private iCalculator calculator;
    private Logger logger;

    /**
     * Конструктор класса декоратор.
     * @param calculator Калькулятор, который будет декорирован.
     * @param logger Логгер для записи операций.
     */
    public Decorator(iCalculator calculator, Logger logger) {
        this.calculator = calculator;
        this.logger = logger;
    }

    @Override
    public iCalculator sum(ComplexNumber arg) {
        ComplexNumber firstArg = calculator.getResult();
        logger.log(String.format("Первое значение калькулятора: %f + %fi. Начало вызова метода sum с параметром: %f + %fi",
                firstArg.getReal(), firstArg.getImaginary(), arg.getReal(), arg.getImaginary()));

        iCalculator result = calculator.sum(arg);
        logger.log("Вызов метода sum произошел");
        return result;
    }

    @Override
    public iCalculator multi(ComplexNumber arg) {
        ComplexNumber firstArg = calculator.getResult();
        logger.log(String.format("Первое значение калькулятора: %f + %fi. Начало вызова метода multi с параметром: %f + %fi",
                firstArg.getReal(), firstArg.getImaginary(), arg.getReal(), arg.getImaginary()));

        iCalculator result = calculator.multi(arg);
        logger.log("Вызов метода multi произошел");
        return result;
    }

    @Override
    public iCalculator division(ComplexNumber arg) {
        ComplexNumber firstArg = calculator.getResult();
        logger.log(String.format("Первое значение калькулятора: %f + %fi. Начало вызова метода division с параметром: %f + %fi",
                firstArg.getReal(), firstArg.getImaginary(), arg.getReal(), arg.getImaginary()));

        iCalculator result = calculator.division(arg);
        logger.log("Вызов метода division произошел");
        return result;
    }


    @Override
    public iCalculator subtract(ComplexNumber arg) {
        ComplexNumber firstArg = calculator.getResult();
        logger.log(String.format("Первое значение калькулятора: %f + %fi. Начало вызова метода subtract с параметром: %f + %fi",
                firstArg.getReal(), firstArg.getImaginary(), arg.getReal(), arg.getImaginary()));

        iCalculator result = calculator.subtract(arg);
        logger.log("Вызов метода subtract произошел");
        return result;
    }



    @Override
    public ComplexNumber getResult() {
        ComplexNumber result = calculator.getResult();
        logger.log(String.format("Получение результата: %f + %fi", result.getReal(), result.getImaginary()));
        return result;
    }
}