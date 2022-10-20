package OgrenciKayitProgrami;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student {
    int id;
    String name;
    String surName;

public static Map<Integer,Student> ogrListe=new HashMap<>();
    static int sayac=0;

    public Student(String name, String surName) {
        this.id = ++sayac;
        this.name = name;
        this.surName = surName;}

    public Student(int id, String name, String surName) {
        this.id = id;
        this.name = name;
        this.surName = surName;}
    public static int ogrSayısı(){return sayac;}

    public static void menu(){
        System.out.println("1-ogrenci ekleme\n2-ogrenci silme\n3-ogrenci arama\n4-ogrenci duzeltme\n5-ogrenci listesi\n6-cikis");
        System.out.println();
    }
    public static int islem(int secim){
        Scanner oku=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);
        int id=0;
        switch (secim){
            case 1:
                System.out.print("Öğrencinin Adını Giriniz = ");
                String isim=oku.nextLine();
                System.out.print("Soyismini Giriniz = ");
                String soyad=oku.nextLine();
                Student yeni=new Student(isim,soyad);
                ogrListe.put(sayac,yeni);
                System.out.println();break;
            case 2:
                System.out.print("Silmek İstediğiniz Öğrencinin No'su = ");
                id=okuInt.nextInt();
                ogrListe.remove(id);
                sayac--;
                System.out.println();break;
            case 3:
                System.out.print("Aramak İstediğiniz Öğrencin ID si= ");
                id=oku.nextInt();
                System.out.println("Öğrenci = "+ ogrListe.get(id));
                System.out.println();break;
            case 4:
                System.out.print("Düzenlemek İstediğiniz Öğrencinin ID si = ");
                id=okuInt.nextInt();
                System.out.print("Yeni İsmi Girin = ");
                String yeniIsim=oku.nextLine();
                System.out.print("Yeni Soyad Girin = ");
                String yeniSoyad=oku.nextLine();
                yeni=new Student(id,yeniIsim,yeniSoyad);
                ogrListe.put(id,yeni);
                System.out.println();break;
            case 5:
                System.out.println("Öğrenci Listesi = "+ ogrListe); break;
            case 6:
                System.out.println("Çıkış ");
                System.out.println();break;
        }
        return secim;}

    @Override
    public String toString() {return name+ " "+ surName+ " "+ id;}
}
