import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        FunctionsOnNumbers functionsOnNumbers = new FunctionsOnNumbers();
        //functionsOnNumbers.separateEvenOdd(List.of(15,52,24,19,89,36,96,52,102,183));

        int [] array = {15,52,-89,7,-8,45,10,-18 };
        System.out.println("sorting: ");
        functionsOnNumbers.sortingInputArray(array);

        System.out.println("reversing: ");
        functionsOnNumbers.reverseTheInputArray(array);

        //functionsOnNumbers.someOperationsOnList(Arrays.asList(25,52,98,75,31,48,34));

        //functionsOnNumbers.sumOfRange(52, 89);
        //functionsOnNumbers.addDigitsInANumber(435834L);
        functionsOnNumbers.findDuplicateElements(List.of(45,18,7,10,8,12,1,5,3,18,7));

        FunctionsOnStrings functionsOnStrings = new FunctionsOnStrings();
        functionsOnStrings.reverseAString("today is jeevas bday");
        String reversedSentence = functionsOnStrings.reverseString("today is jeevas bday");
        System.out.println(reversedSentence);
        //functionsOnStrings.frequencyOfCharactersInAString("supercalifragilisticexpialidocious");
        //functionsOnStrings.frequencyOfAWordInASentence("No Word Repeated For Twice");

        Miscellaneous miscellaneous = new Miscellaneous();
        int[]arr1 = {56,26,74,32,44,91};
        int[]arr2 = {23,78,54,15,13,16};
        miscellaneous.mergeTwoArraysIntoSingleSortedArray(arr1, arr2);

        miscellaneous.fibonacciSeries(15);

        miscellaneous.Palindrome("ROTATOR");

    }
}