package pl.sda.mg.testowanie.datevalidator;

import org.junit.jupiter.api.Test;
import pl.sda.mg.testowanie.countryutil.CountryUtil;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DateValidatorTest {

    @Test
    void shouldReturnFalseForNullDate() {
        //given
        LocalDate testedDate = null;

        //when
        boolean actualValidationResult = DateValidator.isValidDate(testedDate);

        //then
        assertEquals(false, actualValidationResult);
    }

    @Test
    void shouldReturnFalseForDateBeforeValidPeriod() {
        //given
        LocalDate testedDate = LocalDate.of(2020, 12, 31);

        //when
        boolean actualValidationResult = DateValidator.isValidDate(testedDate);

        //then
        assertEquals(false, actualValidationResult);
    }

    @Test
    void shouldReturnFalseForDateAfterValidPeriod() {
        //given
        LocalDate testedDate = LocalDate.of(2021, 4, 2);

        //when
        boolean actualValidationResult = DateValidator.isValidDate(testedDate);

        //then
        assertEquals(false, actualValidationResult);
    }

    @Test
    void shouldReturnTrueForStartDate() {
        //given
        LocalDate testedDate = LocalDate.of(2021, 1, 1);

        //when
        boolean actualValidationResult = DateValidator.isValidDate(testedDate);

        //then
        assertEquals(true, actualValidationResult);
    }

    @Test
    void shouldReturnTrueForEndDate() {
        //given
        LocalDate testedDate = LocalDate.of(2021, 4, 1);

        //when
        boolean actualValidationResult = DateValidator.isValidDate(testedDate);

        //then
        assertEquals(true, actualValidationResult);
    }

    @Test
    void shouldReturnTrueForDateInTheMiddleValidPeriod() {
        //given
        LocalDate testedDate = LocalDate.of(2021, 3, 1);

        //when
        boolean actualValidationResult = DateValidator.isValidDate(testedDate);

        //then
        assertEquals(true, actualValidationResult);
    }

}