import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("перший рядок: ");
            String str1 = sc.nextLine();
            System.out.print("другий рядок: ");
            String str2 = sc.nextLine();
            if (str1.length() > str2.length()) {
                System.out.println("Перший рядок довший. Кількість символів: " + str1.length());
            } else if (str2.length() > str1.length()) {
                System.out.println("Другий рядок довший. Кількість символів: " + str2.length());
            } else {
                System.out.println("Рядки мають однакову довжину: " + str1.length());
            }
        }
    }

