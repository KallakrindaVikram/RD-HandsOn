package org.epam.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExample {
    public static void main(String[] args) {
    List<Integer> list = List.of(1,2,3,4,5,6,7,8);
    List<List<Integer>> listOfLists = List.of(list,list);

    //flatmap - list inside a list to make a single collection
    System.out.println(listOfLists.stream().flatMap(List::stream).collect(Collectors.toSet()));

    //INTERMEDIATE OPERATIONS

    //map - changes each element as specified
    list.stream().map(a -> a*2).forEach(System.out::println);

    //sorted - sorts all the elements
    System.out.println( list.stream().sorted().collect(Collectors.toList()));

    //filter - filters elements based on condition
    list.stream().filter(a -> a%2==0).forEach(System.out::println);

    //limit - limits only that many elements
    list.stream().limit(4).forEach(System.out::println);

    //distinct - removes duplicate values
    System.out.println(list.stream().distinct().collect(Collectors.toList()));


    //TERMINAL OPERATIONS

    //forEach does the operation for each element in the stream
    list.stream().forEach(System.out::println);

    //collect - collects and transforms stream to collection
    System.out.println( list.stream().sorted().collect(Collectors.toSet()));

    //count - counts no.of elements based on condition
    System.out.println(list.stream().sorted().filter(a->a%2==0).count());

    //reduce - reduces all elements to single based on the given operation - returns Optional
    System.out.println(list.stream().reduce(0,Integer::sum)); //Integer::max,Integer::min


    //Stream to IntStream and other streams
    Stream<Integer> nums = Stream.of(1,2,3,4,5);
    IntStream intStream = nums.mapToInt(a->a);
    intStream.forEach(System.out::println);
    }
}
