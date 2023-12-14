import java.lang.reflect.Field;

public class Swaper {
    public static <T> void swap(T first, T second) {
        try {
            swapImpl(first, second);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    private static <T> void swapImpl(T first, T second) throws IllegalAccessException {
        Field[] fields = first.getClass().getDeclaredFields();

        for (java.lang.reflect.Field field : fields) {
            field.setAccessible(true);
            Object tmp = field.get(first);
            field.set(first, field.get(second));
            field.set(second, tmp);
        }
    }
}
