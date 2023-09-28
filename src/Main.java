import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = new Scanner(System.in).nextInt();

        int summa = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        double devision = (double) firstNumber / secondNumber;
        int multiplication = firstNumber * secondNumber;

        System.out.println("Результат сложения:" + summa);
        System.out.println("Результат вычитания:" + difference);
        System.out.println("Результат умножения:" + multiplication);
        System.out.println("Результат деления:" + devision);
    }
}