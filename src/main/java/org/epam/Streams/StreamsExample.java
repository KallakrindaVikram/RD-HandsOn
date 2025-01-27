package org.epam.Streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
    List<Integer> list = List.of(1,2,3,4,5,6,7,8);
    list.stream().filter(a -> a%2==0).forEach(System.out::println);

    List<String> names = List.of("Vikram","Nani","Kd","Varun");
    names.stream().map(String::toUpperCase).forEach(System.out::println);

        System.out.println( list.stream().sorted().collect(Collectors.toList()));

        System.out.println(names.stream().filter(name -> name.startsWith("V")).sorted().collect(Collectors.toList()));;
    }
}
