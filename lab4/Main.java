// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public enum Color{
        RED,
        GREEN,
        BLUE
    };
    public static void switch_enum(Color color) {
        switch (color) {
            case RED:
                System.out.println("Red");
                break;
            case GREEN:
                System.out.println("Green");
                break;
            case BLUE:
                System.out.println("Blue");
                break;
            default:
                System.out.println("Unknown color");
        }
    }

    public static void switch_byte(byte n) {
        switch (n) {
            case 10:
                System.out.println("Ten");
                break;
            case 20:
                System.out.println("Twenty");
                break;
            default:
                System.out.println("Unknown number");

        }
    }

    public static void switch_Byte(Byte n) {
        switch (n) {
            case 10:
                System.out.println("Ten");
                break;
            case 20:
                System.out.println("Twenty");
                break;
            default:
                System.out.println("Unknown number");

        }
    }

    public static void switch_short(short n) {
        switch (n) {
            case 1000:
                System.out.println("One thousand");
                break;
            case 2000:
                System.out.println("Two thousand");
                break;
            default:
                System.out.println("Unknown number");
        }
    }

    public static void switch_Short(Short n) {
        switch (n) {
            case 1000:
                System.out.println("One thousand");
                break;
            case 2000:
                System.out.println("Two thousand");
                break;
            default:
                System.out.println("Unknown number");
        }
    }

    public static void switch_int(int n) {
        switch (n) {
            case 100000:
                System.out.println("100 thousand");
                break;
            case 200000:
                System.out.println("200 thousand");
                break;
            default:
                System.out.println("Unknown number");
        }
    }

    public static void switch_Integer(Integer n) {
        switch (n) {
            case 100000:
                System.out.println("100 thousand");
                break;
            case 200000:
                System.out.println("200 thousand");
                break;
            default:
                System.out.println("Unknown number");
        }
    }



    public static void switch_String(String s) {
        switch (s) {
            case "One":
                System.out.println("1");
                break;
            case "Two":
                System.out.println("2");
                break;
            default:
                System.out.println("Unknown number");
        }
    }

    public static void switch_char(char c) {
        switch (c) {
            case 'a':
                System.out.println("letter a");
                break;
            case 'b':
                System.out.println("letter b");
                break;
            default:
                System.out.println("Unknown letter");

        }
    }

    public static void switch_Character(Character c) {
        switch (c) {
            case 'a':
                System.out.println("letter a");
                break;
            case 'b':
                System.out.println("letter b");
                break;
            default:
                System.out.println("Unknown letter");
        }
    }



    public static void main(String[] args) {
        System.out.println("test Enum");
        switch_enum(Color.RED);
        switch_enum(Color.GREEN);
        switch_enum(Color.BLUE);

        System.out.println("\ntest byte");
        switch_byte((byte)10);
        switch_byte((byte)20);
        switch_byte((byte)30);

        System.out.println("\ntest Byte");
        switch_Byte((byte)10);
        switch_Byte((byte)20);
        switch_Byte((byte)30);

        System.out.println("\ntesy short");
        switch_short((short)1000);
        switch_short((short)2000);
        switch_short((short)3000);

        System.out.println("\ntest Short");
        switch_Short((short)1000);
        switch_Short((short)2000);
        switch_Short((short)3000);

        System.out.println("\ntest int");
        switch_int(100000);
        switch_int(200000);
        switch_int(300000);

        System.out.println("\ntest Integer");
        switch_Integer(100000);
        switch_Integer(200000);
        switch_Integer(300000);

        System.out.println("\ntest String");
        switch_String("One");
        switch_String("Two");
        switch_String("Three");

        System.out.println("\ntest char");
        switch_char('a');
        switch_char('b');
        switch_char('c');

        System.out.println("\ntest Character");
        switch_Character('a');
        switch_Character('b');
        switch_Character('c');
    }
}