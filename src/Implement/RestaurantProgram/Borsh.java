package Implement.RestaurantProgram;

public class Borsh implements IFood {
    void boil(){
        System.out.println("Çorbanız kaynıyor..");
    }
    void eatTomorrow(){
        System.out.println("değişik değişik et çeşitleri ilave ediliyor..");
    }
    @Override
    public void taste() {
        System.out.println("enteresan bir tadı var.");
    }

    @Override
    public double ucret() {
        return 44;
    }
}
