package pl.sda.mg.testowanie.evennumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenNumberUtilTest {
    @Test
    void shouldReturnEvenNumbers() {
        //given
        int[] sampleTable = new int[]{2,3,5};
        EvenNumberUtil evenNumberUtil = new EvenNumberUtil();

        //when
        int[] evenNumbers = evenNumberUtil.getEvenNumbers(sampleTable);

        //then
        assertNotNull(evenNumberUtil);
        assertArrayEquals(new int[]{2}, evenNumbers);
    }

    @Test
    void shouldReturnEmptyTable() {
        //given
        int[] sampleTable = new int[]{3,5};
        EvenNumberUtil evenNumberUtil = new EvenNumberUtil();

        //when
        int[] result = evenNumberUtil.getEvenNumbers(sampleTable);

        //then
        assertNotNull(result);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    void shouldReturnNull() {
        //given
        EvenNumberUtil evenNumberUtil = new EvenNumberUtil();

        //when
        int[] result = evenNumberUtil.getEvenNumbers(null);

        //then
        assertNull(result);
    }
}