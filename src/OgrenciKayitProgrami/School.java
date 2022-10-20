package OgrenciKayitProgrami;

import java.util.Scanner;

public class School {
    // Student (id, name, surName)
    // Yukarıdaki gibi 5 öğrenci tanımlayınız.
    // Her öğrencinin takip eden bir id si olmalı.
    // Ve en son kaç öğrenci olduğunu bulabilmeliyim.
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);

        int secim=0;

        do {
            Student.menu();
            System.out.print("Yapmak İstediğiniz İşlem =");
            secim=num.nextInt();
            Student.islem(secim);
            System.out.println("Öğrenci Sayısı = "+Student.ogrSayısı());

        }while (secim<6);
    }
}
