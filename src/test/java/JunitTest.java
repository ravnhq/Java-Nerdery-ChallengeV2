/* (C)2024 */
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JunitTest {

    @DisplayName("Assertion Success")
    @Test
    void assertSingleFailTest() {
        assertTrue(true);
    }
}
