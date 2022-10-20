package Abstract.Example2;

import java.util.ArrayList;

public abstract class Phone {
    public static ArrayList<String> cart=new ArrayList<>();
    public static int getSum(ArrayList<String> cart){
        int ucret=0;
        for (String f : cart){
            int money=Integer.parseInt(f.replaceAll("^[0-9-$]",""));
            ucret+=money;
        }
        return ucret;
    }

    abstract void options(String memory, String size);
}
