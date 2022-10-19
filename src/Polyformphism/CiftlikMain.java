package Polyformphism;

public class CiftlikMain {
    public static void main(String[] args) {
        Kopek kopek1=new Kopek("karabas");
        Kedi kedi1=new Kedi("kopuk");

        Hayvan kopek2=new Hayvan("rodi");
        Hayvan kedi2=new Hayvan("minnoş");

        kopek1.ses(); // gercekten kopek
        kopek1.kokladi();// gercekten kopek

        kopek2.ses();// hayvan gibi görünüyor
        // ama köpek

        System.out.println("***************");
        hayvanSes(kopek1);
        hayvanSes(kedi1);


    }
    public static void hayvanSes(Hayvan h){
        h.ses();
    }
}
