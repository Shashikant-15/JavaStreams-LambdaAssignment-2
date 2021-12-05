package com.filterPrimeNumber;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimeNumberTestClass {

    // creating a list of integer type
    List<Integer> numbersList = Arrays.asList(2,3,4,8,7,18,25,33,55,71);

    // created a prime list of numbers
    static List<Integer> primeNumbers = Arrays.asList(2,3,7,71);


    @Test
    public void testPrimeNumber() {
        assertEquals(primeNumbers, MainClassToFilterPrimeNumber.filterPrimeNumbers(numbersList));
        System.out.println("Test1 successfully Passed");

    }
    // creating 2nd list of integer type
    List<Integer> numbersList2 = Arrays.asList(1,4,8,11,16,21,31,58,61);

    // created another prime list of numbers
    static List<Integer> primeNumbers2 = Arrays.asList(1,11,31,61);

    @Test
    public void testPrimeNumber2() {
        assertEquals(primeNumbers2, MainClassToFilterPrimeNumber.filterPrimeNumbers(numbersList2));
        System.out.println("Test2 Successfully Passed");
    }

}

