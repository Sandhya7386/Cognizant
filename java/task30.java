public class Main {

    public static void checkType(Object obj) {
        // Enhanced switch expression with pattern matching
        String result = switch (obj) {
            case Integer i -> "It's an Integer with value: " + i;
            case String s -> "It's a String: \"" + s + "\"";
            case Double d -> "It's a Double with value: " + d;
            case null -> "Object is null";
            default -> "Unknown type: " + obj.getClass().getSimpleName();
        };
        System.out.println(result);
    }

    public static void main(String[] args) {
        checkType(42);
        checkType("Hello, Java 21!");
        checkType(3.14);
        checkType(true);
        checkType(null);
    }
}
