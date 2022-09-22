package homework1.ArkadasSayilar;

public class ArkadasSayilar {
    public static void main(String[] args) {
        int sayi=220;
        int sayi2=284;
        int toplam=0;
        int toplam2=0;

        for(int i=1;i<sayi;i++){
            if(sayi%i==0)
            {
                toplam+=i;
            }
        }
        for(int i=1;i<sayi2;i++)
        {
            if(sayi2%i==0)
            {
                toplam2+=i;
            }
        }
        if(toplam2==sayi && toplam==sayi2)
        {
            System.out.println(sayi+"ve"+sayi2+" sayi arkadas sayidir.");
        }
        else{
            System.out.println("iki sayi arkadas sayi degildir!!");
        }
    }
}
