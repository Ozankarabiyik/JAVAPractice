package Implement.RestaurantProgram;

public class Lahmacun implements IFood {
    void dough(){
        System.out.println("Mayalanmıs Hamur ince bir şekilde açılıyor.");
    }
    void addMeat(){
        System.out.println("en özel baharatlarla hazırlanıyor");
    }
    @Override
    public void taste() {
        System.out.println("mükammel bir lezzet...");
    }

    @Override
    public double ucret() {
        return 33;
    }
}
