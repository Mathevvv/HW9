import java.util.Scanner;

public class Main {
    static double a = 0;
    static double b = 0;

    public static void main(String[] args) {
        System.out.println("Введите 2 числа");
        //todo Вам нужно дополнить методы так, чтобы получился рабочий калькулятор
        a = inputDouble();
        b = inputDouble();

        sum(a,b);      //Метод суммирования чисел
        multiply(a,b); //Метод умножения чисел
        diff(a,b);     //Метод вычитания чисел
        divide(a,b);   //Метод деления чисел
    }

    private static void divide(double q, double w) {
        //todo дописать логику и печать результата
        System.out.println("a/b =" + q/w);
    }

    private static void diff(double q, double w) {
        //todo дописать логику и печать результата
        System.out.println("a-b =" + (q-w));
    }

    private static void multiply(double q, double w) {
        //todo дописать логику и печать результата
        System.out.println("a*b =" + q*w);
    }

    private static void sum(double q, double w) {
        //todo дописать логику и печать результата
        System.out.println("a+b =" + (q+w));
    }

    private static double inputDouble() {
        //todo дописать логику
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
}
