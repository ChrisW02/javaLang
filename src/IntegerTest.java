public class IntegerTest {
    public static void main(String[] args) {
        Integer a = Integer.valueOf("10");
        Integer b = 11;

        System.out.println(a.compareTo(b));
        System.out.println(a.equals(b));

        float c = a.floatValue();

        System.out.println(c);

        String d = "10101110";
        int e = Integer.parseInt(d, 2);

        System.out.println(e);
    }
}