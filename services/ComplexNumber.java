package services;

/**
 * Класс редставляет комплексное число с действительной и мнимой частями.
 */
public class ComplexNumber {
    private double real;
    private double imaginary;

    /**
     * Создает комплексное число с заданными действительной и мнимой частями.
     * @param real Действительная часть комплексного числа.
     * @param imaginary Мнимая часть комплексного числа.
     */
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * Возвращает действительную часть комплексного числа.
     * @return Действительная часть комплексного числа.
     */
    public double getReal() {
        return real;
    }
    /**
     * Возвращает мнимую часть комплексного числа.
     * @return Мнимая часть комплексного числа.
     */
    public double getImaginary() {
        return imaginary;
    }
}