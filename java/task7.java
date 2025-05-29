public class TypeCastingDemo {
    public static void main(String[] args) {
        double doubleValue = 9.99;
        System.out.println("Original double value: " + doubleValue);

        int intValue = (int) doubleValue;
        System.out.println("Double casted to int: " + intValue);

        int intVar = 10;
        System.out.println("Original int value: " + intVar);

        double doubleVar = (double) intVar;
        System.out.println("Int casted to double: " + doubleVar);
    }
}

