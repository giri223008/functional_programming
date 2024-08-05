import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency {

    public void frequencyOfCharactersInAString(String word){
        Map<Character, Long> collect = word.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }

    public void frequencyOfAWordInASentence(String sentence){

    }
}
