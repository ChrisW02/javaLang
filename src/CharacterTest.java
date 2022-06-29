public class CharacterTest {
    public static void main(String[] args) {
        int count;
        char[] values = {'*', '_', '%', '8', 'L', 'l'};
        for (count = 0; count < values.length; count++) {
            if (Character.isDigit(values[count])) {
                System.out.println(values[count] + "是一个数字");
            }
            if (Character.isLetter(values[count])) {
                System.out.println(values[count] + "是一个字母");
            }
            if (Character.isUpperCase(values[count])) {
                System.out.println(values[count] + "是大写形式");
            }
        }
        char c = ' ';
        System.out.println("Is c a whitespace? " + Character.isWhitespace(c));
    }
}