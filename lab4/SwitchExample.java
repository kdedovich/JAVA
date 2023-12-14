enum Color{
    RED,
    GREEN,
    BLUE
};
public class SwitchExample {
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
}
