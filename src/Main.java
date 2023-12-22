public class Main {
    public static void main(String[] args) {
        ComplexNum a = new ComplexNum(1, 2);
        ComplexNum b = new ComplexNum(3, 4);


        ComplexNum.sum(a, b);
        ComplexNum.multiply(a, b);
        ComplexNum.division(a, b);
    }
}