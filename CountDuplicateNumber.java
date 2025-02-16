import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountDuplicateNumber {
    public static void main(String...sds){

        List<Integer> numbers= Arrays.asList(10,20,30,10,40,50,30);
        Map<Integer,Long> countduplicateNumbers = numbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        countduplicateNumbers.entrySet().forEach(e-> {
            System.out.println("key:" + e.getKey() + "value:" + e.getValue());
        });


    }
}
