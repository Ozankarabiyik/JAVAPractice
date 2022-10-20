package Abstract.Example2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Apple Store");
        System.out.println("-----------");

        System.out.print("Hafıza Büyütlüğünü Belirtiniz :");
        String memory=oku.nextLine();
        System.out.print("Ekran büyüklüğünü Belirtiniz :");
        String size=oku.nextLine();

        Apple apple=new Apple();
        apple.options(memory,size);
        System.out.println("Tercih ettiğini Apple Cihazının Ücreti :"+Phone.getSum(Phone.cart));
        System.out.println();

        System.out.println("Samsung Store");
        System.out.println("-------------");

        System.out.print("Hafıza Büyütlüğünü Belirtiniz :");
        String memory2=oku.nextLine();
        System.out.print("Ekran büyüklüğünü Belirtiniz :");
        String size2=oku.nextLine();

        Samsung samsung=new Samsung();
        samsung.options(memory2,size2);
        System.out.println("Tercih Ettiğiniz Samsung Cihazının Ücreti :"+Phone.getSum(Phone.cart));
    }
}
