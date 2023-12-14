// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //demonstration of how String type methods work
        String str = "Hello World!";
        System.out.println("str = " + str);
        System.out.println();

        //1 length
        System.out.println("str.lenght() = " + str.length());
        System.out.println();


        //2 concat
        String str2 = "!!!";
        String sum = str.concat(str2);
        System.out.println("str2 = " + str2);
        System.out.println(" sum = str.concat(str2) = " + sum);
        System.out.println();


        //3 charAt
        System.out.println("str.charAt(0) = " + str.charAt(0));
        System.out.println("str.charAt(1) = " + str.charAt(1));
        System.out.println("str.charAt(9) = " + str.charAt(9));
        System.out.println("str.charAt(10) = " + str.charAt(10));
        System.out.println();

        //5 indexOf
        System.out.println("str.indexOf(\"l\") = " + str.indexOf("l"));
        System.out.println("str.indexOf(\"l\", 5) = " + str.indexOf("l", 5));
        System.out.println("str.indexOf(\"World\") = " + str.indexOf("World"));
        System.out.println();

        //6 substring
        String subStr1 = str.substring(6);
        System.out.println("subStr1 = str.substring(6) = " + subStr1);
        String subStr2 = str.substring(6, 11);
        System.out.println("subStr2 = str.substring(6, 11) = " + subStr2);
        System.out.println();

        //7 replace
        String replaceStr = str.replace("l", "L");
        System.out.println("replaceStr = str.replace(\"l\", \"L\") = " + replaceStr);
        System.out.println();

        //8 split
        String[] splitStr = str.split(" ");
        System.out.println("splitStr = str.split(\" \")");
        for (int i = 0; i < splitStr.length; i++) {
            System.out.println("splitStr[" + i + "] = " + splitStr[i]);
        }
        System.out.println();

        //9 toLowerCase
        String lowerStr = str.toLowerCase();
        System.out.println("lowerStr = str.toLowerCase() = " + lowerStr);
        System.out.println();

        //10 toUpperCase
        String upperStr = str.toUpperCase();
        System.out.println("upperStr = str.toUpperCase() = " + upperStr);
        System.out.println();

        //11 trim
        String str3 = "   Hello World!   ";
        System.out.println("str3 = " + str3);
        String trimStr = str3.trim();
        System.out.println("trimStr = str3.trim() = " + trimStr);
        System.out.println();

        //12 isEmpty
        String emptyStr = "";
        System.out.println("emptyStr = " + emptyStr);
        System.out.println("emptyStr.isEmpty() = " + emptyStr.isEmpty());
        System.out.println("str.isEmpty() = " + str.isEmpty());
        System.out.println();


        //13 contains
        System.out.println("str.contains(\"Hello\") = " + str.contains("Hello"));
        System.out.println("str.contains(\"hello\") = " + str.contains("hello"));
        System.out.println("str.contains(\"World\") = " + str.contains("World"));
        System.out.println("str.contains(\"world\") = " + str.contains("world"));
        System.out.println();

        //14 equals
        System.out.println("str.equals(\"Hello World!\") = " + str.equals("Hello World!"));
        System.out.println("str.equals(\"hello world\") = " + str.equals("hello world!"));
        System.out.println();

        //15 equalsIgnoreCase
        System.out.println("str.equalsIgnoreCase(\"Hello World!\") = " + str.equalsIgnoreCase("Hello World!"));
        System.out.println("str.equalsIgnoreCase(\"hello world!\") = " + str.equalsIgnoreCase("hello world!"));
        System.out.println("str.equalsIgnoreCase(\"hello world!\") = " + str.equalsIgnoreCase("hello world"));
        System.out.println();

        //16 compareTo
        String str1 = "bcd";
        System.out.println("str1 = " + str1);
        System.out.println("str1.compareTo(abc) = " + str1.compareTo("abc"));
        System.out.println("str1.compareTo(bcd) = " + str1.compareTo("bcd"));
        System.out.println("str1.compareTo(cde) = " + str1.compareTo("cde"));
        System.out.println("str1.compareTo(bc) = " + str1.compareTo("cde"));
        System.out.println();

    }
}