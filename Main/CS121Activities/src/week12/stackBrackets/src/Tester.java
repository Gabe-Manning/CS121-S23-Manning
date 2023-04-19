public class Tester {
    public static void main(String[] args) {

        BalancedBrackets balanced = new BalancedBrackets();

        System.out.println(balanced.checkBalance("()"));
        System.out.println(balanced.checkBalance("({}[])"));
        System.out.println(balanced.checkBalance("((((()(())))))"));

        System.out.println();

        System.out.println(balanced.checkBalance("{()"));
        System.out.println(balanced.checkBalance("())"));
        System.out.println(balanced.checkBalance("[[]]]"));

        System.out.println();

        System.out.println(balanced.checkBalance("Bob"));
        System.out.println(balanced.checkBalance("({[Chris]})"));
    }
}
