import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами
        System.out.println(analiz(vvod()));
    }
    private static int vvod() {
        System.out.println("Введите целое число");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static boolean analiz(int q) {
        if (q%2==0) return true;
        return false;
    }
}
