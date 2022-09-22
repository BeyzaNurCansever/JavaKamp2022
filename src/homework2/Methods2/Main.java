package homework2.Methods2;

public class Main {
    public static void main(String[] args) {
        String message = "Bugün hava çok güzel.";
        String newMessage = giveCity();
        System.out.println(newMessage);
        int number = addition(5, 3);
        System.out.println(number);

        System.out.println(addition(5, 6, 8));

    }

    public static void add() {
        System.out.println("Eklendi");
    }

    public static void delete() {
        System.out.println("Silindi");
    }

    public static void update() {
        System.out.println("Güncellendi");
    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int addition(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static String giveCity() {
        return "Konya";
    }
}
