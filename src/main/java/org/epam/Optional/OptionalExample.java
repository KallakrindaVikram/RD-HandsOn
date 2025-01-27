package org.epam.Optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

    Optional<Integer> optional = Optional.of(5);
        System.out.println(optional.get());

        //null ptr exception
//    Optional<Integer> optional2 = Optional.of(null);
//    System.out.println(optional2.get());

    Optional<Integer> optional3 = Optional.ofNullable(null);
        System.out.println(optional.get());





    }



}
