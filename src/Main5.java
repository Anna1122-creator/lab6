import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = (int)(Math.random() * 3) + 1;
        int b = (int)(Math.random() * 3) + 1;
        int c = (int)(Math.random() * 3) + 1;
        boolean win = false;
        for (int i = 1; i <= 2; i++) {
            System.out.println("Спроба " + i);
            System.out.println("Введіть 3 числа від 1 до 3:");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if (x == a && y == b && z == c) {
                win = true;
                break;
            } else {
                System.out.println("Неправильно!");
            }
        }
        if (win) {
            System.out.println("Ви виграли");
        } else {
            System.out.println("Ви програли ");
            System.out.println("Правильна комбінація: " + a + " " + b + " " + c);
        }
    }
}