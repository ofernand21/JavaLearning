/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javalearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.classes.Persone;
import com.mycompany.interfaces.NombrePremier;
import com.mycompany.interfaces.Sum;
import com.mycompany.method.Method;

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
        liste.add("Fernando");
        liste.add("Ouedrao");
        liste.add("Mohamed");
        liste.add("Alamofire");
        liste.add("Fabricante");
        Collections.sort(liste);

        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));
        }

        Predicate<Integer>  predicate = value -> Integer.signum(value) != -1;
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

        Stream<Integer> streams = Stream.<Integer>builder()
        .add(1)
        .add(20)
        .add(30)
        .add(579).build();
        
        Optional<Integer> sums = streams.reduce((a, b) -> a + b);

        // ! Impossible d'utiliser une stream 2 fois
        List<Integer> newList = streams.toList();
        newList.forEach(System.out::println);

        // Filtrage avec 
        List<Persone> list = Arrays.asList(
            new Persone("Fernandez", "68789544"),
            new Persone("Ol", "548766")
        );

        Map<Object, Object> map = list.stream()
                .collect(Collectors.toMap(v -> v.getName(), v -> v.getNumero()));
                
        System.out.println(map);
    }
}
