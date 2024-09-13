package Tutorial4;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class EnumSourceParameterizedTest {
    enum CUstomEnum {
        haha,
        baba
    }
    @ParameterizedTest
    @EnumSource(CUstomEnum.class)
    void testWithEnum(CUstomEnum argument) {
        System.out.println("Parameterized test with (TimeUnit) argument: " + argument);
        assertNotNull(argument);
    }
}
