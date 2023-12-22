import java.util.Scanner;

public class Calculator {
    public void run(){
        while (true){
            double prymaryArg1= promptInt("Введите действительную часть: ");
            double prymaryArg2= promptInt("Введите мнимую часть: ");
            Sum calculator1 = Operation.create(prymaryArg1);
            Sum calculator2 = Operation.create(prymaryArg2);
        }
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private double promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());

}
