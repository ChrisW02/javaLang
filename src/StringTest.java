public class StringTest {
    public static void main(String[] args) {
        String s = "Java";
        String m = "java";
        System.out.println("equals(): " + s.equals(m));
        System.out.println("equalsIgnoreCase(): " + s.equalsIgnoreCase(m));

        StringBuilder k = new StringBuilder("I");
        k.append(" java");
        k.insert(1, " love");
        String t = k.toString();
        System.out.println(t);
    }
}