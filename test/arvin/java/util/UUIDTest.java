package arvin.java.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class UUIDTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void randomUUID() {
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);
    }

    @Test
    void nameUUIDFromBytes() {
        byte[] bytes = new byte[10];
        bytes[0] = 96;
        bytes[1] = 98;
        bytes[2] = 102;
        bytes[3] = 112;
        bytes[4] = 100;
        bytes[5] = 96;
        bytes[6] = 98;
        bytes[7] = 102;
        bytes[8] = 112;
        bytes[9] = 100;

        UUID uuid = UUID.nameUUIDFromBytes(bytes);

        System.out.println(uuid);
    }

    @Test
    void fromString() {
    }

    @Test
    void getLeastSignificantBits() {
    }

    @Test
    void getMostSignificantBits() {
    }

    @Test
    void version() {
    }

    @Test
    void variant() {
    }

    @Test
    void timestamp() {
    }

    @Test
    void clockSequence() {
    }

    @Test
    void node() {
    }

    @Test
    void testToString() {
    }

    @Test
    void testHashCode() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void compareTo() {
    }
}