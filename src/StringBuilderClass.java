public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello World");
        String str = stringBuilder.substring(5); //[)
        System.out.println(stringBuilder);
        System.out.println(str);
        System.out.println(stringBuilder.indexOf("lo World",5));
        stringBuilder.delete(0,22);
        System.out.println("stringBuilder: " + stringBuilder);

    }
}
