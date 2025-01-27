package org.epam.Streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
    List<Integer> list = List.of(1,2,3,4,5,6,7,8);

    //INTERMEDIATE OPERATIONS

    //map - changes each element as specified
    list.stream().map(a -> a*2).forEach(System.out::println);

    //sorted - sorts all the elements
    System.out.println( list.stream().sorted().collect(Collectors.toList()));

    //filter - filters elements based on condition
    list.stream().filter(a -> a%2==0).forEach(System.out::println);

    //limit - limits only that many elements
    list.stream().limit(4).forEach(System.out::println);


    //TERMINAL OPERATIONS

    //forEach does the operation for each element in the stream
    list.stream().forEach(System.out::println);

    //collect - collects and transforms stream to collection
    System.out.println( list.stream().sorted().collect(Collectors.toSet()));

    //count - counts no.of elements based on condition
    System.out.println(list.stream().sorted().filter(a->a%2==0).count());

    //reduce - reduces all elements to single based on the given operation - returns Optional
    System.out.println(list.stream().reduce((a,b)->a+b));

    }
}
