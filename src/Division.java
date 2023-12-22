public class Division implements Operation{

    @Override
    public ComplexNum excecute(ComplexNum a, ComplexNum b) {
        double real = (a.getRealPart() * b.getRealPart() + a.getImaginaryPart() * b.getImaginaryPart())
                / (b.getRealPart() * b.getRealPart() + b.getImaginaryPart() * b.getImaginaryPart());
        double imaginary = (a.getImaginaryPart() * b.getRealPart() - a.getRealPart() * b.getImaginaryPart())
                / (a.getImaginaryPart() * b.getRealPart() - a.getRealPart() * b.getImaginaryPart());
        return new ComplexNum(real,imaginary);
    }
}
