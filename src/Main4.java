import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = (int)(Math.random() * 101);
        System.out.println("Згенероване число: " + number);
        int kilkist =  (number + "").length();;
        System.out.println("Кількість цифр: " + kilkist);
    }
}