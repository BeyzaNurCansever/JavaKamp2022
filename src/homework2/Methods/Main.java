package homework2.Methods;

public class Main {
    public static void main(String[] args) {
        findNumber();
    }

    public static void findNumber() {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int searchingNumber = 5;
        boolean isNumberInArray = false;

        for (int number : numbers) {
            if (searchingNumber == number) {
                isNumberInArray = true;
                break;
            }
        }

        if (isNumberInArray) {
            writeMessage(searchingNumber + " : dizide mevcut");
        } else {
            writeMessage(searchingNumber + " : dizide mevcut değil");
        }
    }

    public static void writeMessage(String message) {
        System.out.println(message);
    }
}
