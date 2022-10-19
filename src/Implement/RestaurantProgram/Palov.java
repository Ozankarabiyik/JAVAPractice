package Implement.RestaurantProgram;

public class Palov implements IFood {
    void fry(){
        System.out.println("önce yağda hafif hafif kavruluyor...");
    }
    void boil(){
        System.out.println("kısık ateşte kaynamaya bırakılıyor...");
    }

    @Override
    public void taste() {
        System.out.println("bildiğin haşlanmış pilav..");
    }

    @Override
    public double ucret() {
        return 44;
    }
}
