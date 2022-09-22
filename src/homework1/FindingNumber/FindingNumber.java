package homework1.FindingNumber;

public class FindingNumber {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int search = 6;

        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == search) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            System.out.println("Sayi mevcuttur");
        } else {
            System.out.println("Sayi mevcut degildir");
        }
    }
}
