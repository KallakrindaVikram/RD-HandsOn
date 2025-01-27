package org.epam.streams;

import java.util.List;

public class ParallelStreamsExample {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8);
        nums.stream().forEach(num -> System.out.println(Thread.currentThread().getName() + " : "+num));
        System.out.println();
        System.out.println();
        nums.parallelStream().forEach(num -> System.out.println(Thread.currentThread().getName() + " : "+num));

    }


}
