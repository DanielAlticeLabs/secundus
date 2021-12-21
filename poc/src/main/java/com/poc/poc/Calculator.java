package com.poc.poc;

/**
 *
 * @author Daniel Oliveira
 */
public class Calculator {
    public static int operation(int opCode, int a, int b) {
        switch (opCode) {
            case 0:
                return a + b;
            case 1:
                return a - b;
            case 2:
                return a * b;
            case 3:
                return a / b;
            default:
                return 0;
        }
    }

    public static int hello() {
        return 0;
    }
}
