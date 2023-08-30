package com.kodilla.parametrized_tests.homework;
import org.junit.jupiter.params.provider.Arguments;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PersonSources {
    static Stream<Arguments> BMI(){
        return Stream.of(
                Arguments.of(new Person(1.40, 20).getBMI(),"Very severely underweight"),
                Arguments.of(new Person(1.50,30).getBMI(),"Very severely underweight"),
                Arguments.of(new Person(1.60,40).getBMI(),"Severely underweight"),
                Arguments.of(new Person(1.70,70).getBMI(),"Normal (healthy weight)"),
                Arguments.of(new Person(1.80,100).getBMI(),"Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.90,150).getBMI(),"Obese Class III (Very severely obese)"),
                Arguments.of(new Person(2.00,200).getBMI(),"Obese Class V (Super Obese)"));
    }


}
