public class CalculatorComplexNumber implements iCalculator {
    private ComplexNumber result;

    public CalculatorComplexNumber() {
        this.result = new ComplexNumber(0, 0);
    }

    @Override
    public iCalculator sum(ComplexNumber arg) {
        double realPart = this.result.getReal() + arg.getReal();
        double imaginaryPart = this.result.getImaginary() + arg.getImaginary();
        this.result = new ComplexNumber(realPart, imaginaryPart);
        return this;
    }

    @Override
    public iCalculator multi(ComplexNumber arg) {
        double realPart = this.result.getReal() * arg.getReal() - this.result.getImaginary() *arg.getImaginary() ;
        double imaginaryPart =this.result.getReal()*arg.getImaginary() + this.result.getImaginary() * arg.getReal() ;
        this.result = new ComplexNumber(realPart, imaginaryPart);
        return this;
    }

    @Override
    public iCalculator division(ComplexNumber arg) {
        double denominator = arg.getReal() * arg.getReal() + arg.getImaginary() * arg.getImaginary();
        double realPart = (this.result.getReal() * arg.getReal() + this.result.getImaginary() *arg.getImaginary())/denominator ;
        double imaginaryPart = ( this.result.getImaginary() * arg.getReal() - this.result.getReal()*arg.getImaginary())/denominator   ;
        this.result = new ComplexNumber(realPart, imaginaryPart);
        return this;
    }

    @Override
    public iCalculator subtract(ComplexNumber arg) {
        double realPart = this.result.getReal() - arg.getReal();
        double imaginaryPart = this.result.getImaginary() - arg.getImaginary();
        this.result = new ComplexNumber(realPart, imaginaryPart);
        return this;
    }

    @Override
    public ComplexNumber getResult() {
        return this.result;
    }
}