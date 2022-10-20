package JavaMap.CanliSozluk;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CanliSozluk {
    public static void main(String[] args) {
        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secekte kelimenin kendisi ve manasını bir cümle ile yazınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış


        Map<String, String> sozluk = new TreeMap<>();

        Scanner okuInt = new Scanner(System.in);
        Scanner oku = new Scanner(System.in);
        String kelime = "";
        String anlami = "";
        int secim = 0;

        do {
            System.out.println("MENU\n1-Ekleme\n2-Düzeltme\n3-Listeleme\n4-Arama\n5-Silme\n6-Çıkış");
            secim = okuInt.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Kelimeyi Giriniz :");
                    kelime = oku.nextLine();
                    System.out.print("Anlamını Giriniz :");
                    anlami = oku.nextLine();
                    sozluk.put(kelime, anlami);
                    break;
                case 2:
                    // TODO : kelime var mı yokmu kontrolü yapılacak
                    System.out.print("Düzeltmek istediğiniz kelimeyi giriniz :");
                    kelime = oku.nextLine();
                    System.out.print("Yeni anlamı giriniz :");
                    anlami = oku.nextLine();
                    sozluk.put(kelime, anlami);
                    break;
                case 3:
                    System.out.println("sozluk = " + sozluk);
                    break;
                case 4:
                    System.out.print("Hangi Kelimenın anlamı :");
                    kelime = oku.nextLine();
                    if (sozluk.containsKey(kelime) == false) {
                        System.out.println("Girfiğiniz kelime kayıtlı değil");
                        break;
                    }
                    System.out.print("Kelimenin anlamı :" + sozluk.get(kelime));
                    break;
                case 5:
                    System.out.println("Silmek istediğiniz kelime :");
                    kelime = oku.nextLine();
                    sozluk.remove(kelime);
                    break;
            }
        } while (secim < 6);

    }
}
