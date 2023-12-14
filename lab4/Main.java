
public class Main {
    public static void main(String[] args) {
        System.out.println("test Enum");
        SwitchExample.switch_enum(Color.RED);
        SwitchExample.switch_enum(Color.GREEN);
        SwitchExample.switch_enum(Color.BLUE);

        System.out.println("\ntest byte");
        SwitchExample.switch_byte((byte)10);
        SwitchExample.switch_byte((byte)20);
        SwitchExample.switch_byte((byte)30);

        System.out.println("\ntest Byte");
        SwitchExample.switch_Byte((byte)10);
        SwitchExample.switch_Byte((byte)20);
        SwitchExample.switch_Byte((byte)30);

        System.out.println("\ntesy short");
        SwitchExample.switch_short((short)1000);
        SwitchExample.switch_short((short)2000);
        SwitchExample.switch_short((short)3000);

        System.out.println("\ntest Short");
        SwitchExample.switch_Short((short)1000);
        SwitchExample.switch_Short((short)2000);
        SwitchExample.switch_Short((short)3000);

        System.out.println("\ntest int");
        SwitchExample.switch_int(100000);
        SwitchExample.switch_int(200000);
        SwitchExample.switch_int(300000);

        System.out.println("\ntest Integer");
        SwitchExample.switch_Integer(100000);
        SwitchExample.switch_Integer(200000);
        SwitchExample.switch_Integer(300000);

        System.out.println("\ntest String");
        SwitchExample.switch_String("One");
        SwitchExample.switch_String("Two");
        SwitchExample.switch_String("Three");

        System.out.println("\ntest char");
        SwitchExample.switch_char('a');
        SwitchExample.switch_char('b');
        SwitchExample.switch_char('c');

        System.out.println("\ntest Character");
        SwitchExample.switch_Character('a');
        SwitchExample.switch_Character('b');
        SwitchExample.switch_Character('c');
    }
}