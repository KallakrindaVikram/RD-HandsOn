package org.epam.FunctionalInterfaces;

import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (num) -> num%2==0;//give a condition body
        System.out.println(isEven.test(4));

        Supplier<Integer> supplier = () -> (int) Math.random();
        System.out.println(supplier.get());

        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept("Vikram");

        Function<String,Integer> function = str -> str.length();
        System.out.println(function.apply("Vikram"));

        UnaryOperator<Integer> unary = (a) -> a*a;
        System.out.println(unary.apply(5));

        BinaryOperator<Integer> binaryOperator = (a,b) -> a*b;
        System.out.println(binaryOperator.apply(5,2));

        BiFunction<String,String,Integer> biFunction = (a,b) ->  Integer.parseInt(a+b);
        System.out.println(biFunction.apply("6","9"));

        BiConsumer<String,String> biConsumer = (a,b) -> System.out.println("Name : "+a+" "+b);
        biConsumer.accept("Vikram","Kallakrinda");

    }
}
