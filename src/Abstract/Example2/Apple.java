package Abstract.Example2;

public class Apple extends Phone{

    @Override
    void options(String memory, String size) {
        if (memory.contains("64") && size.contains("5.5"))
            cart.add("$750");
        else if (memory.contains("64") && size.contains("6.5"))
            cart.add("$850");
        else if (memory.contains("128") && size.contains("5.5"))
            cart.add("$950");
        else if (memory.contains("128") && size.contains("6.5"))
            cart.add("$1200");
    }
}
