package Implement.RestaurantProgram;

public class AdanaKebap implements IFood {
    void marinade(){
        System.out.println("Etin en güzel yeri bir gün önceden marine edildi.");
    }
    void grill(){
        System.out.println("pişiriliyor..");
    }

    @Override
    public void taste() {
        System.out.println("Etin en lezzetli hali..");

    }

    @Override
    public double ucret() {
        return 55;
    }
}
