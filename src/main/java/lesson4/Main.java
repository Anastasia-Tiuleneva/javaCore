package lesson4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] animal = {"Собака", "Кролик", "Кот", "Собака", "Собака", "Кролик", "Кот","Морская свинка", "Черепаха" };

        HashMap<String, Integer> uniqueAnimal = new HashMap<>();
        HashSet <String> noSublicate = new HashSet<>();

        for (int i = 0; i < animal.length; i++) {
            noSublicate.add(animal[i]);
            if (uniqueAnimal.containsKey(animal[i])) {
                uniqueAnimal.put(animal[i], uniqueAnimal.get(animal[i]) + 1);
            } else {
                uniqueAnimal.put(animal[i], 1);
            }
        }

        System.out.println(uniqueAnimal);
        System.out.println("Уникальные значения в массиве:" + noSublicate);
    }



}

