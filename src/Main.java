import java.util.List;
import java.util.stream.IntStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SeperateEvenAndOdd seperate = new SeperateEvenAndOdd();
        seperate.seperateEvenOdd(List.of(15,52,24,19,89,36,96,52,102,183));

        Frequency frequency = new Frequency();
        frequency.frequencyOfCharactersInAString("supercalifragilisticexpialidocious");
    }
}