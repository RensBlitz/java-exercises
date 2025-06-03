package blitz;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class VowelCounterTest {
    @Test
    void count_basic() {
        Map<Character,Integer> m = VowelCounter.count("Hello World");
        assertEquals(1, m.get('e'));
        assertEquals(1, m.get('o'));
    }
} 