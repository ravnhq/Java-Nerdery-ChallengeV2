/* (C)2024 */

import org.junit.jupiter.api.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ChallengeTest {
    Challenges challenges;

    @BeforeEach
    void setUp() {
        challenges = new Challenges();
    }

    @Test
    @Order(1)
    public void readableTime() {
        assertEquals("00:07:38", challenges.readableTime(458));
        assertEquals("01:01:30", challenges.readableTime(3690));
        assertEquals("02:01:33", challenges.readableTime(7293));
        assertEquals("09:00:20", challenges.readableTime(32420));
    }

    @Test
    @Order(2)
    public void circularArray() {
        assertArrayEquals(
                new String[] {"Island", "Japan", "Israel", "Germany", "Norway"},
                challenges.circularArray(2));
        assertArrayEquals(
                new String[] {"Japan", "Israel", "Germany", "Norway", "Island"},
                challenges.circularArray(3));
        assertArrayEquals(
                new String[] {"Germany", "Norway", "Island", "Japan", "Israel"},
                challenges.circularArray(5));
        assertArrayEquals(
                new String[] {"Israel", "Germany", "Norway", "Island", "Japan"},
                challenges.circularArray(9));
    }

    @Test
    @Order(3)
    public void ownPower() {
        assertEquals("317", challenges.ownPower(10, 3));
        assertEquals("7190184", challenges.ownPower(12, 7));
        assertEquals("075684339445", challenges.ownPower(21, 12));
    }

    @Test
    @Order(4)
    public void digitSum() {
        assertEquals(27, challenges.digitSum(10));
        assertEquals(189, challenges.digitSum(42));
        assertEquals(423, challenges.digitSum(71));
        assertEquals(549, challenges.digitSum(89));
    }

    @Test
    @Order(5)
    public void decryption() {
        assertEquals("Hi there!",challenges.decrypt(Arrays.asList(72, 33, -73, 84, -12, -3, 13, -13, -68)));
        assertEquals("Sunshine",challenges.decrypt(Arrays.asList(83, 34, -7, 5, -11, 1, 5, -9)));
    }
    @Test
    @Order(6)
    public void encryption() {
        assertIterableEquals(Arrays.asList(83, 34, -7, 5, -11, 1, 5, -9), challenges.encrypt("Sunshine"));
        assertIterableEquals(Arrays.asList(72, 29, 7, 0, 3), challenges.encrypt("Hello"));
    }
}
