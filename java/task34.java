// File: com.greetings/src/com/greetings/Main.java
package com.greetings;

import com.utils.Utils;

public class Main {
    public static void main(String[] args) {
        String message = Utils.getGreeting("Alice");
        System.out.println(message);
    }
}
