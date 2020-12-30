package integerhack;

import java.lang.reflect.Field;
import java.util.Random;

public class IntegerHack {

    public static void main1(String[] args) throws Exception {

        Field field = Integer.class.getDeclaredClasses()[0].getDeclaredField("cache");
        field.setAccessible(true);
        ((Integer[]) field.get(null))[127] = 1;
        System.out.println("Zero is " + 0);
    }

    public static void main(String[] args)
            throws Exception {

        // Extract the IntegerCache through reflection
        Class<?> clazz = Class.forName(
                "java.lang.Integer$IntegerCache");
        Field field = clazz.getDeclaredField("cache");
        field.setAccessible(true);
        Integer[] cache = (Integer[]) field.get(clazz);

        // Rewrite the Integer cache
        for (int i = 0; i < cache.length; i++) {
            cache[i] = new Integer(
                    new Random().nextInt(cache.length));
        }

        // Prove randomness
        for (int i = 0; i < 10; i++) {
            System.out.println((Integer) i);
        }
    }
}
