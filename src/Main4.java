public class Main4 {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 101);
        System.out.println("Згенероване число: " + number);
        int kilkist =  (number + "").length();;
        System.out.println("Кількість цифр: " + kilkist);
    }
}