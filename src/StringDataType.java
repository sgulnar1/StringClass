import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringDataType {
    public static void main(String[] args) {
        String name1 = "M"; //m
        String name2 = new String("M");
        String name3 = "";
//        int murad = 20;
//        String name5 = "";
//        String name6 = "\t t \n ";
//        String name7 = null;
//        String name3 = "Murad";
//        String name4 = new String("Murad");
        System.out.println(name1.equals(name2));
        System.out.println(name1==name2);
////        System.out.println(name1.equals(name3));
////        System.out.println(name1 == "Murad");
////        System.out.println(name3 == "Murad");
//        System.out.println(name1.isBlank());
//        System.out.println(name5.isBlank());
//        System.out.println("name6: " + name6.isBlank());
//        System.out.println(name1.isEmpty());
//        System.out.println(name5.isEmpty());
//        System.out.println(name6.isEmpty());
//        System.out.println(name6);
//        StringDataType stringDataType = new StringDataType();
//        System.out.println(name1.getBytes(StandardCharsets.UTF_8));
//        Integer a = 5;
//        String s = "5";
//        int i = a * 4;
//        int i1 = Integer.valueOf(s) * 4;
//
//        System.out.println(a.toString());
//        System.out.println();
//        System.out.println(name1.length());
//        System.out.println(Arrays.toString(name1.getBytes()));
//        char M = 77;
//        System.out.println(M);
//        System.out.println();
//        test();
//        test(5);
//        test(name1);
//        System.out.println(name1.toUpperCase());
//        System.out.println(name1.toLowerCase());
//        name1 = name1.toLowerCase();
//        System.out.println(name1);
//        //System.out.println(name1.charAt(5));
//        System.out.println(Arrays.toString(name1.getBytes()));
//        System.out.println(Arrays.toString(name2.getBytes()));
//        System.out.println(name1.compareTo(name2));
//        System.out.println(name1.compareToIgnoreCase(name2));
        System.out.println("name1: " + name1);
        name1 =name1.concat("urad");
        System.out.println(name1.concat("urad"));
        System.out.println(name1);
        System.out.println(name1.contains("u"));
        System.out.println(name1);
        System.out.println(name1.endsWith("uRad"));
        System.out.println(name2.hashCode());
        name1 = " Mura    duuu";
        System.out.println(name1.indexOf('u'));
        System.out.println(name1.indexOf('u',4));
        System.out.println(name1.lastIndexOf("u")); //8
        System.out.println(name1.lastIndexOf("u",6));
        System.out.println(name1.indexOf("u",6,8));
        System.out.println(name1.replace('u', 's'));
        System.out.println(name1.replace("urad", "ahire"));
        System.out.println(name1.replaceFirst("[a-z]","t" ));
        System.out.println(name1.replaceAll("[A-Z, a-z]", "t"));
        System.out.println(Arrays.toString(name1.split("-")));
        System.out.println(name1.substring(4));
        System.out.println(name1.substring(4,6)); //[4,6)
        System.out.println(name1.trim());
        System.out.println(name1.repeat(4));
        String name = "AYXAN9";
        System.out.println(name.replaceFirst("[A-X,0-9]", "S"));
        String str = "Bu cumle spliti test etmek ucun yazilib";
        String[]  array = str.split(" ");
        System.out.println(array);
        System.out.println(Arrays.toString(array));
    }

    public static void test() {
        // return 5;
    }

    public static void test(int a) {
        // return 5;
    }

    public static void test(String a) {
        // return 5;
    }
    public static void test(EnumTest a) {
        // return 5;
    }
}
