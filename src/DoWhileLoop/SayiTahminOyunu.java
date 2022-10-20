package DoWhileLoop;

import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        /**
           SAYI TAHMİN OYUNU
         */
        Scanner oku=new Scanner(System.in);
        int tutulanSayi= (int)(Math.random()*10);
        int tahmin=0;
        int tahminSayisi=1;

        System.out.println("Sayı Tahmin Oyununa Hoşgeldiniz.\n0'dan 10'e Kadar Bir Sayı Tahmin Edin\n3 Kere Deneme Hakkınız Var.");

        do{
            System.out.print("Sayi giriniz=");
            tahmin=oku.nextInt();

            if (tahmin < tutulanSayi)
                System.out.println("Büyük sayı giriniz.");

            if (tahmin > tutulanSayi)
                System.out.println("Küçük sayı giriniz.");

            if (tahmin==tutulanSayi) {
                System.out.println("tebrikler");
                break;
            }

            if (tahminSayisi == 3) {
                System.out.println("Tahmin etme hakkınız doldu");
                break;
            }

            tahminSayisi++;
        }while(tutulanSayi != tahmin);

    }
}
