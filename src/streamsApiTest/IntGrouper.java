package streamsApiTest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IntGrouper {
    public static Map<Integer, List<String>> groupByDigitNumbers(int[] input) {
        return Arrays.stream(input)
                .filter(x -> (x>=0))
                .mapToObj(x -> (((x % 2) == 0) ? "e" : "o") + x)
                .collect(Collectors.groupingBy(s -> s.length() - 1));
    }
}
