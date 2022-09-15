package MukemmelSayi;

public class MukemmekSayi {
    public static void main(String[] args) {
        int sayi = 28;
        int total = 0;
        for(int i = 1; i <sayi; i++){
            if(sayi%i ==0){
                total = total + i;
            }
        }
        if(total == sayi) {
            System.out.println("Mukemmel sayidır");
        } else {
            System.out.println("Mukemmel sayi degildir");
        }
    }
}
