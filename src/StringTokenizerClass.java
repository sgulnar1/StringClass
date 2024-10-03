import java.util.StringTokenizer;

public class StringTokenizerClass {
    public static void main(String[] args) {
        StringTokenizer stringTokenizer = new StringTokenizer("Hello World\nfirst project", "e", true);
        System.out.println(stringTokenizer.countTokens());
//        while(stringTokenizer.hasMoreTokens()) {
//            System.out.println(stringTokenizer.nextElement());
//        }

        while(stringTokenizer.hasMoreElements()) {
            System.out.println(stringTokenizer.countTokens());
            System.out.println(stringTokenizer.nextToken());
        }
//        System.out.println("**************");
//        while(stringTokenizer.hasMoreElements()) {
//            System.out.println(stringTokenizer.countTokens());
//            System.out.println(stringTokenizer.nextToken());
//        }
    }
}
