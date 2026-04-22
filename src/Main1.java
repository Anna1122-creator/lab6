import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3;

        System.out.print("Число 1: ");
        if (sc.hasNextDouble()) {
            n1 = sc.nextDouble();
        } else {
            System.out.println("Помилка! Ви ввели не дробове число.");
            return;
        }
        System.out.print("Число 2: ");
        if (sc.hasNextDouble()) {
            n2 = sc.nextDouble();
        } else {
            System.out.println("Помилка! Ви ввели не дробове число.");
            return;
        }
        System.out.print("Число 3: ");
        if (sc.hasNextDouble()) {
            n3 = sc.nextDouble();
        } else {
            System.out.println("Помилка! Ви ввели не дробове число.");
            return;
        }
        double max = Math.max(n1, Math.max(n2, n3));
        System.out.println("Найбільше число: " + max);

    }
}
