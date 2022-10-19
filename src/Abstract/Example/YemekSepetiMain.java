package Abstract.Example;

public class YemekSepetiMain {
    public static void main(String[] args) {
        /*
        Ekteki şekle göre Classları oluşturup,
        YemekDunyasi isimli mainde birer nesne oluşturup yazdırınız.
         */

        Baklava baklava=new Baklava();
        System.out.println(baklava.getClass().getSimpleName());
        System.out.println("...............");
        baklava.madeIn();
        baklava.taste();
        System.out.println();

        CheeseCake kek=new CheeseCake();
        System.out.println(kek.getClass().getSimpleName());
        System.out.println("...............");
        kek.madeIn();
        kek.taste();
        System.out.println();

        GreekSalad salata=new GreekSalad();
        System.out.println(salata.getClass().getSimpleName());
        System.out.println("...............");
        salata.madeIn();
        salata.taste();
        System.out.println();


        SezarSalad sezar=new SezarSalad();
        System.out.println(sezar.getClass().getSimpleName());
        System.out.println("...............");
        sezar.madeIn();
        sezar.taste();
        System.out.println();


    }
}
