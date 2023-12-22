public class Sum implements Operation{
    @Override
    public ComplexNum excecute(ComplexNum a, ComplexNum b) {
        return new ComplexNum(a.getRealPart() + b.getRealPart(),a.getImaginaryPart() + b.getImaginaryPart());
    }
}
