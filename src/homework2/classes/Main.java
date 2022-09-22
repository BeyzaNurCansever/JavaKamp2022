package homework2.classes;

public class Main {
    public static void main(String[] args) {
        //reference type
        Classes.CustomerManager customerManager;
        Classes.CustomerManager customerManager2 = new Classes.CustomerManager();
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //value type
        int number1 = 10;
        int number2 = 20;
        number2 = number1;
        number1 = 30;
        System.out.println("1. Sayı : " + number1);
        System.out.println("2. Sayı : " + number2);

        // Arrays --> reference type
        int[] numbers1 = new int[]{1, 2, 3};
        int[] numbers2 = new int[]{4, 5, 6};

        numbers2 = numbers1;
        numbers1[0] = 10;
        System.out.println(numbers2[0]);
    }
}

