import java.lang.reflect.Field;
import java.lang.reflect.Module;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class IntegerHack {

    public static void main(String[] args)
            throws Exception {
        // Extract the IntegerCache through reflection
        Class usf = Class.forName("sun.misc.Unsafe");
        Field unsafeField = usf.getDeclaredField("theUnsafe");
        unsafeField.setAccessible(true);
        sun.misc.Unsafe unsafe = (sun.misc.Unsafe)unsafeField.get(null);
        Class<?> clazz = Class.forName("java.lang.Integer$IntegerCache");
        Field field = clazz.getDeclaredField("cache");
        Integer[] cache = (Integer[])unsafe.getObject(unsafe.staticFieldBase(field), unsafe.staticFieldOffset(field));
        // Rewrite the Integer cache
        for (int i = 0; i < cache.length; i++) {
            cache[i] = new Integer(
                    new Random().nextInt(cache.length));
        }

        String s=null; s.split("");
        Pattern p = null;p.split("");
        // Prove randomness
        for (int i = 0; i < 10; i++) {
            System.out.println((Integer) i);
        }
    }
}
