public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("test");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.indexOf("e",3));
        System.out.println(sb.capacity());
        sb.ensureCapacity(31);
        System.out.println(sb.append(" new"));
        System.out.println(sb);
        System.out.println(sb.append(" new" , 2,4));
        System.out.println(sb.insert(3,"old"));
        System.out.println(sb.insert(3, "asdfgh", 2, 4)); //[2,4)
        System.out.println(sb.delete(3,6)); //[3,6)
        System.out.println(sb.deleteCharAt(4));
        System.out.println(sb.replace(1,5, "aaa"));
        System.out.println(sb.reverse());
        System.out.println(sb.subSequence(3,5));
        System.out.println("sb: " + sb);
        System.out.println(sb.substring(4));
        System.out.println("sb: " + sb);
        sb.setCharAt(2,'U');
        System.out.println(sb);
        sb.setLength(3);
        System.out.println(sb);

    }
}
