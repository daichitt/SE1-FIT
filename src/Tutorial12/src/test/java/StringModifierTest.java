//package Tutorial12.src.test.java;
//
//import Tutorial12.src.main.java.StringModifier;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//public class StringModifierTest {
//
//
//    @Test
//    public void testModifyString() throws Exception {
//        StringModifier modifier = new StringModifier();
//        assertEquals("Helloworld", modifier.modifyString("helloworld "));
//    }
//
//    @Test
//    public void testFirstCharacterNotLetter() {
//        StringModifier modifier = new StringModifier();
//        Exception exception = assertThrows(Exception.class, () -> {
//            modifier.modifyString("1hello");
//        });
//        assertEquals("First character is not a letter", exception.getMessage());
//    }
//}


package Tutorial12.src.test.java;

import Tutorial12.src.main.java.StringModifier;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import static org.junit.jupiter.api.Assertions.*;

public class StringModifierTest {

    private final StringModifier modifier = new StringModifier();

    @ParameterizedTest
    @ArgumentsSource(StringModifierArgumentsProvider.class)
    public void testModifyString(String input, String expected) throws Exception {
        if (expected.equals("First character is not a letter")) {
            Exception exception = assertThrows(Exception.class, () -> {
                modifier.modifyString(input);
            });
            assertEquals(expected, exception.getMessage());
        } else {
            assertEquals(expected, modifier.modifyString(input));
        }
    }

    @Test
    public void testFirstCharacterNotLetter() {
        Exception exception = assertThrows(Exception.class, () -> {
            modifier.modifyString("1hello");
        });
        assertEquals("First character is not a letter", exception.getMessage());
    }
}