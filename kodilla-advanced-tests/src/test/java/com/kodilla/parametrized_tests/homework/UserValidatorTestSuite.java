package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    private UserValidator validator = new UserValidator();
    @ParameterizedTest
    @ValueSource(strings = {"A", "@Kamilek", "@@@", "", " "})
    public void shouldResturnFalseIfUsernameIsNotCorrect(String input){
        boolean result = validator.validateUsername(input);
        assertFalse(result);
    }
    @ParameterizedTest
    @ValueSource(strings = {"Kamilek", "Kamilek123", "123", ".-_", "Kamilek_.-123"})
    public void shouldReturnTrueForCorrectUsername(String input){
        assertTrue(validator.validateUsername(input));
    }
    @ParameterizedTest
    @ValueSource(strings = {"!@gmail.com", " @ .com", "Kamilek@@gmail.com", "another$$incorrect@email$.pl"})
    public void shouldReturnFalseForIncorrectEmailAdress(String input){
        assertFalse(validator.validateEmail(input));
    }
    @ParameterizedTest
    @ValueSource(strings = {"Kamilek@gmail.com.pl", "abcd.dcba@gmail.com", "abcd_ca@abc.PL.COM","-_@g-mail.com"})
    public void shouldReturnTrueForCorrectEmailAdress(String input){
        assertTrue(validator.validateEmail(input));
    }
}