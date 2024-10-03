import java.util.StringJoiner;

public class StringJoinerClass {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner("\n");
        stringJoiner.add("Hello");
//        stringJoiner.add("World");

        stringJoiner.setEmptyValue("Empty value");
        StringJoiner stringJoiner1 = new StringJoiner("\n","***", "...");
        System.out.println("1: " + stringJoiner1);
        stringJoiner1.merge(stringJoiner);
        stringJoiner1.add(" World");
        System.out.println("2: " + stringJoiner1);
        System.out.println("3: " + stringJoiner);
    }
}
