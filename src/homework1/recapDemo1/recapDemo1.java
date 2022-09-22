package homework1.recapDemo1;

public class recapDemo1 {
    public static void main(String[] args) {
        int sayi1 = 100;
        int sayi2 = 50;
        int sayi3 = 2;

        int enBuyuk = sayi1;
        if(enBuyuk < sayi2) {
            enBuyuk = sayi2;
        }
        if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }
        System.out.println("En büyük = " + enBuyuk);
    }
}
