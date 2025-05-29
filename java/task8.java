public class OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;
        System.out.println("Expression 1: 10 + 5 * 2 = " + result1);
        int result2 = (10 + 5) * 2;
        System.out.println("Expression 2: (10 + 5) * 2 = " + result2);
        int result3 = 10 / 2 + 3;
        System.out.println("Expression 3: 10 / 2 + 3 = " + result3);
        int result4 = 10 + 5 * 2 - 3;
        System.out.println("Expression 4: 10 + 5 * 2 - 3 = " + result4);
        int result5 = 10 + 5 / 5 * 2;
        System.out.println("Expression 5: 10 + 5 / 5 * 2 = " + result5);
    }
}
