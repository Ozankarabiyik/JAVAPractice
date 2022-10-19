package Inheritance.Example;

public class AracPark {
    public static void main(String[] args) {
        /*
            1- Arac isimli bir superclass olusturunuz, fields : renk, motorHacmi, marka olsun.
            2- Consructor ekleyiniz.get ve set metodları ve toString Metodunu ekleyiniz.
            3- Bu sınıftan  Otobus sınıfını üretiniz, otobusun ayrıca yolcuKapasitesi field ını ekleyiniz.
            4- Bir AracPark isimli içinde main olan bir sınıf olucturunuz ve Otobus ten
               nesne oluşturarak, Otobusun özelliklerinin tümünü ekrana yazdırınız.
         */

        Otobus otobus1=new Otobus("beyaz", 4500, "temsa", 2, 46);
        System.out.println("otobus1 = " + otobus1);
    }
}
