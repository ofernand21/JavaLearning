/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javalearning;

import java.util.Scanner;
import com.mycompany.Method.Method;

/**
 *
 * @author fernand
 */
public class JavaLearnibg {

    public static void main(String[] args) {
        System.out.println("Hello World!\n It is the beginning of the project!");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter a number (Weight ): ");
            float weight = scanner.nextFloat();
            System.out.println("Please enter a number (Height ): ");
            float height = scanner.nextFloat();
            float area = Method.calculeSurfaceRectangle(weight, height);
            System.out.println("The area of reactangle is: " + area);
        }
    }
}
