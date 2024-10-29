package ru.kaznu.ruslan.collections2;

import java.util.*;

public class PhoneBook {


    public static void add(HashMap<String, List<Integer>> map, String name, int... numbers){
        List<Integer> phoneNumbers = map.getOrDefault(name, new ArrayList<>());

        for (int number : numbers){
            phoneNumbers.add(number);
        }
        map.put(name,phoneNumbers);
    }

    public static void info(HashMap<String, List<Integer>> map){
        for (String name : map.keySet()) {
            System.out.println("Name: "+name+" Phone: "+map.get(name));
        }
    }

    public static String findPerson(HashMap<String, List<Integer>> map, String target){
        if (map.containsKey(target)) {
            return "Person is found " + target;
        }
        return "No person";
    }

    public static String containsPhoneNumber(HashMap<String, List<Integer>> map, int target){
        for (List<Integer> numbers: map.values()) {
            if (numbers.contains(target)){
                return "Person with this number found: " + target;
            }
        }
        return "No person";
    }
}

