import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Miscellaneous {
    public void mergeTwoArraysIntoSingleSortedArray(int[]array1, int[]array2){
        int[] mergedAndSortedArray = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).sorted().toArray();
        System.out.println(Arrays.toString(mergedAndSortedArray));
    }

    public void fibonacciSeries(int limit){
        Stream.iterate(new int[] {0, 1}, f -> new int[] {f[1], f[0]+f[1]})
                .limit(limit)
                .map(f -> f[0])
                .forEach(i -> System.out.print(i+" "));
    }

    public void Palindrome(String inputString){
        boolean isItPalindrome = IntStream.range(0, inputString.length()/2).
                noneMatch(i -> inputString.charAt(i) != inputString.charAt(inputString.length() - i -1));

        if (isItPalindrome)
        {
            System.out.println(inputString+" is a palindrome");
        }
        else
        {
            System.out.println(inputString+" is not a palindrome");
        }
    }
}
