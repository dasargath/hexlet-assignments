package exercise;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> listNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> actual = App.take(listNumbers, 4);
        assertEquals(expected, actual);

        // END
    }
}

