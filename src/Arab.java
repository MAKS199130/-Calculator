public class Arab {
    private final static String EXCEPTION = "Введите без пробелов два числа от 1 до 10 (арабские или римские) и арифмитический знак (+ , - , / , *)";

    public static void plus(int index, String line, String line1, String line2) {

        int a = Integer.parseInt(line1);
        int b = Integer.parseInt(line2);
        if ((a >= 1 && a <= 10) && (b >= 1 && b <= 10)) {

            SearchForSigns.lookForSign(line, index, a, b);

        } else {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println(EXCEPTION);
                System.exit(0);
            }
        }
    }
}
