package com.filterPrimeNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/**
 * Represents a FilterPrimeNumber class to filter a prime no.
 */
public class MainClassToFilterPrimeNumber {

     /**
     *  stream to filtering random prime number
     * @param numbersList it displays
     * @return  it will return random prime number
     */
    public static List<Integer> filterPrimeNumbers(List<Integer> numbersList){
        return numbersList.stream()
                .filter(number-> IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0))
                .sorted()                           // used for sorting the List
                .collect(Collectors.toList());
    }
   
     /**
     *  main method called to implement filter a prime number among list of 100.
     * @param arguments  passes to method
     */
    public static void main(String[] arguments) {

        List<Integer> numbersList = new ArrayList<>();              // used to creating a list of integer

        Random random = new Random();

        //  Here Lambda Expression to  generating 100 random integers and adding to numbersList
        random.ints(100,1,100).forEach(i -> numbersList.add(i));

        // getting Result as Prime Number
        List<Integer> primeNum = MainClassToFilterPrimeNumber.filterPrimeNumbers(numbersList);
        System.out.println("Prime numbers are : "+primeNum);
    }

}
