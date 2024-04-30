/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javalearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;

import com.classes.Persone;
import com.mycompany.Interface.NombrePremier;
import com.mycompany.Interface.Sum;
import com.mycompany.Method.Method;

/**
 *
 * @author fernand
 */
public class JavaLearnibg {

    /**
     * @param args
     */
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

        List<String> liste = new ArrayList<>();
        liste.add("Fernand");
        liste.add("Ouedrao");
        liste.add("Mohamed");
        liste.add("Alamofire");
        liste.add("Fabricante");
        Collections.sort(liste);

        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));
        }

        Predicate<Integer>  predicate = value -> value >= 0;

        Boolean isTest = predicate.test(20);
        System.out.println(isTest);

        // Arrow function to makke sum
        Sum sum = (value1, value2) -> value1 + value2;
        int result = sum.sum(10, 20);
        System.out.println(result);

        // check if number is premier

        NombrePremier isNombrePremier = value -> {
            int square = (int) Math.sqrt(value);
            for(int i = 2; i < square; i++) {
                if(value % i == 0) {
                    return false;
                }
            }
            return true;
        };

        Boolean isPremier = isNombrePremier.isPremier(20);
        System.out.println(isPremier);
        Boolean isPremierPremier = isNombrePremier.isPremier(17);
        System.out.println(isPremierPremier);

        List<Persone> persones = new ArrayList<>();
        persones.add(new Persone("Fernand", "74074099"));
        persones.add(new Persone("Ouedraogo", "77074099"));
        persones.add(new Persone("Happy", "74054099"));
        
        Persone persone = new Persone("Happy", "74054099");

        Optional<Persone> searchPersone = persone.findByNom(persones, "Fernand");
        if (searchPersone.isPresent()) {
            System.out.println(searchPersone.get().toString());
        }
    }
}
