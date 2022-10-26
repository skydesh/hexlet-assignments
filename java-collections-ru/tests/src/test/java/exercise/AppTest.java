package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> list = Arrays.asList(7, 5, 12, 23, 25);
        assertThat(App.take(list, 3))
//                .size()
//                .isEqualTo(3)
                .isEqualTo(Arrays.asList(7, 5, 12));
        // END
    }
}
