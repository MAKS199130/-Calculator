import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rom {
    private final static String EXCEPTION = "Введите без пробелов два числа от 1 до 10 (арабские или римские) и арифмитический знак (+ , - , / , *)";

    public static void plus(int index, String line, String line1, String line2) {
        List<String> list = new ArrayList(Arrays.asList("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"));
        int ind = list.indexOf(line1);
        int ind1 = list.indexOf(line2);
        if ((ind >= 0 && ind1 >= 0)) {
            SearchForSigns.lookForSign1(line, index, ind, ind1);
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

