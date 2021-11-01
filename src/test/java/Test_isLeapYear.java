import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Test_isLeapYear {

    @ParameterizedTest
    @CsvSource({
            "1999, false",
            "2000, true",
            "1996, true"
    })
    public void DivisibleBy4(int year, boolean output) {
        assertEquals(output, newLeapYear(year).isLeapYear());
    }

    private LeapYear newLeapYear(int year) {
        return new LeapYear(year);
    }

    @ParameterizedTest
    @CsvSource({
            "1999, false",
            "2000, true",
            "1996, true"
    })
    public void DivisibleBy4ButNot100(int input, boolean output) {
        assertEquals(output, newLeapYear(input).isLeapYear());
    }

    @ParameterizedTest
    @CsvSource({
            "1700, false",
            "1800, false",
            "2100, false",
            "1996, true"
    })
    public void DivisibleBy4And400ButNot100(int input, boolean output) {
        assertEquals(output, newLeapYear(input).isLeapYear());
    }


}
