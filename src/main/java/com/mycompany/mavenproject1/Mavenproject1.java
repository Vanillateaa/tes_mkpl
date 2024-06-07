/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Rheins
 */
public class Mavenproject1 {
    // Method untuk menambahkan dua bilangan
    public int add(int a, int b) {
        return a + b;
    }

    // Method untuk mengurangkan dua bilangan
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method untuk perkalian (dengan code smell: unnecessary complexity)
    public int multiply(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result = add(result, a);
        }
        return result;
    }

    // Method untuk pembagian (dengan code smell: no exception handling for division by zero)
    public int divide(int a, int b) {
        return a / b;
    }
}

