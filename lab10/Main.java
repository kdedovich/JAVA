// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Triple<Integer> triple = new Triple<>(1, 2, 3);
        System.out.println(triple.toString());
        System.out.println(triple.min());
        System.out.println(triple.max());
        System.out.println(triple.mean());

        Triple<Integer> triple1 = new Triple<>(1, 2, 4);
        Triple<Integer> triple2 = new Triple<>(1, 2, 3);
        System.out.println(triple.equals(triple1));
        System.out.println(triple.equals(triple2));

    }
}