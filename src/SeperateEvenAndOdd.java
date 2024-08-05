import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeperateEvenAndOdd {

    public void seperateEvenOdd(List<Integer> listToBeSeperated) {
        Map<Boolean, List<Integer>> evenOddSeperatedMap = listToBeSeperated.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println("even numbers:");
        evenOddSeperatedMap.get(true);
        System.out.println("odd numbers list:");
        System.out.println(evenOddSeperatedMap.get(false));
    }
}
