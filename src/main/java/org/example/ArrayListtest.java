package org.example;

import java.util.ArrayList;

public class ArrayListtest {
    public static void main(String[] args) {

        // ArrayList oluşturma
        ArrayList<Integer> numbers = new ArrayList<>();

        // Eleman ekleme
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Numbers: " + numbers);

        // Tür değişikliği
        int firstNumber = numbers.get(0);
        numbers.set(0, firstNumber + 5);
        System.out.println("Updated first number: " + numbers.get(0));

    }
}
