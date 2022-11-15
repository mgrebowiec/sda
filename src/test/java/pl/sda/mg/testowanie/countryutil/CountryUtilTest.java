package pl.sda.mg.testowanie.countryutil;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountryUtilTest {

    @Test
    void shouldReturnEmptyCountryNameForNullCode() {
        //given
        String countryCode = null;

        //when
        String actualCountryName = CountryUtil.getCountryNameByCode(countryCode);

        //then
        assertEquals("", actualCountryName);
    }

    @Test
    void shouldReturnEmptyCountryNameForCodeWithWrongLength() {
        //given
        String countryCode = "POL";

        //when
        String actualCountryName = CountryUtil.getCountryNameByCode(countryCode);

        //then
        assertEquals("", actualCountryName);
    }

    @Test
    void shouldReturnEmptyCountryNameForNonExistingCode() {
        //given
        String countryCode = "EN";

        //when
        String actualCountryName = CountryUtil.getCountryNameByCode(countryCode);

        //then
        assertEquals("", actualCountryName);
    }

    @Test
    void shouldReturnCountryNameForExistingCode() {
        //given
        String countryCode = "PL";

        //when
        String actualCountryName = CountryUtil.getCountryNameByCode(countryCode);

        //then
        assertEquals("Polska", actualCountryName);
    }

}