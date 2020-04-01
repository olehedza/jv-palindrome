package core.basesyntax;

public class Palindrome {

    /**
     * <p>Реализуйте метод, проверяющий, является ли заданная строка палиндромом.
     * Палиндромом называется строка, которая читается одинаково слева направо
     * и справа налево (в том числе пустая).
     * При определении "палиндромности" строки должны учитываться только буквы и цифры. А пробелы,
     * знаки препинания, а также регистр символов должны игнорироваться.</p>
     *
     * <p>Подсказки (не читайте, если хотите решить сами):
     * для удаления из строки всех символов, не являющихся буквами и цифрами, можно воспользоваться
     * регулярным выражением. Найдите в классе String метод, выполняющий замену по
     * регулярному выражению;
     * для перестановки символов строки в обратном порядке можно воспользоваться методом reverse(),
     * который находится в классе StringBuilder;
     * в классе String есть методы для преобразования всей строки в верхний и нижний регистр.</p>
     *
     * <p>Пример: Madam, I'm Adam!</p>
     * <p>Результат: true</p>
     */
    public boolean isPalindrome(String text) {
        String reverse;
        String wholeStr;
        String[] tokens = text.toLowerCase()
                .replaceAll("[,.:;()!?]", "")
                .replaceAll("(?<=[ ])[-](?=[ ])", "")
                .replaceAll(" {2,}", " ")
                .trim()
                .split(" ");

        for (String str : tokens) {
            reverse = new StringBuilder(str).reverse().toString();
            if (str.equals(reverse)) {
                return true;
            }
        }
        wholeStr = String.join("", tokens);
        reverse = new StringBuilder(wholeStr).reverse().toString();
        return wholeStr.equals(reverse);
    }
}
