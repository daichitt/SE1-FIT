package Tutorial4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
public class CsvSourceParameterizedTest {

    @ParameterizedTest
    @CsvSource({"hello, 1", "world, 2", "'happy, testing', 3"})
    void testWithCsvSource(String first, int second) {
        System.out.println("Parameterized test with (String) " + first + " and (int) " + second);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "input.csv")
    void testWithCsvFileSource(String first, int second) {
        System.out.println("Yet another parameterized test with (String) " + first + " and (int) " + second);
    }



}
