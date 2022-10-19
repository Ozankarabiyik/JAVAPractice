package Implement.RestaurantProgram;

import java.util.ArrayList;

public class TechnoKitchen extends TechnoCafe {
    public static void yemekHazirlama(ArrayList<IFood> siparisler) throws InterruptedException {
        for (IFood y :siparisler ){
            if (y instanceof AdanaKebap){
                System.out.println("---Adana Kebap---");
                new AdanaKebap().grill();new AdanaKebap().marinade();new AdanaKebap().taste();
                System.out.println("************************");
                Thread.sleep(1000);}
            if (y instanceof Lahmacun){
                System.out.println("---Lahmacun---");
                new Lahmacun().addMeat();new Lahmacun().dough();new Lahmacun().taste();
                System.out.println("************************");
                Thread.sleep(1000);}
            if (y instanceof Borsh){
                System.out.println("---Borsh---");
                new Borsh().boil();new Borsh().eatTomorrow();new Borsh().taste();
                System.out.println("************************");
                Thread.sleep(1000);}
            if (y instanceof Palov){
                System.out.println("---Palov---");
                new Palov().boil();new Palov().fry();new Palov().taste();
                System.out.println("************************");
                Thread.sleep(1000);
            }
        }
    }
}
