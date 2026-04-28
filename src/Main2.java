import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
            System.out.print("Введіть перше ім'я: ");
            String name1 = sc.nextLine();
            System.out.print("Введіть друге ім'я: ");
            String name2 = sc.nextLine();
            if (name1.equalsIgnoreCase(name2)) {
                System.out.println("Імена ідентичні.");
            } else {
                System.out.println("Імена різні.");
            }
        }
    }
