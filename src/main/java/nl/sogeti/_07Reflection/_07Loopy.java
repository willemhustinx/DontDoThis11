package nl.sogeti._07Reflection;

public class _07Loopy {
    public static void main(String... args) throws Exception {

        _07Reflector.setPrivateFieldValue(Integer.class, "value", 5, 4);

        for (Integer i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}