import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionDemo {

    public static void main(String[] args) {
        try {
            // Load class dynamically by name
            Class<?> clazz = Class.forName("Sample");

            // Print class name
            System.out.println("Class: " + clazz.getName());

            // Get all declared methods
            Method[] methods = clazz.getDeclaredMethods();

            for (Method method : methods) {
                System.out.print("Method: " + method.getName() + "(");

                // Print parameter types
                Parameter[] params = method.getParameters();
                for (int i = 0; i < params.length; i++) {
                    System.out.print(params[i].getType().getSimpleName() + " " + params[i].getName());
                    if (i < params.length - 1) System.out.print(", ");
                }
                System.out.println(")");
            }

            // Create an instance of the class
            Object obj = clazz.getDeclaredConstructor().newInstance();

            // Invoke a method dynamically - say, "greet" with a String parameter
            Method greetMethod = clazz.getDeclaredMethod("greet", String.class);
            Object result = greetMethod.invoke(obj, "Alice");

            System.out.println("Result of greet(): " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Sample class to demonstrate reflection
class Sample {
    public String greet(String name) {
        return "Hello, " + name + "!";
    }

    public void printNumber(int n) {
        System.out.println("Number: " + n);
    }
}
