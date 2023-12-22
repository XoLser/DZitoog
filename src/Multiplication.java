public class Multiplication implements Operation{
    @Override
    public ComplexNum excecute(ComplexNum a, ComplexNum b) {
        double real = a.getRealPart() * b.getRealPart() - a.getImaginaryPart() * b.getImaginaryPart();
        double imaginary = a.getRealPart() * b.getImaginaryPart() + a.getImaginaryPart() * b.getRealPart();
        return new ComplexNum(real,imaginary);
    }
}
