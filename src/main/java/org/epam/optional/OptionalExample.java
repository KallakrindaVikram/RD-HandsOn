package org.epam.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        Optional<Integer> optional = Optional.of(5);

        System.out.println(optional.get()); //gives the value of the optional


      //null ptr exception
//      Optional<Integer> optional2 = Optional.of(null);
//      System.out.println(optional2.get());

        //if null, returns an empty optional - no null ptr exception
        Optional<Integer> optional3 = Optional.ofNullable(null);

        System.out.println(optional3.isEmpty()); //checks if empty
        System.out.println(optional3.isPresent()); //checks if value is present

        optional.ifPresent(System.out::println); //if value is present, does the operation

        System.out.println(optional3.orElse(0)); //if value is there return, or gives default value

        System.out.println(optional.filter(a->a%2==0)); //gives value if cond is true, or empty optional

        System.out.println(optional.map(a->a.doubleValue())); //uses the operation on the value

    }



}
