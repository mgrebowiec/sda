package mg.testowanie.pesel;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PeselUtilTest {
    @Test
    void shouldReturnBirthDateForExistingPesel() {
        //given
        String pesel = "84093011111";

        //when
        LocalDate calculatedBirthDate = PeselUtil.getBirthDate(pesel);

        //then
        assertNotNull(calculatedBirthDate);
        assertEquals(LocalDate.of(1984, 9, 30), calculatedBirthDate);
    }

    @ParameterizedTest
    @ValueSource(strings = {"84093011111", "84093022222"})
    void shouldReturnBirthDateForPeselsWithSameDate(String pesel) {
        //when
        LocalDate calculatedBirthDate = PeselUtil.getBirthDate(pesel);

        //then
        assertNotNull(calculatedBirthDate);
        assertEquals(LocalDate.of(1984, 9, 30), calculatedBirthDate);
    }

    @ParameterizedTest
    @CsvSource({"84093011111,1984-09-30", "84093022222,1984-09-30"})
    void shouldReturnBirthDateForPeselsWithSameDate(String pesel, String expectedBirthDate) {
        //when
        LocalDate calculatedBirthDate = PeselUtil.getBirthDate(pesel);

        //then
        assertNotNull(calculatedBirthDate);
        assertEquals(expectedBirthDate, calculatedBirthDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    }

    @ParameterizedTest
    @MethodSource("peselsAndExpectedDates")
    void shouldReturnBirthDateForPeselsWithSameDate(String pesel, LocalDate expectedBirthDate) {
        //when
        LocalDate calculatedBirthDate = PeselUtil.getBirthDate(pesel);

        //then
        assertNotNull(calculatedBirthDate);
        assertEquals(expectedBirthDate, calculatedBirthDate);
    }

    static Stream peselsAndExpectedDates() {
        return Stream.of(
                Arguments.of("84093011111", LocalDate.of(1984, 9, 30)),
                Arguments.of("85093011111", LocalDate.of(1985, 9, 30))
        );
    }
}