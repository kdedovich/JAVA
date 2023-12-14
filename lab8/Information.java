public class Information {
    public static  void information(Class cls) {
        System.out.println("Class name: " + cls.getName());
        System.out.println();

        System.out.println("Fields:");
        for (var field : cls.getDeclaredFields()) {
            System.out.println("\t" + field.getType().getName() + " " + field.getName());
        }
        System.out.println();

        System.out.println("Constructors:");
        for (var constructor : cls.getDeclaredConstructors()) {
            System.out.println("\t" + constructor.getName());
            System.out.println("\t\tParameters:");
            for (var parameter : constructor.getParameters()) {
                System.out.println("\t\t\t" + parameter.getType().getName() + " " + parameter.getName());
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Methods:");
        for (var method : cls.getDeclaredMethods()) {
            System.out.println("\t" + method.getName());
            System.out.println("\t\tReturn type:" + method.getReturnType().getName());
            System.out.println("\t\tParameters:");
            for (var parameter : method.getParameters()) {
                System.out.println("\t\t\t"+parameter.getType().getName() + " " + parameter.getName());
            }
            System.out.println();
        }
        System.out.println();
    }
}
