package blitz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PocketMoneyTrackerTest {
    @Test
    void calculateTotal_shouldReturn8() {
        assertEquals(8, PocketMoneyTracker.calculateTotal(5, 3));
    }
} 