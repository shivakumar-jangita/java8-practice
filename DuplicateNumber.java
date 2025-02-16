import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateNumber {
  public static void main(String...fdd){
    Stream<Integer> numbers= Stream.of(10,20,40,40,50,20);
    Set<Integer> numberSet = new HashSet<>();
    numbers.filter(n->!numberSet.add(n)).collect(Collectors.toSet()).forEach(System.out::println);

  }

}
