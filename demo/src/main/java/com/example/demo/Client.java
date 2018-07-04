package com.example.demo;

import com.example.demo.bean.User;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 *
 */
public class Client {

    public static void main(String[] args) {
        Optional<Object> empty = Optional.empty();

        Optional<Object> of = Optional.of(new User());

        Predicate<Integer> addNumbers = (Integer i) -> i % 2 == 1;

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 3, 2);
//        list.stream().sorted( (param1,param2) -> ((int)param1 < (int)param2 ? 1 : -1 ) )
//                .forEach(System.out::println);
//        list = list.stream().distinct().filter(i -> i % 2 == 0).collect(Collectors.toList());
//        list.forEach(i -> System.out.println(i));
//        list.forEach(System.out::println);

//        System.out.println(list.stream().min((param1, param2) -> (int) param1 < (int) param2 ? 1 : -1).get());
//        System.out.println(list.stream().reduce((param1, param2) -> (int) param1 + (int) param2).get());

        Optional<User> optUser = Optional.ofNullable(new User("Mike",1,"NewYork"));
        Optional<Integer> optAge = optUser.map(User::getAge);
        System.out.println(optAge.get());
        System.out.println("------------------------------");
//        list.forEach(i -> System.out.println(i));
        list.forEach(System.out::println);
}

}
