package org.epam.streams;

import java.util.ArrayList;
import java.util.List;

public class MethodReferencesexampes {

    private String name;

    public MethodReferencesexampes(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MethodReferencesexampes{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Vikram");
        names.add("Kallakrinda");
        names.add("Pandu");

        //static method reference
        names.forEach(MethodReferencesexampes::toCapital);

        //instance method reference
        MethodReferencesexampes instance = new MethodReferencesexampes("hehe"); //must create an instance
        names.forEach(instance::toSmall);

        //Constructor reference - helps in automatically making onjects from a collection for a class
        names.stream().map(MethodReferencesexampes::new).forEach(System.out::println);

        String name = "Epam";
        names.stream().map(name::concat).forEach(System.out::println);
    }

    static void toCapital(String name){
        System.out.println(name.toUpperCase());
    }

    void toSmall(String name){
        System.out.println(name.toLowerCase());
    }
}
