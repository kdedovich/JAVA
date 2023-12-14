public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan", "Ivanov", 30);
        Person person2 = new Person("Petr", "Petrov", 25);

        System.out.println("Before swap:");
        System.out.println(person1);
        System.out.println(person2);

        Swaper.swap(person1, person2);

        System.out.println("After swap:");
        System.out.println(person1);
        System.out.println(person2);

    }
}