package mg.testowanie.pesel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EvenNumberTest {

    @Test
    void shouldReturnEvenNumbers() {
        //given
        int[] sampleTable = new int[]{2,3,5};
        EvenNumber evenNumber = new EvenNumber();

        //when
        int[] evenNumbers = evenNumber.getEvenNumbers(sampleTable);

        //then
        assertNotNull(evenNumber);
        assertArrayEquals(new int[]{2}, evenNumbers);
    }

    @Test
    void shouldReturnEmptyTable() {
        //given
        int[] sampleTable = new int[]{3,5};
        EvenNumber evenNumber = new EvenNumber();

        //when
        int[] result = evenNumber.getEvenNumbers(sampleTable);

        //then
        assertNotNull(result);
        assertArrayEquals(new int[]{}, result);
    }


}
