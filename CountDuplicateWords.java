import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountDuplicateWords {
    public static void main(String...sds){

        List<String> words = Arrays.asList("welcome","siva","jangita","kumar","siva","kumar","test");
        Map<String,Long> countDuplicateNames = words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(countDuplicateNames);


    }
}
