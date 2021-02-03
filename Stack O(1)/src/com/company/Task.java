package com.company;

import java.util.Scanner;
import java.util.Stack;


public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int size = Integer.parseInt(sc.nextLine());
        while (size-- > 0) {
            String command = sc.next();
            switch (command) {
                case "push" -> {
                    int numb = sc.nextInt();
                    if (stack.isEmpty() || numb > stack.peek()) stack.push(numb);
                    else stack.push(stack.peek());
                }
                case "pop" -> stack.pop();
                case "max" -> System.out.println(stack.peek());
                default -> System.out.println("Unknown command..");
            }
        }
    }
}

