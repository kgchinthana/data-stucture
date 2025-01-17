package org.example.stacks;

import java.util.Arrays;

public class Stack {
    private int[] numbers;
    private int count;

    public Stack(int capacity) {
        this.numbers = new int[capacity];
        this.count = 0;
    }

    public void push(int item) {
        if (count == numbers.length) {
            var newNumbers = new int[numbers.length * 2];
            System.arraycopy(numbers, 0, newNumbers, 0, numbers.length);
            numbers = newNumbers;
        }
        numbers[count] = item;
        count++;
    }

    public int pop() {
        if (count == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return numbers[--count];
    }

    public int peek() {
        if (count == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return numbers[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        var content = Arrays.copyOfRange(numbers, 0, count);
        return Arrays.toString(content);
    }
}
