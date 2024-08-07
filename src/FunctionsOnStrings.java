import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionsOnStrings {

    public void frequencyOfCharactersInAString(String word){
        Map<Character, Long> collect = word.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }

    public void frequencyOfAWordInASentence(String sentence){
        String[] sentenceArray = sentence.split(" ");
        Map<String, Long> collect = Arrays.stream(sentenceArray).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map.Entry<String, Long> mostRepetitiveWord = collect.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        boolean isAllWordsAreUnique = collect.values().stream().allMatch(count->count == 1);

        if(isAllWordsAreUnique && mostRepetitiveWord != null) {
            System.out.println("Most Repetitive Word: "+ mostRepetitiveWord.getKey());
            System.out.println("It Repeated for: "+ mostRepetitiveWord.getValue()+ "times");
        }
        else {
            System.out.println("All the words in the sentence having same frequency");
        }
    }

    public void reverseAString(String stringToBeReversed){
        String reversedString = Arrays.stream(stringToBeReversed.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
        System.out.println(reversedString);
    }

    public String reverseString(String input) {
        // Split the string into an array of characters
        return input.chars() // Create an IntStream of the characters
                .mapToObj(c -> (char) c) // Convert each int to a char
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(), // Collect characters to a List
                        list -> {
                            java.util.Collections.reverse(list); // Reverse the List
                            return list.stream(); // Stream the reversed List
                        }
                ))
                .map(Object::toString) // Convert each char back to a String
                .collect(Collectors.joining()); // Join all characters into a single string
    }


}
