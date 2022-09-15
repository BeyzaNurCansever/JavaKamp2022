package arraysDemo;

public class arraysDemo {
    public static void main(String[] args) {
        String ogrenci1 = "Beyza";
        String ogrenci2 = "Nur";
        String ogrenci3 = "Özge";
        String ogrenci4 = "Adalet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("---------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Beyza";
        ogrenciler[1] = "Nur";
        ogrenciler[2] = "Özge";
        ogrenciler[3] = "Adalet";


        for(int i = 0; i < ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("----------------");
        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}
