import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FunctionsOnNumbers {

    public void separateEvenOdd(List<Integer> listToBeSeperated) {
        Map<Boolean, List<Integer>> evenOddSeperatedMap = listToBeSeperated.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println("even numbers:");
        evenOddSeperatedMap.get(true);
        System.out.println("odd numbers list:");
        System.out.println(evenOddSeperatedMap.get(false));
    }

    public void sortingInputArray(int[] inputArray){
        List<Integer> inputList = Arrays.stream(inputArray) // Create an IntStream
                .boxed() // Box each int to Integer
                .toList(); // Collect into a list
        inputList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println) ; //printing the values in reverse order
        int[] reversedArray = inputList.stream().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray(); //converting into string and storing in another array
        System.out.println(Arrays.toString(reversedArray));
    }

    public void reverseTheInputArray(int[] arrayToBeReversed) {
        int[] reversedArray = IntStream.rangeClosed(1, arrayToBeReversed.length).map(i -> arrayToBeReversed[arrayToBeReversed.length - i]).toArray();

        System.out.println(Arrays.toString(reversedArray));
    }

    public void someOperationsOnList(List<Integer>inputList) {
        System.out.println("printing in reverse order");
        inputList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);//descending order sorting
        System.out.println("top 3 elements in a list ");
        inputList.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);//max 3 elements
        System.out.println("bottom 3 elements in a list ");
        inputList.stream().sorted().limit(3).forEach(System.out::println);//min 3 elements
        System.out.println("2nd largest in the list: ");
        Integer secondHighest = inputList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondHighest);

        System.out.println("sumOfInputList: ");
        int[] inputArrayConvertedFromList = inputList.stream()
                .mapToInt(Integer::intValue) // Map Integer to int
                .toArray();

        int sumOfInputList = Arrays.stream(inputArrayConvertedFromList).sum();
        System.out.println(sumOfInputList);
        System.out.println("average of input list: ");
        double averageOfInputList = Arrays.stream(inputArrayConvertedFromList).average().getAsDouble();
        System.out.println(averageOfInputList);
    }

    public void sumOfRange(int from, int to){
        int sum = IntStream.range(from, to).sum();
        System.out.println("sum of the range: "+ sum);
    }

    public void addDigitsInANumber(Long number){
        System.out.println( Stream.of(String.valueOf(number).split("")).mapToInt(Integer::parseInt).sum());
    }

    public void findDuplicateElements(List<Integer>listHavingDuplicates){
        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> duplicateElements = listHavingDuplicates.stream().filter(i -> !uniqueElements.add(i)).collect(Collectors.toSet());
        System.out.println("duplicateElements: "+ duplicateElements);
    }
}
