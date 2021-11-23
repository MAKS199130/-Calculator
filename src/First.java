public class First {
    private final static String EXCEPTION = "Введите без пробелов два числа от 1 до 10 (арабские или римские) и арифмитический знак (+ , - , / , *)";

    public static void one(String line) {
        String[] array = {"+", "-", "/", "*"};

        int index = line.indexOf(array[0]);
        int index1 = line.indexOf(array[1]);
        int index2 = line.indexOf(array[2]);
        int index3 = line.indexOf(array[3]);

        if (index < 0) {
            if (index1 < 0) {
                if (index2 < 0) {
                    if (index3 < 0) {
                        try {
                            throw new Exception();
                        } catch (Exception e) {
                            System.out.println(EXCEPTION);
                            System.exit(0);
                        }
                        // Выброс исключения, закрытие программы
                    } else {
                        SearchForSigns.checks(index3, line);// делаем все что в else-0
                    }
                } else {
                    SearchForSigns.checks(index2, line);// делаем все что в else-0
                }
            } else {
                SearchForSigns.checks(index1, line);// делаем все что в else-0
            }
        } else { //это else-0
            SearchForSigns.checks(index, line);
        }
    }
}
