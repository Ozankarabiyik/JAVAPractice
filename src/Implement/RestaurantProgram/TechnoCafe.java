package Implement.RestaurantProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<IFood> yemekSiparisi=new ArrayList<>();
        double toplamUcret=0;
        Scanner oku=new Scanner(System.in);
        int secim;
        int kebapCount=0;
        int lahmacunCount=0;
        int borshCount=0;
        int palovCount=0;


        do {
            System.out.println("**********MENU*********");
            System.out.println("1- Adana Kebap\n2- Lahmacun\n3- Borsh\n4- Palov\n0- Tamam");
            secim=oku.nextInt();
            switch (secim){
                case 1: AdanaKebap adanaKebap=new AdanaKebap();
                        toplamUcret+=adanaKebap.ucret();
                        yemekSiparisi.add(adanaKebap);
                        ++kebapCount;break;

                case 2: Lahmacun lahmacun=new Lahmacun();
                        toplamUcret+=lahmacun.ucret();
                        yemekSiparisi.add(lahmacun);
                        ++lahmacunCount;break;

                case 3: Borsh borsh=new Borsh();
                        toplamUcret+=borsh.ucret();
                        yemekSiparisi.add(borsh);
                        ++borshCount;break;

                case 4: Palov palov=new Palov();
                        toplamUcret+=palov.ucret();
                        yemekSiparisi.add(palov);
                        ++palovCount;break;
            }

            kebapCount(kebapCount);
            lahmacunCount(lahmacunCount);
            borshCount(borshCount);
            palovCount(palovCount);
            System.out.println("Toplam sipariş tutarı :"+toplamUcret);
            Thread.sleep(1000);
        }while (secim!=0);

        TechnoKitchen.yemekHazirlama(yemekSiparisi);
        System.out.println("Toplam sipariş tutarı :"+toplamUcret);


    }
    public static void kebapCount(int count){
        if (count>0){
            System.out.println("Adana Kebap :"+count);
        }
    }
    public static void lahmacunCount(int count){
        if (count>0){
            System.out.println("Lahmacun :"+count);
        }
    }
    public static void borshCount(int count){
        if (count>0){
            System.out.println("Borsh :"+count);
        }
    }
    public static void palovCount(int count){
        if (count>0){
            System.out.println("Palov :"+count);
        }
    }
}
