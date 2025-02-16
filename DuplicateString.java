import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateString {

    public static void main(String...sd)
    {
        Stream<String> name=Stream.of("siva","jangita","siva");
        Set<String> set=new HashSet<>();
        name.filter(i->!set.add(i)).collect(Collectors.toSet()).forEach(System.out::println);

    }
}
