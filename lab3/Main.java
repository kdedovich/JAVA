public class Main {
    public static void leapYear(int n) {
        System.out.println("is " + n + " leap year?");
        System.out.println("(" + n+ " % 4 == 0) && (!(" + n + " % 100 == 0) || (" + n + " % 400 == 0))");
        System.out.println((n % 4 == 0) && (!(n % 100 == 0) || (n % 400 == 0)));
        System.out.println();
    }

    public static void max(int x, int y) {
        System.out.println("max(" + x + ", " + y + ")");
        System.out.println(x + " > " + y + " ? " + x + " : " + y);
        System.out.println(x > y ? x : y);
        System.out.println();
    }


    public static void main(String[] args) {
        //logical operators
        System.out.println("false && false = " + (false && false));
        System.out.println("false && true  = " + (false && true));
        System.out.println("true  && false = " + (true && false));
        System.out.println("true  && true  = " + (true && true));
        System.out.println();

        System.out.println("false || false = " + (false || false));
        System.out.println("false || true  = " + (false || true));
        System.out.println("true  || false = " + (true || false));
        System.out.println("true  || true  = " + (true || true));
        System.out.println();

        System.out.println("!false = " + (!false));
        System.out.println("!true  = " + (!true));
        System.out.println();

        leapYear(2000);
        leapYear(2003);
        leapYear(2020);
        leapYear(2100);

        // ternary operator
        max(10, 5);
        max(-5, 5);

        //binary operators
        System.out.println("13 & 6 = " + (13 & 6));
        System.out.println(Integer.toBinaryString(13) + " & " + Integer.toBinaryString(6)
                + " = " + Integer.toBinaryString(13 & 6) + "\n");

        System.out.println("13 | 6 = " + (13 | 6));
        System.out.println(Integer.toBinaryString(13) + " | " + Integer.toBinaryString(6)
                + " = " + Integer.toBinaryString(13 | 6) + "\n");

        System.out.println("13 ^ 6 = " + (13 ^ 6));
        System.out.println(Integer.toBinaryString(13) + " ^ " + Integer.toBinaryString(6)
                + " = " + Integer.toBinaryString(13 ^ 6) + "\n");

        System.out.println("~13 = " + (~13));
        System.out.println(Integer.toBinaryString(13) + " = " + Integer.toBinaryString(~13));
        System.out.println();

        // shift operations
        System.out.println("27 << 3 = " + (27 << 3));
        System.out.println(Integer.toBinaryString(27) + " << 3 = "
                + Integer.toBinaryString(27 << 3));

        System.out.println("-27 << 3 = " + (-27 << 3));
        System.out.println(Integer.toBinaryString(-27) + " << 3 = "
                + Integer.toBinaryString(-27 << 3));

        System.out.println("27 >> 3 = " + (27 >> 3));
        System.out.println(Integer.toBinaryString(27) + " >> 3 = "
                + Integer.toBinaryString(27 >> 3));

        System.out.println("-27 >> 3 = " + (-27 >> 3));
        System.out.println(Integer.toBinaryString(-27) + " >> 3 = "
                + Integer.toBinaryString(-27 >> 3));

        System.out.println("27 >>> 3 = " + (27 >>> 3));
        System.out.println(Integer.toBinaryString(27) + " >>> 3 = "
                + Integer.toBinaryString(27 >>> 3));

        System.out.println("-27 >>> 3 = " + (-27 >>> 3));
        System.out.println(Integer.toBinaryString(-27) + " >>> 3 = "
                + Integer.toBinaryString(-27 >>> 3));

    }
}