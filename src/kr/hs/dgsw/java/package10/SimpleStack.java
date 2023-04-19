package kr.hs.dgsw.java.package10;

import javax.xml.crypto.NoSuchMechanismException;
import java.util.Scanner;

public class SimpleStack {
    private static final int SIZE = 10;
    private String[] array = new String[SIZE];
    private static int top = 0;

    void push(String value) {
        array[top] = value;
        top++;
    }

    String pop() {
        top--;
        return array[top];
    }

    boolean isFull() {
        return top == SIZE;
    }

    boolean isEmpty() {
        return top == 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = null;
        String data = null;
        SimpleStack simpleStack = new SimpleStack();

        while (true) {
            System.out.print("Command : ");
            command = scanner.next();
            if ("push".equals(command)) {
                if (simpleStack.isFull()) {
                    System.out.println("stack Full");
                    continue;
                }
                data = scanner.next();
                simpleStack.push(data);
            } else if ("pop".equals(command)) {
                if (simpleStack.isEmpty()) {
                    System.out.println("엄");
                    continue;
                }
                data = simpleStack.pop();
                System.out.println(data);
            } else if ("exit".equals(command)) {
                break;
            } else if ("size".equals(command)) {
                System.out.println(top);
            } else {
                throw new NoSuchMechanismException();
            }
        }

        scanner.close();
    }
}
