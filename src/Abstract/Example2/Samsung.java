package Abstract.Example2;

public class Samsung extends Phone{
    @Override
    void options(String memory, String size) {
        if (memory.contains("256") && size.contains("5.5"))
            cart.add("$1000");
        else if (memory.contains("256") && size.contains("7.5"))
            cart.add("$1200");
        else if (memory.contains("512") && size.contains("5.5"))
            cart.add("$1300");
        else if (memory.contains("512") && size.contains("6.5"))
            cart.add("$1400");
    }
}
