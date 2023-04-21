package arvin.java.util;

import arvin.spi.HelloService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ServiceLoader;

import static org.junit.jupiter.api.Assertions.*;

class ServiceLoaderTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void forEach() {
    }

    @Test
    void spliterator() {
    }

    @Test
    void reload() {
    }

    @Test
    void iterator() {
    }

    @Test
    void load() {
        ServiceLoader<HelloService> loaders = ServiceLoader.load(HelloService.class);
        for (HelloService helloService:loaders) {
            helloService.sayHello();
        }
    }

    @Test
    void testLoad() {
    }

    @Test
    void loadInstalled() {
    }

    @Test
    void testToString() {
    }
}