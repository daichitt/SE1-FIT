package Tutorial4;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
public class MethodSourceStringsParameterizedTest {
    static Stream<String> stringProvider() {
        return Stream.of("hello", "world");
    }

    @ParameterizedTest
    @MethodSource("stringProvider")
    void testWithStringProperty(String argument) {
        System.out.println("Parameterized test with (String) argument: " + argument);
        assertNotNull(argument);
    }
}
