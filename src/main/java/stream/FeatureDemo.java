package stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by justin on 5/29/18.
 */
public class FeatureDemo {

    public static void main(String[] args) {
        // ==================construct=======================
        Stream<String> stream = Stream.of("a", "a", "a", "a");
        IntStream intStream = IntStream.of(1, 2, 3, 4);

        // array
        String[] s = new String[]{"a", "b", "c"};
        Stream<String> s1 = Arrays.stream(s);
        Stream<String> s2 = Stream.of(s);

        //collections
        List<String> strings = Arrays.asList(s);
        Stream<String> stream1 = strings.stream();

        //
        IntStream.rangeClosed(1, 3).forEach(System.out::println);

        // stream -> array
        String[] strings1 = stream.toArray(String[]::new);

        // ==========intermediate operation===================
        //1 to 1 mapping
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<Integer> collect = list.stream().map(n -> n * n).collect(Collectors.toList());

        //1 to many mapping
        Stream<List<Integer>> inputStream = Stream.of(
                Arrays.asList(1),
                Arrays.asList(2, 3),
                Arrays.asList(4, 5, 6)
        );

        inputStream.flatMap(Collection::stream).forEach(System.out::println);

        // filter
        Integer[] sixNums = {1, 2, 3, 4, 5, 6};
        Arrays.stream(sixNums).filter(n -> n % 2 == 0).forEach(System.out::println);

      //  Defaulable defaulable = DefaulableFactory.create( DefaultableImpl::new );
    }
}
