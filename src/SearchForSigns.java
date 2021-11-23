public class SearchForSigns {
    private final static String EXCEPTION = "Введите без пробелов два числа от 1 до 10 (арабские или римские) и арифмитический знак (+ , - , / , *)";

    public static void lookForSign(String line, int index, int a, int b) {

        int result = 0;
        switch (line.charAt(index)) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '/':
                result = a / b;
                break;
            case '*':
                result = a * b;
        }
        System.out.println(result);

    }

    public static void lookForSign1(String line, int index, int ind, int ind1) {
        int result1 = 0;
        switch (line.charAt(index)) {
            case '+':
                result1 = (ind + 1) + (ind1 + 1);
                break;
            case '-':
                result1 = (ind + 1) - (ind1 + 1);
                break;
            case '/':
                result1 = (ind + 1) / (ind1 + 1);
                break;
            case '*':
                result1 = (ind + 1) * (ind1 + 1);
        }
        if (result1 <= 0) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Результат меньше 1 не доступен. Сорян.");
                System.exit(0);
            }//выброс исключения
        } else {
            System.out.println(ResultRom.convert(result1));
        }
    }

    public static void checks(int index, String line) {
        String line1 = line.substring(0, index);
        String line2 = line.substring(index + 1);
        if (!(isNumeric(line1) && (isNumeric(line2)))) {
            Rom.plus(index, line, line1, line2);
        } else {
            if (isNumeric(line1) && (isNumeric(line2))) {
                Arab.plus(index, line, line1, line2);
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

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
