import java.lang.reflect.Method;

public class Executer {
    public static void execute(String className, String methodName) {
        try {
            executeImpl(className, methodName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void executeImpl(String className, String methodName) throws Exception {
        Class<?> cls = Class.forName(className);
        Object instance = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(instance);

    }
}
