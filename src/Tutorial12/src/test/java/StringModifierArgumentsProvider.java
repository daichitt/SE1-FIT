package Tutorial12.src.test.java;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import java.util.stream.Stream;

public class StringModifierArgumentsProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
                Arguments.of("helloworld ", "Helloworld"),
//                Arguments.of("java programming", "JavaProgramming"),
//                Arguments.of("   test string", "Teststring"),
                Arguments.of("1invalid", "First character is not a letter") // For exception case
//                Arguments.of("", "First character is not a letter") // For empty string case
        );
    }
}
