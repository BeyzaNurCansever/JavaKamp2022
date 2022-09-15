package Loops;

public class Loops {
    public static void main(String[] args) {
        //For döngüsü
        for (int i = 1; i < 5; i += 2) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");

        // While döngüsü
        int i = 2;
        while (i < 5) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("While Döngüsü Bitti");

        //Do While döngüsü
        int j = 2;
        do {
            System.out.println(j);
            j +=2;
        } while (j < 5);
        System.out.println("Do While Döngüsü Bitti");
    }
}
