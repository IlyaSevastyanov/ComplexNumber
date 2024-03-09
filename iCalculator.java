public interface iCalculator {
    iCalculator sum(ComplexNumber arg);
    iCalculator multi(ComplexNumber arg);
    iCalculator division(ComplexNumber arg);
    iCalculator subtract(ComplexNumber arg);
    ComplexNumber getResult();
}
