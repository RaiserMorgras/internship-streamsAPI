package streamsApiTest;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

public class TestCases {
    @Test
    public void testCase1() {
        int[] input = new int[] {3, 44, 108, 8, 51};
        Map<Integer, List<String>> expected = Map.of(
                1, List.of("o3", "e8"),
                2, List.of("e44", "o51"),
                3, List.of("e108")
        );
        Map<Integer, List<String>> actual = IntGrouper.groupByDigitNumbers(input);

        assertEquals(expected, actual);

    }
}
