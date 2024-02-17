package problems;

import utils.Generators;

import java.util.List;

/*
1. Write a Java program to calculate the average of a list of integers using streams.
2. Write a Java program to convert a list of strings to uppercase or lowercase using streams.
3. Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
4. Write a Java program to remove all duplicate elements from a list using streams.
5. Write a Java program to count the number of strings in a list that start with a specific letter using streams.
6. Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
7. Write a Java program to find the maximum and minimum values in a list of integers using streams.
8. Write a Java program to find the second smallest and largest elements in a list of integers using streams.
 */
public class ProblemSet1 {

    public static void problem_1(){
        List<Integer> inputList = Generators.getIntegerList(20);
        System.out.println("ProblemSet1.problem_1");
        System.out.println(inputList);
        double d = inputList.stream().mapToDouble(Integer::doubleValue).average().orElse(0);
        System.out.println(Double.toString(d));
    }

    public static void problem_2() {


    }

}
